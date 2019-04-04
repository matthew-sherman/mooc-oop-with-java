import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        
        while(i < this.length){
            int number = random.nextInt(characters.length());
            char symbol = characters.charAt(number);
            password += symbol;
            i++;
        }
        return password;
    }
}
