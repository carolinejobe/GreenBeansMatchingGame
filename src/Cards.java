import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Cards extends JToggleButton {

	public static ArrayList<Cards> cards = new ArrayList<Cards>(16);
	static int Touch;
	static int Score;
	static String[] cardFacesFileName = { "Path1", "Path2", "Path3", "Path4", "Path5", "Path6", "Path7", "Path8" };//TODO CHANGE to path of card face file names
	static Icon[] cardImage = new Icon[2];

	/**
	* TODO figure out how to compare icons(by string value)
	*
	*
	*TODO set icon to card back when card is initalized
	*
	*/
	/**
	 * 
	 * @param int
	 *            x where x is a card object in an array
	 */
	public static void activateCard(int x) {
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

	}

	/**
	 * sets the icons for a card in the form of a String Array with 2 positions
	 */
	private void setCardImage(String cardFace) {
		cardImage[0] = new ImageIcon( "PATH OF CARD BACK");//TODO set to path of card back file name
		cardImage[1] = new ImageIcon(cardFace);
	}

	/**
	 * iterates over every card object in array cards to set card images for
	 * front and back
	 */
	public static void setCardImages() {
		int j = 0;

		for (int i = 0; i < cards.size(); i = i + 2) {

			cards.get(i).setCardImage(cardFacesFileName[j]);
			cards.get(i + 1).setCardImage(cardFacesFileName[j]);
			j++;
		}
	}
	/**
	 * 
	 */
	public static void randomizeCards() {
		Collections.shuffle(cards);
	}
}
