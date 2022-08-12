package week06;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
	
	public SalariedEmployee(String firstName, String lastName, String sSN, double weeklySalary) {
		super(firstName, lastName, sSN);
		this.weeklySalary = weeklySalary;
	}


	/*
	 * SalariedEmployee class'� da e�er abstract olursa,
	 * employee s�n�f�n�n abstract motodlar�n� override etme
	 * zorunlulu�umuz kalmaz.
	 */
	
	@Override
	public double earning() {
		return getWeeklySalary();
	}


	@Override
	public String toString() {
		return super.toString() + " WeeklySalary : " + getWeeklySalary();
	}


	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}


	
	

	
	
}
