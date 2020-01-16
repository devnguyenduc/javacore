package company.collections.set;


import company.collections.arraylist.Matrix;

import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class HashSetExample {

    private Set<Object> hset;

    public HashSetExample(Matrix<Double> matrix){
        hset = new HashSet<Object>();
        for(int i = 0; i < matrix.getRows(); i++){
            ListIterator liter = matrix.getRow(i).listIterator();
            while(liter.hasNext()){
                hset.add(liter.next());
            }
        }

        /* Similar with for loop code:
            for(int i = 0; i < matrix.getRows();i++){
                for(int j = 0; j < matrix.getCols(); j++){
                    hset.add(matrix.getRow(i).get(j));
                }
            }
         */

    }

    public void print(){
        System.out.println("Hash Set Matrix: ");
        System.out.println(hset);
    }

    public Set<Object> getHset() {
        return hset;
    }
}