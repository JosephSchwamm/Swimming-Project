import java.util.*;
public class RaceDriver
	{

		public static void main(String[] args)
			{
				TeamArray.fillTeam();
				pickYourSwimmer();
				
			}
		
		
		public static void pickYourSwimmer()
		{
			System.out.println("Welcome User to the underground world of swim betting. "
					+ "\nPlease select the number preceeding the following swimmer whom you will be placing your bets on.");
			
			for (int i = 0; i < TeamArray.team.size(); i++)
				{
					System.out.println(i + 1 + " " + TeamArray.team.get(i).getName());
					
				}
			Scanner userInput = new Scanner(System.in);
			int whichSwimmer = userInput.nextInt();	
			System.out.println("You picked" + whichSwimmer);
		}

	}
