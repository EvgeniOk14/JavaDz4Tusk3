import java.util.Scanner;

public class inputData 
{
    public static double inputData1()
    {
        Scanner sc = new Scanner(System. in, "Cp866");
        System.out.println("Введите первое число: ");
        String s = sc.nextLine();
        double number = Integer.parseInt(s);
        return number;
    }

    public static double inputData2()
    {
        Scanner sc = new Scanner(System. in, "Cp866");
        System.out.println("Введите второе число: ");
        String s = sc.nextLine();
        double number = Integer.parseInt(s);
        return number;

    }

    
}
