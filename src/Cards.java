import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JToggleButton;

public class Cards extends JToggleButton {

	public static ArrayList<Cards> cards = new ArrayList<Cards>(16);
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

	/**
	 * 
	 * @param int
	 *            x where x is a card object in an array
	 */
	public static void activateCard(int x) {
		cards.get(x).addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ev) {
				if (ev.getStateChange() == ItemEvent.SELECTED) {
					for (int y = 0; y < cards.size(); y++) {
						if (cards.get(y) == cards.get(x)) {
							continue;
						} else if ((cards.get(y)).isSelected()) {

							for (int i = 0; i < cards.size(); i++) {
								if (cards.get(i) == cards.get(x)) {
									continue;
								} else if (cards.get(x).getSelectedIcon().equals(cards.get(i).getSelectedIcon())) {
									cards.get(x).setEnabled(false);
									cards.get(i).setEnabled(false);
									Score++;

								} else
									cards.get(x).setSelected(false);
								cards.get(i).setSelected(false);

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
	private void setCardImage(String cardFace) {
		cardImage[0] = "PATH OF CARD BACK";
		cardImage[1] = cardFace;
	}

	/**
	 * iterates over every card object in array cards to set card images for
	 * front and back
	 */
	public static void setCardImages() {
		int j = 0;

		for (int i = 0; i < cards.size(); i = i + 2) {

			cards.get(i).setCardImage(cardFaces[j]);
			cards.get(i + 1).setCardImage(cardFaces[j]);
			j++;
		}
	}
	
	public static void randomizeCards() {
		Collections.shuffle(cards);
	}
}
