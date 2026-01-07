package utilities;
import common.Utility;
import common.InputHelper;
public class StringUtility implements Utility {

@Override
public void execute() {
int choice = -1;
InputHelper.readLine();
do{

System.out.println("\n---- String Utility ----");
System.out.println("1. Reverse String");
System.out.println("2. Count Vowels");
System.out.println("3. Check Palindrome");
System.out.println("4. convert case ");
System.out.println("0. Back to Main Menu");
System.out.println("Enter choice: ");
choice = InputHelper.sc.nextInt();
InputHelper.readLine();
switch(choice) {
case 1:reverseString();break;
case 2:countVowels();break;
case 3:checkPalindrome();break;
case 4:convertCase();break;
case 0:System.out.println("Return to main menu...");
break;
default:
System.out.println("Invalid choice!");
}
}while(choice != 0);

}
private void reverseString(){
System.out.print("Enter number: ");
String str = InputHelper.readLine();
String reversed = new StringBuilder(str).reverse().toString();
System.out.println("Reversed String: " + reversed);
}
private void countVowels() {
System.out.print("Enter String: ");
String str = InputHelper.readLine().toLowerCase();
int count =0;
for (char c : str.toCharArray()) {
if ("aeiou".indexOf(c) != -1) {
count++;
}
}
System.out.println("Number of vowels: " + count);
}
private void checkPalindrome() {
System.out.println("Enter string: ");
String str = InputHelper.readLine();
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(str.equalsIgnoreCase(reversed) ? "palindrome String " : "Not a Palindrome ");
}
private void convertCase() {
System.out.print("Enter String: ");
String str =InputHelper.readLine();
System.out.println("Uppercase: " + str.toUpperCase());
System.out.println("Lowercase: " + str.toLowerCase());
}
}
