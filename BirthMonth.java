import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self = new HashSet<>();

        for(int i = 1; i < 7; i++){
            int adjustedIndex = (i - 1) % 3 + 1;

            if (i <= 3){
                System.out.print("Enter birth month " + adjustedIndex + ": ");
                String birthMonth = sc.nextLine();
                group1.add(birthMonth);
            }
            else{
                System.out.print("Enter birth month " + adjustedIndex + ": ");
                String birthMonth = sc.nextLine();
                group2.add(birthMonth);
            }
        }
        
        System.out.println("Group 1: " + group1);
        System.out.println("Group 2: " + group2);
        
        System.out.print("Enter your birth month: ");
        String selfBirthMonth = sc.nextLine();
        self.add(selfBirthMonth);
        
        Set<String> union = new HashSet<>(group1);
        union.addAll(group2);
        System.out.println("Union: " + union);
        
        Set<String> intersection = new HashSet<>(group1);
        intersection.retainAll(group2);
        System.out.println("Intersection: " + intersection);
        
        Set<String> difference = new HashSet<>(group1);
        difference.removeAll(group2);
        System.out.println("Difference: " + difference);
        
        boolean shareBirthMonth = union.contains(selfBirthMonth);

        if (shareBirthMonth){
            System.out.println("You have the same birth month with one of your classmates.");
        }
        else{
            System.out.println("You don't have the same birth month with your classmates.");
        }
    }
}