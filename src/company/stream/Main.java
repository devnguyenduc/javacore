package company.stream;

import jdk.internal.instrumentation.Logger;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    private static long counter;
    private static void wasCalled(){
        counter++;
    }
    public static void main(String[] args) throws IOException {
	// write your code here
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        System.out.println(streamOfCollection.toArray());

        //Stream array
        Stream<String> streamOfArray = Stream.of("A","B","C");

        String[] arr = new String[]{"a","b","c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        //Stream builder
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        //Stream generate
        Stream<String> streamGenerater =
                Stream.generate( ()-> "element").limit(10);

        Stream<Integer> streamIterated = Stream.iterate(40, n-> n + 2).limit(20);
        System.out.println(streamIterated);

        //Stream of Primitives
        IntStream intStream = IntStream.range(1,3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        //Stream of String
        IntStream streamOfChars = "abc".chars();

        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");

        //Stream of File
        Path path = Paths.get("input.txt");
        Stream<String> streamofString = Files.lines(path);
        Stream<String> streamWithCharSet = Files.lines(path , Charset.forName("UTF8"));

        /*
        *
        *   Referencing a Stream
        *
        * */

        Stream<String> stream = Stream.of("ac", "b", "c").filter(element -> element.contains("c"));
        Optional<String> anyElement = stream.findAny();
        System.out.println(anyElement.get());

        List<String> elements = Stream.of("ab","bc","ccd").filter(element -> element.contains("b"))
                .collect(Collectors.toList());

        Optional<String> anyElements = elements.stream().findAny();
        Optional<String> firstElements = elements.stream().findFirst();
        System.out.println(firstElements.get());


        List<String> a = streamofString.filter(element -> element.contains("hello")).collect(Collectors.toList());
        Iterator<String> b = a.iterator();
        while (b.hasNext()){
            System.out.println(b.next());
        }

        /*
        *
        * Stream Pipeline
        *
        * */

        Stream<String> onceModifiedStream = Stream.of("abcd", "bbcd", "cbcd").skip(1);

        Stream<String> twiceModifiedStream = onceModifiedStream.skip(1).map( element -> element.substring(0, 3));
        long size = twiceModifiedStream.sorted().count();
        System.out.println(size);

        /*
        *
        *  Lazy Invocation
        *
        * */

        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        Stream<String> stream_n = list.stream().filter( element ->{
            wasCalled();
            return element.contains("2");
        });

        /*
        *
        *   Order of Execution
        *
        * */
        size = list.stream().map(element ->{
            wasCalled();
            return element.substring(0, 3);
        }).count();

        System.out.println(size);

        /*
        *
        * Stream Reduction
        *
        * */

        //  The reduce() Method
        int reducedTwoParams = Stream.of(1, 2, 3).reduce(3 , (d, e) -> d - e , (d, e)->{
            Logger log = null;
            log.info("combiner was called");
            return d + e;
        });

        System.out.println(reducedTwoParams);

        // The collect() Method

        List<Product> productList = Arrays.asList(new Product(23, "potatoes", 10),
                new Product(14, "orange", 10), new Product(13, "lemon", 10),
                new Product( 23, "bread", 10), new Product(13, "sugar", 10)
        );

        List<String> collectorCollection = productList.stream().map(Product::getName).collect(Collectors.toList());

        System.out.println(collectorCollection);

        String listToString = productList.stream().map(Product::getName).collect(Collectors.joining(", ", "[","]"));
        System.out.println(listToString);

        double avaragePrice = productList.stream().collect(Collectors.averagingInt(Product::getI));
        System.out.println(avaragePrice);

        int summingPrice = productList.stream().collect(Collectors.summingInt(Product::getI));
        System.out.println(summingPrice);

        IntSummaryStatistics statistics = productList.stream().collect(Collectors.summarizingInt(Product::getI));
        System.out.println(statistics);

        Map<Integer, List<Product>> collectorMapOfLists = productList.stream().collect(Collectors.groupingBy(Product::getI));
        Iterator iter = collectorMapOfLists.entrySet().iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        /*
        *
        *   NEW FEATURE
        *
        * */
        ModifyStream ne = new ModifyStream();
        ne.readFileCSV("caigicungduoc, mac dinh la input.txt");
        ne.ConvertCsvToObject();
        ne.printListObject();
        System.out.println(ne.SoleProduct("lemon", 3).toString());
    }

}
