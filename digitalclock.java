// Importing necessary classes for date and time formatting
import java.text.SimpleDateFormat;
import java.util.Date;

// The class implements Runnable so that it can run on a separate thread
public class digitalclock implements Runnable {

    // A flag variable to control the clock running state
    // 'volatile' ensures visibility of changes across threads
    private volatile boolean running = true;

    // This method is executed when the thread starts
    public void run() {
        // Create a formatter to format the current time as HH:mm:ss
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        // Loop keeps running until 'running' is set to false
        while (running) {
            // Get the current system time
            Date now = new Date();

            // Format the current time in HH:mm:ss format
            String time = formatter.format(now);

            // Print the formatted time on the same line (overwrite with \r)
            System.out.print("\rCurrent Time: " + time);

            try {
                // Sleep for 1 second before updating the time again
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // If the thread is interrupted, stop the clock
                System.out.println("Clock interrupted");
                running = false;
            }
        }
    }

    // Method to stop the clock externally
    public void stop() {
        running = false;
    }

    // Main method
    public static void main(String[] args) {
        // Create a digital clock object
        digitalclock clock = new digitalclock();

        // Create a thread and pass the clock object (Runnable) to it
        Thread clockThread = new Thread(clock);

        // Start the thread -> this calls the run() method
        clockThread.start();

        // Optional: Stop the clock automatically after 1 minute
        /*
        try {
            Thread.sleep(60000); // Main thread sleeps for 60 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clock.stop(); // Stop the clock after 1 minute
        */
    }
}
