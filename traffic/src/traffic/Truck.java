package traffic;

public class Truck extends Vehicle
{
	public Truck() {super();}
	public Truck(String VIN, String model, int productionYear, int power, int maximalAuthorizedMass)
	{
		super(VIN, "Truck", model, productionYear, power, maximalAuthorizedMass);
	}
	
	
	@Override
	public double fuelConsumption(int km)
	{
		return 2*8 * km/100;
	}
}
