package company.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    private Set<Object> treeset;

    public TreeSetExample(HashSetExample hashSetExample){
        treeset = new TreeSet<Object>(hashSetExample.getHset());
    }

    public void print(){
        System.out.println("Tree Set Matrix: ");
        System.out.print("[");
        for (Object data:treeset){
            System.out.print(data + ", ");
        }
        System.out.println("]");
    }
}
