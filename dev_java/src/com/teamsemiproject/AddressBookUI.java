package com.teamsemiproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;

import com.oracle.jdbc.DBConnection;

public class AddressBookUI {
	//�����ͺ��̽� ����
	
	
	final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
	final String _USER = "scott";
	final String _PW = "tiger";
	Connection 	con 		= 	null;
	CallableStatement cstmt = null;
	PreparedStatement pstmt = null;
	//	Statement cstmt = null;
	ResultSet rs = null;
	DBConnection dbCon = new DBConnection();
	
			JFrame 				jf_addr		= new JFrame();
			JMenuBar 			jmb 		= new JMenuBar();
			JMenu 				jm_edit 	= new JMenu("Edit");
			JMenu 				jm_file 	= new JMenu("File");
			JMenuItem		 	jmi_ins 	= new JMenuItem("�Է�");
			JMenuItem 			jmi_upd 	= new JMenuItem("����");
			JMenuItem 			jmi_del 	= new JMenuItem("����");
			JMenuItem 			jmi_det 	= new JMenuItem("����ȸ");
			JMenuItem 			jmi_all 	= new JMenuItem("��ü��ȸ");
			JMenuItem 			jmi_exit 	= new JMenuItem("����");
			JPanel 				jp_topb		= new JPanel();
			JPanel 				jp_center	= new JPanel();
	static 	AddressBookUI		abook 		= null;
	//���� �߰�
			JToolBar			jtbar 		= new JToolBar();
			JButton				jbtn_ins	= new JButton();
			JButton				jbtn_upd	= new JButton();
			JButton				jbtn_del	= new JButton();
			JButton				jbtn_det	= new JButton();
			JButton				jbtn_all	= new JButton();
			String 				imgPath 	= "D:\\image\\";
			AddressEvent 		ade			= new AddressEvent(this);
			ImageIcon titleIcon = new ImageIcon(imgPath+"jodan.png");
	//���̺� �߰�
//			String col[] = {"��ȣ","�̸�","����","�޴���ȭ","����ó","ī�װ�","�������","�����ȣ"};
			String col[] = {"��ȣ","�̸�","�޴���ȭ","�������"};
			DefaultTableModel 	dtm			= new DefaultTableModel(col,0);
			JTable				jtb			= new JTable(dtm);
			JScrollPane			jsp			= new JScrollPane(jtb);
		
			public Connection getConnetion() {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");//Ŭ������ �޸𸮿� �ε� Ŭ���� �̸��� ��ã���� �����?
					con = DriverManager.getConnection(_URL, _USER, _PW);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.toString());
				}
				
				return con;
			}
			public AddressBookUI() {
		getConnetion();
		initDisplay();
		Select();
	}
			public AddressBookUI(int i) {
				
			}
			public void Select() {

				int test[] =jtb.getSelectedRows(); 
				try {
					String sql = "select * from ADDRESSBOOK";
					pstmt = con.prepareStatement(sql);
					System.out.println("pstmt : "+pstmt);
					rs = pstmt.executeQuery();
					System.out.println("rs : "+rs);
					while(rs.next()) {
						String num =rs.getString(1);
						String name =rs.getString(2);
//						String gen = rs.getString(3);
						String hp = rs.getString(4);
//						String tel = rs.getString(5);
//						String cat = rs.getString(6);
						String bi = rs.getString(7);
//						String post = rs.getString(8);
						//�̸� ���� �޴���ȭ ��ȭ ī�װ� ������� �����ȣ
						Object data[]= {num,name,hp,bi};
						dtm.addRow(data);
					}

				}
					catch (Exception e) {
						System.out.println(e);
					}					
				while(dtm.getRowCount()>0) {//��ȸ�� �ϰԵǸ� �ڵ����� �������� �ϰԵ�.
						dtm.removeRow(0);
					}
				try {
					String sql = "select * from ADDRESSBOOK";
					pstmt = con.prepareStatement(sql);
					System.out.println("pstmt : "+pstmt);
					rs = pstmt.executeQuery();
					System.out.println("rs : "+rs);
					while(rs.next()) {
						String num =rs.getString(1);
						String name =rs.getString(2);
//						String gen = rs.getString(3);
						String hp = rs.getString(4);
//						String tel = rs.getString(5);
//						String cat = rs.getString(6);
						String bi = rs.getString(7);
//						String post = rs.getString(8);
						//�̸� ���� �޴���ȭ ��ȭ ī�װ� ������� �����ȣ
						Object data[]= {num,name,hp,bi};
						dtm.addRow(data);
					}

				}
					catch (Exception e) {
						System.out.println(e);
					}
				}
			public void dataAll() {
				JFrame 				jf_addr		= new JFrame();
				JPanel 				jp_center	= new JPanel();
				String col[] = {"��ȣ","�̸�","����","�޴���ȭ","����ó","ī�װ�","�������","�����ȣ"};
				DefaultTableModel 	dtm			= new DefaultTableModel(col,0);
				JTable				jtb			= new JTable(dtm);
				JScrollPane			jsp			= new JScrollPane(jtb);
				jf_addr.setSize(400, 600);
				jf_addr.setTitle("���̺� �󼼺���");
				jf_addr.setVisible(true);
				jf_addr.add("Center", jp_center);
				jp_center.add(jsp);
				
				try {
					String sql = "select * from ADDRESSBOOK";
					pstmt = con.prepareStatement(sql);
					System.out.println("pstmt : "+pstmt);
					rs = pstmt.executeQuery();
					System.out.println("rs : "+rs);
					while(rs.next()) {
						String num =rs.getString(1);
						String name =rs.getString(2);
						String gen = rs.getString(3);
						String hp = rs.getString(4);
						String tel = rs.getString(5);
						String cat = rs.getString(6);
						String bi = rs.getString(7);
						String post = rs.getString(8);
						//�̸� ���� �޴���ȭ ��ȭ ī�װ� ������� �����ȣ
						Object data[]= {num,name,gen,hp,tel,cat,bi,post};
						dtm.addRow(data);
					}
				}
					catch (Exception e) {
						System.out.println(e);
					}
				
				}	
			
	public void initDisplay() {
		//��ư�� �̹��� ������ �߰��ϱ�
		jbtn_ins.setIcon(new ImageIcon(imgPath+"new.gif"));
		jbtn_upd.setIcon(new ImageIcon(imgPath+"update.gif"));
		jbtn_del.setIcon(new ImageIcon(imgPath+"delete.gif"));
		jbtn_det.setIcon(new ImageIcon(imgPath+"detail.gif"));
		jbtn_all.setIcon(new ImageIcon(imgPath+"detail.gif"));
		
		jmb.add(jm_file);
		jmb.add(jm_edit);
		jm_edit.add(jmi_ins);
		jm_edit.add(jmi_upd);
		jm_edit.add(jmi_del);
		jm_edit.add(jmi_det);
		jm_edit.add(jmi_all);
		jm_file.add(jmi_exit);
		jf_addr.setJMenuBar(jmb);
		//���ٿ� ��ư �߰��ϱ�
		jtbar.add(jbtn_ins);
		jtbar.add(jbtn_upd);
		jtbar.add(jbtn_del);
		jtbar.add(jbtn_det);
		jtbar.add(jbtn_all);
		jf_addr.setSize(500, 600);
		jf_addr.setTitle("���� ù ������ �ּҷ� Ver 1.0");
		jf_addr.setVisible(true);
		//���� ���ʿ� ��ġ�ϱ�
		jf_addr.add("North",jtbar);
		jbtn_ins.setToolTipText("�Է�");
		jbtn_upd.setToolTipText("����");
		jbtn_del.setToolTipText("����");
		jbtn_det.setToolTipText("��");
		jbtn_all.setToolTipText("��ü����");
		jp_center.add(jsp);
		jf_addr.add("Center", jp_center);
		
		jbtn_ins.addActionListener(ade);
		jbtn_upd.addActionListener(ade);
		jbtn_del.addActionListener(ade);
		jbtn_det.addActionListener(ade);
		jbtn_all.addActionListener(ade);
		jmi_exit.addActionListener(ade);
		jf_addr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�����̺�Ʈ
		jf_addr.setIconImage(titleIcon.getImage());
		//���� ������ ȭ���� ũ��
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension di2 = jf_addr.getSize();
		jf_addr.setLocation((int)di.getWidth()/2-(int)di2.getWidth()/2,(int)di.getHeight()/2-(int)di2.getHeight()/2);

	}


	public static void main(String[] args) {
//		JFrame.setDefaultLookAndFeelDecorated(true);
		abook = new AddressBookUI();
		
		
	}

}
