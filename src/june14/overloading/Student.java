package june14.overloading;

public class Student {
	
	public int adt(int a , int b ) {
		
		return a+b ;
		
	}
	
	public int adt(int a , int b, int c) {
		
		return a+b+c ;
	}
	
	public int adt(int a , int b, int c , int d) {
		
		return (a+b*c)+d ;
	}
	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println("First Variable- "+s.adt(12, 10));
		System.out.println();
		System.out.println("Second Variable- "+s.adt(12, 10, 45));
		System.out.println();
		System.out.println("Third Variable- "+s.adt(23, 43, 12, 3));
	}

}
