package singleton.secondSingletonExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
    public static final Logger INSTANCE = new Logger();

    private Logger() {
    }

    public void log(Object object) {
        try( FileWriter fileWriter = new FileWriter("messages.log",true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
            printWriter.println(LocalDateTime.now() + ": " + object);
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
