import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        LinkedList list = new LinkedList();

        File file = new File("liczby.txt");
        Scanner scan = new Scanner(file);
        Integer number;

        while (scan.hasNextLine()) {
            number = scan.nextInt();
            list.add(number);
        }
        scan.close();
        list.sort(null);

        Map<Integer, Integer> numbers = new TreeMap<>();


        for (int i = 0; i < list.size(); i++) {
            Integer x = numbers.get(list.get(i));
            if (x == null) {
                numbers.put((Integer) list.get(i), 1);
            } else numbers.put((Integer) list.get(i), x + 1);

        }

        Set<Entry<Integer,Integer>> entrySet = numbers.entrySet();
        for(Entry<Integer, Integer> entry: entrySet) {
            System.out.println(entry.getKey() + " liczba wystąpień : " + entry.getValue());
    }

}}



