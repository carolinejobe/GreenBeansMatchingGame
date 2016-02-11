import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class CardToggle {

	private static ArrayList <CardToggle> cards;
	
	
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
	public static ArrayList<CardToggle> getCards(){
		return cards;
	}
	
	
		cards.addItemListener(new ItemListener() {
			   public void itemStateChanged(ItemEvent ev) {
			      if(ev.getStateChange()==ItemEvent.SELECTED){
			        for(int y=0;y<button.length;y++){
			        	if(button[y]==button[1]){
			        		continue;
			        	}else if(button[y].isSelected())
			        
			        	for(int i=0;i<button.length;i++){
			        		if(button[i]==button[1]{
			        			continue;
			        		}else if(button[1].equals(button[i].icon)){
			        			button[1].setEnabled(false);
			        			button[i].setEnabled(false);
			        			Score++;
			        	
			        		}else
			        		button[1].setSelected(false);
			        		button[i].setSelected(false);
			        		Attempts++;
			        }
			        }
			      } 
			   }
			});
	
	
	
}
