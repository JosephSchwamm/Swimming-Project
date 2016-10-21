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
					+ "\nPlease select one of the following swimmers whom you will be placing your bets on.");
			
			for (int i = 0; i < TeamArray.team.size(); i++)
				{
					System.out.println(i + 1 + " " + TeamArray.team.get(i).getName());
					
				}
			Scanner userInput = new Scanner(System.in);
			String s = userInput.nextLine();
			System.out.println("Please choose the number of the swimmer that you would like to bet on.");
			 = userInput.nextInt();
			
		}

	}
