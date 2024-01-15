package com.bsit303.movietime;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MovieTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieName, snacksName;
        char eat;
        int num = 3;
        
        Queue<String> snacks = new LinkedList<>();
        Queue<String> movies = new LinkedList<>();
        
        for(int i = 0; i < num; i++){
            System.out.print("Enter movie " + (i+1) + " of 3: ");
            movieName = sc.nextLine();
            movies.offer(movieName);
        }
        
        for(int i = 0; i < num; i++){
            System.out.print("Enter snack " + (i+1) + " of 3: ");
            snacksName = sc.nextLine();
            snacks.offer(snacksName);
        }
        
        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are: " + snacks);
        
        while(num > 0){
            num--;
            System.out.print("Press 'S' each time you finish a snack: ");
            eat = sc.next().charAt(0);
            snacks.remove();
            if(snacks.isEmpty()){
                System.out.print("No more snacks");
            }
            else{
                System.out.println("Snacks remaining: " + snacks);
            }
        }
    }
}
