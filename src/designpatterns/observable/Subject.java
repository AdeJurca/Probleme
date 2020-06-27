package designpatterns.observable;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    void setVideoName(String videoName);
}
