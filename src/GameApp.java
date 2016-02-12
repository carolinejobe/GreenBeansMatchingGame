import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
public class GameApp {
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameApp window = new GameApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public GameApp() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 4, 2, 2));
		
		JToggleButton tglbtnCard = new JToggleButton("Card 1");
		frame.getContentPane().add(tglbtnCard);
		
		JToggleButton tglbtnCard_1 = new JToggleButton("Card 2");
		frame.getContentPane().add(tglbtnCard_1);
		
		JToggleButton tglbtnCard_2 = new JToggleButton("Card 3");
		frame.getContentPane().add(tglbtnCard_2);
		
		JToggleButton tglbtnCard_3 = new JToggleButton("Card 4");
		frame.getContentPane().add(tglbtnCard_3);
		
		JToggleButton tglbtnCard_4 = new JToggleButton("Card 5");
		frame.getContentPane().add(tglbtnCard_4);
		
		JToggleButton tglbtnCard_5 = new JToggleButton("Card 6");
		frame.getContentPane().add(tglbtnCard_5);
		
		JToggleButton tglbtnCard_6 = new JToggleButton("Card 7");
		frame.getContentPane().add(tglbtnCard_6);
		
		JToggleButton tglbtnCard_7 = new JToggleButton("Card 8");
		frame.getContentPane().add(tglbtnCard_7);
		
		JToggleButton tglbtnCard_8 = new JToggleButton("Card 9");
		frame.getContentPane().add(tglbtnCard_8);
		
		JToggleButton tglbtnCard_9 = new JToggleButton("Card 10");
		frame.getContentPane().add(tglbtnCard_9);
		
		JToggleButton tglbtnCard_10 = new JToggleButton("Card 11");
		frame.getContentPane().add(tglbtnCard_10);
		
		JToggleButton tglbtnCard_11 = new JToggleButton("Card 12");
		frame.getContentPane().add(tglbtnCard_11);
		
		JToggleButton tglbtnCard_12 = new JToggleButton("Card 13");
		frame.getContentPane().add(tglbtnCard_12);
		
		JToggleButton tglbtnCard_13 = new JToggleButton("Card 14");
		frame.getContentPane().add(tglbtnCard_13);
		
		JToggleButton tglbtnCard_14 = new JToggleButton("Card 15");
		frame.getContentPane().add(tglbtnCard_14);
		
		JToggleButton tglbtnCard_15 = new JToggleButton("Card 16");
		frame.getContentPane().add(tglbtnCard_15);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewGame = new JMenuItem("New Game");
		mnFile.add(mntmNewGame);
		
		JMenuItem mntmLeaderboard = new JMenuItem("Leaderboard");
		mnFile.add(mntmLeaderboard);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
	}
}