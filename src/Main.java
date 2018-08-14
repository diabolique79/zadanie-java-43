import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        LinkedList list = new LinkedList();

        File file = new File("liczby.txt");
        Scanner scan = new Scanner(file);
        Integer number;
        Integer sum = 0;
        int liczbaWystepien = 1;

        while (scan.hasNextLine()) {
            number = scan.nextInt();
            list.add(number);
        }
        scan.close();
        list.sort(null);

        TreeSet set = new TreeSet();

        set.addAll(list);
        System.out.println(set);

//        for (Object check : set){
//
//            for (int j = 0; j < list.size(); j++) {
//
//                if (check.equals(list.get(j))){
//                   sum++;
//                }
//            }
//
//            System.out.println(check + " "+ sum);
//
//        }

        Map<Integer, Integer> liczby = new TreeMap<>();

//        for (Object s : list) {
//
//            if (liczby.containsKey(s)) {
//                sum++;
//                liczby.put((Integer) s, sum);
//
//            } else liczby.put((int) s, 1);
//
//        }
//        System.out.println(liczby.keySet() + " dodać " + liczby.values());
//
//        System.out.println(liczby.entrySet());

        for (Object s : list){

                if(liczby.containsKey(s)){
                    liczbaWystepien++;
                    liczby.put((Integer) s, liczbaWystepien);
                }
                else liczby.put((Integer) s, 1);
        }System.out.println(liczby.entrySet());

    }
}


