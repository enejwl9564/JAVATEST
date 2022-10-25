package TEST14EXEC;
//문제 
//다음 클래스의 equals 메서드를 재정의해서 멤버변수간(x,y)의 값이 일치할때 true
//불일치시 false를 반환하도록 하세요
class T01Point
{
	int x;
	int y;
	
	T01Point(int x, int y){
		this.x =x; this.y=y;
		}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof T01Point) {
			T01Point down = (T01Point)obj;
			return this.x == down.x&&this.y == down.y;
		}
		return false;
	}

	//equals 재정의 하기
	
}

public class T01Prac {

	public static void main(String[] args) {
		T01Point pos1 = new T01Point(10,20);
		T01Point pos2 = new T01Point(10,50);
		T01Point pos3 = new T01Point(40,20);
		System.out.println(pos1.equals(pos2));
		System.out.println(pos2.equals(pos3));
		System.out.println(pos1.equals(pos3));

	}

}
