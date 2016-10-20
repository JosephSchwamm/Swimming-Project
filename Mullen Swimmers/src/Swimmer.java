import java.util.*;
class Swimmer
	{	
		String name;
		String event1;
		String event1Time;
		String event2;
		String event2Time;
		String event3;
		String event3Time;
		
			public Swimmer (String n, String e1, String e1t, String e2, String e2t, String e3, String e3t)
			{
				name = n;
				event1 = e1;
				event1Time = e1t;
				event2 = e2;
				event2Time = e2t;
				event3 = e3;
				event3Time = e3t;
			}

			public String getName()
				{
					return name;
				}

			public void setName(String name)
				{
					this.name = name;
				}

			public String getEvent1()
				{
					return event1;
				}

			public void setEvent1(String event1)
				{
					this.event1 = event1;
				}

			public String getEvent1Time()
				{
					return event1Time;
				}

			public void setEvent1Time(String event1Time)
				{
					this.event1Time = event1Time;
				}

			public String getEvent2()
				{
					return event2;
				}

			public void setEvent2(String event2)
				{
					this.event2 = event2;
				}

			public String getEvent2Time()
				{
					return event2Time;
				}

			public void setEvent2Time(String event2Time)
				{
					this.event2Time = event2Time;
				}

			public String getEvent3()
				{
					return event3;
				}

			public void setEvent3(String event3)
				{
					this.event3 = event3;
				}

			public String getEvent3Time()
				{
					return event3Time;
				}

			public void setEvent3Time(String event3Time)
				{
					this.event3Time = event3Time;
				}

	}