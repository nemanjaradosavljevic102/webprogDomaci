import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Profesor  implements Runnable{

    CyclicBarrier cyclicBarrier;
    private double raspolozivost = 0.00;


    public Profesor(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;

    }

    @Override
    public void run() {
        Random ocena = new Random();
        System.out.println("Profesor je spreman");
        try{
            cyclicBarrier.await();

            for(Student s : Main.studenti) {

                    if (s.isProfesor() == true) {
                       synchronized (Main.lockProf) {
                        s.setOcena(ocena.nextInt(6) + 5);
                        System.out.println("Student" + s.getId() + ", Arrival: " + Math.round(raspolozivost * 100.0) / 100.0 + ", Pregledao profesor, TTC: " + Math.round(s.getDuzinaOdbrane() * 100.0) / 100.0 + ", Score: " + s.getOcena());
                        raspolozivost = raspolozivost + s.getDuzinaOdbrane();


                    }

                }
            }
        }catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();

        }

    }
}
