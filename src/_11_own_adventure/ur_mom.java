package _11_own_adventure;

import javax.swing.JOptionPane;

public class ur_mom {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"welcome traveler toletpaper. your quest is to fing the ultmate pooooooooop");
		String poop = JOptionPane.showInputDialog("sherch in big poop or tolet");
		if (poop.equals("big poop")) {
			JOptionPane.showMessageDialog(null, "you go in the big poop and look around");
			String bigpoop = JOptionPane.showInputDialog("look in bathroom or stay around");
			if (bigpoop.equals("go in bathroom")) {
				JOptionPane.showMessageDialog(null, "you go in bathroom");
				JOptionPane.showInputDialog(null, "you die of smellness");
				if (bigpoop.equals("stay around")) {
					JOptionPane.showMessageDialog(null, "you find tohe ultmate poop but leave it");
					JOptionPane.showMessageDialog(null, "you die of stupidness");
				}
			}
		}
		if (poop.equals("tolet")) {
			JOptionPane.showMessageDialog(null, "you go in the tolet and flush your self ");
			String tolet = JOptionPane.showInputDialog(null, "go pipe one or pipe two");
			if (tolet.equals("pipe 1")) {
				JOptionPane.showMessageDialog(null, "you go in pipe one you get flushed into a alagator");
				JOptionPane.showMessageDialog(null, "you died of alagatorness");
				if (tolet.equals("pipe 2")) {
					 JOptionPane.showMessageDialog(null,
							"you go in pipe two you get flushed into the big poop and fing the ultmate poop");
					JOptionPane.showMessageDialog(null, "you grab to poop and aborsorbe it, die or die");
				
						
					}
				}
			}
		}

	}

