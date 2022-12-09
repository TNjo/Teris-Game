package com;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {
	
	private JLabel statusbar;
	
	

	public Tetris() {
		initUI();
	}



	private void initUI() {
		// TODO Auto-generated method stub
		statusbar = new JLabel(" 0");
		add(statusbar , BorderLayout.SOUTH);
		
		var board  = new Board(this);
		add(board);
		board.start();
		
		setTitle("Tetris");
		setSize(200,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
				
	}
	
	JLabel getStatusBar() {

        return statusbar;
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(() ->{
			var game = new Tetris();
			game.setVisible(true);
		});

	}

}
