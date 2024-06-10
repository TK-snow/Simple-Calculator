package ToolsQA;

import ToolsQA.Calculator.simple_func;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        say_hello("hello!");
        simple_func.calculation("+", 5, 7);
        simple_func.calculation("-", 10, 8);
        simple_func.calculation("*", 4, 3);
        simple_func.calculation("/", 21, 5);

    }

    private static void say_hello(String sentence){
        System.out.println("welcome to my first application!");
        System.out.println(sentence);
        System.out.println("");
    }
}

