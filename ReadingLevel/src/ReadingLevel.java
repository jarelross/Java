//Program that reads a text file from the web and reports the average number of 
//letters in a word and the average number of words in a sentence.
//Jarel Ross

public class ReadingLevel{
    public static void main (String[] oooo) throws java.io.IOException{
        java.util.Scanner keyboard = new java.util.Scanner(System.in);//Creating User Input Scanner//
        System.out.println("Enter the URL ");
        String filename = keyboard.next();
        java.net.URL URL = new java.net.URL(filename);
        java.util.Scanner fileIn = new java.util.Scanner(URL.openStream());
        //Declared and initialized Characters//
        String count;
        String letters;
        String words;
        String Sentences;
        double amountOfLetters = 0.0;
        double amountOfWords = 0.0;
        double amountOfSentences = 0.0;
        //While Statement//
        while ( fileIn.hasNext() ){
            count = fileIn.next();
            amountOfWords++;
            count.length();
            amountOfLetters += count.length();
            //If you reach the end of a sentence//
            if (count.endsWith(".") || count.endsWith("!") || count.endsWith("?")){
                amountOfSentences++;
            }
            if (count.equals("?") || count.equals(",") || count.equals("!")){
                amountOfLetters++;
            }
        }
        double lettersPerWord = amountOfLetters/ amountOfWords;
        double wordsPerSentence = amountOfWords/ amountOfSentences;
        //displayed prompt//
        System.out.println(lettersPerWord+" Letters Per Word");
        System.out.println(wordsPerSentence+" Words Per Sentence");



    }
}
     