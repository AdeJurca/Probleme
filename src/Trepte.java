//combinatii de k trepte luate de n ori

import java.util.ArrayList;
import java.util.List;

public class Trepte {
    public static void main(String[] args) {
        int k = 5;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        int i = 2;
        while(numbers.size()<k) {
            int number = numbers.get(i-1) + numbers.get(i-2);
            i++;
            numbers.add(number);
        }
        numbers.forEach(System.out::println);
    }
}
