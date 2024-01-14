package object;

public class Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize finalize = new Finalize();
		System.out.println("Hash code is : "+finalize.hashCode());
		finalize=null;
		
		// garbage collector called.
		System.gc();
		System.out.println("This is end.....");
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalize method called...");
	}

}
