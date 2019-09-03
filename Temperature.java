import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temperature extends JFrame{

	

	public Temperature(){

	
	JPanel p = new JPanel();
	p.setLayout(new GridLayout(2,2,5,5));
	JLabel txt = new JLabel("Celsius:");
	JTextField fl = new JTextField(15);
	

	JLabel txt1 = new JLabel("Fahrenheit:");
	JTextField f2 = new JTextField(15);

    
	p.add(txt);
	p.add(fl);
	p.add(txt1);
	p.add(f2);
	
	add(p);


	  fl.addActionListener(

                	new ActionListener() {


        @Override
            public void actionPerformed(ActionEvent e)
           { 

           	    String str = fl.getText();
            
           	 double answer1;
           	 double answer2;
              
             answer1=Double.parseDouble(str);

             answer2 = (answer1*1.8)+32;
              
             String aa = answer2+"";


                 f2.setText(aa);

           }

   });

                f2.addActionListener(

                	new ActionListener() {


        @Override
            public void actionPerformed(ActionEvent e)
           {

           	 
             String aa = f2.getText();
                double c;
                double fa;

                fa = Double.parseDouble(aa);

                c = (fa-32)/1.8000;

                 String g = c+"";
                 
                   
             fl.setText(g);
           	   
           }


	});

   }
}


