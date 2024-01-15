package com.bsit303.taskperformance;
import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class TaskPerformance {
    public static void main(String[] args) {
        Queue book = new LinkedList <String> ();
        Stack <String> title = new Stack <> ();
        Scanner user = new Scanner(System.in);
        System.out.println("Enter four book titles.");
        int b = 4;
        for(int i=1; i <= b;i++){
            System.out.print("Book " + i + ": ");
            String Enter = user.nextLine();
            title.push(Enter);
        }
        for(int i=1; i <= b; i++){
            book.offer(title.pop());
        }
        System.out.println("New order of books:");
        System.out.println(book);
    }
}
