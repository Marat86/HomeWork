package Lesson2;

public class lesson2 {
    public static void main(String[] args) {

        boolean answer = sumFrom10To20(5, 7); // мы тут создали тип и имя answer потом присвоили значение sumFrom10to20
        System.out.println(answer);

        isPositiveOrNegative(6);

        boolean result = isNegative (6);
        System.out.println(result);

        printWordNTimes("Hello Java ", 6);
    }
    public static boolean sumFrom10To20 (int a, int b){ //тутКак яПонял мыСоздаем методДля boolean которыйМыВынесли вНачало и присвоилиЗначение в ()
        return a+b>=10 && a+b<=20;
    }

    public static void isPositiveOrNegative (int x) {
        if (x >= 0) {
            System.out.println(x + " is possitive");
        }
        else {
            System.out.println(x + " is negative");
        }
    }
    public static boolean isNegative (int x) {
        if (x < 0) {
            return true;
        }
        return false;

    }
    public static void printWordNTimes (String word, int times) {
        for (int printWordNTimes = 0; printWordNTimes < 6; printWordNTimes++) {
            System.out.println(word + printWordNTimes);
        }
    }
}