import java.util.*;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static int studentiProf = 0;
    //public static ArrayList<Student> studentiKodProf = new ArrayList<>();
    public static ArrayList<Student> studenti = new ArrayList<>();
    //public static ArrayList<Student> studentiKodAsist = new ArrayList<>();
    public static String lockProf = "LOCK";
  //  public static String lockAsist = "LOCK";


    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("Dva studenta ulaze na uvid kod profesora...");
            }
        });
        Random rnd = new Random();
        Scanner scan = new Scanner( System.in );
        System.out.println("Unesite broj studenata ");
        int n = scan.nextInt();
      //  Thread profesor = new Thread(new Profesor());
      //  Thread asistent = new Thread(new Asistent());

      //  Future<String> future = executorServiceFixed.submit(new Student());



        for(int i = 0; i<n; i++){

            int sansa = rnd.nextInt(10)+1;
            if(sansa<6){

                studenti.add(new Student(true,i));
                studentiProf++;
            }

            else
                studenti.add(new Student(false,i));
        }
        int size = studentiProf;


        Thread asistent = new Thread(new Asistent());
        asistent.start();

        //ExecutorService executorServiceFixed = Executors.newFixedThreadPool(size);
        //executorServiceFixed.submit(new Profesor(cyclicBarrier));

       for(int j = 0; j < size; j++){
           new Thread(new Profesor(cyclicBarrier)).start();
       }


    }
}
