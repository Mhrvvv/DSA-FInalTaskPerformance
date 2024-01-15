import java.util.HashMap;
import java.util.Map;

public class Activity_01{
    public static void main(String[] args) {
        
        Map <String, String> programs = new HashMap<>();
        programs.put("BSIT", "Bachelor of Science in Information Technology");
        programs.put("BSCS", "Bachelor of Science in Computer Science");
        programs.put("BSIS", "Bachelor of Science in Information Systems");

        System.out.println("Keys: " + programs.keySet());

        if(!programs.isEmpty()){
            String firstKey = programs.keySet().iterator().next();
            programs.remove(firstKey);
            System.out.println("Removed entry with key: " + firstKey);
        }
        else{
            System.out.println("The map is empty.");
        }

        String keyToCheck = "BSCpE";
        if(programs.containsKey(keyToCheck)){
            System.out.println("The map contains the key: " + keyToCheck);
        }
        else{
            System.out.println("The map does not contain the key: " + keyToCheck);
        }
    }
}