class Point02 {
	int x, y;

	public Point02() {
	}

	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}

public class ObjectTest01 {
	public static void main(String[] args) {
		Point02 pt01 = new Point02(100,200);
		Point02 pt02 = new Point02(100,200);
		
		if(pt01==pt02){
			System.out.println("pt01과 pt02는 같다.");
		}else {
			System.out.println("pt01과 pt02는 다르다");
		}
		
		if(pt01.equals(pt02)) {
			System.out.println("pt01과 pt02는 같다.");
		}else {
			System.out.println("pt01과 pt02는 다르다");
		}
	}
}