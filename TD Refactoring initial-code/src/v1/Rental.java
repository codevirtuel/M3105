package v1;

public class Rental {

	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}
	
	public double getCharge() {
		return getMovie().getCharge(getDaysRented());
	}

	int getFrequentRenterPoints() {
		return getMovie().getFrequentRenterPoints(getDaysRented());
	}
}
