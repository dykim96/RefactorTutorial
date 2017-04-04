class Rental {
    private Movie _movie;
	private int _daysRented;
	
    public Rental(Movie movie, DateRange range) {
        _movie = movie;
        _daysRented = (int)((range.getEnd().getTime() - range.getStart().getTime()) / (1000 * 60 * 60 * 24));
    }
    
	public Movie getMovie() {
		return _movie;
	}
    
    public int getDaysRented() {
        return _daysRented;
    }

	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}
	
	public int getFrequentRenterPoints(){
        return _movie.getFrequentRenterPoints(_daysRented);
	}
}
