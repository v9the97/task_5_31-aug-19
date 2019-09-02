package task_5;

public class Employees {
	private String  empname,destination; 
	private int salary,employyeno;
	public Employees(int employyeno,String empname,int salary, String destination) {
		super();
		this.empname = empname;
		this.destination = destination;
		this.salary = salary;
		this.employyeno = employyeno;
	}
	
	
	@Override
	public String toString() {
		return "Employees [empname=" + empname + ", destination=" + destination
				+ ", salary=" + salary + ", employyeno=" + employyeno + "]";
	}


	//@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employyeno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		if (employyeno != other.employyeno)
			return false;
		return true;
	}
	
}
