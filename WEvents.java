package calc;
import java.awt.*;
import java.awt.event.*;

public class WEvents extends WindowAdapter{
	
	Frame frame;
	WEvents(Frame f){
	frame = f;
	}
	
	public void windowClosing (WindowEvent e) {
		frame.dispose();

}
}