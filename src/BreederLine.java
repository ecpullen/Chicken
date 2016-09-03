import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BreederLine extends JPanel implements ActionListener{

	JTextField name,address,email;
	JButton next;
	
	public BreederLine(){
		setLayout(new FlowLayout());
		next = new JButton("Next");
		name = new JTextField("Name", 20);
		address = new JTextField("Address", 40);
		email = new JTextField("Email", 30);
		add(name);
		add(address);
		add(email);
		add(next);
		next.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BreederList.breederList.add(new Breeder(name.getText(), address.getText(), email.getText()));
		System.out.println(BreederList.breederList.get(BreederList.breederList.size() - 1).name);
		new EntryForm(BreederList.breederList.get(BreederList.breederList.size() - 1));
	}
}
