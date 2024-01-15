package com.bsit303.greeting;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<String> nicknames = new PriorityQueue<>();
        
        System.out.println("Enter the nicknames of 4 of your classmates: ");
        for(int i = 0; i < 4; i++){
            String nickname = sc.nextLine();
            nicknames.add(nickname);
        }
        
        while(!nicknames.isEmpty()){
            System.out.println("Press H to say Hi to each of them. ");
            
            for(int i = 0; i < 4; i++){
                String input = sc.nextLine();
                
                if("H".equals(input) || "h".equals(input)){
                    String nickname = nicknames.poll();
                    System.out.println("Hi " + nickname + " !");
                }
                else{
                    break;
                }
            }
        }
        System.out.println("Done saying Hi.");
    }
}
