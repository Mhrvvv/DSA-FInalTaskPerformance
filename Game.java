import java.util.Scanner;
public class Game {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int damage, playerLife = 100, playerLevel = 1, mobsLife = 20, bossLife = 100;
        char choice;

        System.out.println("Let's start our Adventure!");

        while(playerLevel <= 4) {
            System.out.println("Level " + playerLevel + ":");
            System.out.println("Player Health: " + playerLife);
            System.out.println("Mobs Health: " + mobsLife);
            System.out.print("Press Y to attack: ");

            choice = sc.next().charAt(0);

            if(choice == 'Y'){
                //Player attacks the mobs
                damage = (int) (Math.random() * 500);
                mobsLife -= damage;
                System.out.println("You dealt " + damage + " damage to the mobs!");
            }
            if (mobsLife <= 0) {
                System.out.println("You defeated the mobs of level " + playerLevel + "!");
                System.out.println("");
                playerLevel++;
                // Reset mobs health for the next level
                mobsLife = 20; 
            }
        }
        if (playerLevel > 4) {
            System.out.println("Welcome to the final boss!!!");
            System.out.println("");
            while(playerLevel > 4) {
                System.out.println("Boss Health: " + bossLife);
                System.out.print("Press Y to attack the final boss: ");

                choice = sc.next().charAt(0);

                if(choice == 'Y'){
                    //Player attacks the boss
                    damage = (int) (Math.random() * 100);
                    bossLife -= damage;
                    System.out.println("You dealt " + damage + " damage to the mobs!");
                    System.out.println("");
                }
                if (bossLife <= 0) {
                    System.out.println("You defeated the boss of the game!");
                    System.out.println("");
                    System.out.println("Congratulations! You defeated all levels and won the game!");
                    break;
                }
            }
        }
    }
}
