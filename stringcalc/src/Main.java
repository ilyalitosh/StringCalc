import megalib.StringCalc;
import megalib.StringCalcModes;

public class Main {

    public static void main(String[] args) {
        System.out.println(StringCalc.getResult("(2+2)^2*fact(5)+log(ln(100)*100)+sin(30)", StringCalcModes.DEGREES));
    }

}
