import java.util.LinkedList;
import java.util.TreeSet;

public class Methods {


    public int countObjects(TreeSet treeSet, LinkedList list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(treeSet))
                count++;
        }
        return count;
    }
}
