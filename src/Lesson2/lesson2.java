package Lesson2;

public class lesson2 {
    public static void main(String[] args) {
        boolean answer = sumFrom10To20(5, 7); // мы тут создали тип и имя answer потом присвоили значение sumFrom10to20
        System.out.println(answer);// здесь мы вызваем код уже в конце кода
        isPositiveOrNegative( 6);
    }
    public static boolean sumFrom10To20 (int a, int b){ //тутКак яПонял мыСоздаем методДля boolean которыйМыВынесли вНачало и присвоилиЗначение в ()
        return a+b>=10 && a+b<=20;
    }
    public static boolean isPositiveOrNegative (int variable) {
        if (variable >= 0) {
            System.out.println(variable + " is positive");
        }
        else {
            System.out.println(variable + " is negative");
        }
        return false; // почему он просит добавить это тут без него ошибка выходит а с ним все работает
        // missing returm statement выдало когда без него запустил. Я просто смотрю то что учитель на уроке сделал у него нету этого там
        // вот поэтому и не понятно ничего он там одно пишет тут другое происходит а в книге вообще другое написано.
    }
}