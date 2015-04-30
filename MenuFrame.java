// MenuFrame: Frame to contain the menu that first loads.

import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame
{
	private JPanel panel = new MenuPanel();
	public MenuFrame()
	{
		this.setTitle("Start Menu");
		setBounds(267, 200, 800, 500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centerFrame(this);

		this.add(panel);
	}

	public void centerFrame(Window w)
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension d = kit.getScreenSize();
		setLocation( ((d.width - w.getWidth()) / 2), ((d.height - w.getHeight()) / 2));
	}

	public static void main(String [] args)
	{
		JFrame frame = new MenuFrame();
		frame.setVisible(true);
	}
}