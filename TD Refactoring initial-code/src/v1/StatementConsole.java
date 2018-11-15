package v1;

public class StatementConsole extends Statement{

	@Override
	public String rentalRecord(String name) {
		return "Rental Record for " + name + "\n";
	}

	@Override
	public String rentalInfo(Rental each) {
		return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
	}

	@Override
	public String customerInfo(Customer customer) {
		String result = "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

}
