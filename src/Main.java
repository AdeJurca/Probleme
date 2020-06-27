import java.util.*;

public class Main {
//2    public int a = 10;
//    public static void main(String[] args) {
//2        Main main = new Main(); //cand nu vrei sa faci variabila a statica
//1        A a= new A();
//1        System.out.println(a.getA());

//        List<Integer> numbers = Arrays.asList(1,5,12,2,5,6,8,9,14);
//        List<Integer> resultList = new ArrayList<>();
//        int max=0;
//        for(Integer number: numbers) {
//3            if(number>=7) {
//                resultList.add(number);
//4                if(number%2==1) {
//                    resultList.add(number);
//5            if(max<number) {
//                max=number;
//            }
//            System.out.println(max);
//                }
//            }
    //3.2        resultList.forEach(System.out::println);
//        }

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 5, 12, 6);
//        List<Integer> resultList = new ArrayList<>();
//        int max = 0;
//        int max2 = 0;
//        for(Integer number:numbers) {
//            if(max<number) {
//                max2=max;
//                max=number;
//            }
//            else if(max2<number) {
//                max2=number;
//            }
//        }
//        System.out.println(max);
//    }

    //se afiseaza toate nr prime mai mici decat x, 10000

//    public static void main(String[] args) {
//        int x=10000;
//        for(int i=2; i<=x; i++) {
//            boolean isPrime=true;
//            for(int j=2; j<=Math.sqrt(i); j++) {
//                if(i%j ==0){
//                    isPrime=false;
//                }
//            }
//            if(isPrime==true) {
//                System.out.println(i);
//            }
//        }
//    }


//    public static void main(String[] args) {
//        int x =31;
//        boolean isPrime = true;
//        for (int i = 2; i < Math.sqrt(x); i++) {
//            if (x % i == 0) {
//                isPrime = false;
//            }
//        }
//        System.out.println(isPrime);
//    }

    //daca 2 nr adunate dau un numar anume

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(2, 4, 5, 6, 3, 12, 7);
//        int x = 10;
//        boolean pairExists = false;
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            for (int j = i + 1; j < numbers.size(); j++) {
//                if (numbers.get(i) + numbers.get(j) == x) {
//                    System.out.println(numbers.get(i) + " " + numbers.get(j));
//                    pairExists = true;
//                }
//            }
//        }
//        System.out.println(pairExists);
//    }

    //inversare lista nr fara a face o alta lista

//    public static void main(String[] args) {
//        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < numbers.length / 2; i++) {
//            numbers[i] = numbers[i] + numbers[numbers.length - 1 - i];
//            numbers[numbers.length - 1 - i] = numbers[i] - numbers[numbers.length - 1 - i];
//            numbers[i] = numbers[i] - numbers[numbers.length - 1 - i];
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.printf("%d ", numbers[i]);
//        }
//    }

    //anagrama

//    public static void main(String[] args) {
//        Map<Character, Integer> charFrequency = new HashMap<>();
//        Map<Character, Integer> charFrequency2 = new HashMap<>();
//        String s1 = "car";
//        String s2 = "arc";
//        boolean isAnagram = true;
//        if (s1.length() != s2.length()) {
//            isAnagram = false;
//        } else {
//            int count = 0;
//            for (int i = 0; i < s1.length(); i++) {
//                Integer number = charFrequency.get(s1.charAt(i));
//                if (number == null) {
//                    charFrequency.put(s1.charAt(i), 1);
//                } else {
//                    charFrequency.put(s1.charAt(i), number + 1);
//                }
//            }
//
//            for (int i = 0; i < s2.length(); i++) {
//                Integer number = charFrequency2.get(s2.charAt(i));
//                if (number == null) {
//                    charFrequency.put(s2.charAt(i), 1);
//                } else {
//                    charFrequency.put(s2.charAt(i), number + 1);
//                }
//           }
//        }
//        for(Map.Entry<Character, Integer> entry:charFrequency.entrySet()) {
//            if(entry.getValue().equals(charFrequency2.get(entry.getKey()))){
//                isAnagram = false;
//            }
//        }
//        System.out.println(isAnagram);
//    }

    //cautam nr fara pereche

//    public static void main(String[] args) {
//        Integer[] numbers = {1, 4, 4, 1, 5, 5, 6, 7, 7, 8, 8, 9, 9};
//        int result = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            result = result ^ numbers[i];
//        }
//        System.out.println(result);
//    }

}






