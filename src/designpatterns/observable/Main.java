package designpatterns.observable;

public class Main {
    public static void main(String[] args) {
        Observer human = new Human();
        Subject youtube = new Youtube();
        human.subscribe(youtube);
        youtube.setVideoName("Crazycat");
        System.out.println(human.getVideoname());
        youtube.setVideoName("You just got slapped");
        System.out.println(human.getVideoname());
    }
}
