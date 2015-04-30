// InfoFrame: Frame to contain the game info.

import javax.swing.*;
import java.awt.*;

public class InfoFrame extends JFrame
{
	private JPanel panel = new InfoPanel();

	public InfoFrame()
	{
		this.setTitle("Game Info");
		setBounds(100, 200, 400, 500);
		setResizable(true);

		this.add(panel);
	}

	public static void main(String [] args)
	{
		JFrame frame = new InfoFrame();
		frame.setVisible(true);
	}
}