package megalib;

public final class StringMath {

    public static final double PI = Math.PI;

    //расчет факториала
    public static double fact(int value){
        if(value == 1){
            return 1;
        }
        return fact(value - 1) * value;
    }

}
