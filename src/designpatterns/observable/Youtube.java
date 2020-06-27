package designpatterns.observable;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject {
    private List<Observer> observerList;
    private String videoName;

    public Youtube() {
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(videoName);
        }
    }

    @Override
    public void setVideoName(String videoName) {
        this.videoName = videoName;
        notifyObservers();
    }

}
