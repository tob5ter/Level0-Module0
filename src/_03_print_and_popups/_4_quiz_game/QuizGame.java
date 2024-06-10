package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String input = JOptionPane.showInputDialog("How many holes in a polo?");
		if (input.equals("4")) {
			JOptionPane.showMessageDialog(null,"Great Job!");
			score += 1;

		} else {JOptionPane.showMessageDialog(null,"You'll do better on the next problem right?");

			
		}
		String answer = JOptionPane.showInputDialog("what do you call a fly without wings?");
		if (answer.equals("a walk")) {
			JOptionPane.showMessageDialog(null,"Great Job!");
			input += 1;

		} else {JOptionPane.showMessageDialog(null,"You'll do better on the next problem right?");
		String thing = JOptionPane.showInputDialog("can you get this question wrong?");
		if (thing.equals("no")) {
			JOptionPane.showMessageDialog(null,"Great Job!");
			score += 1;

		} else {JOptionPane.showMessageDialog(null,"You'll do better on the next problem right?");

			
		}
		JOptionPane.showMessageDialog(null,"your score is " + score);

		


		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}}
