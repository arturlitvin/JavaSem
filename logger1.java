import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.*;

public class logger1 {
    public static void main(String[] args) throws IOException {
        Logger ll = Logger.getLogger(logger1.class.getName());
        String logsPath = "logger1.txt";
        FileHandler fh = new FileHandler(logsPath, false);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        // XMLFormatter form = new XMLFormatter();
        fh.setFormatter(formatter);

        for (int i = 0; i < 10; i++) {
            ll.log(Level.INFO, "element: " + i);
        }
        ll.log(Level.WARNING, "logger off");

        ll.info("test");
        ll.warning("logsPath");

    }
}
