import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SwingCounter extends JFrame {
    int count;
    int count2;
	public SwingCounter(){
	JPanel p = new JPanel();
	p.setLayout(new FlowLayout());
	JLabel txt = new JLabel("Counter");
	JTextField fl = new JTextField(10);
	JButton btn = new JButton("Add");
	JButton btn2 = new JButton("Delete");
	
  
	p.add(txt);
	p.add(fl);
	p.add(btn);
	p.add(btn2);
	
	add(p);
                btn.addActionListener(

                	new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e)
           {
                 ++count;

                 fl.setText(count +"");
           }
	});
               btn2.addActionListener(

                	new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e)
           {
               --count;

                fl.setText(count +"");
           }
	});

}}
