package dev.tal.rain.line;

public class Line {
	
	private int x, y, startY, speed;
	
	public Line(int startY, int x, int y, int speed) {
		this.startY = y;
		this.x = x;
		this.y = y;
		this.speed = speed;
	}
	
	public void runTheAnimation(int maxHeight) {
		if(this.y >= maxHeight) {
			this.y = startY;
		} else {
			this.y += speed;
		}
	}

	
	
	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
