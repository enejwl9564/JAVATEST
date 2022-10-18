package TEST05;

class T09Simple{
	String name;
	int sum(int x, int y){
		System.out.println("sum(int,int)호출!");
		return x+y;
		}
	double sum(double x , double y){
		System.out.println("sum(double,double)호출!");
		return x+y; 
		}
	int sum(int x, int y, int z) {
		System.out.println("sum(int,int,int)호출!");
		return x+y+z; 
		}
	int sum(String str1, int x, int y){
		System.out.println("sum(String,int,int)호출!");
		name = str1; return x+y;
		}
}


public class T09MethodOverloading {

	public static void main(String[] args) {
		
		T09Simple obj = new T09Simple();
		obj.sum("홍길동",10,20);

	}

}
