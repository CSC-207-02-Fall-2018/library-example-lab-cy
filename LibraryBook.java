package lib;

public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {

	private String callNumber;
	

	public LibraryBook(String au, String ti, String num, String callNum) {
		super(au,ti,num);
		callNumber = callNum;
	}

	
	public String getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	
	abstract void checkout(String name, String date);
	
	abstract void returned();
	
	abstract String circulationStatus();
	
	/** 
	 * implementation of Comparable's compareTo method
	 * @param lib:  Library object being compared
	 * @return 0 if call numbers of this and lib match
	 *         < 0 if call number of this comes before call number of lib
	 *         > 0 otherwise
	 */
	public int compareTo ( LibraryBook b) {
		return callNumber.compareTo(b.getCallNumber());
	}
	
	/**
	 * @return title, author, ISBN, call number as a String for printing
	 */
	public String toString() {
		return super.toString()+ "\nCall Number: " + callNumber + 
				"\nCirculation Status: " + circulationStatus();
	}
}
