package designpatterns.observable;

public class Human implements Observer {
    private String videoName;
    private Subject subject;

    @Override
    public void update(String videoName) {
        this.videoName = videoName;
    }

    @Override
    public void subscribe(Subject subject) {
        subject.register(this);
    }

    @Override
    public String getVideoname() {
        return videoName;
    }


    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
}
