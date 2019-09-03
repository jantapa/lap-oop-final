import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jan{

	public static void main(String[] args) {

		Temperature f = new Temperature();
		 f.pack();
		 f.setTitle("Temperature Converter");
		 f.setSize(300, 100);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setLocationRelativeTo(null);
		 f.setVisible(true);
	}
}