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
	
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
}