package OOP.enums;

enum Level{                 //cleaner and easier than using string array, can be used inside or outside a class
    LOW, MEDIUM, HIGH;
}
public class Enums {
//    static String[] levels = {"low", " medium", "high"};

    enum Flavor{
        CHOCOLATE, VANILLA, STRAWBERRY;
        public void getVanilla(){               // we can also use methods inside of enums
            System.out.println(Flavor.VANILLA);
        }
    }
    public static void main(String[] args) {
        Level l = Level.LOW;
        System.out.println(Level.HIGH);
        System.out.println(l);


        switch (l){
            case LOW -> System.out.println("low level");
            case HIGH -> System.out.println("high level");
            case MEDIUM -> System.out.println("medium level");
        }

        Flavor flv  = Flavor.VANILLA;

        switch (flv){
            case VANILLA -> System.out.println("vanilla");
            case CHOCOLATE -> System.out.println("chocolate");

        }
    }
}
