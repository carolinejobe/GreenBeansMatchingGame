import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Card {

	static int Touch;
	public static int Attempts = Touch/2;
	static int Score;
	String[] cardImage = new String[2];

	/**
	 * sets the icons for a card in the form of a String Array with 2 positions
	 */
	public void setCardImage(String cardFace) {
		cardImage[0] = "Images/GC-tent.png";
		cardImage[1] = cardFace;
	}
	
	/**
	* TODO figure out how to compare icons(by string value)
	*
	 * @param int x where x is a card object in an array
	 */

	
}
