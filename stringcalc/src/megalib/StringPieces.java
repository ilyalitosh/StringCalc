package megalib;

import java.util.ArrayList;

class StringPieces extends ArrayList<String>{

    StringPieces(String input){
        parseInput(input);
    }

    private void parseInput(String input){
        clear();
        String buffer = "";
        for(int i = 0; i < input.length(); i++){
            if((input.charAt(i)!='(') && (input.charAt(i)!=')') && (input.charAt(i)!='/') && (input.charAt(i)!='*') && (input.charAt(i)!='+') && (input.charAt(i)!='-') && (input.charAt(i)!='^') && (input.charAt(i)!='s') && (input.charAt(i)!='i') && (input.charAt(i)!='c') && (input.charAt(i)!='o') && (input.charAt(i)!='l') && (input.charAt(i)!='g') && (input.charAt(i)!='n') && (input.charAt(i)!='f') && (input.charAt(i)!='t') && (input.charAt(i)!='p') && (input.charAt(i)!='e') && (input.charAt(i)!='r') && (input.charAt(i)!='a')){
                buffer += input.charAt(i);
            }else{
                switch(input.charAt(i)){
                    case '(':                                                               //самый низкий приоритет "(",")"
                        add(String.valueOf(input.charAt(i)));
                        break;
                    case ')':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add(String.valueOf(input.charAt(i)));
                        break;
                    case '+':                                                               //низкий приоритет "+","-"
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add(String.valueOf(input.charAt(i)));
                        break;
                    case '-':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        if(i == 0){
                            add("0");
                        }else if(input.charAt(i-1) == '('){
                            add("0");
                        }
                        add(String.valueOf(input.charAt(i)));
                        break;
                    case '*':                                                               //высокий приоритет "*","/","sin","cos","lg","ln","perc"
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add(String.valueOf(input.charAt(i)));
                        break;
                    case '/':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add(String.valueOf(input.charAt(i)));
                        break;
                    case 's':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add(String.valueOf(input.charAt(i)) + "i" + "n");
                        i += 2;
                        break;
                    case 'c':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        if((input.charAt(i + 1) == 'o') && (input.charAt(i + 2) == 's')){
                            add(String.valueOf(input.charAt(i)) + "o" + "s");
                            i += 2;
                        }
                        if((input.charAt(i + 1) == 'o') && (input.charAt(i + 2) == 't')){
                            add(String.valueOf(input.charAt(i)) + "o" + "t");
                            i += 2;
                        }
                        break;
                    case 'g':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add("l" + String.valueOf(input.charAt(i)));
                        break;
                    case 'n':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add("l" + String.valueOf(input.charAt(i)));
                        break;
                    case 'f':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add(String.valueOf(input.charAt(i)) + "a" + "c" + "t");
                        i += 3;
                        break;
                    case 't':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add(String.valueOf(input.charAt(i)) + "a" + "n");
                        i += 2;
                        break;
                    case 'p':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add(String.valueOf(input.charAt(i)) + "e" + "r" + "c");
                        i += 3;
                        break;
                    case 'a':
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        if((input.charAt(i + 1) == 's') && (input.charAt(i + 2) == 'i')){
                            add(String.valueOf(input.charAt(i)) + "s" + "i" + "n");
                            i += 3;
                        }
                        if((input.charAt(i + 1) == 'c') && (input.charAt(i + 2) == 'o') && (input.charAt(i + 3) == 's')){
                            add(String.valueOf(input.charAt(i)) + "c" + "o" + "s");
                            i += 3;
                        }
                        if((input.charAt(i + 1) == 't') && (input.charAt(i + 2) == 'a')){
                            add(String.valueOf(input.charAt(i)) + "t" + "a" + "n");
                            i += 3;
                        }
                        if((input.charAt(i + 1) == 'c') && (input.charAt(i + 2) == 'o') && (input.charAt(i + 3) == 't')){
                            add(String.valueOf(input.charAt(i)) + "c" + "o" + "t");
                            i += 3;
                        }
                        break;
                    case '^':                                                               //самый высокий приоритет "^"
                        if(buffer != ""){
                            add(buffer);
                            buffer = "";
                        }
                        add(String.valueOf(input.charAt(i)));
                        break;
                }
            }
            if(i + 1 == input.length()){
                if(buffer != ""){
                    add(buffer);
                    buffer = "";
                }
            }
        }
    }

}
