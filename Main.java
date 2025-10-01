import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Create Scanner
        Scanner scanObj = new Scanner(System.in);
        
        while (true) {
            // Create Variable
            int num = (int)(Math.random() * 10);
            
            System.out.println(); // Add Extra Line
            System.out.println("Enter Guess: ");
            int guess = scanObj.nextInt();
            
            if (guess < 10 && guess > -1) {
                
                System.out.println("You geussed "+ guess);
                System.out.println("And the correct number was "+ num);
                if (guess == num) {
                    System.out.println("You Win!");
                } elif (guess == 67) {
                    
                    System.out.println();
                    System.out.println();
                    System.out.println("Welcome to top secret admin controls");
                    System.out.println("Select and option:");
                    System.out.println();
                    System.out.println(" 1 - Auto Win");
                    System.out.println(" 2 - Auto Break");
                    System.out.println(" 3 - Exit");
                    
                    int adminOption = scanObj.nextLine();
                    
                    switch adminOption {
                        case 1:
                            System.out.println();
                            System.out.println();
                            System.out.println("You Win!");
                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println();
                        default:
                            System.out.println("Invalid Option. Exiting...");
                            System.out.println();
                            System.out.println();
                    };
                        
                } else {
                    System.out.println("You Lose...");
                };
                
            } else {
                
                System.out.println("Invalid Guess");
                System.out.println("Enter Guess: ");
                int guess2 = scanObj.nextInt();
                
                System.out.println("You geussed "+ guess2);
                System.out.println("And the correct number was "+ num);
                if (guess == num) {
                    System.out.println("You Win!");
                    break;
                } else {
                    System.out.println("You Lose...");
                };
                
            };
            
            
        }
        
    }
}
