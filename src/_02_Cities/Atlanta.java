package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double grow = growthRate * 2;
		double taxes = growthRate * population * grow;
		return taxes;
	}

}
