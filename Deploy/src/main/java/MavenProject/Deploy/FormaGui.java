package MavenProject.Deploy;

import javax.swing.JFrame;
import javax.swing.JButton;

public class FormaGui extends JFrame{
	public FormaGui() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Deployed");
		btnNewButton.setBounds(154, 123, 85, 21);
		getContentPane().add(btnNewButton);
	}
}
