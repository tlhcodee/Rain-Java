package dev.tal.rain;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JPanel;

import dev.tal.rain.line.Line;

@SuppressWarnings("serial")
public class Panel extends JPanel implements Runnable{
	
	public List<Line> rainLines = new ArrayList<Line>();
	
	public Panel(int amount) {

		for(int i = 0; i < amount; i++) {
			int randomX = ThreadLocalRandom.current().nextInt(Rain.width);
			int randomY = ThreadLocalRandom.current().nextInt(-25, -15);
			int randomSpeed = ThreadLocalRandom.current().nextInt(5);
			rainLines.add(new Line(-5, randomX, randomY, randomSpeed));
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.MAGENTA);
		for(Line line : rainLines) {
			g.drawLine(line.getX(), line.getY(), line.getX(), line.getY() + 20);
		}
		this.repaint();
	}

	@Override
	public void run() {
		while(true) {
			for(Line line : rainLines) {
				line.runTheAnimation(Rain.height + 55);
			}
		}
	}

}
