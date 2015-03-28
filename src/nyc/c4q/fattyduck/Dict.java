package nyc.c4q.fattyduck;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fattyduck on 3/28/15.
 */
public class Dict{

    private File f;

    public Dict(File f){
        this.f=f;
    }

    public ArrayList<String> getWords() {
        ArrayList<String> wordArray=new ArrayList<String>();
        try {
            Scanner input = new Scanner(f);
            while(input.hasNext()){
                wordArray.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wordArray;

    }

    public static ArrayList<String> search(String input, ArrayList<String> wordArray) {
        ArrayList<String> search=new ArrayList<String>();
        for (int i = 0; i < wordArray.size(); i++) {
            if (wordArray.get(i).contains(input)){
                search.add(wordArray.get(i));
            }

        }
        return search;
    }

    public static ArrayList<String> searchPre(String input, ArrayList<String> wordArray) {
        ArrayList<String> search=new ArrayList<String>();
        for (int i = 0; i < wordArray.size(); i++) {
            if (wordArray.get(i).startsWith(input)){
                search.add(wordArray.get(i));
            }

        }
        return search;
    }

    public static ArrayList<String> searchSuf(String input, ArrayList<String> wordArray) {
        ArrayList<String> search=new ArrayList<String>();
        for (int i = 0; i < wordArray.size(); i++) {
            if (wordArray.get(i).endsWith(input)){
                search.add(wordArray.get(i));
            }

        }
        return search;
    }


}
