
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList words = new ArrayList();
        
        while(true){
            
            System.out.print("Type a word: ");
            String word = reader.nextLine();
             
            if(word.isEmpty()){
                break;
            }else{
                words.add(word);
            }
        }
        
        Collections.sort(words);
        
        System.out.println("You typed the following words: ");

        for (Object word : words){
            System.out.println(word);
        }
    
    }
}
