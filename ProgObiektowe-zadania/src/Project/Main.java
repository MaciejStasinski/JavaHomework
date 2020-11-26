package Project;
class Contestant extends Thread {
    @Override
    public void run() {

        for (int i=0; i<10; i++) {
            System.out.println(i+" : "+Thread.currentThread());

        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread t1= new Contestant();
        Thread t2= new Contestant();
        t1.start();
        t2.start();
    }
}


