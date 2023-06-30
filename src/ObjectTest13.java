
public class ObjectTest13 {
	public static void main(String[] args) {
		String fullName="Hello.java";
		
		int index = fullName.indexOf('.');
		
		System.out.println(fullName.substring(0,index));
		
		System.out.println(fullName.substring(index));
	}
}
