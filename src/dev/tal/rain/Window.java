package dev.tal.rain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import dev.tal.rain.line.Line;

@SuppressWarnings("serial")
public class Window extends JFrame{
	
	public List<Line> rainLines = new ArrayList<Line>();
	
	public Window(Panel panel, String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		add(panel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
