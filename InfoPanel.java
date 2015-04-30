// InfoPanel: Panel for the game info.

import javax.swing.*;

public class InfoPanel extends JPanel
{
	private JLabel infoText;

	public InfoPanel()
	{
		infoText = new JLabel("This is the game info");

		this.add(infoText);
	}
}