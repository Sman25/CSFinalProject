// MenuPanel: Panel for the menu that first loads.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MenuPanel extends JPanel implements ActionListener
{
	// Buttons
	private JButton binfo;
	private JButton bstart;

	public MenuPanel()
	{
		binfo = new JButton("Game Info");
		bstart = new JButton("Start Game");

		binfo.addActionListener(this);
		bstart.addActionListener(this);

		this.add(binfo);
		this.add(bstart);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();

		if(source == binfo)
		{
			JFrame infoFrame = new InfoFrame();
			infoFrame.setVisible(true);
		}
	}
}