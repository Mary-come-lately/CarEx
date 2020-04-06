public class Main {
    public static void main(String[] args)  {
        Car car = new Car();
        try{
            car.start("bmw");
            car.start("volga");
        }
        catch (IfPositiveExseption e){
            System.err.print(e);
        }

    }
}