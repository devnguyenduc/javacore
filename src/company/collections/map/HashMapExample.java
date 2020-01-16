package company.collections.map;

import company.collections.arraylist.Matrix;
import java.util.*;

public class HashMapExample {

    public HashMap<Integer, Object> hashmap;

    public HashMapExample(Matrix<Double> matrix){
        hashmap = new HashMap<Integer, Object>();
        int rows = matrix.getRows();
        int i = 0;
        ListIterator liter = matrix.getMatrix().listIterator();
        while (liter.hasNext()) {
            i++;
            hashmap.put(i, liter.next());
        }
    }

    public void print(){
        Iterator iterator = hashmap.entrySet().iterator();
        System.out.println("Hash Map Matrix: ");
        while (iterator.hasNext()){
            Map.Entry men = (Map.Entry) iterator.next();
            System.out.println("Row: " + men.getKey() + "  " + men.getValue());
        }
    }

    public HashMap<Integer, Object> getHashmap() {
        return hashmap;
    }
}
