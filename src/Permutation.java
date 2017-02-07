
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import edu.princeton.cs.algs4.*;

/**
 * Created by ryan on 2/1/17.
 */

public class Permutation {
    public static void main(String[] args){

//        int cycles = Integer.parseInt(args[0]);
//        RandomizedQueue rand = new RandomizedQueue<>();
//
//        for (int i = 0; i < cycles; i++){
//            rand.enqueue(StdIn.readString());
//        }
//
//        while(rand.iterator().hasNext()) {
//            System.out.println(rand.iterator().next());
//        }
        unitTest("permutation4.txt");
    }

    public static void unitTest(String filename) {
        Deque<String> rand = new Deque<>();
        int elements = 0;

//        try {
//            for (String line : Files.readAllLines(Paths.get(filename))){
//                for (String part : line.split("\\s+")){
//                    elements++;
//                    rand.addFirst(part);
//                }
//            }
//
//
//        } catch (Exception e) {
//
//        }


        Iterator itr = rand.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
