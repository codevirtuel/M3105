package v1;

public class Movie {
	
	private String title; 
	private Price price;
	
	public Movie(String title, int priceCode) { 
		this.title = title;
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() { 
		return price.getPriceCode();
	}
	
	public void setPriceCode(int priceCode) {
		switch(priceCode) {
			case Price.CHILDRENS: this.price = new ChildrenPrice(); break;
			case Price.NEW_RELEASE: this.price = new NewReleasePrice(); break;
			case Price.REGULAR: this.price = new RegularPrice(); break;
		}
	}

	public String getTitle(){ 
		return title;
	}
	
	double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRented > 2)
				result += (daysRented - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += daysRented * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRented > 3)
				result += (daysRented - 3) * 1.5;
			break;
		}
		return result;
	}
	
	int getFrequentRenterPoints(int daysRented) {
		if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		return 1;
	}
}