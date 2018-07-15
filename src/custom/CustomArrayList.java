package custom;

import java.util.Arrays;

public class CustomArrayList {

	
	public static void main(String[] args){
		
		CustomArrayList customArrayList = new  CustomArrayList();
		
		customArrayList.add(new Integer(1));
		customArrayList.add(new Integer(2));
		customArrayList.add(new Integer(3));
		customArrayList.add(new Integer(4));
		customArrayList.add(new Integer(5));
		customArrayList.add(new Integer(6));
		customArrayList.add(new Integer(7));
		customArrayList.add(new Integer(8));
		customArrayList.add(new Integer(9));
		customArrayList.add(new Integer(10));
		
		customArrayList.print();
		
		System.out.println(customArrayList.get(9));
	}

	
	private Object get(int i) {
		// TODO Auto-generated method stub
		if (i<size) {
			return objects[i];
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}


	private void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]+", ");
		}
	}


	int actualSize = 5;
	Object[] objects = new Object[actualSize];
	
	int size = 0;
	
	private void add(Object object) {
		
		if (objects.length-actualSize<=5) {
			increaseListSize();
		}
		objects[size++] = object;
		
	}

	
	
	
	
	private void increaseListSize() {
		// TODO Auto-generated method stub
		objects = Arrays.copyOf(objects, objects.length*2);
		System.out.println("list size: "+objects.length);
		
	}
	
	
	
	
	
}
