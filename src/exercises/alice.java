package exercises;

import java.util.Scanner;

public class alice {

    public static void main(String[] args) {
        String str = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search term: ");
        String term = input.nextLine();
        String find = term;
        Integer length = find.length();
        boolean val = str.contains(find);
        if (val){
        System.out.println("Your search term first appears at index " + find + ". Your term is " + length + " characters long.");
        String modifiedSentence = str.replace(find, "");
        System.out.println(modifiedSentence);}
        else
            System.out.println("string not found");
    }
}

