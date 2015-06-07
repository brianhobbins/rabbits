import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


@SuppressWarnings("serial")
public class Main extends Applet implements Runnable,KeyListener{
	
	public void init(){
		  setSize(800, 480);
	        setBackground(Color.BLACK);
	        setFocusable(true);
	        Frame frame = (Frame) this.getParent().getParent();
	        frame.setTitle("Rabbits");
	} 
	public void start(){
		Thread thread = new Thread(this);
	    thread.start();
		
	} 
	
	public void run() {
	    while (true) {
	        repaint();
	        try {
	            Thread.sleep(17);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	} 
	
	public void stop(){} 
	public void destroy(){}
	
	public void keyPressed(KeyEvent e) {

		   switch (e.getKeyCode()) {
		   case KeyEvent.VK_UP:
		   break;

		   case KeyEvent.VK_DOWN:
		   break;

		   case KeyEvent.VK_LEFT:
		   break;

		   case KeyEvent.VK_RIGHT:
		   break;

		   case KeyEvent.VK_SPACE:
		   break;
		   }
		}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
