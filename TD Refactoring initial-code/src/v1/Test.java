package v1;

public class Test {

	public static void main(String[] args) {
		
		Customer paul = new Customer("Paul");
		
		paul.addRental(new Rental(new Movie("Monty Python et le sacre graal",Price.REGULAR),3));
		paul.addRental(new Rental(new Movie("La cite de la peur",Price.REGULAR),2));
		paul.addRental(new Rental(new Movie("Han Solo ",Price.NEW_RELEASE),2));
		paul.addRental(new Rental(new Movie("Moi, moche et mechant",Price.CHILDRENS),4));
		paul.addRental(new Rental(new Movie("Wallace and Gromit",Price.CHILDRENS),6));
		
		System.out.println(paul.statement());
		
		System.out.println(paul.htmlStatement());
		
	}

}
