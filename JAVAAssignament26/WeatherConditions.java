//Assignment 7: Weather Conditions
//Write a program that determines whether it's safe to go outside based on temperature and weather conditions. The conditions to go outside are:
//•    Temperature should be between 20°C and 30°C.
//•    It should not be raining.
//Requirements:
//•    Use logical operators && and !.



package JAVAAssignament26;

import java.util.Scanner;  

public class WeatherConditions {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter the temperature (°C): ");  
        int temperature = scanner.nextInt();  

        System.out.print("Is it raining (true/false)? ");  
        boolean isRaining = scanner.nextBoolean();  

        if (temperature >= 20 && temperature <= 30 && !isRaining) {  
            System.out.println("It's safe to go outside.");  
        } else {  
            System.out.println("It's not safe to go outside.");  
        }  

         
    }  
}
