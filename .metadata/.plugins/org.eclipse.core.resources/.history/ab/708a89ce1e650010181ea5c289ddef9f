package learning;
import java.util.Scanner;
import java.util.Random;
public class stonePaperSeasor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To StonePaperSeasor");
		System.out.println("\nStone-> 1\nPaper->2\nSeasor->3\n\nQuite->4");
		
		System.out.println("Lets Start---->\n\n");
		
		System.out.print("Enter 1,2,3: ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		Random random = new Random();
		int userScore = 0;
		int computerScore = 0;
		while(user !=4) {
			
			int computer = random.nextInt(3)+1;
			
			if(user == 1 && computer == 2) {
				System.out.println("You:- Stone\nComputer:-Paper\nWinner:-Computer");
				computerScore++;
				
			}
			else if(user == 2 && computer == 3) {
				System.out.println("You:- Paper\nComputer:-Scissor\nWinner:-Computer");
				computerScore++;
				
			}
			else if(user == 3 && computer == 1) {
				System.out.println("You:- Scissor\nComputer:-Stone\nWinner:-Computer");
				computerScore++;
				
			}
			else if(user == 2 && computer == 1) {
				System.out.println("You:- Paper\nComputer:-Stone\nWinner:-You");
				userScore++;
				
			}
			else if(user == 3 && computer == 2) {
				System.out.println("You:- Scissor\nComputer:-Paper\nWinner:-You");
				userScore++;
				
			}
			
			else if(user == 1 && computer == 3){
				System.out.println("You:- Stone\nComputer:-Scissor\nWinner:-You");
				userScore++;
			}
			
			else if(user == computer) {
				switch(user) {
				case 1->System.out.println("You:- Stone\nComputer:-Stone\nWinner:-Tie");
				case 2->System.out.println("You:- Stone\nComputer:-Stone\nWinner:-Tie");
				case 3->System.out.println("You:- Stone\nComputer:-Stone\nWinner:-Tie");
				default->System.out.println("Tie");
				}
			}
			
			else System.out.println("See instructions-->>above");
			
			System.out.print("Enter 1,2,3: ");
			user = sc.nextInt();
			
			if(user == 4) {
				System.out.println("Score----->\nYou Scored: "+userScore+" computerScored: "+computerScore);
				if(userScore>computerScore)System.out.println("You are winner");
				else if (userScore==computerScore)System.out.println("Tie Game");
				else System.out.println("You lost");
				sc.close();
			}
		}
		
	}

}
