package com.ch6;

public class TV {
	int height = 0;
	int width = 0;
	String tv_color = null;
	int channel =0;//����
	int volume = 0;
	//�ڹٿ����� �����ڸ� ������ ������ �� �ִ�.(�����̸���)
	public TV() {
		//width = 0, height = 0, channel = 0, volume = 0, color = null
	}
	public TV(int channel, int volume, int width, int height) {
		this.width=width;
		this.height=height;
		this.channel=channel;
		this.volume=volume;
	}
	public TV(int width, int height) {//�ν��Ͻ�ȭ�� ���� ��� ������ �ʱ�ȭ�� ������.
		this.width = width;
		this.height = height;
		
	}

	boolean PowerOn(boolean on) {
		if(on==true) {
			System.out.println("TV�� �մϴ�.");
		}
		return on;

	}
	public TV(int channel, int volume,boolean onoff) {
		System.out.println("TV�� �մϴ�.");
		this.channel = channel;
		this.volume = volume;
		
	}
	public TV(boolean onoff,int width, int height) {
		System.out.println("TV�� ���ϴ�.");
		this.width = width;
		this.height = height;
		
	}
	boolean PowerOff(boolean off) {
		if(off==false) {
			System.out.println("TV�� ���ϴ�.");
		}
		return off;
	}
	int VolumeUp() {
		volume++;
		return volume;
	}
	int VolumeDown() {
		volume--;
		return volume;
	}
	int ChannelUp() {
		channel++;
		return channel;
	}
	int ChannelDown() {
		channel--;
		return channel;
	}

}
