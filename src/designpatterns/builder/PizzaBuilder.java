package designpatterns.builder;

public class PizzaBuilder {
    private Pizza pizza;
    private String name;
    private int size;
    private boolean hasMozzarella;
    private boolean hasOlives;
    private boolean hasSalamy;
    private boolean hasCorn;
    private boolean hasSauce;
    public PizzaBuilder name(String name){
        this.name = name;
        return this;
    }
    public PizzaBuilder size(int size){
        this.size = size;
        return this;
    }
    public PizzaBuilder addMozzarella(boolean mozzarella){
        this.hasMozzarella = mozzarella;
        return this;
    }
    public PizzaBuilder addOlives(boolean olives){
        this.hasOlives = olives;
        return this;
    }
    public PizzaBuilder addCorn(boolean corn){
        this.hasCorn = corn;
        return this;
    }
    public PizzaBuilder addSauce(boolean sauce){
        this.hasSauce = sauce;
        return this;
    }
    public PizzaBuilder addSalamy(boolean salamy){
        this.hasSalamy = salamy;
        return this;
    }
    public Pizza build(){
        Pizza pizza = new Pizza();
        pizza.setName(this.name);
        pizza.setSize(this.size);
        pizza.setHasMozzarella(this.hasMozzarella);
        pizza.setHasCorn(this.hasCorn);
        pizza.setHasOlives(this.hasOlives);
        pizza.setHasSalamy(this.hasSalamy);
        pizza.setHasSauce(this.hasSauce);
        return pizza;
    }
}