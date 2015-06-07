package rabbits;



public class Blocks {
	final int GROUND = 382;
	private int speedX = 0;
	private int speedY = 1;
	private int centerX = 100;
	private int centerY = 0;
	
	
	public void update(){
		if (centerY < GROUND) {
			centerY += 1;
		}
	}
	

	
	public void moveLeft(){
		if (centerY == 382){
			System.out.println("block is set and you cannot move");
		}else{
		centerX -= 5;}
	}
	
	public void moveRight(){
		if (centerY == 382){
			System.out.println("block is set and you cannot move");
		}else{
		centerX += 5;}
	}
	


	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	

	

	
}
