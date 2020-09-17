public class Person 
{
	private String fname;
	private String lname;
	private int age;
	
	/*
	def __init__(fname, lname, age):
		self.fname = fname
		self.lname = lname
		self.age = age
	*/
	public Person(String fname, String lname, int age)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public String getFname()
	{
		return this.fname;
	}
	
	public void display()
	{
		System.out.println(this.fname + " " + this.lname + "(age: " + this.age + ")");
	}
}
