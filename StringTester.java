public class StringTester
{
    public static String weatherCondition = "tropical storm";
    public static void main(){
        System.out.println(weatherCondition.length());
        System.out.println(weatherCondition.substring(0, weatherCondition.indexOf(" ")));
            String weatherCondition1 = new String("mixed rain and snow");
            String weatherCondition2 = new String("mixed rain and snow");
            
            boolean result1 = (weatherCondition1 == weatherCondition2);
            boolean result2 = (weatherCondition1.equals(weatherCondition2));
            System.out.println(result1);
            System.out.println(result2);
            
            System.out.println(WeatherConditionals.getWeatherAdvice(33, "sunny"));
            System.out.println(WeatherConditionals.Temp(30));
            System.out.println("\n");
            System.out.println(WeatherConditionals.getHikingAdvice(81, 50, 40, "sunny"));
    }
}
