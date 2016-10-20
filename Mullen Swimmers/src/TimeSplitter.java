import java.util.*;
public class TimeSplitter
	{

		public static void main(String[] args)
			{	
				minutesToSeconds();
			
			}
				public static void minutesToSeconds()
					{
					String team = TeamArray.team.get(0).getEvent2Time();
					
					String [] times = team.split(":");
					
					double minutes= Double.parseDouble(times[0]);
					
					double inSeconds = minutes * 60;
					
					double seconds= Double.parseDouble(times[1]);
					
					System.out.println(inSeconds + seconds);
					}
				
				
					
					
					
					
					
				

	}
