package socket02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//send message to server  
class WritingThead extends Thread{
	Socket socket = null;
	//chatting scanner
	Scanner scanner = new Scanner(System.in);
	
	public WritingThead(Socket socket) {
		// �޾ƿ� socket parameter�� �ش� Ŭ������ socket���� �ֱ�
		this.socket = socket;
	}
	
	public void run() {
		try {
			//outputStream : send message to Server 
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(outputStream, true);
			
			while(true) {
				writer.println(scanner.nextLine());
//				outputStream.wir
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// read server message
class ListeningThread extends Thread{
	Socket socket = null;
	
	public ListeningThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			//get server's inputStream message to client
			InputStream inputStream = socket.getInputStream();
			
//			byte[] data = new byte[512];
//			int len = inputStream.read(data);
//			if (len == -1) {
//				throw new IOException();
//			}
//			String str = new String(data, 0, len, "UTF-8");
			
			//inputStream�� bufferedreader�� �ֱ�
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			
			while(true) {
				System.out.println(reader.readLine());
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Client extends Application {
	Socket c_socket = new Socket();
//	Socket clientSocket = null;
	
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();      
		
		root.setPrefSize(400, 300);  
		root.setSpacing(15);      
		//--------------------------------------------------
		
		Button btn1 = new Button("Connect");
		Button btn2 = new Button("Send");
		TextArea textArea = new TextArea();
		TextField textField = new TextField();

		
		
		textField.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// enter key event
				try {
//					c_socket = new Socket();
					WritingThead writeThread = new WritingThead(c_socket); 
					writeThread.start();
					
					ListeningThread listenThread = new ListeningThread(c_socket);
					listenThread.start();
					
					OutputStream outputStream = c_socket.getOutputStream();
//					byte[] buffer = c_socket
//					textArea.appendText(outputStream.toString() + "\n");
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				try {
					c_socket.connect(new InetSocketAddress("211.221.45.85",5001));
					System.out.println("connected server");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				try {
					textField.setText("");
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		root.getChildren().addAll(btn1, btn2, textArea, textField);
		
		//----------------------------------------------------
		Scene scene = new Scene(root);   
		arg0.setTitle("Client"); 		
		arg0.setScene(scene);
		arg0.show();					 
	}
	
	public static void main(String[] args) {
		launch();
		System.out.println("EXIT");
	}
}

/*
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
public class Client extends Application {
	Socket socket;
	TextArea textArea;
	
	// Ŭ���̾�Ʈ ���α׷� ���� �޼ҵ�
	public void startClient(String IP, int port) {
		//�������α׷��� �ٸ��� �������� �����尡 ���ôٹ������� ���ܳ��� ��찡 ���� ������
		//���� ThreadPool�� ����� �ʿ䰡 ����.
		//���� Runnable��ü ��ſ� �ܼ��ϰ� Thread��ü�� ����Ѵ�.
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					// ���� �ʱ�ȭ
					socket = new Socket(IP, port);
					// �޽����� ���޹޵��� receive �޼ҵ� ȣ��
					receive();
					
				} catch (Exception e) {
					//������ �߻��� ���
					if(!socket.isClosed()) {
						//stopClient �޼ҵ带 ȣ���ؼ� Ŭ���̾�Ʈ�� ����
						stopClient();
						System.out.println("[���� ���� ����]");
						//���α׷� ��ü�� �����Ų��.
						Platform.exit();
					}
				}
			}
		};
		thread.start();
	}
	
	
	// Ŭ���̾�Ʈ ���α׷� ���� �޼ҵ�
	public void stopClient() {
		try {
			// ������ �����ִ� ���¶��
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// �����κ��� �޽����� ���޹޴� �޼ҵ�
	// ��� ���޹ޱ� ���ؼ� ����loop�� �����ش�.
	public void receive() {
		while(true) {
			try {
				// ���� �����κ��� ��� �޽����� ���޹��� �� �ֵ���.
				InputStream in = socket.getInputStream();
				// 512byte��ŭ ���ۿ� ��Ƽ� ��� ��� ���޹��� ��.
				byte[] buffer = new byte[512];
				// read�Լ��� ������ �Է��� �޴´�.
				int length = in.read(buffer);
				// ������ �Է¹޴� ���߿� ������ �߻��ϸ� IOException�� �߻���Ų��.
				if(length == -1 ) throw new IOException();
				// message�� ���ۿ� �ִ� ������ ���.
				String message = new String(buffer, 0, length, "UTF-8");
				// ȭ�鿡 ���
				Platform.runLater(()->{
					// textArea�� GUI ����� �ϳ��ν� ȭ�鿡 ������ִ� ���
					textArea.appendText(message);
				});
				
			} catch (Exception e) {
				//������ �߻����� ���� stopClient ȣ�� �� �ݺ��� break;
				stopClient();
				break;
			}
		}
	}
	
	
	// ������ �޽����� �����ϴ� �޼ҵ�
	public void send(String message) {
		// ���⼭�� �޽����� ������ �� Thread�� �̿��ϴµ�,
		// ������ �޽����� �����ϱ� ���� Thread 1��
		// �����κ��� �޽����� ���޹޴� Thread 1��
		// �̷��� �� 2���� Thread�� ���� �ٸ� ������ ������.
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					OutputStream out = socket.getOutputStream();
					// �������� �ϴ� ���� UTF-8�� ���ڵ��� �Ѵ�.
					// �������� ���޹��� �� UTF-8�� ���ڵ��� ���� �޵��� �صξ��� ����.
					byte[] buffer = message.getBytes("UTF-8");
					//�޽��� ����
					out.write(buffer);
					//�޽��� ������ ���� �˸�.
					out.flush();
					
				} catch (Exception e) {
					//������ �߻��ߴٸ�
					stopClient();
				}
			}
		};
		thread.start();
	}
	
	
	// ������ ���α׷��� ���۽�Ű�� �޼ҵ�
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5));
		
		// BorderPane���� �ϳ��� ���̾ƿ��� �� �־��ֱ� ���� ��.
		HBox hbox = new HBox();
		// ����
		hbox.setSpacing(5);
		
		// ����� �̸��� �� �� �ִ� �ؽ�Ʈ ����
		TextField userName = new TextField();
		userName.setPrefWidth(150); // �ʺ�
		userName.setPromptText("�г����� �Է��ϼ���.");
		// HBox���ο� TextField�� �׻� ��µǵ���.
		HBox.setHgrow(userName, Priority.ALWAYS);
		
		TextField IPText = new TextField("115.22.11.172");
		TextField portText = new TextField("5001");
		portText.setPrefWidth(80);
		
		
		// hbox�� 3���� �ؽ�Ʈ�ڽ��� �߰��� �� �ֵ���.
		hbox.getChildren().addAll(userName, IPText, portText);
		
		// borderPane ��ܿ� ��ġ
		root.setTop(hbox);
		textArea = new TextArea();
		// ������ ������ �� ������ ����
		textArea.setEditable(false);
		// ���̾ƿ�(borderPane)�� �߰��� ��ġ
		root.setCenter(textArea);
		
		TextField input = new TextField();
		input.setPrefWidth(Double.MAX_VALUE);
		input.setDisable(true); // �����ϱ� �������� ��� �޽����� ������ �� ������.
		input.setOnAction(event ->{
			// ������ ��� �޽����� ������ �� �ֵ���.
			send(userName.getText() + ": " + input.getText() +"\n");
			input.setText(""); // ���������ϱ� ����ĭ ����
			input.requestFocus(); // �ٽ� ��� �޽����� ������ �� �ֵ��� ��Ŀ���� ����
		});
		
		Button sendButton = new Button("������");
		sendButton.setDisable(true); // �����ϱ� �������� �̿��� �� ������ ����
		
		// ��ư�� ������ �̺�Ʈ�� �߻����� �� ���۵� �� �ֵ���
		sendButton.setOnAction(event ->{
			send(userName.getText() +": " + input.getText() + "\n");
			input.setText("");
			input.requestFocus();
		});
		
		Button connectionButton = new Button("�����ϱ�");
		connectionButton.setOnAction(event ->{
			// ��ư�� ���� "�����ϱ�"�� ���� Ŭ���ߴٸ�
			if(connectionButton.getText().equals("�����ϱ�")) {
				int port = 9876; // ��Ʈ��ȣ �⺻ ����
				try {
					// ��Ʈ��ȣ �Է�ĭ�� ����ִ� �ؽ�Ʈ ������ �������·� ��ȯ�ؼ� �ٽ� ���� �� �ֵ��� �Ѵ�.
					// ����ڰ� ���� ��Ʈ��ȣ�� ������ �� �� �ֵ���.
					port = Integer.parseInt(portText.getText());
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Ư���� IP�ּҿ� ��� port��ȣ�� ������ �� �ֵ���.
				startClient(IPText.getText() , port);
				// runLater �Լ��� ���������� ȭ�鿡 ���õ� ������ ��µ� �� �ֵ���.
				Platform.runLater(() -> {
					textArea.appendText("[ä�ù� ����]\n");
				});
				connectionButton.setText("�����ϱ�"); // ��ư�� ����
				input.setDisable(false); // ��ư�� ������ �� �ֵ��� false�� ó��
				sendButton.setDisable(false);
		 		input.requestFocus(); // �ٷ� �Է��� �� �ֵ��� ��Ŀ��
			} else {
				// �����ϱ� ��ư�� �ƴ϶� �����ϱ� ��ư�̾��ٸ�
				stopClient();
				Platform.runLater(()->{
					textArea.setText("[ ä�ù� ���� ]\n");
				});
				connectionButton.setText("�����ϱ�");
				input.setDisable(true);
				sendButton.setDisable(true);
			}
		});
		
		//������ ������ ������ ���� ���� ����
		BorderPane pane = new BorderPane();
		pane.setLeft(connectionButton);
		pane.setCenter(input);
		pane.setRight(sendButton);
		
		root.setBottom(pane);
		Scene scene = new Scene(root, 600, 600);
		primaryStage.setTitle("[ ä�� Ŭ���̾�Ʈ ]");
		primaryStage.setScene(scene); // scene���
		primaryStage.setOnCloseRequest(event -> stopClient()); // ȭ��ݱ� ��ư�� ������ stopClient ���� �� ����.
		primaryStage.show();
		
		connectionButton.requestFocus();		
	}
	
	// ���α׷��� �������Դϴ�.
	public static void main(String[] args) {
		launch(args);
	}
}
////		new Scanner(System.in).nextInt();
////		System.out.println("Client End");
////	}
////
////}
 */

