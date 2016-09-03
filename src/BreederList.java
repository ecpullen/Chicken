import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class BreederList extends JPanel{

	public static ArrayList<Breeder> breederList;
	
		private JFrame window;
		
	public BreederList(){
		window = new JFrame();
		window.setSize(1000,200);
		window.add(new BreederLine());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		breederList = new ArrayList<Breeder>();
	}
	
	public static void main(String [] args){
		new BreederList();
		new SearchBar();
	}
}
