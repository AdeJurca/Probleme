//thread

public class Runner implements Runnable {
    private Thread t;
    private String threadName;
    private static int a=5;

    public Runner(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
//        for(int i=0; i<5; i++) {
//            System.out.println("I have the nr");
        try {
            Thread.sleep((long) Math.random());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        doSomething();
    }

    public void start() {
        if(t==null) {
            t=new Thread(this);
            t.start();
        }
    }

    private synchronized void doSomething() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName()+ "has the name" +i);
        }
    }
  public String getName() {
        return threadName;
  }
}
