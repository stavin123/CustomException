package CustomException;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence,word;
        System.out.println("Enter a sentence");
        sentence=sc.nextLine();
        System.out.println("Enter the word to find in the sentence");
        word=sc.next();


        String[] s1=sentence.split(" ");
        int n=s1.length;
        int count = 0;
        try {
            for (int i = 0; i < n; i++) {
                String s = s1[i];

                if (word.equalsIgnoreCase(s)) {
                    count++;
                }



            }
            if (count == 0) {
                throw new CustomException("not found");
            }
            System.out.println(count);
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }

    }
}