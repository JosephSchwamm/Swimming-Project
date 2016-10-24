import java.util.*;
public class RaceDriver
	{
		static int whichSwimmer;
		static int eventPicked;
		static String finalEvent;
		static String baseTime;
		static String fromEventOne;
		static String fromEventTwo;
		static String fromEventThree;
		static double timeBeforeMods;
		public static void main(String[] args)
			{
				TeamArray.fillTeam();
				pickYourSwimmer();
				chooseEvent();
				showSwimmersInTheEvent();
				double timeBeforeMods = TimeSplitter.minutesToSeconds(baseTime);
				sketchySteroids();
				
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
						baseTime = TeamArray.team.get(whichSwimmer-1).getEvent1Time();
						
					}
				
				else if (eventPicked == 2)
					{	
						finalEvent = TeamArray.team.get(whichSwimmer-1).getEvent2();
						baseTime = TeamArray.team.get(whichSwimmer-1).getEvent2Time();
					}
				
				else if (eventPicked == 3)
					{
						finalEvent = TeamArray.team.get(whichSwimmer-1).getEvent3();
						baseTime = TeamArray.team.get(whichSwimmer-1).getEvent3Time();
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
							fromEventOne = s.getName();
							 s.getEvent1Time();
						}
					
					else if (s.getEvent2().equals(finalEvent))
						{
							System.out.println(s.getName());
							fromEventTwo = s.getName();
							s.getEvent2Time();
						}
					
					else if (s.getEvent3().equals(finalEvent))
						{
							System.out.println(s.getName());
							fromEventThree = s.getName();
							s.getEvent3Time();
						}
				}	
		}
		
		
		public static void sketchySteroids()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Would you like to give your swimmer steroids? Yes or No? \n"
					+ "If you choose yes, there is a 50% chance your swimmer will be 20% faster,\n"
					+ " there is also a 50% chance they will drown.");
			String steroidQuestion = userInput.nextLine();	
			
				if(steroidQuestion.equalsIgnoreCase("yes"))
					{
						System.out.println(timeBeforeMods);
						double fixingTimes = timeBeforeMods * .2; 
						double finalTime = timeBeforeMods - fixingTimes;
						System.out.println("Your swimmer's new time is " + finalTime + ".");
					}
			
				else if (steroidQuestion.equalsIgnoreCase("no"))
					{
						System.out.println("Fair player, lets get to the race!");
					}
			
			
		}
		
		public static void racingTime()
		{
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
