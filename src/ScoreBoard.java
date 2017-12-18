import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreBoard implements ActionListener {
	
	//example  ...Scoreboard extends JFrame implements ActionListener  GOOD
	//example  ...Scoreboard extends JFrame implements ActionListener,   GOOD
	//example  ...Scoreboard extends JFrame,JPanel implements ActionListener  BAD

	//extends means inherit - use all vars and methods of the superclass
	//implements means you must use an "interface"
	

	int homeScoreAmount = 0;
	int visitorScoreAmount = 0;

	JPanel titlePanel, scorePanel, buttonPanel;
	JLabel homeLabel, visitorLabel, homeScore, visitorScore;
	JButton homeButton, visitorButton, resetButton;

	public Container createContentPane() {
		

		JPanel totalGUI = new JPanel();
		totalGUI.setSize(400,300);
		totalGUI.setBackground(Color.YELLOW);
		totalGUI.setLayout(null);


		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(10, 10);
		titlePanel.setSize(330, 30);
		totalGUI.add(titlePanel);
		
		homeLabel = new JLabel("Home Team");
		homeLabel.setLocation(0, 0);
		homeLabel.setSize(200, 30);
		homeLabel.setHorizontalAlignment(0);
		homeLabel.setForeground(Color.RED);
		titlePanel.add(homeLabel);
		
		visitorLabel = new JLabel("Visitor Team");
		visitorLabel.setLocation(160, 0);
		visitorLabel.setSize(200, 30);
		visitorLabel.setHorizontalAlignment(0);
		visitorLabel.setForeground(Color.BLUE);
		titlePanel.add(visitorLabel);
		
		
		scorePanel = new JPanel();  // JPanel scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setBackground(Color.PINK);
		scorePanel.setLocation(10, 50);
		scorePanel.setSize(330, 30);
		totalGUI.add(scorePanel);
		
		homeScore = new JLabel("" + homeScoreAmount);
		homeScore.setLocation(0, 0);
		homeScore.setSize(200, 30);
		homeScore.setHorizontalAlignment(0);
		scorePanel.add(homeScore);

		visitorScore = new JLabel("" + visitorScoreAmount);
		visitorScore.setLocation(130, 0);
		visitorScore.setSize(200, 30);
		visitorScore.setHorizontalAlignment(0);
		scorePanel.add(visitorScore);
		

		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(10, 90);
		buttonPanel.setSize(330, 100);
		totalGUI.add(buttonPanel);
		
		homeButton = new JButton("home Score +1");
		homeButton.setLocation(0, 0);
		homeButton.setSize(160, 30);
		homeButton.addActionListener(this); //FIRST TIME!  YEAH!!
		buttonPanel.add(homeButton);
		
		return totalGUI;
	}

	
	//this method came to us from the interface ActionListener
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
