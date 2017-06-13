
public class Student{
	
	public int add(int x, int y) {
		System.out.println("add with two args called");
		return x +y;
	}
	public int add(int x, int y, int z) {
		System.out.println("add with three args called");
		this.add(x,y);
		return x + y + z;

	}

	public static void main(String[] args) {
		Student st = new Student();
		
		
		System.out.println(st.add(5,8));
		System.out.println(st.add(5,8,6));
	
	}
}
