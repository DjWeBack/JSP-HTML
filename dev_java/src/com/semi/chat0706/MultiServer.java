package com.semi.chat0706;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
class Service extends Thread{
	Socket client = null;
	MultiServer mServer = null;
	ObjectInputStream ois = null;//���
	ObjectOutputStream oos = null;//���ϱ�
	public Service(Socket client, MultiServer mServer) {
		this.client = client;
		this.mServer = mServer;
		try {
			
			oos = new ObjectOutputStream
					(client.getOutputStream());
			ois = new ObjectInputStream
					(client.getInputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void run() {}
}

public class MultiServer extends JFrame implements Runnable{
	JTextArea		jta_log = new JTextArea();
	JScrollPane		jsp_log = new JScrollPane(jta_log);
	public MultiServer() {
		this.add("Center",jsp_log);
		this.setTitle("Server log����ϱ�");
		this.setSize(500, 400);
		this.setVisible(true);
		jta_log.append("Server Ready......\n");
			}
	
	public static void main(String[] args) {
		MultiServer ms = new MultiServer();
		new Thread(ms).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(3100);
		} catch (Exception e) {
			// TODO: handle exception
		}
		while(true) {
			
			try {
				Socket client = ss.accept();
				System.out.println(client);
				Service sv = new Service(client,this);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
