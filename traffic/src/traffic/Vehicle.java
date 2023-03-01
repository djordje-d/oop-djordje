package traffic;

public class Vehicle
{
	protected String VIN; // Vehicle identification number
	protected String type;
	protected String model;
	protected int productionYear;
	protected int power; // [kW]
	protected int maximumAuthorizedMass; // [kg]
	
	
	public Vehicle() {}
	public Vehicle(String VIN, String type, String model, int productionYear, int power, int maximalAuthorizedMass)
	{
		this.VIN = VIN;
		this.type = type;
		this.model = model;
		this.productionYear = productionYear;
		this.power = power;
		this.maximumAuthorizedMass = maximalAuthorizedMass;
	}
	
	
	public double fuelConsumption(int km)
	{
		return 8 * km/100;
	}
	
	@Override
	public String toString()
	{
		return "VIN: " + VIN + "\n" +
			   "Type: " + type + "\n" +
			   "Model: " + model + "\n" +
			   "Production year: " + productionYear + "\n" +
			   "Power: " + power + "kg\n" +
			   "Maximum authorized mass: " + maximumAuthorizedMass + "kg\n";
	}
	
	
	public String getVIN() {return VIN;}
	public void setVIN(String VIN) {this.VIN = VIN;}
	
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	
	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}
	
	public int getProductionYear() {return productionYear;}
	public void setProductionYear(int productionYear) {this.productionYear = productionYear;}
	
	public int getPower() {return power;}
	public void setPower(int power) {this.power = power;}
	
	public int getMaximumAuthorizedMass() {return maximumAuthorizedMass;}
	public void setMaximumAuthorizedMass(int maximumAuthorizedMass) {this.maximumAuthorizedMass = maximumAuthorizedMass;}
}
