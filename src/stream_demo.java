import org.junit.Test;

import java.util.stream.Stream;

public class stream_demo {

    @Test
    public void test1(){
        Stream<String> stream1 = Stream.of("甲", "甲壳虫", "乙");
        System.out.println(stream1);
    }


}
