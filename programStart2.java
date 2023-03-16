import java.io.IOException;

public class programStart2 
{
    public static Double startProgram2(double currentResult) throws IOException
  {  
     
    
      double previousResult = currentResult;
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
              return startProgram2(sum);
            

          case 2:
            
              double sub = actions2.subData(previousResult,inputData.inputData2()); 
              System.out.print("Результат вычитания двух чисел равен: " + sub);
              return startProgram2(sub);
            

          case 3:
            
              double mult = actions2.multData(previousResult, inputData.inputData2());
              System.out.print("Результат умножения двух чисел равен: " + mult);
              return startProgram2(mult);
            

          case 4:
            
              double div = actions2.divData(previousResult, inputData.inputData2());
              System.out.print("Результат деления двух чисел равен: " + div); 
              return startProgram2(div);
                
          case  5:
                
            System.out.println("Вы вышли из программы. ");
            break;
            
            /*case 6: // данный блок не доработан полностью
              //ll.removeLast();
              //double riviousResult = ll.getLast();  
              return startProgram2(previousResult);*/

           default: break;   
          }   
          
          return null;  
 }
    
}
