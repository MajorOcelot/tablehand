package tablehand;

import javax.swing.JFrame;

public class BaseFrame extends JFrame 
{
	BaseFrame()
	{
		new Label("How's it goin?");
		
		
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
		
		
	}
}
