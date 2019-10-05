import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

import static java.util.stream.Collectors.toList;

public class StrongNumber {


    public static String isStrongNumber(int num) {

        List<Object> list = Arrays.stream(String.valueOf(num)
                .split(""))
                .mapToInt(n ->silnia( n ))
                .mapToObj(m->String.valueOf(m))
                .collect(toList());
        String effect = "";
        for(int i =0; i <list.size(); i++){
            effect+=list.get(i);
        }
        if( num == Integer.valueOf(effect) ){
            return "STRONG!!!!";
        }
        return "Not Strong !!";
    }

    static int silnia(String i) {
        int res = 0;
        for (int j = 1; j <= Integer.valueOf(i); j++) {
            res = res * j;
        }
        return res;
    }


}
