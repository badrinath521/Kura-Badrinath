
	import java.util.AbstractList;
	import java.util.Arrays;

	public class Arraylist<T> extends AbstractList<T>{
		
	    private int size = 0;
	     
	    private static final int DEFAULT_CAPACITY = 10;
	     
	    //This array will store all elements added to list
	    private Object elements[];
	 
	    public Arraylist(T initElements[]) {
	    	elements = new Object[DEFAULT_CAPACITY];
	    	int initElementsSize = initElements.length;
	    	if( initElementsSize<10) {
	    		throw new RuntimeException("Minimum Initial Size:  10 \n\t\t\t\t\t\t       Given size:  "+initElementsSize);
	    	}
	    	int iter=0;
	    	while( iter < initElementsSize) {
	    		add(initElements[iter]);
	    		iter++;
	    	}
	    }
	 
	    //this is add method 
	    public boolean add(T element) {
	        if (size == elements.length) {
	            ensureCapacity();
	        }
	        elements[size++] = element;
			return true;
	    }
	     
	    //this is get method
	    @SuppressWarnings("unchecked")
	    public T get(int index) {
	        if (index >= size || index < 0) {
	            throw new IndexOutOfBoundsException("Index:" +index+ ", Size :" + size);
	        }
	        return (T) elements[index];
	      }
	     
	    //this is remove method
	    @SuppressWarnings("unchecked")
	    public T remove(int index) {
	        if (index >= size || index < 0) {
	            throw new IndexOutOfBoundsException("Index : " + index + ", Size :" + size);
	        }
	        Object item = elements[index];
	        int numElts = elements.length - ( index+ 1 ) ;
	        System.arraycopy( elements, index + 1, elements, index, numElts );
	        size--;
	        return (T) item;
	    }
	    
	    public int size() {
	        return size;
	    }
	    //To increase the size of the elements
	    private void ensureCapacity() {
	        int newSize = elements.length * 2;
	        elements = Arrays.copyOf(elements, newSize);
	    }
}
