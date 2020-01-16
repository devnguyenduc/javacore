package company.stream;

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
    }
}
