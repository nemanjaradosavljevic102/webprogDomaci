import java.util.Random;
import java.util.concurrent.Callable;

public class Student implements Callable<String> {

    Random rnd = new Random();
    private double duzinaOdbrane;
    private int ocena;
    private Object pregledac;

    // Random rnd = new Random();
    public Student(Object pregledac){
        this.duzinaOdbrane = Math.random() * 0.5 + 0.5;
        int sansa = rnd.nextInt(10) + 1;
        this.pregledac = pregledac;
    }
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep((int)(duzinaOdbrane*1000));
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }

        return null;
    }
}
