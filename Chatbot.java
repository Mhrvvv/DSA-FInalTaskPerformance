import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chatbot {

    private static List<String> reservations = new ArrayList<>();

    private static void description() {
        System.out.println("Welcome to the Restaurant ChatBot!");
        System.out.println("This chatbot is here to assist you with information about our restaurant.");
        System.out.println("Feel free to ask about the menu, today's specials, make reservations, get recommendations, and more!");
        System.out.println("Here are some examples of what you can ask:");
        System.out.println("- 'Menu': What's on the menu?");
        System.out.println("- 'Specials': Tell me about today's specials.");
        System.out.println("- 'Reservation': Make a reservation for tomorrow at 7:00 PM.");
        System.out.println("- 'View Reservations': What are my reservations?");
        System.out.println("- 'Recommendation': Can you recommend something for dinner?");
        System.out.println("- 'Info': Tell me more about the restaurant.");
        System.out.println("- 'Hours': What are your operating hours?");
        System.out.println("- 'Exit': Type 'exit' to end the conversation.");
        System.out.println("Feel free to explore and ask any questions you have. Enjoy your interaction with the Restaurant ChatBot!");
        System.out.println();
    }

    private static String getBotResponse(String userMessage) {
        if (userMessage.contains("menu") || userMessage.contains("Menu")) {
            return "Our menu includes a variety of dishes, including appetizers, main courses, and desserts.";
        } else if (userMessage.contains("specials") || userMessage.contains("Specials")) {
            return "Today's specials are: Chef's Special Pasta, Grilled Salmon, and Tiramisu for dessert.";
        } else if (userMessage.contains("reservation") || userMessage.contains("Reservation")) {
            return handleReservation(userMessage);
        } else if (userMessage.contains("recommendation") || userMessage.contains("Recommendation")) {
            return provideRecommendation();
        } else if (userMessage.contains("info") || userMessage.contains("Info")) {
            return "Our restaurant is located at 123 Main St. We take pride in offering a cozy atmosphere and delicious food.";
        } else if (userMessage.contains("hours") || userMessage.contains("Hours")) {
            return "We are open from 11:00 AM to 10:00 PM from Monday to Saturday.";
        } else if (userMessage.contains("exit") || userMessage.contains("Exit")) {
            return "Goodbye! If you have any more questions, feel free to ask.";
        } else {
            return "I'm sorry, I didn't understand that. How can I assist you?";
        }
    }

    private static String handleReservation(String userMessage) {
        if (userMessage.contains("make reservation") || userMessage.contains("Make Reservation")) {
            reservations.add("Reserved for " + userMessage.substring(userMessage.indexOf("on")));
            return "Your reservation has been confirmed. See you soon!";
        } else if (userMessage.contains("view reservations") || userMessage.contains("View Reservations") || userMessage.contains("View reservations")) {
            return "Your reservations: " + String.join(", ", reservations);
        } else {
            return "To make a reservation, please provide the date and time. For example, 'Make a reservation on January 15th at 7:00 PM.'";
        }
    }

    private static String provideRecommendation() {
        return "I recommend trying our Chef's Special Pasta. It's a customer favorite!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        description();

        String userInput;

        do {
            System.out.print("You: ");
            userInput = scanner.nextLine();
            String response = getBotResponse(userInput);
            System.out.println("Bot: " + response);

        } while (!userInput.equalsIgnoreCase("exit"));

        System.out.println("Thank you for using the Restaurant ChatBot. Have a great day!");
        scanner.close();
    }
}
