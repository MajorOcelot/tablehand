package tablehand;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BaseFrame extends JFrame 
{
	BaseFrame()
	{		
		// Sets title for frame
		this.setTitle("Tablehand");
		
		// Sets default operation for close button to exit application
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Prevents window from being resized
		this.setResizable(false);
		
		// Sets the size of the window
		this.setSize(800, 800);
		
		// Displays the Frame
		this.setVisible(true);
		
		JLabel testLabel = new JLabel("Hello");
		
		this.add(testLabel);
	}
}
