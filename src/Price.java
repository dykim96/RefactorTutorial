public abstract class Price {

	public Price() {
		super();
	}

	protected abstract int getPriceCode();
	
	protected abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}