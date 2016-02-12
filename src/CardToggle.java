import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class CardToggle extends JToggleButton {

	private static CardToggle cards[];
	private static int Attempts;
	private static int Score;
	
	
	/**
	 * Logic for checking card matches
	 * 
	 * 
	 * Cards have 3 properties: 
	 * 			boolean selected
	 * 			boolean active
	 * 			icon
	 * 
	 * while(Score<8){
	 */
	
	//TODO CODE FOR CHANGING CARDBACK TO CARDFRONT FOR BOTH BUTTONS
	//TODO DISABLE BUTTONS ON ACTIVATION, REENABLE ON DEACTIVATION WHEN NON MATCH
	private CardToggle(){}
	public static CardToggle[] getCards(){
		return cards;
	}
	/**
	 * 
	 * @param int x where x is a card object in an array 
	 */
	public static void makeCard(int x){
		cards[x].addItemListener(new ItemListener() {
			   public void itemStateChanged(ItemEvent ev) {
			      if(ev.getStateChange()==ItemEvent.SELECTED){
			        for(int y=0;y<cards.length;y++){
			        	if(cards[y]==cards[x]){
			        		continue;
			        	}else if(( cards[y]).isSelected()){
			        
			        	for(int i=0;i<cards.length;i++){
			        		if(cards[i]==cards[x]){
			        			continue;
			        		}else if(cards[x].getSelectedIcon().equals(cards[i].getSelectedIcon())){
			        			cards[x].setEnabled(false);
			        			cards[i].setEnabled(false);
			        			Score++;
			        	
			        		}else
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
	
}
