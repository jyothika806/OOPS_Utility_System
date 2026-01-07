package menu;
import java.util.Scanner;
import common.InputHelper;
import common.Utility;
import java.util.InputMismatchException;

import utilities.Calculator;
import utilities.NumberUtility;
import utilities.StringUtility;
import utilities.ArrayUtility;

public class Menu {
public void display() {
Scanner sc = new Scanner(System.in);
int choice = -1;
do{

System.out.println("\n==== Utility System =====");
System.out.println("1.Calculator");
System.out.println("2. Number Utility");
System.out.println("3. String utility ");
System.out.println("4. Array Utility");

System.out.println("0. Exit");
System.out.println("Enter your choice: ");
choice = InputHelper.readInt();
Utility u =null;
switch(choice) {
case 1:u=new Calculator();break;
case 2:u=new NumberUtility();break;
case 3:u=new StringUtility();break;
case 4:u = new ArrayUtility();break;

case 0:System.out.println("thank You !");break;
default:System.out.println("Invalid option");
}
if (u != null) {
u.execute();
}
}while(choice !=0);
}
}

