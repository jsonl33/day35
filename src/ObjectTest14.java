
public class ObjectTest14 {
	public static void main(String[] args) {
		StringBuffer sb01 = new StringBuffer("abc");
		StringBuffer sb02 = new StringBuffer("abc");
		
		System.out.println("sb01 == sb02 ? "+(sb01 == sb02));
		
		System.out.println("sb01 == sb02 ? "+(sb01.equals(sb02)));
		
		String StrSb01 = sb01.substring(0);
		String StrSb02 = sb02.toString();
		
		System.out.println("StrSb01 == StrSb02 ? "+(StrSb01.equals(StrSb02)));
	}
}
