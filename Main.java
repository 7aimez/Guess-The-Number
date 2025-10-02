import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Create Scanner Object
        Scanner scanObj = new Scanner(System.in);
        
        while (true) {
            // Create Variable
            int num = (int)(Math.random() * 10);
            
            clear();
            System.out.println();
            System.out.println("----------------");
            System.out.println();
            System.out.print("Enter Guess: ");
            int guess = scanObj.nextInt();
            
            if (guess < 10 && guess > -1) {
                
                System.out.println("You geussed "+ guess);
                System.out.println("And the correct number was "+ num);
                if (guess == num) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("You Lose...");
                };
            } else {
                
                if (guess == 67) {
                    clear();
                    System.out.println();
                    System.out.println("----------------");
                    System.out.println();
                    System.out.println("Welcome to top secret admin controls");
                    System.out.println();
                    System.out.println(" 1 - Auto Win");
                    System.out.println(" 2 - Auto Break");
                    System.out.println(" 3 - Exit");
                    System.out.println();
                    System.out.print("Select and option: ");
                    
                    int adminOption = scanObj.nextInt();
                    
                    switch (adminOption) {
                        case 1:
                            System.out.println();
                            System.out.println();
                            System.out.println("You Win!");
                            break;
                        case 2:
                            clear();
                            break;
                        case 3:
                            System.out.println();
                        default:
                            System.out.println("Invalid Option. Exiting...");
                            System.out.println();
                            System.out.println();
                    };
                        
                } else {
                    clear();
                    System.out.println();
                    System.out.println("Invalid Guess");
                    System.out.println();
                    System.out.println("----------------");
                    System.out.println();
                    System.out.print("Enter Guess: ");
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
                
            };
            
            
        }
        
    }
    
    public static void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
}
