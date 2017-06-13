
public class Student{
	//here we create the first method
	public int add(int x, int y) {
		System.out.println("add with two args called");
		return x +y;
	}
	//here we create the second method
	public int add(int x, int y, int z) {
		System.out.println("add with three args called");
		//here we call the 1st method from the second method
		this.add(x,y);
		return x + y + z;

	}

	public static void main(String[] args) {
		//here we creating the new object
		Student st = new Student();
		System.out.println(st.add(5,8));
		System.out.println(st.add(5,8,6));
	
	}
}
