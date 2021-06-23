package demo;

import java.util.Scanner;

public class Calculator {

  public String eval(String input) {

    String[] tokens = input.trim().split(" ");  
    if (tokens.length > 1) { 
      int arg1 = Integer.parseInt(tokens[0]);
      int arg2 = Integer.parseInt(tokens[2]);
      String op = tokens[1];
      if (op.equals("+")) {
        int sum = arg1 + arg2;
        return Integer.toString(sum);
      }
      else {
        int product = arg1 * arg2;
        return Integer.toString(product); 
      }
    }    
    else { 
      return input.trim();
    }
  }

  public static void main(String[] args) {
    Calculator c = new Calculator();
    Scanner s = new Scanner(System.in);
    while(true) {
        String input = s.nextLine();      
        System.out.println(c.eval(input));
    }
  }
}

