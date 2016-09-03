import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class SearchBar extends JPanel implements ActionListener{

	JFrame window;
	JTextField searchBar;
	JButton search;
	
	public SearchBar(){
		//window = new JFrame("Search");
		//window.setSize(500,100);
		//window.add(this);
		
		//window.setLocation(750,0);
		
		search = new JButton("Search");
		searchBar = new JTextField("Search", 25);
		
		add(search);
		add(searchBar);
		//window.setLocation(500, 0);
		//window.setVisible(true);
		searchBar.addActionListener(this);
		search.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = searchBar.getText();
		ArrayList<Breeder> bL = BreederList.breederList;
		
		for(Breeder b: bL){
			if(s.equals(b.name)){
				b.showEntry();
				System.out.println(b.name);
			}
		}
	}
	
	
}
