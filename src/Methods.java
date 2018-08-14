import java.util.LinkedList;

public class Methods {


public boolean object(LinkedList linkedList) {

        for (int i = 0; i < linkedList.size(); i++) {
            int numContained = countObjects((LinkedList) linkedList.get(i), linkedList);
            if (numContained > 1) {
                return false;
            }
        }
        return true;

    }



    public int countObjects(LinkedList search, LinkedList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(search))
                count++;
        }
        return count;
    }
}
