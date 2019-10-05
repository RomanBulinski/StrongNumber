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
        int effect = 0;
        for(int i =0; i <list.size(); i++){
            effect+= Integer.parseInt( (String)list.get(i) );
        }
        if( num == effect ){
            return "STRONG!!!!";
        }else{
            return "Not Strong !!";
        }

    }

    static int silnia(String i) {
        int res = 1;
        for (int j = 1; j <= Integer.valueOf(i); j++) {
            res = res * j;
        }
        return res;
    }
    


}
