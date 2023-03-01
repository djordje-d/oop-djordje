package traffic;

public class Test
{
	public static void main(String[] args)
	{
		Vehicle v = new Vehicle("87839UIH2874ZV2", "Car", "Volkswagen Golf 7", 2018, 90, 3500);
		
		boolean[] cat = new boolean[17];
		cat[4] = true;
		cat[5] = true;
		cat[6] = true;
		cat[16] = true;
		
		Driver d = new Driver("Petar", "Petrovic", "04. 02. 1995.", "13. 06. 2017.", "13. 06. 2027.", 1234321, cat, v);
		
		
		System.out.println(v);
		System.out.println(d);
		
		
		Truck t = new Truck("87839UIH2863SGD2", "Nesto", 2010, 120, 7500);
		
		
		System.out.println(t);
		
		
		System.out.println(v.fuelConsumption(1230));
		System.out.println(t.fuelConsumption(1230));
	}
}
