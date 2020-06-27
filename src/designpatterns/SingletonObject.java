package designpatterns;

public class SingletonObject {
    private static SingletonObject singletonObject;

    private SingletonObject() {

    }

    public static SingletonObject getInstance() {
        if(singletonObject==null) {
            singletonObject = new SingletonObject();
        }
        return singletonObject;
    }
}
