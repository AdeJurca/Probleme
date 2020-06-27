package designpatterns.builder;

public class Pizza {
    private String name;
    private int size;
    private boolean hasMozzarella;
    private boolean hasOlives;
    private boolean hasSalamy;
    private boolean hasCorn;
    private boolean hasSauce;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public boolean isHasMozzarella() {
        return hasMozzarella;
    }
    public void setHasMozzarella(boolean hasMozzarella) {
        this.hasMozzarella = hasMozzarella;
    }
    public boolean isHasOlives() {
        return hasOlives;
    }
    public void setHasOlives(boolean hasOlives) {
        this.hasOlives = hasOlives;
    }
    public boolean isHasSalamy() {
        return hasSalamy;
    }
    public void setHasSalamy(boolean hasSalamy) {
        this.hasSalamy = hasSalamy;
    }
    public boolean isHasCorn() {
        return hasCorn;
    }
    public void setHasCorn(boolean hasCorn) {
        this.hasCorn = hasCorn;
    }
    public boolean isHasSauce() {
        return hasSauce;
    }
    public void setHasSauce(boolean hasSauce) {
        this.hasSauce = hasSauce;
    }
    public static PizzaBuilder builder(){
        return new PizzaBuilder();
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", hasMozzarella=" + hasMozzarella +
                ", hasOlives=" + hasOlives +
                ", hasSalamy=" + hasSalamy +
                ", hasCorn=" + hasCorn +
                ", hasSauce=" + hasSauce +
                '}';
    }
}