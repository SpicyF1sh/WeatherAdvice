public class WeatherConditionals
{
    private int temperature = 0;
    private int windchill = 0;
    private int humidity = 0;
    private String description = "";
   
    public static String getWeatherAdvice(int temperature, String description){
        //return(temperature + "°F" + " and " + description);
        boolean windy = false;
        if (description == "windy" || description == "snow" || temperature <=32) return("Too windy or cold! Enjoy watching the weather through the window.");
        else return("You can go outside! " + temperature + "°F" + " and " + description + "! Enjoy the weather!");
   }
   public static String Temp(int temperature){
       if (temperature <28) return("too cold");
       if (temperature > 28 && temperature < 35) return("Chilly");
       if (temperature >=35) return("Nice weather");
       else return("Something has gone wrong");
   }
   public static String getHikingAdvice(int temperature, int windchill, int humidity, String description){
       //Descriptions Used: snow, rain, storm, hurricane

       if (temperature <40 || temperature >80) return("Temperature isn't good enough to jog today.");
       else if(windchill <= 0) return("Windchill is too cold to hike today.");
       else if(humidity <= 20 || humidity >= 60) return("It's too humid to hike today.");
       else if(description.indexOf("snow") != -1 || description.indexOf("rain") != -1 || description.indexOf("storm") != -1 || description.indexOf("hurricane") != -1) return("Weather is not suitible to hike today");
       else return("Today is a good day to hike!");
   }
}