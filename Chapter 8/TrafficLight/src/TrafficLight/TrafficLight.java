package TrafficLight;

public enum TrafficLight {
RED(3),
GREEN(4),
BLUE(2);
	private final int duration;
	TrafficLight(int duration) {
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public static void main(String[] args) {
		System.out.printf("%5s %5s \n", "Trafiic","Duration");
		for(TrafficLight trafficlight : TrafficLight.values())
			System.out.printf("%5s %5d \n",trafficlight,trafficlight.getDuration());
	}


}
