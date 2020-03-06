package epam.Collections;

import java.util.Arrays;
import java.lang.Exception;



public class MyCustomList{
	private Object mylist[];
	private static int size=0;
	private static final int INITIAL_CAPACITY=10;
	
	
	MyCustomList() {
        
		mylist = new Object[INITIAL_CAPACITY];
    }
	public void add(Object e) {
		if(size ==  mylist.length) {
		ensureCapacity();
		}
		mylist[size++]=e;
		System.out.println("Element "+e+" is added to the list");
		
	}
	public Object remove(int index) {
		
		if(index>size-1 || index < 0){
			throw new ArrayIndexOutOfBoundsException("Invalid index");
		}
		
	
		System.out.println("Element "+this.mylist[index]+" is removed from the list");
		Object removedElement=mylist[index];
		for(int x=index; x<this.mylist.length-1;x++){
			mylist[x]=mylist[x+1];
		}
		size--;
		
		return removedElement;
		}
	
	public void printList() {
		for(Object object:mylist) {
			System.out.print(object +" ");
		}
		System.out.println();
	}

    public Object get(int index)  {
    	
    	try {
    		if(index >=size) {
    			throw new Exception("size limit");
    		}
    		
    	}catch(Exception e) {
    		System.out.println("Arraylist size exceeded");
    	}
    	
        return mylist[index];
    }

  
    public int size() {
        return mylist.length;
    }
    
    
    private void ensureCapacity() {
        int newSize = mylist.length + 1;
        mylist = Arrays.copyOf(mylist, newSize);
    }
    
}
