package designpatterns.observable;

public interface Observer {
    void update(String videoName);
    void subscribe(Subject subject);
    String getVideoname();
}
