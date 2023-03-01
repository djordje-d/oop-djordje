package traffic;

public class Driver
{
	private String name;
	private String lastName;
	private String birthDate;
	private String licenseIssueDate;
	private String licenseExpirationDate;
	private int licenseNumber;
	private boolean[] licenseCategories;
	private Vehicle vehicle;
	
	
	public Driver() {}
	public Driver(String name, String lastName, String birthDate, String licenseIssueDate, String licenseExpirationDate, int licenseNumber, boolean[] licenseCategories, Vehicle vehicle)
	{
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.licenseIssueDate = licenseIssueDate;
		this.licenseExpirationDate = licenseExpirationDate;
		this.licenseNumber = licenseNumber;
		this.licenseCategories = licenseCategories;
		this.vehicle = vehicle;
	}
	
	
	String printLicenseCategories(boolean[] licenseCategories)
	{
		String categories = "";
		
		if (licenseCategories[0] == true)
			categories += "AM ";
		if (licenseCategories[1] == true)
			categories += "A1 ";
		if (licenseCategories[2] == true)
			categories += "A2 ";
		if (licenseCategories[3] == true)
			categories += "A ";
		if (licenseCategories[4] == true)
			categories += "B1 ";
		if (licenseCategories[5] == true)
			categories += "B ";
		if (licenseCategories[6] == true)
			categories += "BE ";
		if (licenseCategories[7] == true)
			categories += "C1 ";
		if (licenseCategories[8] == true)
			categories += "C1E ";
		if (licenseCategories[9] == true)
			categories += "C ";
		if (licenseCategories[10] == true)
			categories += "CE ";
		if (licenseCategories[11] == true)
			categories += "D1 ";
		if (licenseCategories[12] == true)
			categories += "D1E ";
		if (licenseCategories[13] == true)
			categories += "D ";
		if (licenseCategories[14] == true)
			categories += "DE ";
		if (licenseCategories[15] == true)
			categories += "F ";
		if (licenseCategories[16] == true)
			categories += "M ";
		
		return categories;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + "\n" +
			   "Last name: " + lastName + "\n" +
			   "Birth date: " + birthDate + "\n" +
			   "License issue date: " + licenseIssueDate + "\n" +
			   "License expiration date: " + licenseExpirationDate + "\n" +
			   "License number: " + licenseNumber + "\n" +
			   "License vehicle categories: " + printLicenseCategories(licenseCategories) + "\n" +
			    vehicle.toString();
	}
	
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	
	public String getBirthDate() {return birthDate;}
	public void setBirthDate(String birthDate) {this.birthDate = birthDate;}
	
	public String getLicenseIssueDate() {return licenseIssueDate;}
	public void setLicenseIssueDate(String licenseIssueDate) {this.licenseIssueDate = licenseIssueDate;}
	
	public String getLicenseExpirationDate() {return licenseExpirationDate;}
	public void setLicenseExpirationDate(String licenseExpirationDate) {this.licenseExpirationDate = licenseExpirationDate;}
	
	public int getLicenseNumber() {return licenseNumber;}
	public void setLicenseNumber(int licenseNumber) {this.licenseNumber = licenseNumber;}
	
	public boolean[] getLicenseCategories() {return licenseCategories;}
	public void setLicenseCategories(boolean[] licenseCategories) {this.licenseCategories = licenseCategories;}
	
	public Vehicle getVehicle() {return vehicle;}
	public void setVehicle(Vehicle vehicle) {this.vehicle = vehicle;}
}
