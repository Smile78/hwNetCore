package netology.Core.t12StreamApi.hw121Digits;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        intList.sort(Integer::compareTo);
        for (Integer dig : intList) {
            if (dig > 0 && dig % 2 == 0) System.out.println(dig); }


    }
}
