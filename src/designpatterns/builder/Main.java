package designpatterns.builder;

public class Main {
    public static void main(String[] args) {

         Pizza pizza = Pizza.builder()
                .name("Diavola")
                .size(35)
                .addOlives(true)
                 .addCorn(true)
                .addMozzarella(true)
                .addSalamy(true)
                .addSauce(true)
                .build();
        System.out.println(pizza);
    }
}
