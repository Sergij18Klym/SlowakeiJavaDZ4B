import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classname: LogsService
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

public class LogsService {

   // private String dateTime;

    /**
     * Default constructor
     */
    public LogsService() { }
/*
    public LogsService(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
*/


    /**
     * A method to get all the lines containing specific date from the logs document using the stream filter,
     *  count them all assigning to variable int 'count',
     *  collect them all into String List 'logsList'
     *  assign all the lines separated with lineSeparator to String 'stringToFile'
     *  and write them all into the file with the provided path
     * @param str String - a date of searching in a format of 'yyyy-mm-dd'
     * */

    public void getLogsByDate(String str) throws IOException {

        LocalDateTime start = LocalDateTime.now();
        System.out.println(str + " search is started at - " + start);

        int count = (int) Files.lines(Paths.get("E:\\logs.txt"))
                .filter(line -> line.contains(str))
                .count();

        LocalDateTime finish = LocalDateTime.now();
        long duration = ChronoUnit.MILLIS.between(start, finish);
        System.out.println(str + " search is OVER at - " + finish
                + "\nDuration - " + duration + " ms"
                + "\nERROR lines amount - " + count);


        List<String> logsList = Files.lines(Paths.get("E:\\logs.txt"))
                .filter(line -> line.contains(str))
                .collect(Collectors.toList());

        String stringToFile = "";

        for (String line:logsList) {
            stringToFile += line + System.lineSeparator();
        }

        Path path = Paths.get("E:\\ERROR-" + str + ".log");
        Files.write(path, stringToFile.getBytes());

        System.out.println("File 'ERROR-" + str + ".log' has been written.\n");
    }

}
