package utilities;
import common.Utility;
import common.InputHelper;
import java.util.InputMismatchException;
import java.util.Arrays;
public class ArrayUtility implements Utility {
@Override
public void execute() {
int choice = -1;
do {
try{
System.out.println("\n---- Array Utility ----");
System.out.println("1. Find Max & Min");
System.out.println("2. Calculate Average");
System.out.println("3. Sort Array");
System.out.println("4. Search Element");
System.out.println("0. Back to Main Menu");
System.out.print("Enter choice: ");
choice =InputHelper.sc.nextInt();
switch (choice) {
case 1:
findMaxMin();
break;
case 2:calculateAverage();break;
case 3:sortArray();break;
case 4:searchElement();break;
case 0:return;
default:
System.out.println("Invalid choice!");
}
} catch (InputMismatchException e) {
System.out.println("error: please enter numbers only!");
InputHelper.sc.nextLine();
}
}while(choice != 0);
}
private int[] readArray() {
System.out.println("Enter number of elements: ");
int n =InputHelper.sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements: ");
for(int i = 0; i< n;i++) {
arr[i] = InputHelper.sc.nextInt();
}
return arr;
}
private void findMaxMin() {
int[] arr = readArray();
int max = arr[0],min = arr[0];
for (int x: arr) {
if (x > max) max =x;
if(x < min ) min = x;
}
System.out.println("Maximum = " + max);
System.out.println("Minimum = " + min);
}
private void calculateAverage() {
int[] arr = readArray();
int sum =0;
for(int x : arr) sum += x;
double avg = (double) sum/arr.length;
System.out.println("Average = " + avg);
}
private void sortArray() {
int[] arr = readArray();
Arrays.sort(arr);
System.out.println("Sorted Array: " + Arrays.toString(arr));
}
private void searchElement() {
int[] arr = readArray();
System.out.print("Enter element to search: ");
int key = InputHelper.sc.nextInt();
boolean found = false;
for (int  x: arr ) {
if (x == key) {
found = true;
break;
}
}
System.out.println(found ? "Element found" : "Element not found");
}
}
