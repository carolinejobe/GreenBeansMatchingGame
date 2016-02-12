

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MatchingGameMainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchingGameMainWindow window = new MatchingGameMainWindow();
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
	public MatchingGameMainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToggleButton button1 = new JToggleButton("New toggle button");
		button1.setEnabled(false);
		button1.setIcon(null);
		
		button1.setActionCommand("Button");
		button1.addItemListener(new ItemListener() {
			   public void itemStateChanged(ItemEvent ev) {
			      if(ev.getStateChange()==ItemEvent.SELECTED){
			        System.out.println("button is selected");
			      } else if(ev.getStateChange()==ItemEvent.DESELECTED){
			        System.out.println("button is not selected");
			      }
			   }
			});
		frame.getContentPane().setLayout(new GridLayout(0, 4, 0, 0));
		frame.getContentPane().add(button1);
		
		JToggleButton button2 = new JToggleButton("New toggle button");
		frame.getContentPane().add(button2);
		
		JToggleButton button3 = new JToggleButton("New toggle button");
		button3.addItemListener(new ItemListener() {
			   public void itemStateChanged(ItemEvent ev) {
			      if(ev.getStateChange()==ItemEvent.SELECTED){
			        System.out.println("button3 is selected");
			        button1.setSelected(true);
			      } else if(ev.getStateChange()==ItemEvent.DESELECTED){
			        System.out.println("button3 is not selected");
			        button1.setSelected(false);
			      }
			   }
			});
		frame.getContentPane().add(button3);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		JToggleButton toggleButton_5 = new JToggleButton("New toggle button");
		frame.getContentPane().add(toggleButton_5);
		
		JToggleButton toggleButton_3 = new JToggleButton("New toggle button");
		frame.getContentPane().add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton("New toggle button");
		frame.getContentPane().add(toggleButton_4);
		
		JToggleButton toggleButton = new JToggleButton("New toggle button");
		frame.getContentPane().add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("New toggle button");
		frame.getContentPane().add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton("New toggle button");
		frame.getContentPane().add(toggleButton_2);
		
		JToggleButton toggleButton_6 = new JToggleButton("New toggle button");
		frame.getContentPane().add(toggleButton_6);
	}
}
