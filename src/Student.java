import java.util.Random;
import java.util.concurrent.Callable;

public class Student {

    Random rnd = new Random();
    private double duzinaOdbrane;
    private int ocena;
    private boolean isProfesor;
    private int id;
    // Random rnd = new Random();
    public Student(boolean isProfesor, int id){
        this.duzinaOdbrane = Math.random() * 0.5 + 0.5;
      //  int sansa = rnd.nextInt(10) + 1;
       // if(sansa < 6)
       //     pregledac = (Profesor)pregledac;
      //  else
        //    pregledac = (Asistent)pregledac;

        this.isProfesor = isProfesor;
        this.id = id;

    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean isProfesor() {
        return isProfesor;
    }

    public double getDuzinaOdbrane() {
        return duzinaOdbrane;
    }

    public int getId() {
        return id;
    }
}
