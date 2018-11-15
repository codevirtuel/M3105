package v1;

public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3.;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		return 1;
	}

}
