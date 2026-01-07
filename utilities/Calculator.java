package utilities;
import common.Utility;
import common.InputHelper;
public class Calculator implements Utility {
@Override
public void execute() {
int choice =-1;
do{

System.out.println("\n---- Calculator ----");
System.out.println("1.Add   2.Sub   3.Mul   4.Div");
System.out.println("enter choice: ");
choice=InputHelper.readInt();

if (choice == 0) {
                    return;
                }
System.out.println("enter two numbers: ");
int a = InputHelper.readInt();
int b = InputHelper.readInt();

switch(choice) {
case 1:System.out.println("result = " +(a + b));break;
case 2:System.out.println("result = " + (a - b));break;
case 3:System.out.println("result = " + (a * b));break;
case 4:System.out.println(b!=0 ? "result= " +(a/b) :"Error:Division by zero");
break;

default:System.out.println("Invalid choice");
}

}while(choice!=0);
}
}