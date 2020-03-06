package epam.Collections;


import java.util.Scanner;
public class MyArrayList 
{
    public static void main( String[] args ) 
    {
    	String input;
    	int index;
    	int choice;
       MyCustomList customList= new MyCustomList();
       Scanner scanner = new Scanner(System.in);
       System.out.println("List is initially empty!");
       do {
       System.out.println("1.ADD ElEMENTS TO THE LIST");
       System.out.println("2.REMOVE ElEMENT(S) FROM THE LIST");
       System.out.println("3.PRINT THE LIST");
       System.out.println("4.FETCH ELEMENT FROM THE LIST");
       System.out.println("5.EXIT");
       
       choice=scanner.nextInt();
      switch(choice) {
      case 1: System.out.println("Enter element to the list:");
      			
      			input=scanner.next();
      			customList.add(input);
      			break;
      case 2 : System.out.println("Enter index to remove element from the list:");			
    	  		index=scanner.nextInt();
    	  		
    	  			customList.remove(index);
    	  			
    	  		break;
      case 3: System.out.println("List elements are :");
      			customList.printList();
      			break;
      case 4 :System.out.println("Enter index to retrieve element from the list:");			
    	  		index=scanner.nextInt();
    	  		System.out.println("Element at index "+index+" is "+ customList.get(index));
    	  		break;
      case 5: System.exit(choice);
    	default :System.out.println("Enter a valid choice!");  		
    	  		
      		}
       }while(choice!=5);
       scanner.close();
    }
    
}

