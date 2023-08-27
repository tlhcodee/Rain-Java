package dev.tal.rain;

public class Rain {
	
	public static Panel panel;
	public static Window window;
	public static final int width = 500, height = 500;
	
	public static void main(String[] args) {
		panel = new Panel(70);
		window = new Window(panel, "Rain - Particles", width, height);
		panel.run();
	}

}
