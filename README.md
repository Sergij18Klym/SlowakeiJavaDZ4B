# SlowakeiJavaDZ4B

Module 4, task 2. Multi-threading.
 
 * 1. Use the file from the previous task - logs.txt.
 * 2. Create a class that manages logs in this file.
 * 3. Create a method that finds all the ERROR logs for a specific date
 *    and write them into a specific file (name = ERROR  + Date  + .log)
 * 4. In your main class develop a functionality to create 5 such a files for 5 different days.
 *    Launch them in consistent way (one after another).
 * 5. Repeat the above task in parallel way. Multi-threading.
 * 6. Compare two results.
 
 RESULTS:
 
 -------Consequently writing ERROR-log files-------
 
2019-10-14 search is started at - 2020-06-21T19:01:41.649863200

2019-10-14 search is OVER at - 2020-06-21T19:01:44.595186700

Duration - 2945 ms

ERROR lines amount - 6396

File 'ERROR-2019-10-14.log' has been written.

''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

2019-10-16 search is started at - 2020-06-21T19:01:47.900918700

2019-10-16 search is OVER at - 2020-06-21T19:01:49.866000800

Duration - 1965 ms

ERROR lines amount - 8217

File 'ERROR-2019-10-16.log' has been written.

''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

2019-10-17 search is started at - 2020-06-21T19:01:53.390366100

2019-10-17 search is OVER at - 2020-06-21T19:01:55.358651

Duration - 1968 ms

ERROR lines amount - 6473

File 'ERROR-2019-10-17.log' has been written.

''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

2019-10-18 search is started at - 2020-06-21T19:01:58.231371200

2019-10-18 search is OVER at - 2020-06-21T19:02:00.178659200

Duration - 1947 ms

ERROR lines amount - 6669

File 'ERROR-2019-10-18.log' has been written.

''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

2019-10-19 search is started at - 2020-06-21T19:02:03.108602600

2019-10-19 search is OVER at - 2020-06-21T19:02:05.053300

Duration - 1944 ms

ERROR lines amount - 4097

File 'ERROR-2019-10-19.log' has been written.

''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

TOTAL DURATION of the consequent procedure: 25694 ms

''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

-------Writing ERROR-log files using Multi-Threading-------

2019-10-14 search is started at - 2020-06-21T19:02:07.350008800

2019-10-16 search is started at - 2020-06-21T19:02:07.350008800

2019-10-17 search is started at - 2020-06-21T19:02:07.351008900

2019-10-18 search is started at - 2020-06-21T19:02:07.351008900

2019-10-19 search is started at - 2020-06-21T19:02:07.351008900


2019-10-17 search is OVER at - 2020-06-21T19:02:11.981821

Duration - 4630 ms

ERROR lines amount - 6473

2019-10-18 search is OVER at - 2020-06-21T19:02:12.008822500

Duration - 4657 ms

ERROR lines amount - 6669

2019-10-16 search is OVER at - 2020-06-21T19:02:12.189832900

Duration - 4839 ms

ERROR lines amount - 8217

2019-10-19 search is OVER at - 2020-06-21T19:02:13.321492400

Duration - 5970 ms

ERROR lines amount - 4097

2019-10-14 search is OVER at - 2020-06-21T19:02:13.322492500

Duration - 5972 ms

ERROR lines amount - 6396


File 'ERROR-2019-10-17.log' has been written.

File 'ERROR-2019-10-18.log' has been written.

File 'ERROR-2019-10-19.log' has been written.

File 'ERROR-2019-10-16.log' has been written.

File 'ERROR-2019-10-14.log' has been written.

''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

TOTAL DURATION of threads procedure: 12903 ms

''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

Writing ERROR-log files is quicker using Multi-Threading.

----------------------------------------------------------------

Process finished with exit code 0
