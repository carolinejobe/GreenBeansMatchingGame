mport java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Cards extends JToggleButton {

	private static Cards cards[];
	private static int Attempts;
	private static int Score;
	static String[] cardImage = new String[2];
	static String[] cardFaces = { "Path1", "Path2", "Path3", "Path4", "Path5", "Path6", "Path7", "Path8" };

	/**
	 * Logic for checking card matches
	 * 
	 * 
	 * Cards have 3 properties: boolean selected boolean active icon
	 * 
	 * while(Score<8){
	 */

	// TODO CODE FOR CHANGING CARDBACK TO CARDFRONT FOR BOTH BUTTONS
	// TODO DISABLE BUTTONS ON ACTIVATION, REENABLE ON DEACTIVATION WHEN NON
	// MATCH
	private Cards() {
	}

	public static Cards[] getCards() {
		return cards;
	}

	/**
	 * 
	 * @param int
	 *            x where x is a card object in an array
	 */
	public static void makeCard(int x) {
		cards[x].addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ev) {
				if (ev.getStateChange() == ItemEvent.SELECTED) {
					for (int y = 0; y < cards.length; y++) {
						if (cards[y] == cards[x]) {
							continue;
						} else if ((cards[y]).isSelected()) {

							for (int i = 0; i < cards.length; i++) {
								if (cards[i] == cards[x]) {
									continue;
								} else if (cards[x].getSelectedIcon().equals(cards[i].getSelectedIcon())) {
									cards[x].setEnabled(false);
									cards[i].setEnabled(false);
									Score++;

								} else
									cards[x].setSelected(false);
								cards[i].setSelected(false);

								Attempts++;
							}
						}
					}
				}
			}
		});

	}

	/**
	 * sets the icons for a card in the form of a String Array with 2 positions
	 */
	private static void setCardImage(String cardFace) {
		cardImage[0] = "PATH OF CARD BACK";
		cardImage[1] = cardFace;
	}
	
	int j =0;
	
	  for (int i=0;i<cardList.length;i+2){
	 	
	 cards[i].setCardImage(cardFaces[j]);
	 cards[i+1].setCardImage(cardFaces[j]);
	j++;
	  }
	 }
	 
}
