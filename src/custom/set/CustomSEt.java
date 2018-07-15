package custom.set;

public class CustomSEt {

	
	
	public static   void main(String[] args){
		
		HashMapCustom<Integer, Object> hashMapCustom = new HashMapCustom();
		hashMapCustom.put(21, null);
		hashMapCustom.put(25, null);
		hashMapCustom.put(30, null);
		hashMapCustom.put(33, null);
		System.out.println(hashMapCustom);
		hashMapCustom.display();
	}
	
	
	
	
}
