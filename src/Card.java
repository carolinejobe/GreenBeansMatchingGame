

public class Card {

//	static int Touch;
//	public static int Attempts = Touch/2;
//	static int Score;
	String[] cardImage = new String[2];

	/**
	 * sets the icons for a card in the form of a String Array with 2 positions
	 */
	public void setCardImage(String cardFace) {
		cardImage[0] = "Images/GC-tent.png";
		cardImage[1] = cardFace;
	}

	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	* TODO figure out how to compare icons(by string value)
	*
	 * @param int x where x is a card object in an array
	 

	
	//TODO figure out how to add this to each button where x is the button number

	public void activateCard(int x) {
		deck.cards.get(x).addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ev) {
				if (ev.getStateChange() == ItemEvent.SELECTED) {
					
					deck.cards.get(x).setIcon(deck.cardImage[1]);
					deck.cards.get(x).setEnabled(false);//disables clicking on  a card after it's been clicked once
					for (int y = 0; y < deck.cards.size(); y++) {
						if (deck.cards.get(y) == deck.cards.get(x)) {//checks if a selected card is the same as itself, skips rest of loop if true
							continue;
						} else if ((deck.cards.get(y)).isSelected()) {
							//if a card other than the selected card is also selected
							for (int i = 0; i < deck.cards.size(); i++) {
							if (deck.cards.get(i) == deck.cards.get(x)) {//if selected card is the same as itself, skip over rest of loop
									continue;
								} else if (deck.cards.get(x).getSelectedIcon().equals(deck.cards.get(i).getSelectedIcon())) {
									score++;//iterate score if cards match
									

								} else if(deck.cards.get(x).getSelectedIcon().equals(deck.cards.get(i).getSelectedIcon())){
									
									deck.cards.get(x).setIcon(deck.cardImage[0]);
									deck.cards.get(i).setIcon(deck.cardImage[0]);
								} //deselects cards
									deck.cards.get(x).setSelected(false);
									deck.cards.get(i).setSelected(false);
								

									
							}
					}
			}
					touch++;
				}
			}
		});
}
*/
}
