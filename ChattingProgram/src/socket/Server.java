package socket;

import java.io.*;
import java.util.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


class ClientThread extends Thread{
	//check client
	static ArrayList<Socket> list = new ArrayList<Socket>(); 
	static Socket socket;
	
	ClientThread(Socket socket){
		this.socket = socket;
		list.add(socket);
	}
	
	public void run() {
		//통신소켓
		try {
			System.out.println("server : " + socket.getInetAddress() +"IP client connected");
			
			//inputStream : client message read
			InputStream inputStream = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			
			//outputStream : Server to client
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(outputStream, true);
			writer.println("write your ID!!");
			
			
			// save client's data 
			String readValue;
			String name = null;
			boolean identify = false;
			
			// When client write message
			while((readValue = reader.readLine()) != null) {
				// 1번 실행
				if(!identify) {
					name = readValue;
					identify = true;
					writer.println(name + " connect ");
					continue;
				}
					// client's information
					for(int i=0; i<list.size(); i++) {
						outputStream = list.get(i).getOutputStream();
						writer = new PrintWriter(outputStream,true);
						
						//server : text message to client
						writer.println(name + " : " + readValue);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//접속 스레드
class ConnectThread extends Thread {
	public void run() {
		try {
			int socketPort = 5001;
			// create main server socket
			ServerSocket mainServerSocket = new ServerSocket();
			System.out.println("socket : " + socketPort + " server open !!");
			
			// binding
			mainServerSocket.bind(new InetSocketAddress( InetAddress.getLocalHost() , socketPort));  
			
			// socket server가 종료될 때까지 무한루프
			while(true) {
				// blocking
				Socket ss = mainServerSocket.accept();
				
				System.out.println("client is connected");
				
				new ClientThread(ss).start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Server extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();     
		root.setPrefSize(400, 300);
		root.setSpacing(15);       
		//--------------------------------------------------
	
		Button btn1 = new Button("Server open");
		Button btn2 = new Button("Server close");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread().start();
			}
		});
		root.getChildren().addAll(btn1, btn2);
		//----------------------------------------------------
		Scene scene = new Scene(root);    
		arg0.setTitle("Server"); 		   
		arg0.setScene(scene);
		arg0.show();					
	}
	
	public static void main(String[] args) {
		launch();
		System.out.println("EXIT");
	}
}