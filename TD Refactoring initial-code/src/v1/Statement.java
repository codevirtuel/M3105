package v1;

import java.util.Iterator;

public abstract class Statement {
	
	public String value(Customer aCustomer) {
		Iterator<Rental> theRentals = aCustomer.getRentals().iterator();

		String result = rentalRecord(aCustomer.getName());

		while (theRentals.hasNext()) {
			Rental each = theRentals.next();
			// show figures for this rental
			result += rentalInfo(each);
		}
		// add footer lines
		result += customerInfo(aCustomer);

		return result;
	}
	
	abstract String rentalRecord(String name);
	abstract String rentalInfo(Rental rental);
	abstract String customerInfo(Customer customer);

}
