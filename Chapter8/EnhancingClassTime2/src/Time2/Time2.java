package Time2;

public class Time2 {
      private int seconds;
      private int minutes;
      private int hours;
      public void setTime(int hours,int minutes,int seconds) {
    	  if(hours<0 || hours>23)
    		  throw new IllegalArgumentException("hours must be 0-23");
    	  if(hours<0 || hours>59)
    		  throw new IllegalArgumentException("minutes must be 0-59");
    	  if(hours<0 || hours>59)
    		  throw new IllegalArgumentException("seconds must be 0-59");
    	  this.hours=hours;
    	  this.minutes=minutes;
    	  this.seconds=seconds;
      }
      public Time2(int hours,int minutes,int seconds) {
    	setTime(hours, minutes, seconds);
      }
      public Time2(int hours,int minutes) {
    	 this(hours,minutes,0);
      }
      public Time2(int hours) {
     	 this(hours,0,0);
       }
      public Time2() {
      	 this(0,0,0);
        }
      public int getHour() {
    	  return hours;
      }
      public int getMinutes() {
    	  return minutes;
      }
      public int getSeconds() {
    	  return seconds;
      }
      public String toUniversalString() {
    	  return String.format("%02d:%02d:%02d", getHour(),getMinutes(),getSeconds());
      }
      public String toString() {
    	  return String.format("%d:%02d:%02d %s", (getHour()==0 || getHour() ==12)?12: getHour()%12,
    			  getMinutes(),getSeconds(),(getHour()<12? "AM" :"PM"));
      }
      public void tick() {
    	  if(seconds<59)
    		  seconds+=1;
    	  else {
    		  seconds=0;
    		  incrementMinute();
    		  
    	  }
      }
      public void incrementMinute() {
    	  if(minutes<59)
    		  minutes+=1;
    	  else {
    		  minutes=0;
    		  incrementHour();
    		  
    	  }
      }
      public void incrementHour() {
    	  if(hours<23)
    		  hours+=1;
    	  else {
    		  hours=0;
    	  }
    	 
      }
      
	public static void main(String[] args) {
		Time2 t1= new Time2(23,59,59);
		t1.tick();
		t1.incrementHour();
		System.out.printf("T1 in Universal Format : %s \n", t1.toUniversalString());
		System.out.printf("T1 in Standard Format : %s \n", t1);
		
	

	}

}
