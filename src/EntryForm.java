import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class EntryForm extends JPanel{

	private JFrame window;
    private JButton b1;
    private JLabel s1;
    private JTextField t1;
    private Breeder b;
    
    public EntryForm(Breeder b){
    	new Data("CMBF");
    	this.b = b;
        window = new JFrame("EntryForm, " + b.name);
        window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        window.setSize(1250,600);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setBackground(Color.BLACK);
        setBackground(Color.WHITE);
        window.add(this);
        
        /*setLayout(null);
        b1 = new JButton("NextPage");
        b1.setSize(100, 30);
        b1.setLocation(1130,550) ;
        b1.setBackground(Color.WHITE);
        add(b1);
        s1 = new JLabel("Hi");
        s1.setName("Hello");
        s1.setSize(100, 1000);
        s1.setLocation(100,100);
        s1.setForeground(Color.CYAN);
        add(s1);
        t1 = new JTextField("Enter numbers");
        add(t1);
       // window.setVisible(true);
        repaint();
        this.addKeyListener(new Listener(this));*/
        //this.addActionListener(new Listener(this));
        EntryLine t2;
        int c = 50;
        while(c < 600){
        	t2 = new EntryLine(b);
        	t2.setLocation(100,c);
        	window.add(t2);
        	c += 50;
        	System.out.println(c);
        }
        //window.add(new EntryLine(new Breeder(null,null,null)));
        //window.add(new EntryLine(new Breeder(null,null,null)));
        window.setVisible(true);
    }

	public void action(ActionEvent e) {}
}
