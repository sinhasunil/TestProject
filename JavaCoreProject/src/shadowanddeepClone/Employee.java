package shadowanddeepClone;

public class Employee implements  Cloneable {
	public String  name ;
	public String  salary ;
    public Address address ;
	
	public Employee(String name, String salary, Address address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Address getAddress()  throws CloneNotSupportedException {
	      return (Address) address.clone();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//Employee  emp  = (Employee) super.clone();
		//emp.setAddress((Address)address.clone());
		
		return super.clone();
	}
	
	

}
