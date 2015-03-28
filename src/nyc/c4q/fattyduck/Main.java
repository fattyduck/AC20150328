package nyc.c4q.fattyduck;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Scanner request = new Scanner(System.in);
        File f1 = new File("/Users/fattyduck/Desktop/accesscode/AC20150328/words");
        Dict baseDict= new Dict(f1);

        while(true) {
            System.out.println("Search by prefix, suffix, or random?");
            String in = request.nextLine();

            if (in.equalsIgnoreCase("random")) {
                System.out.println("Enter your search");
                String in2=request.nextLine();
                if(Dict.search(in2, baseDict.getWords()).size()>0) {
                    System.out.println(Dict.search(in2, baseDict.getWords()));
                }else{
                    System.out.println("Learn use a Dictionary, you cow!");
                }
            } else if (in.equalsIgnoreCase("prefix")) {
                System.out.println("Enter your search");
                String in2=request.nextLine();
                if(Dict.searchPre(in2, baseDict.getWords()).size()>0) {
                    System.out.println(Dict.searchPre(in2, baseDict.getWords()));
                }else{
                    System.out.println("Learn use a Dictionary, you cow!");
                }
            } else if (in.equalsIgnoreCase("suffix")) {
                System.out.println("Enter your search");
                String in2=request.nextLine();
                if(Dict.searchSuf(in2, baseDict.getWords()).size()>0) {
                    System.out.println(Dict.searchSuf(in2, baseDict.getWords()));
                }else{
                    System.out.println("Learn use a Dictionary, you cow!");
                }
            }
        }
    }
}
