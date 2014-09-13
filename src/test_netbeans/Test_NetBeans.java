/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_netbeans;

import javax.swing.*;

/*public class Test_NetBeans {
	public static void main(String args[]) {
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\huon\\Desktop\\book\\picture\\1247486914.jpg"));
		JScrollPane scroll = new JScrollPane(label);

		JFrame win = new JFrame();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setBounds(10 , 10 , 400 , 300);
		win.getContentPane().add(scroll);
		win.show();
	}
}*/

import java.awt.*;

class Test_NetBeans extends JFrame {
	Test_NetBeans() {
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(false);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(200, 100));
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JScrollPaneTest");
		setSize(200, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test_NetBeans();
	}
}