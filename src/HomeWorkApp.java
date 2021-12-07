public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords () ;
        checkSumSign ();
        printColor () ;
        compareNumbers () ;
    }
    public static void printThreeWords() {
        System.out.println("Orange") ;
        System.out.println("Banana") ;
        System.out.println("Apple") ;
    }
    public static void checkSumSign() {
        int a =27 ;
        int b = 35 ;
        int c = a + b ;
        if (c >= 0) {
            System.out.println("The sum is possitive");
        }
        else {
            System.out.println("The sum is negative");
        }
    }

    public static void printColor() {
       int value = 100 ;
       if (value <= 0) {
           System.out.println("Red");
       }
       if (value > 0 && value <= 100) {
           System.out.println("Yellow");
       }
       if (value > 100) {
           System.out.println("Green");
       }
    }

    public static void compareNumbers() {
        int a = 26 ;
        int b = 47 ;
        if (a > b) {
            System.out.println("a > b");
        }
        else {
            System.out.println("a < b");
        }
    }
}