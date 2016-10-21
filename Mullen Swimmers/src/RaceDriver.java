import java.util.*;
public class RaceDriver
	{
		static int whichSwimmer;
		static int eventPicked;
		static String finalEvent;
		public static void main(String[] args)
			{
				TeamArray.fillTeam();
				pickYourSwimmer();
				chooseEvent();
				showSwimmersInTheEvent();
				
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
			whichSwimmer = userInput.nextInt();	
			System.out.println("You picked " + TeamArray.team.get(whichSwimmer-1).getName());
			
			System.out.println("These are all of " + TeamArray.team.get(whichSwimmer-1).getName() + "'s events. "
					+ "\nPlease choose the number of the event you would like him to swim.");
		}
		
		public static void chooseEvent()
		{
			
			String swimmerChosen = TeamArray.team.get(whichSwimmer-1).getName();
			System.out.println("1. " + TeamArray.team.get(whichSwimmer-1).getEvent1() + " \n2. "
					+ TeamArray.team.get(whichSwimmer-1).getEvent2() + " \n3. " + TeamArray.team.get(whichSwimmer-1).getEvent3() + ".");
			
			Scanner userInput = new Scanner(System.in);
			eventPicked = userInput.nextInt();	
				
				if (eventPicked == 1)
					{
						finalEvent = TeamArray.team.get(whichSwimmer-1).getEvent1();
					}
				
				else if (eventPicked == 2)
					{	
						finalEvent = TeamArray.team.get(whichSwimmer-1).getEvent2();	
					}
				
				else if (eventPicked == 3)
					{
						finalEvent = TeamArray.team.get(whichSwimmer-1).getEvent3();	
					}
		}
		
		public static void showSwimmersInTheEvent()
		{
			System.out.println("These is what the competition will look like for the " + finalEvent + ".");
			for (Swimmer s : TeamArray.team)
				{
					if (s.getEvent1().equals(finalEvent))
						{
							System.out.println(s.getName());
							 s.getEvent1Time();
						}
					
					else if (s.getEvent2().equals(finalEvent))
						{
							System.out.println(s.getName());
							s.getEvent2Time();
						}
					
					else if (s.getEvent3().equals(finalEvent))
						{
							System.out.println(s.getName());
							s.getEvent3Time();
						}
				}
			
			
			
			
		}
		
		
		
		public static void 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
