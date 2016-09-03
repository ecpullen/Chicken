import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class EntryLine extends JPanel implements ActionListener{
	public Chicken c;
	public Breeder breeder;
	JRadioButton RCCL,SCCL,AOCCL,OE,MG,BTMD, FL;
	ButtonGroup classes;
	JButton next;
	JTextField breed, variety;
	JTextField ageSex;
	
	public EntryLine(Breeder b){
		
		breeder = b;
		setSize(1000,50);
		classes = new ButtonGroup();
		RCCL = new JRadioButton("RCCL");
		SCCL = new JRadioButton("SCCL");
		AOCCL = new JRadioButton("AOCCL");
		FL = new JRadioButton("FL");
		OE = new JRadioButton("OE");
		MG = new JRadioButton("MG");
		BTMD = new JRadioButton("BTMD");
		classes.add(RCCL);
		classes.add(SCCL);
		classes.add(AOCCL);
		classes.add(FL);
		classes.add(OE);
		classes.add(MG);
		classes.add(BTMD);
		next = new JButton("NEXT");
		breed = new JTextField("Breed",15);
		variety = new JTextField("Variety", 15);
		ageSex = new JTextField("C,H,K,P");
		add(breed);
		add(variety);
		add(RCCL);
		add(SCCL);
		add(AOCCL);
		add(OE);
		add(MG);
		add(BTMD);
		add(FL);
		add(ageSex);
		add(next);
		setBackground(Color.WHITE);
		next.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(next)){
			ButtonModel b = classes.getSelection();
			String cla = "NRB";
			if(RCCL.isSelected()){
				cla = "RCCL";
			}
			else if(SCCL.isSelected()){
				cla = "SCCL";
			}
			else if(AOCCL.isSelected()){
				cla = "AOCCL";
			}
			else if(OE.isSelected()){
				cla = "OE";
			}
			else if(MG.isSelected()){
				cla = "MG";
			}
			else if(BTMD.isSelected()){
				cla = "BTMD";
			}
			else if(FL.isSelected()){
				cla = "FL";
			}
			c = new Chicken(breeder, "Bantam", cla, breed.getText(), variety.getText(), ageSex.getText());
		}
		System.out.println(c);
		
		Data.add(c);
	}
	
	
	
	
	
}
