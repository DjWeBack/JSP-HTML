package com.ch11;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImgIOTest {
	public void initdis() {
		String imagePath = "�̹������.."; 
		BufferedImage image = null;
		//�̹����� �о�ͼ� BufferedImage�� �ִ´�. 
		image = ImageIO.read(new URL(imagePath)); 
		int width = image.getWidth(); 
		int height = image.getHeight(); 
		//���ϸ� �ڸ��� 
		String fileNm = imagePath.substring(imagePath.lastIndexOf("/") + 1); 
		try { 
			// ������ �̹����� ũ��� Ÿ���� �����. 
			BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR); 
			bufferedImage.createGraphics().drawImage(image, 0, 0, this); 
			// �ش��ο� �̹����� ������. 
			ImageIO.write(bufferedImage, "jpg", new File("C:/saveImage/" + fileNm)); 
		} 
		catch(Exception e) { 
			e.printStackTrace(); 
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
