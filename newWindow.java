import java.awt.*;
import javax.swing.*;

public class newWindow
{
	private static void createWindow() 
	{
		JFrame window = new JFrame("Hello World!");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel displayText = new JLabel("Hello World!", SwingConstants.CENTER);
		displayText.setPreferredSize(new Dimension(300, 100));
		window.getContentPane().add(displayText, BorderLayout.CENTER);
		
		window.setLocationRelativeTo(null);
		window.pack();
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createWindow();
	}
}
