package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	JFrame frame=new JFrame();
	JButton button=new JButton("add name");
	JPanel panel=new JPanel();
	JButton button1=new JButton("view names");
	String[] arrayList=new String[4];
	public void run() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(button1);
	button.addActionListener(this);
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String names=JOptionPane.showInputDialog(null,"enter the persons name or else");
		arrayList[4]=names;
		
	}
}
