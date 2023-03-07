import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("Unesite broj studenata ");
        int n = scan.nextInt();
        Thread profesor = new Thread(new Profesor());
        Thread asistent = new Thread(new Asistent());
        ExecutorService executorServiceFixed = Executors.newFixedThreadPool(n);

      //  Future<String> future = executorServiceFixed.submit(new Student());

    }
}
