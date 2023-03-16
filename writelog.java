
import java.io.IOException;
import java.util.logging.*;

public class writelog {
    
    public static void records1(String S) throws IOException
    {
        Logger logger = Logger.getLogger(actions1.class.getName());
        /*ConsoleHandler ch = new ConsoleHandler();*/
        FileHandler fh = new FileHandler("logger.txt", true);
        /*logger.addHandler(ch);*/
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        /*ch.setFormatter(sFormat);*/
        fh.setFormatter(sFormat);

        logger.info(S);
    }

    public static void records2(String S) throws IOException
    {
        Logger logger = Logger.getLogger(actions2.class.getName());
        /*ConsoleHandler ch = new ConsoleHandler();*/
        FileHandler fh = new FileHandler("logger.txt", true);
        /*logger.addHandler(ch);*/
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        /*ch.setFormatter(sFormat);*/
        fh.setFormatter(sFormat);

        logger.info(S);
    }

}
