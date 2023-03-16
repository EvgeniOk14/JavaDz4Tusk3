import java.io.IOException;
public class programStart1 
{
  public static Double startProgram1() throws IOException
  { 
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
       System.out.print("Результат сложения двух чисел равен: " + sum);
       return programStart2.startProgram2(sum);
      
      case 2:
      
        double sub = actions1.subData(inputData.inputData1(), inputData.inputData2());
        System.out.print("Результат вычитания двух чисел равен: " + sub);
        return programStart2.startProgram2(sub);
      
      case 3:
      
        double mult = actions1.multData(inputData.inputData1(), inputData.inputData2());
        System.out.print("Результат умножения двух чисел равен: " + mult);
        return programStart2.startProgram2(mult);
      
      case 4:
      
        double div = actions1.divData(inputData.inputData1(), inputData.inputData2());
        System.out.print("Результат деления двух чисел равен: " + div); 
        return programStart2.startProgram2(div);
      }

      return programStart1.startProgram1();  
  
  }    
}
