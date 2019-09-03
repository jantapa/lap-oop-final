import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ha{

	public static void main(String[] args) {
		SwingCounter f = new SwingCounter();
         f.pack();
 		 f.setTitle("Swing Counter");
		
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setLocationRelativeTo(null);
		 f.setVisible(true);
	}
}