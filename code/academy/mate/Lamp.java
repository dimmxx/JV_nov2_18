package academy.mate;

public class Lamp {
	boolean state;
	int brightness;

	void turnOn() {
		state = true;
		brightness = 100;
	}
	void turnOff() {
		state = false;
		brightness = 0;
	}
	void getInfo() {
		System.out.println("State: " + (state ? "ON" : "OFF") + "; Brightness: " + brightness);
	}
}
