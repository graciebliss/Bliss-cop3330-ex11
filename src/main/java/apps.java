/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String euros=in.nextLine();

        System.out.print("What is the exchange rate? ");
        String exchange=in.nextLine();

        double eurosNum=Double.parseDouble(euros);
        double exchangeNum=Double.parseDouble(exchange);

        double usDollars=eurosNum*exchangeNum;

        double rounded=Math.round(usDollars*100.00)/100.00;

        System.out.print(euros+" euros at an exchange rate of "+exchange+" is "+String.format("%.2f",rounded)+" U.S. dollars.");
    }
}
