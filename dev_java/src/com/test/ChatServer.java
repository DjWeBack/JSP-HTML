package com.test;

import java.io.*;
import java.net.*;

public class ChatServer extends Thread{ 
	//ä�ü��� Ŭ����
	
		
	void ChatServer() {
		SocketStart();
		
	}
	void ChatServer(int a) {
		//��Ʈ�� ������
		
	}
	public void DataBase() {
		//�����ͺ��̽� �޼ҵ� //�������� ���Ŀ�ؼ��� �̿��� ����.
		String user_id="weback";
		String user_pw="112233";
	}
	public void initDisplay() {
		//UI ���� �޼ҵ�
	}
	public void SocketStart() {
		try {
			ServerSocket s_socket = new ServerSocket(8080);		// ���� ���� �� ip �� 6���� ������ ������ְ� �� ������ ��Ʈ��ȣ (8080);
			Socket c_Socket = s_socket.accept();				// ������ ������ ������ ���� Ȯ�� �ϴ� ���� 
			OutputStream s_reqO = c_Socket.getOutputStream();	// ����� �Ҽ��ִ� ��θ� ����
			InputStream s_reqI = c_Socket.getInputStream();		// �Է��� �Ҽ��ִ� ��θ� ����
			
			DataInputStream DIS = new DataInputStream(s_reqI);	// ������ Ÿ���� ������ 
			DataOutputStream DOS = new DataOutputStream(s_reqO);// ������ Ÿ���� Ʈ�� 
			
			String ServerMsg = "Server���� ����";
			
			DOS.writeUTF(ServerMsg);
			DIS.readUTF();
			
			s_socket.close();
			c_Socket.close();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
	@Override
	public void run() {
		try {
			
			SocketStart();
			//ù��° ������� ���ϴ����¸� ����� ��������
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String args[]) {
		new ChatServer();
		
	}
}
