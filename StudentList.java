import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> students = new HashMap<>();
        
        for(int i = 0; i < 3; i++){
            System.out.print("Enter student number: ");
            int studentNumber = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter first name: ");
            String firstName = sc.nextLine();
            students.put(studentNumber, firstName);
        }
        
        System.out.println("Student List: ");
        for(Map.Entry<Integer, String> entry: students.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        if(students.size() >= 3){
            int thirdEntryKey = (int) students.keySet().toArray()[2];
            students.remove(thirdEntryKey);
        }
        
        System.out.print("Enter your student number: ");
        int studentNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        students.put(studentNumber, firstName);
        
        System.out.println("Student List: ");
        Set<Integer> keys = students.keySet();
        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
