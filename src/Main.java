import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Classname: Main
 *
 * @version     21 June 2020
 * @author      Klymenko Sergij, ONPU
 *
 *  Module 4, task 2. Multi-threading.
 *
 * 1. Use the file from the previous task - logs.txt.
 * 2. Create a class that manages logs in this file.
 * 3. Create a method that finds all the ERROR logs for a specific date
 *    and write them into a specific file (name = ERROR  + Date  + .log)
 * 4. In your main class develop a functionality to create 5 such a files for 5 different days.
 *    Launch them in consistent way (one after another).
 * 5. Repeat the above task in parallel way. Multi-threading.
 * 6. Compare two results.
 *
 * */

public class Main {

    /**
     * A static class extending default class Thread
     */
    static class MyThread extends Thread {

        private String date;    // the needed date

        /**
         * Class constructor with the date as a parameter
         */
        MyThread(String date){
            this.date = date;
        }

        /**
         * A Thread's method to run the LogsService class initialization
         *  with its getLogsByDate() method with the needed date as a parameter
         */
        @Override
        public void run() {
            LogsService service = new LogsService();
            try {
                service.getLogsByDate(date);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        /**
         * Initializing the LogsService class
         */
        LogsService service = new LogsService();

        System.out.println("-------Consequently writing ERROR-log files-------");

        LocalDateTime start1 = LocalDateTime.now();

        /**
         * The getLogsByDate() method of LogsService class is being run
         * with 5 different dates as parameters consequently
         */
        service.getLogsByDate("2019-10-14");
        service.getLogsByDate("2019-10-16");
        service.getLogsByDate("2019-10-17");
        service.getLogsByDate("2019-10-18");
        service.getLogsByDate("2019-10-19");

        LocalDateTime fin1 = LocalDateTime.now();
        long dif1 = ChronoUnit.MILLIS.between(start1, fin1);
        System.out.println("TOTAL DURATION of the consequent procedure: " + dif1 + " ms\n");

        System.out.println("-------Writing ERROR-log files using Multi-Threading-------");

        LocalDateTime start2 = LocalDateTime.now();

        /**
         * The initialization of MyThread class with 5 different dates as parameters
         */
        MyThread mt1 = new MyThread("2019-10-14");
        mt1.start();
        MyThread mt2 = new MyThread("2019-10-16");
        mt2.start();
        MyThread mt3 = new MyThread("2019-10-17");
        mt3.start();
        MyThread mt4 = new MyThread("2019-10-18");
        mt4.start();
        MyThread mt5 = new MyThread("2019-10-19");
        mt5.start();

        /**
         * Making the Main Thread waiting until mt1-mt5 Treads are over doing their functions
         */
        try {
            mt1.join();
            mt2.join();
            mt3.join();
            mt4.join();
            mt5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime fin2 = LocalDateTime.now();
        long dif2 = ChronoUnit.MILLIS.between(start2, fin2);
        System.out.println("TOTAL DURATION of threads procedure: " + dif2 + " ms\n");

        /**
         * Comparing the duration results of both methods
         */
        if (dif2 < dif1) {
            System.out.println("Writing ERROR-log files is quicker using Multi-Threading.");
        }
        else {
            System.out.println("Writing ERROR-log files consequently is quicker.");
        }
    }
}
