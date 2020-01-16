package company.collections.arraylist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Matrix<T> {
    private int rows;
    private int cols;
    private ArrayList<ArrayList<T>> matrix;
    private Matrix<Double> singleMatrix;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new ArrayList<ArrayList<T>>();
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public ArrayList<ArrayList<T>> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<ArrayList<T>> matrix) {
        this.matrix = matrix;
    }

    public void generate(T space){
        System.out.println("Generate matrix with elements is " + space);
        for(int i = 0; i < rows; i++){
            matrix.add(new ArrayList<T>());
            for(int j = 0; j < cols; j++){
                matrix.get(i).add(space);
            }
        }
    }

    public Matrix<Double> generate_random(){
        System.out.println("Generate Matrix Random from 0 to 1.");
        singleMatrix = new Matrix<Double>(rows,cols);
        singleMatrix.generate(0.0);
        Random rand = new Random(1);
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols; j++) {
                singleMatrix.getMatrix().get(i).set(j, rand.nextDouble());
            }
        }
        return singleMatrix;
    }

    public void addByFile(String name) throws IOException {

    }

    public ArrayList<T> getRow(int row){
        return this.matrix.get(row);
    }

    public void print(){
        System.out.println("Matrix: {");
        ListIterator<ArrayList<T>> litr = matrix.listIterator();
        while (litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("}");
    }

    public void delete(){
        for(int i = 0; i < rows; i++){
            matrix.get(i).clear();
        }
        matrix.clear();
        rows = 0;
        cols = 0;
    }
}
