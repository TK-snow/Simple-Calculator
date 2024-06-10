package ToolsQA.Calculator;

public class simple_func {

    static float result ;
    static String operation;

    public static void calculation(String mode,float number1,float number2){
        switch (mode.toLowerCase()) {
            case "adittion":
            case "plus":
            case "+":
                operation = "+";
                result = number1 + number2;
                break;
            
            case "subtraction":
            case "minus":
            case "-":
                operation = "-";
                result = number1 - number2;
                break;
                
            case "multiplication":
            case "mulltply":
            case "*":
                operation = "*";
                result = number1 * number2;
                break;
                
            case "division":
            case "devied":
            case "/":
                operation = "/";
                result = number1 / number2;
                break;

            default:
                break;
        }

        System.out.println( number1 + " " + operation + " " + number2 + " = " + result);
        System.out.println("");

    }

}
