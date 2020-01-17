package company.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModifyStream {
    private Path path;
    private List<String> listCsv;
    private List<Product> listProduct;
    public ModifyStream(){
        listProduct = new ArrayList<Product>();
    }
    public void readFileCSV(String file_path){
        path = Paths.get("input.txt");
        try(Stream<String> stream = Files.lines(path, Charset.forName("UTF8"))){
            listCsv = stream.collect(Collectors.toList());
            Iterator iter = listCsv.iterator();
            while(iter.hasNext()){
                System.out.println(iter.next());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void ConvertCsvToObject(){
        for(int i = 0; i < listCsv.size(); i++){
            String[] temp = listCsv.get(i).replace(" ", "").split(",");
            listProduct.add(new Product(new Integer(temp[0]),
                    temp[1],
                    new Integer(temp[2])));
        }
    }

    public void printListObject(){
        Iterator iterator = listProduct.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getClass());
        }
    }

    public List<Product> getListObject(){
        return listProduct;
    }

    public List<Product> FilterNameProduct(String filter){
        List<Product> temp = listProduct.stream().filter( element -> element.getName().contains(filter)).collect(Collectors.toList());
        return temp;
    }

    public Product SoleProduct(String ProductName, int number){
        return this.FilterNameProduct(ProductName).stream().reduce(
          new Product(100000, ProductName, number), (e , q)-> q.minus(e)
        );
    }

}
