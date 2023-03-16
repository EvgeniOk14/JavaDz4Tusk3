import java.io.IOException;
import java.util.LinkedList;

public class programStart2 
{
    public static LinkedList<Double> startProgram2(LinkedList<Double> ll, double currentResult) throws IOException
     {
    
      double previousResult = currentResult;
      LinkedList<Double> lis = new LinkedList<Double>();
      lis = (LinkedList)ll.clone();
        interfaceOperations.operationList2();


        int number = scunnerNumber.operationNumber();

    
            while(number < 1 || number > 6)
          {
            System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
            interfaceOperations.operationList2();
            number = scunnerNumber.operationNumber();
          }
    
          switch (number)
          {
          case 1:
              
              double sum = actions2.sumData(previousResult, inputData.inputData2());
              System.out.print("Результат сложения двух чисел равен: " + sum);
              lis.add(sum);
              System.out.println("после суммы: " + lis);
              return startProgram2(lis, sum);
            

          case 2:
            
              double sub = actions2.subData(previousResult,inputData.inputData2()); 
              System.out.print("Результат вычитания двух чисел равен: " + sub);
              lis.add(sub);
              System.out.println("после разности: " + lis);
              return startProgram2(lis, sub);
            

          case 3:
            
              double mult = actions2.multData(previousResult, inputData.inputData2());
              System.out.print("Результат умножения двух чисел равен: " + mult);
              lis.add(mult);
              System.out.println("после умножения: " + lis);
              return startProgram2(lis, mult);
            

          case 4:
            
              double div = actions2.divData(previousResult, inputData.inputData2());
              System.out.print("Результат деления двух чисел равен: " + div); 
              lis.add(div);
              System.out.println("после деления: " + lis);
              return startProgram2(lis, div);
                
          case  5:
                
            System.out.println("Вы вышли из программы. ");
            break;
            
            case 6: // данный блок не доработан полностью
              lis.removeLast();
              previousResult = lis.getLast();  
              return startProgram2(lis, previousResult);

           default: break;   
          }   
          
          return null;  
 }
    
}
