package megalib;

import java.util.Stack;


/**
 * StringCalc v1.4
 * */

public class StringCalc {

    public static double getResult(String input, StringCalcModes mode){
        StringParser sp = new StringParser(input);
        PolishString ps = new PolishString(sp);
        Stack<Double> stack = new Stack<>();
        switch(mode){
            case RADIANS:
                for(int i = 0; i < ps.size(); i++){
                    if((ps.get(i).charAt(0)!='(') && (ps.get(i).charAt(0)!=')') && (ps.get(i).charAt(0)!='/') && (ps.get(i).charAt(0)!='*') && (ps.get(i).charAt(0)!='+') && (ps.get(i).charAt(0)!='-') && ps.get(i).charAt(0)!='^' && ps.get(i).charAt(0)!='s' && ps.get(i).charAt(0)!='c' && ps.get(i).charAt(0)!='l' && ps.get(i).charAt(0)!='f' && ps.get(i).charAt(0)!='t' && ps.get(i).charAt(0)!='p' && ps.get(i).charAt(0)!='a'){
                        stack.push(Double.parseDouble(ps.get(i)));
                    }else{
                        double outValue1, outValue2;
                        switch(ps.get(i)){
                            case "+":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(outValue2 + outValue1);
                                break;
                            case "-":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(outValue2 - outValue1);
                                break;
                            case "*":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(outValue2 * outValue1);
                                break;
                            case "/":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(outValue2 / outValue1);
                                break;
                            case "sin":
                                outValue1 = stack.pop();
                                stack.push(Math.sin(outValue1));
                                break;
                            case "cos":
                                outValue1 = stack.pop();
                                stack.push(Math.cos(outValue1));
                                break;
                            case "lg":
                                outValue1 = stack.pop();
                                stack.push(Math.log10(outValue1));
                                break;
                            case "ln":
                                outValue1 = stack.pop();
                                stack.push(Math.log(outValue1));
                                break;
                            case "fact":
                                outValue1 = stack.pop();
                                stack.push(StringMath.fact((int)outValue1));
                                break;
                            case "tan":
                                outValue1 = stack.pop();
                                stack.push(Math.tan(outValue1));
                                break;
                            case "cot":
                                outValue1 = stack.pop();
                                stack.push(1/Math.tan(outValue1));
                                break;
                            case "perc":
                                outValue1 = stack.pop();
                                stack.push(outValue1 / 100);
                                break;
                            case "asin":
                                outValue1 = stack.pop();
                                stack.push(Math.asin(outValue1));
                                break;
                            case "acos":
                                outValue1 = stack.pop();
                                stack.push(Math.acos(outValue1));
                                break;
                            case "atan":
                                outValue1 = stack.pop();
                                stack.push(Math.atan(outValue1));
                                break;
                            case "acot":
                                outValue1 = stack.pop();
                                stack.push(Math.atan(-outValue1) + (StringMath.PI / 2));
                                break;
                            case "^":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(Math.pow(outValue2, outValue1));
                                break;
                        }
                    }
                }
                break;
            case DEGREES:
                for(int i = 0; i < ps.size(); i++){
                    if((ps.get(i).charAt(0)!='(') && (ps.get(i).charAt(0)!=')') && (ps.get(i).charAt(0)!='/') && (ps.get(i).charAt(0)!='*') && (ps.get(i).charAt(0)!='+') && (ps.get(i).charAt(0)!='-') && ps.get(i).charAt(0)!='^' && ps.get(i).charAt(0)!='s' && ps.get(i).charAt(0)!='c' && ps.get(i).charAt(0)!='l' && ps.get(i).charAt(0)!='f' && ps.get(i).charAt(0)!='t' && ps.get(i).charAt(0)!='p' && ps.get(i).charAt(0)!='a'){
                        stack.push(Double.parseDouble(ps.get(i)));
                    }else{
                        double outValue1, outValue2;
                        switch(ps.get(i)){
                            case "+":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(outValue2 + outValue1);
                                break;
                            case "-":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(outValue2 - outValue1);
                                break;
                            case "*":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(outValue2 * outValue1);
                                break;
                            case "/":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(outValue2 / outValue1);
                                break;
                            case "sin":
                                outValue1 = stack.pop();
                                stack.push(Math.sin(Math.toRadians(outValue1)));
                                break;
                            case "cos":
                                outValue1 = stack.pop();
                                stack.push(Math.cos(Math.toRadians(outValue1)));
                                break;
                            case "lg":
                                outValue1 = stack.pop();
                                stack.push(Math.log10(outValue1));
                                break;
                            case "ln":
                                outValue1 = stack.pop();
                                stack.push(Math.log(outValue1));
                                break;
                            case "fact":
                                outValue1 = stack.pop();
                                stack.push(StringMath.fact((int)outValue1));
                                break;
                            case "tan":
                                outValue1 = stack.pop();
                                stack.push(Math.tan(Math.toRadians(outValue1)));
                                break;
                            case "cot":
                                outValue1 = stack.pop();
                                stack.push(1/Math.tan(Math.toRadians(outValue1)));
                                break;
                            case "perc":
                                outValue1 = stack.pop();
                                stack.push(outValue1 / 100);
                                break;
                            case "asin":
                                outValue1 = stack.pop();
                                stack.push(Math.toDegrees(Math.asin(outValue1)));
                                break;
                            case "acos":
                                outValue1 = stack.pop();
                                stack.push(Math.toDegrees(Math.acos(outValue1)));
                                break;
                            case "atan":
                                outValue1 = stack.pop();
                                stack.push(Math.toDegrees(Math.atan(outValue1)));
                                break;
                            case "acot":
                                outValue1 = stack.pop();
                                stack.push(Math.toDegrees(Math.atan(-outValue1) + (StringMath.PI / 2)));
                                break;
                            case "^":
                                outValue1 = stack.pop();
                                outValue2 = stack.pop();
                                stack.push(Math.pow(outValue2, outValue1));
                                break;
                        }
                    }
                }
                break;
        }
        return stack.pop();
    }

    public static double getResult(String input){
        StringParser sp = new StringParser(input);
        PolishString ps = new PolishString(sp);
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < ps.size(); i++){
            if((ps.get(i).charAt(0)!='(') && (ps.get(i).charAt(0)!=')') && (ps.get(i).charAt(0)!='/') && (ps.get(i).charAt(0)!='*') && (ps.get(i).charAt(0)!='+') && (ps.get(i).charAt(0)!='-') && ps.get(i).charAt(0)!='^' && ps.get(i).charAt(0)!='s' && ps.get(i).charAt(0)!='c' && ps.get(i).charAt(0)!='l' && ps.get(i).charAt(0)!='f' && ps.get(i).charAt(0)!='t' && ps.get(i).charAt(0)!='p' && ps.get(i).charAt(0)!='a'){
                stack.push(Double.parseDouble(ps.get(i)));
            }else{
                double outValue1, outValue2;
                switch(ps.get(i)){
                    case "+":
                        outValue1 = stack.pop();
                        outValue2 = stack.pop();
                        stack.push(outValue2 + outValue1);
                        break;
                    case "-":
                        outValue1 = stack.pop();
                        outValue2 = stack.pop();
                        stack.push(outValue2 - outValue1);
                        break;
                    case "*":
                        outValue1 = stack.pop();
                        outValue2 = stack.pop();
                        stack.push(outValue2 * outValue1);
                        break;
                    case "/":
                        outValue1 = stack.pop();
                        outValue2 = stack.pop();
                        stack.push(outValue2 / outValue1);
                        break;
                    case "sin":
                        throw new StringCalcTrigonometryException("Для вычисления выражения с тригонометрическими функциями нужно указать StringCalcMode");
                    case "cos":
                        throw new StringCalcTrigonometryException("Для вычисления выражения с тригонометрическими функциями нужно указать StringCalcMode");
                    case "lg":
                        outValue1 = stack.pop();
                        stack.push(Math.log10(outValue1));
                        break;
                    case "ln":
                        outValue1 = stack.pop();
                        stack.push(Math.log(outValue1));
                        break;
                    case "fact":
                        outValue1 = stack.pop();
                        stack.push(StringMath.fact((int)outValue1));
                        break;
                    case "tan":
                        throw new StringCalcTrigonometryException("Для вычисления выражения с тригонометрическими функциями нужно указать StringCalcMode");
                    case "cot":
                        throw new StringCalcTrigonometryException("Для вычисления выражения с тригонометрическими функциями нужно указать StringCalcMode");
                    case "perc":
                        outValue1 = stack.pop();
                        stack.push(outValue1 / 100);
                        break;
                    case "asin":
                        throw new StringCalcTrigonometryException("Для вычисления выражения с тригонометрическими функциями нужно указать StringCalcMode");
                    case "acos":
                        throw new StringCalcTrigonometryException("Для вычисления выражения с тригонометрическими функциями нужно указать StringCalcMode");
                    case "atan":
                        throw new StringCalcTrigonometryException("Для вычисления выражения с тригонометрическими функциями нужно указать StringCalcMode");
                    case "acot":
                        throw new StringCalcTrigonometryException("Для вычисления выражения с тригонометрическими функциями нужно указать StringCalcMode");
                    case "^":
                        outValue1 = stack.pop();
                        outValue2 = stack.pop();
                        stack.push(Math.pow(outValue2, outValue1));
                        break;
                }
            }
        }
        return stack.pop();
    }

}
