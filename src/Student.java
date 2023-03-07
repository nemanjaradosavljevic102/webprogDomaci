import java.util.concurrent.Callable;

public class Student implements Callable<String> {

    private double duzinaOdbrane;
    // Random rnd = new Random();
    public Student(){
        this.duzinaOdbrane = Math.random() * 0.5 + 0.5;
    }
    @Override
    public String call() throws Exception {
        return null;
    }
}
