import javax.swing.JFrame;

public class Main {
	static int SCREEN_WIDTH = 1000;
	static int SCREEN_HEIGHT = 600;
	
	public static void main(String[] args) {
//		System.out.print("Hello");
		JFrame frame = new JFrame();
		
		frame.setTitle("Supermarket Management System");
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setVisible(true);
	}
}
