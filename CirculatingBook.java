package lib;

public class CirculatingBook extends LibraryBook {

	private String currentHolder;
	private String dueDate;
	
	public CirculatingBook(String a, String t, String i, String c){
		super(a,  t,  i,  c);
		currentHolder = null;
		dueDate = null;
	}
	
	public void checkout(String name, String date) {
		currentHolder = name;
		dueDate = date;
	}

	public void returned() {
		if (currentHolder != null) {
			currentHolder = null;
			dueDate = null;
		} else {
			System.out.println("Already returned");
		}
	}
	
	
	public String circulationStatus() {
		if(currentHolder == null) {
			return "book available on shelves";
		}else {
			return "Current Holder's Name " +currentHolder + 
					"Due: " + dueDate;  
		}
	}
	
	@Override
	public String toString() {
		if(currentHolder == null) {
			return super.toString();
		} else {
			return super.toString() + "\nCirculatingBook currentHolder=" + currentHolder + "\ndueDate=" + dueDate;
		}
	}


}
