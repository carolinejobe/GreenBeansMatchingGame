import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Card {

	static int Touch;
	static int Score;
	String[] cardImage = new String[2];

	/**
	 * sets the icons for a card in the form of a String Array with 2 positions
	 */
	public void setCardImage(String cardFace) {
		cardImage[0] = "Images/GC-tent.png";//Done - TODO set to path of card back file name
		cardImage[1] = cardFace;
	}
	
	/**
	* TODO figure out how to compare icons(by string value)
	*
	 * @param int x where x is a card object in an array
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

}
