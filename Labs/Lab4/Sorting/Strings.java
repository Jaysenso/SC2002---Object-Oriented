import java.util.*;

public class Strings {
    
// --------------------------------------------
// Reads in an array of Strings, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args)
{
	String[] stringList;
	int size;
	Scanner scan = new Scanner(System.in);

	System.out.print ("\nHow many Strings do you want to sort? ");
	size = scan.nextInt();
    scan.nextLine();

	stringList = new String[size];
	System.out.println ("\nEnter Strings...");
    System.out.println(size);

	for (int i = 0; i < size; i++) 
		stringList[i] = scan.nextLine();
		
    //Sorting.selectionSort(stringList);
	Sorting.insertionSort(stringList);


    System.out.println ("\nYour Strings in sorted order...");

	for (int i = 0; i < size; i++){
		System.out.print(stringList[i] + " ");
        if(stringList[i].equals(""))
            System.out.println("empty");
    }
	System.out.println();
	}
}