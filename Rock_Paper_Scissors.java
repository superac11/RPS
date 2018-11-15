import java.util.Scanner;

/**					Question:
 * Write a program that lets the user play the game of Rock, Paper, Scissors against the computer.
 *  The program should work as follows. 
 *  1. When the program begins, a random number in the range of 1 through 3 is generated. If the number is 1, then the computer has chosen rock.
 *   	If the number is 2, then the computer has chosen paper. If the number is 3, then the computer has chosen scissors. (Don’t display the computer’s choice yet.) 
 * 	2. The user enters his or her choice of “rock”, “paper”, or “scissors” at the keyboard.
 *    	(You can use a menu if you prefer.) 
 *  3. The computer’s choice is displayed. 
 *  4.  A winner is selected according to the following rules: 
 *  •	If	one	player	chooses	rock	and	the	other	player	chooses	scissors,	then	rock	wins.	(The	rock smashes the scissors.) 
 *  •	If	one	player	chooses	scissors	and	the	other	player	chooses	paper,	then	scissors	wins.	(Scissors cuts paper.) 
 *  •	If	one	player	chooses	paper	and	the	other	player	chooses	rock,	then	paper	wins.	(Paper	wraps rock.) 
 *  •	If	both	players	make	the	same	choice,	the	game	must	be	played	again	to	determine	the winner.
 *   Be sure to divide the program into methods that perform each major task.
 */

/**
 * @author 		Sagar
 * Date:		2018-10-29
 * 
 *
 */
public class Rock_Paper_Scissors {
	static Scanner Key_Input=new Scanner(System.in );
	/**
	 * @param args
	 */
	
	/*
	 * The main method will call the user_pick(takes user choice) Computer_pick(generate a random number) & print_PickedItem methods (Print the user and computer choice).
	 * Print the winner based on the question requirement.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("\t\t\tWelcome to the rock paper scissor Game");		///Greetings
		
		// Call the methods and save the return to variables.
		
		int User_Choice=User_Pick();
		System.out.print("\nYou pick "); print_PickedItem(User_Choice);
		
		int Computer_Choice=Computer_pick(); 	
		System.out.print("\nComputer pick "); 		print_PickedItem(Computer_Choice);
		
		// IF else below willl print the winnner based on the logic
		if((User_Choice==1) && (Computer_Choice==3))	System.out.print("\n\t\t\tYou win the game");
		
		else if((User_Choice==2) && (Computer_Choice==1))	System.out.print("\n\t\t\tYou win the game");
		
		else if((User_Choice==2) && (Computer_Choice==3))	System.out.print("\n\t\t\tYou win the game");
			
		else if((User_Choice == Computer_Choice))
			{
				System.out.print("\t\t\tBoth Pick the same: Restarting game:\n\n  ");	Key_Input.nextLine();
				
				main(args);				//Call the main function to reload the game if there is draw
				
			}
		else	System.out.print("\n\t\t\tComputer win the game");
	}
	
	
	
	

/*
 * This method will pick random number from 1 to 3 and return it.
 * 
 */
public static int Computer_pick()
{
	int randomNumber= (int)(Math.random()*3+1);
	return randomNumber;
}

/*
 * THis method  will take  a number either 1, 2, or 3 and print the choice respectively, Rock or paper or scissors  
 */
public static void print_PickedItem(int userpick)
{
	if(userpick==1)
	{
		System.out.print("Rock");
	}
	else if(userpick==2)
	{
		System.out.print("Paper");
	}
	else if(userpick==3)
	{
		System.out.print("Scissors");
	}
}

/*
* This method will  ask the user for the user choice and return it. 
*/

public static int User_Pick()
{

int user_guess=-1;			//Variables for user input.
int statCheck=0;			//Flag for condition check.
while(!(statCheck==1))				
{
System.out.print("\n\t\t\tPick the Corresponding number \n\t\t\t1)Rock\n\t\t\t2)Paper\n\t\t\t3)Scissor\n\nEnter your choice:\\nThe range is from 1 to 3: ");
user_guess=Key_Input.nextInt();	
	
if(user_guess>0 && user_guess<4) statCheck=1;

else System.out.print("\t\t\tInput not in range, Input again\n");
	
}

return user_guess;


}

}

