package custom.set;

public class HashMapCustom<K, V> {

	static class Entry<K, V> {
		K key;
		V value;
		Entry next;

		public Entry(K key, V value, Entry next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	private Entry<K, V>[] table;
	private int capacity = 4;

	public HashMapCustom() {
		// TODO Auto-generated constructor stub
		table = new Entry[capacity];
	}
	
	 public void display(){
	       
	       for(int i=0;i<capacity;i++){
	           if(table[i]!=null){
	                  Entry<K, V> entry=table[i];
	                  while(entry!=null){
	                        System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
	                        entry=entry.next;
	                  }
	           }
	       }             
	    
	    }

	public void put(K key, V value) {

		if (key==null) {
			return;
		}

		int hash = hash(key);
		
		Entry<K, V> newEntry = new Entry<K, V>(key, value, null);
		
		Entry<K, V> previouse = null;
		Entry<K, V> current = table[hash];
		
		if (table[hash]==null) {
			table[hash] = newEntry;
		}else{
			
			while (current!= null) {
			
				if (current.key.equals(key)) {
					if (previouse== null) {
						newEntry.next = current.next;
						table[hash] =  newEntry;
					}else{
						newEntry.next = current.next;
						previouse.next = newEntry;
						
					}
				}
				
				previouse = current;
				current = current.next;
			}
			
			
			previouse.next = newEntry;
		}
		
		

	}

	private int hash(K key) {
		// TODO Auto-generated method stub
		return Math.abs(key.hashCode()) % capacity;
	}

}
