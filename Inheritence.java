

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//
		//Person p1; // C++
		
//		Person p1;
		
		Person p1 = new Person();// Java
		System.out.println(p1);
//		System.out.prin
		Employee e1= new Employee();
		p1.setPerson("shivam",23 , 65);
		e1.setEmp("sagar", 23, 68, 30000);
		p1.DispPerson();
		e1.DispEmp();
		
//		System.out.println(e1.strName);
		
		
	}

}

class Person
{
	String strName;
	int age;
	float wt;
	
	public void setPerson(String nm, int ag, float wt)
	{
		this.strName = nm;
		this.age = ag;
		this.wt = wt;
	}
	
	public void DispPerson()
	{
		System.out.println(strName+ " "+age+ " "+wt);
	}
	
}

class Employee extends Person
{

	int salary;
	
	public void setEmp(String nm, int ag, float wt,int sl)
	{
	
		this.setPerson(nm, ag, wt);
		this.salary = sl;
	}
	
	public void DispEmp()
	{
		this.DispPerson();
		System.out.println(salary);
//		System.out.println(strName+ " "+age+ " "+wt+" "+salary);
	}
	
	
}

