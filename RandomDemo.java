public class RandomDemo
{
    public static void main()
    {
        double random = Math.random();
        System.out.println(random);
        int randint = (int)(random * 10);
        System.out.println(randint);
        //double price = Song.getPrice();
    }
    public static void dice()
    {
        
        for(int i = 0; i <100; i++){
        int diceroll = (int)(Math.random() * 6.0) + 1;
        diceroll += (int)(Math.random() * 6.0) + 1;
        System.out.println(diceroll);
    }
    }
}