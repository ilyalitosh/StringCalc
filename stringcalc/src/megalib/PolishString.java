package megalib;

import java.util.ArrayList;
import java.util.Stack;

class PolishString extends ArrayList<String>{

    private ArrayList<String> input;

    PolishString(StringParser sp){
        input = sp.getStringPieces();
        toPolishString();
    }

    private void toPolishString(){
        clear();
        Stack<String> stack = new Stack<>();
        for(int i = 0 ; i < input.size(); i++){
            if((input.get(i).charAt(0)!='(') && (input.get(i).charAt(0)!=')') && (input.get(i).charAt(0)!='/') && (input.get(i).charAt(0)!='*') && (input.get(i).charAt(0)!='+') && (input.get(i).charAt(0)!='-') && input.get(i).charAt(0)!='^' && input.get(i).charAt(0)!='s' && input.get(i).charAt(0)!='c' && input.get(i).charAt(0)!='l' && input.get(i).charAt(0)!='f' && input.get(i).charAt(0)!='t' && input.get(i).charAt(0)!='p' && input.get(i).charAt(0)!='a'){
                add(input.get(i));
            }else{
                switch(input.get(i)){
                    case "(":
                        stack.push(input.get(i));
                        break;
                    case ")":
                        while(!stack.peek().equals("(")){
                            add(stack.pop());
                        }
                        stack.pop();
                        break;
                    case "+":
                        while(!stack.empty()){
                            if(!stack.peek().equals("(")){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "-":
                        while(!stack.empty()){
                            if(!stack.peek().equals("(")){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "*":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "/":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "sin":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "cos":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "lg":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "ln":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "fact":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "tan":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "cot":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "perc":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "asin":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "acos":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "atan":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "acot":
                        while(!stack.empty()){
                            if((!stack.peek().equals("(")) && (!stack.peek().equals("+")) && (!stack.peek().equals("-")) && (!stack.peek().equals("*")) && (!stack.peek().equals("/"))){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                    case "^":
                        while(!stack.empty()){
                            if(stack.peek().equals("^")){
                                add(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.push(input.get(i));
                        break;
                }
            }
        }
        if(!stack.empty()){
            while (!stack.empty()){
                add(stack.pop());
            }
        }
    }

}
