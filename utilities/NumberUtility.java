package utilities;
import common.Utility;
import common.InputHelper;
public class NumberUtility implements Utility {
@Override
public void execute() {
int choice = -1;
do{
System.out.println("\n----- Number Utility ----");
System.out.println("1. Check prime");
System.out.println("2. Find Factorial");
System.out.println("3. Check Palindrome");
System.out.println("4. Even or Odd");
System.out.println("0. Back to Main menu");
System.out.println("enter choice:");
choice = InputHelper.readInt();
switch(choice) {
case 1: checkPrime();break;
case 2:findFactorial();break;
case 3:checkPalindrome();break;
case 4:checkEvenOdd();break;
case 0:System.out.println("Returning to main menu...");
break;
default:
System.out.println("Invalid choice");
}


}while(choice!=0);

}
private void checkPrime() {
System.out.println("enter number: ");
int n = InputHelper.readInt();
if (n <= 1) {
System.out.println("Not a prime number");

}
boolean prime=true;
for(int i=2;i<=n/2;i++) {
if(n%i == 0) {
prime = false;
break;
}
}
System.out.println(prime  ? "prime number" : "not a prime number");
}
private void findFactorial() {
System.out.println("enter number: ");
int n = InputHelper.readInt();
long fact = 1;
for ( int i = 1; i<=n;i++) {
fact *=i;

}
System.out.println("Factorial = " + fact);
}
private void checkPalindrome() {
System.out.println("enter number: ");
int n = InputHelper.readInt();
int original = n,reverse =0;
while(n>0) {
reverse = reverse * 10 + n % 10;
n /= 10;
}
System.out.println(original == reverse ? "Palindrome" : "not a palindrome");
}
private void checkEvenOdd() {
System.out.println("enter number : ");
int n =InputHelper.readInt();
System.out.println(n % 2 == 0 ? "Even number" : "Odd number");
}
}
