import megalib.StringCalc;
import megalib.StringCalcModes;

/**
  * ПРИМЕР ВЫЧИСЛЕНИЯ СТРОКИ С ПОМОЩЬЮ StringCalc
  */

public class Example {

    public static void main(String[] args) {
        // Вызываем статический метод getResult из StringCalc;
        double result = StringCalc.getResult("(2+2)^2*fact(5)+log(ln(100)*100)+sin(30)", StringCalcModes.DEGREES);
        // Выводим результат
        System.out.println("Результат: " + result);
        
        // Также есть перегруженная версия метода getResult, если в строке нет тригонометрических функций;
        double result = StringCalc.getResult("(2+2)^2*fact(5)+log(ln(100)*100)");
        // Выводим результат
        System.out.println("Результат: " + result);
    }

}
