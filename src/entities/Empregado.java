package entities;

public class Empregado {

	private Integer id;
	private String name;
	private Double salary;

	//Construtor
	public Empregado(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Get and Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//Fun��o
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString () {
		return id 
				+ ", " 
				+ name
				+ ", "
				+ String.format("%.2f", salary);
	}
}
