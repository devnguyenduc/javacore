package company.collections;

import company.collections.map.HashMapExample;
import company.collections.arraylist.Matrix;
import company.collections.set.HashSetExample;
import company.collections.set.TreeSetExample;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Matrix<Integer> matrix = new Matrix<Integer>(3,3);
        matrix.generate(0);
        matrix.print();

        HashSetExample hashSetExample = new HashSetExample(matrix.generate_random());
        hashSetExample.print();

        TreeSetExample treeSetExample = new TreeSetExample(hashSetExample);
        treeSetExample.print();

        HashMapExample hashMapExample = new HashMapExample(matrix.generate_random());
        hashMapExample.print();

    }
}
