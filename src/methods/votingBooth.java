package methods;

import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	String Ans = JOptionPane.showInputDialog("how old are you?");
	int Ate = Integer.parseInt(Ans);
	
	if (Ate >= 18) {
		JOptionPane.showMessageDialog(null, "you can vote");
	}
	else {
		JOptionPane.showMessageDialog(null, "you can't vote");
	}
}
}
