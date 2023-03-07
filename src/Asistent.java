import java.util.Random;

public class Asistent  implements Runnable{
    private double raspolozivost = 0.00;

    @Override
    public void run() {
        Random ocena = new Random();
        System.out.println("Asistent je spreman");
        for(Student s : Main.studenti){

            if(s.isProfesor() == false) {
                synchronized(Main.lockProf){
                // raspolozivost = raspolozivost - s.getDuzinaOdbrane();
                s.setOcena(ocena.nextInt(6) + 5);
                System.out.println("Student" + s.getId() + ", Arrival: " + Math.round(raspolozivost * 100.0) / 100.0 + ", Pregledao asistent, TTC: " + Math.round(s.getDuzinaOdbrane() * 100.0) / 100.0 + ", Score: " + s.getOcena());
                raspolozivost = raspolozivost + s.getDuzinaOdbrane();
            }
            }
        }

    }
}
