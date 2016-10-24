import java.util.*;
public class TimeSplitter
	{
		static String [] times;

				public static double minutesToSeconds(String t)
					{
					times = t.split(":");
					
					double minutes= Double.parseDouble(times[0]);
					
					double inSeconds = minutes * 60;
					
					double seconds= Double.parseDouble(times[1]);
					
					return (inSeconds + seconds);
					
					}
				
				
					
					
					
					
					
				

	}
