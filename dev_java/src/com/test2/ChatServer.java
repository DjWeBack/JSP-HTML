package com.test2;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ChatServer{ 
	//ä�ü��� Ŭ����
	public ChatServer(){
		SocketStart();
	}
	public String DID() {
		//�����ͺ��̽� �޼ҵ� //�������� ���Ŀ�ؼ��� �̿��� ����.
		String user_id="weback";//������ ����� �������̵�
		return user_id;
	}
	public String DPW() {
		String user_pw = "112233";
		return user_pw;
	}
	public void initDisplay() {
		//UI ���� �޼ҵ�
	}
	public void SocketStart() {
		try {
			System.out.println("���� �������");
			ServerSocket s_socket = new ServerSocket(8080);
			System.out.println("���� ����");
			System.out.println("Ŭ���̾�Ʈ �����");
			Socket c_Socket = s_socket.accept();
			OutputStream s_req = c_Socket.getOutputStream();
			String ServerMsg = "Server���� ����";
			int i = 0;
			while(true) {
				if(i==0) {
				s_req.write(ServerMsg.getBytes());
				i++;
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String args[]) {
		new ChatServer();
	}
}
