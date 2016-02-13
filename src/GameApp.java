import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class GameApp {
	private JFrame frame;
	private DeckOfCards deck;
	
	//assign cards to JToggle buttons
	
	//each button calls activateCard(int cardNumber 0-15)
	
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

		deck= new DeckOfCards();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 4, 2, 2));
		
		
		JToggleButton tglbtnCard = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard.setSelectedIcon(new ImageIcon(deck.cards.get(0).cardImage[1]));
		frame.getContentPane().add(tglbtnCard);
		
		JToggleButton tglbtnCard_1 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_1.setSelectedIcon(new ImageIcon(deck.cards.get(1).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_1);
		
		JToggleButton tglbtnCard_2 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_2.setSelectedIcon(new ImageIcon(deck.cards.get(2).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_2);
		
		JToggleButton tglbtnCard_3 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_3.setSelectedIcon(new ImageIcon(deck.cards.get(3).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_3);
		
		JToggleButton tglbtnCard_4 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_4.setSelectedIcon(new ImageIcon(deck.cards.get(4).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_4);
		
		JToggleButton tglbtnCard_5 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_5.setSelectedIcon(new ImageIcon(deck.cards.get(5).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_5);
		
		JToggleButton tglbtnCard_6 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_6.setSelectedIcon(new ImageIcon(deck.cards.get(6).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_6);
		
		JToggleButton tglbtnCard_7 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_7.setSelectedIcon(new ImageIcon(deck.cards.get(7).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_7);
		
		JToggleButton tglbtnCard_8 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_8.setSelectedIcon(new ImageIcon(deck.cards.get(8).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_8);
		
		JToggleButton tglbtnCard_9 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_9.setSelectedIcon(new ImageIcon(deck.cards.get(9).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_9);
		
		JToggleButton tglbtnCard_10 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_10.setSelectedIcon(new ImageIcon(deck.cards.get(10).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_10);
		
		JToggleButton tglbtnCard_11 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_11.setSelectedIcon(new ImageIcon(deck.cards.get(11).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_11);
		
		JToggleButton tglbtnCard_12 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_12.setSelectedIcon(new ImageIcon(deck.cards.get(12).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_12);
		
		JToggleButton tglbtnCard_13 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_13.setSelectedIcon(new ImageIcon(deck.cards.get(13).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_13);
		
		JToggleButton tglbtnCard_14 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_14.setSelectedIcon(new ImageIcon(deck.cards.get(14).cardImage[1]));
		frame.getContentPane().add(tglbtnCard_14);
		
		JToggleButton tglbtnCard_15 = new JToggleButton(new ImageIcon(deck.cards.get(0).cardImage[0]));
		tglbtnCard_15.setSelectedIcon(new ImageIcon(deck.cards.get(15).cardImage[1]));
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
		
		JLabel lblNewLabel = new JLabel("[Placeholder for Timer]");
		menuBar.add(lblNewLabel);
		
		JLabel label = new JLabel(Integer.toString(Card.Attempts));
		menuBar.add(label);
	}
	
	/*public static void activateCard(int x) {
		cards.get(x).addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ev) {
				if (ev.getStateChange() == ItemEvent.SELECTED) {
					//TODO code for setting image to card back
					cards.get(x).setIcon(cardImage[1]);
					cards.get(x).setEnabled(false);//disables clicking on  a card after it's been clicked once
					for (int y = 0; y < cards.size(); y++) {
						if (cards.get(y) == cards.get(x)) {//checks if a selected card is the same as itself, skips rest of loop if true
							continue;
						} else if ((cards.get(y)).isSelected()) {
							//if a card other than the selected card is also selected
							for (int i = 0; i < cards.size(); i++) {
								if (cards.get(i) == cards.get(x)) {//if selected card is the same as itself, skip over rest of loop
									continue;
								} else if (cards.get(x).getSelectedIcon().equals(cards.get(i).getSelectedIcon())) {
									Score++;//iterate score if cards match
									

								} else if(cards.get(x).getSelectedIcon().equals(cards.get(i).getSelectedIcon())){
									
									cards.get(x).setIcon(cardImage[0]);
									cards.get(i).setIcon(cardImage[0]);
								} //deselects cards
									cards.get(x).setSelected(false);
									cards.get(i).setSelected(false);
								

									
							}
						}
					}
					Touch++;
				}
			}
		});

	}*/
}