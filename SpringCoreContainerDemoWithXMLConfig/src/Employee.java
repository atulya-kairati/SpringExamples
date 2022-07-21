
public class Employee {

	private int empid;
	private String empName;
	private int empSal;
	private String empAdd;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public Employee() {
		System.out.println("setter injection");
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}

	public Employee(int empid, String empName, int empSal, String empAdd) {
		super();
		System.out.println("param constructor");
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}

}
