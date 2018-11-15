package v1;

public class ChildrenPrice extends Price {
	
	@Override
	public int getPriceCode() {
		return CHILDRENS;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 0;
		result += 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}

}
