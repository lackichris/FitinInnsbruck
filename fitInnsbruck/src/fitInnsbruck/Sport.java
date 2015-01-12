package fitInnsbruck;

import java.util.List;

public class Sport {
	private String name;
	private double calorieFactor;
	private List<String> impossibleWeather;

	
	public Sport(String name, double calorieFactor,
			List<String> impossibleWeather) {
		super();
		this.name = name;
		this.calorieFactor = calorieFactor;
		this.impossibleWeather = impossibleWeather;
	}




	public double computeCalories(int height, double weight, int age) {
		return 0;
	};
	
}