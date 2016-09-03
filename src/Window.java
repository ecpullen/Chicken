import java.awt.*;
import javax.swing.*;


public class Window extends JPanel{
	JFrame window;
	
	
	public Window(String showName){
		//JButton test = new JButton("test")
		setLayout(new FlowLayout());
		//setLayout(null);
		setBackground(Color.RED);
		//window.setResizable(false);
		window = new JFrame("Show Report, " + showName);
		new Data(showName);
		window.setSize(1500, 720);
		window.setResizable(false);
		SearchBar sb = new SearchBar();
		add(new BreederLine());
		add(sb);
		Dimension size = sb.getSize();
		sb.setBounds(0, 0, (int)size.getWidth(), (int)size.getHeight());
		sb.setVisible(true);
		add(sb);
		
		//sb.setLocation(1500,500); 
		/*BreederLine bl = new BreederLine();
		add(bl);
		bl.setVisible(true);
		bl.setLocation(540, 360);*/
		
		Breeder temp = new Breeder(null,null,null);
		add(new BreederPanel(temp));
		
		setVisible(true);
		window.add(this);
		window.setVisible(true);
		
	}
	
	public static void main(String [] args){
		new Window("CMBF");
	}
	
}
