import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        LinkedList list = new LinkedList();
        
        File file = new File("liczby.txt");
        Scanner scan = new Scanner(file);
        Integer number;
        Integer sum = 0;
        int i = 0;
        Comparator<Integer> comparator = null;

        while (scan.hasNextLine()) {
            number = scan.nextInt();
            list.add(number);
        }
        scan.close();
        list.sort(null);


        for (Object liczby : list) {
            System.out.println(liczby); {
                sum++;
            }
            //System.out.println(liczby + " indeks " + (i - 1) + " suma " + sum);

        }


    }
}


