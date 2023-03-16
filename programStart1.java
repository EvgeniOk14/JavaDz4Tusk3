import java.io.IOException;
import java.util.LinkedList;
public class programStart1 
{
  public static LinkedList<Double> startProgram1() throws IOException
  { 
    LinkedList <Double> ll = new LinkedList<>();
    interfaceOperations.operationList1();
    int number = scunnerNumber.operationNumber();

    while(number < 1 || number > 4)
    {
        System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
        interfaceOperations.operationList1();
        number = scunnerNumber.operationNumber();
    }
    
      switch (number)
      {
      case 1:
       
       double sum = actions1.sumData(inputData.inputData1(), inputData.inputData2()); 
       System.out.print("\nРезультат сложения двух чисел равен: " + sum);
       ll.add(sum);
       System.out.println(ll);
       return programStart2.startProgram2(ll, sum);
      
      case 2:
      
        double sub = actions1.subData(inputData.inputData1(), inputData.inputData2());
        System.out.print("\nРезультат вычитания двух чисел равен: " + sub);
        ll.add(sub);
        System.out.println(ll);
        return programStart2.startProgram2(ll,sub);
      
      case 3:
      
        double mult = actions1.multData(inputData.inputData1(), inputData.inputData2());
        System.out.print("\nРезультат умножения двух чисел равен: " + mult);
        ll.add(mult);
        System.out.println(ll);
        return programStart2.startProgram2(ll,mult);
      
      case 4:
        double div = actions1.divData(inputData.inputData1(), inputData.inputData2());
        System.out.print("\nРезультат деления двух чисел равен: " + div); 
        ll.add(div);
        System.out.println(ll);
        return programStart2.startProgram2(ll, div);
      }

      return programStart1.startProgram1();  
  
  }    
}
