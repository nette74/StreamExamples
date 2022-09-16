import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;




public class StreamExampleTest {


    @Test
    void streamTest1()
    {
        int[] intArray = {9,2,3,2,8,4,3,2,6,4,7,8};
        Arrays.stream(intArray)
                .distinct()
                .sorted()
                .forEach(x -> System.out.print(x + " "));
    }

    @Test
    void streamTest2()
    {
        List<String> stringList = new ArrayList<>();
        stringList.add("orange");
        stringList.add("grape");
        stringList.add("apple");
        stringList.add("grape");
        stringList.add("mango");
        stringList.add("lemon");
        stringList.add("lime");

        List<String> streamedList = stringList.stream()
                .filter(x -> x.length()<6)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        Map<Integer, String> streamedMap =
                stringList.stream()
                .filter(x -> x.length()<6)
                .distinct()
                .collect(Collectors.toMap(k-> stringList.indexOf(k), v->v ));
        streamedMap
            .forEach((k,v) -> System.out.print(k +":" + v));
                

        System.out.println(streamedList);
        System.out.println(streamedMap);
    }
}
