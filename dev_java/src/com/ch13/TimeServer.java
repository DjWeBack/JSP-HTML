package com.ch13;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

import javax.swing.JFrame;

public class TimeServer extends Thread{
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	Socket client = null;
	public TimeServer(ObjectOutputStream oos, ObjectInputStream ois, Socket client) {
		this.oos=oos;
		this.ois=ois;
		this.client = client;
	}
	@Override
	public void run() {
		try {
			oos = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			while(true) {
				oos.writeObject(getTime());
				try {
					this.sleep(1);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
				}
	//���� �ð� ���� ��������
	public String getTime() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int milsec = cal.get(Calendar.MILLISECOND);
		String time = hour+":"+min+":"+sec+":"+milsec;
		return time;
	}
	public static void main(String[] args) {
		ServerSocket tserver = null;//Ŭ���̾�Ʈ�� ������ ��ٸ�.


		try {
				tserver = new ServerSocket(8080);
				while(true) {
					client = tserver.accept();
					System.out.println("������");
					TimeServer ts = new TimeServer();
					ts.start();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		
	}
}

