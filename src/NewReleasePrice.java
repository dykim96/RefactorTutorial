public class NewReleasePrice extends Price {
	@Override
	protected int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

	@Override
	protected double getCharge(int daysRented) {
	    //determine amounts for each line
	    double result = 0;
        result += daysRented * 3;
	    return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if (daysRented > 1)
        	frequentRenterPoints++;
		return frequentRenterPoints;
	}
}
