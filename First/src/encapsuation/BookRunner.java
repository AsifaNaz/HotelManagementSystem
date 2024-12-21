package encapsuation;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputer=new Book(1000);
		Book effectiveJava=new Book(1234);
		Book cleanCode=new Book(5678);
		//artOfComputer.setNoOfCopies(20);
		System.out.println("original :"+artOfComputer.getNoOfCopies());
		artOfComputer.increaseCopies(25);
		System.out.println("increase :"+artOfComputer.getNoOfCopies());
		//effectiveJava.setNoOfCopies(70);
		System.out.println("original: "+effectiveJava.getNoOfCopies());
		effectiveJava.increaseCopies(80);
		System.out.println("increase :"+effectiveJava.getNoOfCopies());
		//cleanCode.setNoOfCopies(48);
		System.out.println("original: "+cleanCode.getNoOfCopies());
		cleanCode.increaseCopies(60);
		System.out.println("increase: "+cleanCode.getNoOfCopies());
		
		
		
	}

}
