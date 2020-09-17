
public class Driver 
{
	public static void main(String[] args)
	{
		// p = Person("Mike", "Litman", 21)
		Person p = new Person("Mike", "Litman", 21);
		Person p2 = new Person("Mr.", "Gonzales", 9);
		p.display();
		p2.display();
		System.out.println(p.getFname());

	}
}
