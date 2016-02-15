import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {

	public ArrayList<Card> cards = new ArrayList<Card>(16);
	String[] cardFacesFileName = { "Images/AmbassadorBridge.jpg", "Images/ComericaPark.jpg", "Images/FordField.jpg", "Images/HitsvilleUsa.jpg", "Images/JoeLouisFist.jpg", "Images/RenCen.jpg", "Images/SpiritOfDetroit.jpg", "Images/UniroyalTire.jpg" };//Done - TODO CHANGE to path of card face file names
	
	//DeckOfCards constructor
	public DeckOfCards() {
		//use for loop to create arrayList of cards that has Card in each element
		for (int k = 0; k< 16; k++){
			cards.add(new Card());
		}
		//call setCardImages to assign face and back to each Card in the arrayList cards
		setCardImages(); 
		//call randomize cards to assign faces to random JToggle buttons on the game board
		randomizeCards();
	}
	
	/**
	 * iterates over every card object in array cards to set card images for
	 * front and back
	 */
	public void setCardImages() {
		int j = 0;

		for (int i = 0; i < cards.size(); i = i + 2) {
			cards.get(i).setCardImage(cardFacesFileName[j]);
			cards.get(i + 1).setCardImage(cardFacesFileName[j]);
			j++;
		}
	}

	/*
	 * randomizes or shuffles the ArrayList cards prior to assigning them to JToggleButtons
	*/
	public void randomizeCards() {
		Collections.shuffle(cards);
	}
}
