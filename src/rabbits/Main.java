package rabbits;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Main extends Applet implements Runnable, KeyListener {
	Dimension dim;
	Image offscreen;
	Graphics bufferGraphics;
	private int i=0;
	private ArrayList<Blocks> blocks = new ArrayList<Blocks>();
	private Blocks curBlock;
	private Blocks nextBlock;
	public void init() {
		
		//construct the applet
		setSize(800, 480);
		setBackground(Color.WHITE);
		setFocusable(true);
		addKeyListener(this);
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("Rabbits");
		
	  // Create an off screen image to draw on for double buffering 
	   dim = getSize();
       offscreen = createImage(dim.width,dim.height); 
       bufferGraphics = offscreen.getGraphics(); 
       
       curBlock = new Blocks();
       blocks.add(curBlock);
		
	}

	public void start() {
		
		
		
		

		Thread thread = new Thread(this);
		thread.start();
		

	}

	public void run() {
		while (true) {
			
			System.out.println("now drawing"+blocks);
			if (blocks.get(i).getCenterY() == 382) {
				curBlock = new Blocks();
				blocks.add(curBlock);
				i++;
			}
			
			for(Blocks block: blocks){
			block.update();
			repaint();
			}
			
			
			
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	

	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			break;

		case KeyEvent.VK_DOWN:
			break;

		case KeyEvent.VK_LEFT:
			curBlock.moveLeft();
			break;

		case KeyEvent.VK_RIGHT:
			curBlock.moveRight();
			break;

		case KeyEvent.VK_SPACE:
			break;
		}
	}



	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			break;

		case KeyEvent.VK_DOWN:
			break;

		case KeyEvent.VK_LEFT:
			curBlock.moveLeft();
			break;

		case KeyEvent.VK_RIGHT:
			curBlock.moveRight();
			break;

		case KeyEvent.VK_SPACE:
			break;
		}

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void update(Graphics g) {
			paint(g);
	}
	
	
	public void paint(Graphics g) {
		//System.out.println(bg1.getCenterX()+","+bg1.getCenterY());
		
		//remove old image & buffer new one
		bufferGraphics.clearRect(0,0,dim.width,dim.width); 
        bufferGraphics.setColor(Color.red); 
        
        for(Blocks block: blocks){
          bufferGraphics.drawRect(block.getCenterX(), block.getCenterY(), 50, 50);
        }
        //move buffer to screen
        g.drawImage(offscreen,0,0,this); 
	}
	
	public void stop() {
	}

	public void destroy() {
	}
}
