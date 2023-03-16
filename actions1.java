
import java.io.IOException;

public class actions1 
{

    static double sumData(double previousResult, double b) throws IOException
    {
        double sum = previousResult + b;
        String S = String.format("%s + %s = %s", previousResult,b,sum);
        writelog.records1(S);
        double currentResult = sum;
        return currentResult;
    }

    static double subData(double previousResult, double b) throws IOException
    {
        double div = previousResult - b;
        String S = String.format("%s - %s = %s", previousResult,b,div);
        writelog.records1(S);
        double currentResult = div;
        return currentResult;
    }

    static double multData(double previousResult, double b) throws IOException
    {
        double mult = previousResult * b;
        String S = String.format("%s * %s = %s", previousResult,b,mult);
        writelog.records1(S);
        double currentResult = mult;
        return currentResult;
    }

    static double divData(double previousResult, double b) throws IOException
    {
        double div = previousResult / b;
        String S = String.format("%s + %s = %s", previousResult,b,div);
        writelog.records1(S);
        double currentResult = div;
        return currentResult;
    }
    
}
