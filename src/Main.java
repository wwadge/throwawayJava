public class Main {

   // Visibility settings:
   // public = any class can access
    // private = only members inside this class can access
    // protected = this class and subclasses can access

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, short b){
        return a + b;
    }

    // method overloading: (same method name, different signature)
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        // byte        -127 -> 127
        // short          65535
        // int          4M
        // long


        // boolean   true / false
        // char       'a' , '1', '!'


        // variable declaration:   type varname eg
        // int i;


        // get a good cheat sheet


//        // loops:
//        for (int i=0; i < 5; i++) {
//
//            System.out.println("Hello World!");
//        }
//
//        while (!wheelsTurning && carMoving){
//                // apply ABS brakes
//        }
//
//        do{);
//            // do something. This code will execute at least once
//        } while(condition);


        // if..else
        // if (boolean_condition) {
//        } else {
//    }
//         boolean operators
//         && = and
//         || = or
//          ! = not
//         >= greater or equal
//         <= less than or equal
//         == equals
//         > greater than
//         < less than
//        if ( (a > 2) && (b <= 5) )

        sum(3, (short)5); // typecasting 5 as an int to short


        // a CLASS is a definition ( = template)
        // eg : class is like a blueprint of a building
        // each time you build a building based on that blueprint it is called as
        // an INSTANCE

        // create an instance of class Clock
        Clock maltaClock = new Clock();
        maltaClock.setHours(99);
        maltaClock.setMins(22);

        Clock ukClock = new Clock();
        ukClock.hours = 17;
        ukClock.mins = 22;



    }
}
