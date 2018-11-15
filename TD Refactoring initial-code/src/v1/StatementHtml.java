package v1;

public class StatementHtml extends Statement{

	@Override
	public String rentalRecord(String name) {
		return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
	}

	@Override
	public String rentalInfo(Rental each) {
		return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
	}

	@Override
	public String customerInfo(Customer customer) {
		String result = "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
		return result;
	}

}
