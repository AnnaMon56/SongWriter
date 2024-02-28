import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Song {


    static String[] combined = Combine.Combined.split(" ");

    public static void spell() {
        for (int i = 0; i <combined.length; i++) {
            System.out.print(combined[i] + " ");
        }
    }


    public static void create() {
        String block = "";
        Random random = new Random();
        //choose first word, add it to block
        int firstWord = random.nextInt(combined.length);
        block += combined[firstWord] + " ";
        String currentWord = combined[firstWord];

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {


                //create an array of all places for current word
                ArrayList<Integer> places = new ArrayList<>();
                for (int z=0; z < combined.length; z++) {
                    if (combined[z].equals(currentWord)) {

                        places.add(z);

                    }
                }

                int maxSize = places.size();
               // for (int a = 0; a < maxSize; a++) {
                 //   System.out.print(places.get(a) + " ");
                //}


                //choose a random instance of the current word
                int previousWord = places.get(random.nextInt(maxSize));


                //take the next word
                currentWord = combined[previousWord + 1];

                if (currentWord.equals("\n")) {
                    j--;

                } else {
                    block += currentWord + " ";
                    if (j == 5) {
                        block += "\n";
                    }
                    if (i==1 && j==3) {
                        j++;
                    }
                }
            }
        }
        System.out.println(block);
    }
}


