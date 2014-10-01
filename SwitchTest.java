import static java.lang.System.out;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchTest {

    private static boolean verbose = false;
    private static boolean help = false;
    private static boolean log = false;

    private final static Logger logger = Logger.getLogger("log.txt");

    public static void main(String ...arg) {
        int n ;

        /*
            for (String val : arg) {
                switch (val) {
                case "-verbose":
                case "-v":
                    verbose = true;
                    break;

                case "-help":
                case "-h" :
                    help = true;
                    break;

                case "-log":
                case "-l":
                    log = true;
                    break;

                default:
                    out.println("Invalid value");
                }
            }
        */

        try

            /*
                (
                  FirstAutoCloseable resource1  = new FirstAutoCloseable();
                  SecondAutoCloseable resource2 = new SecondAutoCloseable();
                )
            */
        {


            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            if (input < 0)
                throw new InvalidParameter();

            out.println("El Nro. es: " + input);
            // resource1.manipulateResource();
            // resource2.manipulateResource();
        } catch (InputMismatchException | InvalidParameter e) {
            logger.log(Level.INFO, e.getMessage());
            // e.printStackTrace();
            // for (Throwable t : e.getSuppressed())
            //     out.println(t);
        }
        // printValues();
    }

    private static void printValues() {
        out.println(
            "Verbose: " + verbose + "\n" +
            "Help: " + help + "\n" +
            "Log: " + log
        );
    }
}

class FirstAutoCloseable implements AutoCloseable {

    @Override
    public void close() {
        out.println("Closing FirstAutoCloseable class");
        throw new UnsupportedOperationException("A problem occurred in FirstAutoCloseable");
    }

    public void manipulateResource() {
        out.println("Manipulating resouce for FirstAutoCloseable");
    }
}

class SecondAutoCloseable implements AutoCloseable {

    @Override
    public void close() {
        out.println("Closing SecondAutoCloseable class");
        throw new UnsupportedOperationException("A problem occurred in SecondAutoCloseable");
    }

    public void manipulateResource() {
        out.println("Manipulating resouce for SecondAutoCloseable");
    }
}

class InvalidParameter extends Exception {
    public InvalidParameter() {
        super("Invalid Parameter");
    }
}