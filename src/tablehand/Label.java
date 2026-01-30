package tablehand;

import java.awt.Color;
import javax.swing.JLabel;

public class Label 
{
	Label(String labelText) 
	{
		JLabel label = new JLabel();
		label.setText(labelText);
		label.setForeground(Color.blue);
	}
}
