import java.util.Random;

class Foreceaster{
	void readWeather(){
		Meteorologist prediction = new Meteorologist();
		int temperature = prediction.getTemperature();
		boolean willRain = prediction.willRain();

		System.out.println("Temperature: " + temperature + " degrees");
		if (temperature < 50){
			// What happens if it's cold?
		}

		if(willRain){
			// What do you advise?
		}else{
			// What about now?
		}
	}
}

class Meteorologist{
	int getTemperature(){
		return (int) Math.floor(Math.random() * 120);
	}

	boolean willRain(){
		Random gen = new Random();
		int willRain = gen.nextInt(2);
		return willRain == 0;
	}
}