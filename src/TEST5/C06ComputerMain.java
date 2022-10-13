package TEST5;

class C06Computer{
	String SerialNo, CPUSpec, RAMSpec, DISKSpec;
	
	void PowerON() {
		System.out.println("SerialNo+의 전월을 겹니다 가 출력");
	}
	void PowerOFF() {
		System.out.println("SerialNo+의 전원을 끕니다 가 출력");
	}
	void ShowInfo() {
		System.out.printf("NO : %s CPU : %s RAM : %s DISK : %s\n",SerialNo,CPUSpec,RAMSpec,DISKSpec);
	}
}

public class C06ComputerMain {

	public static void main(String[] args) {
		
		C06Computer LGGram1010 = new C06Computer();
		LGGram1010.SerialNo = "1010";
		LGGram1010.CPUSpec = "I7";
		LGGram1010.RAMSpec = "16G";
		LGGram1010.DISKSpec = "2TB";
		LGGram1010.PowerON();
		LGGram1010.ShowInfo();
		LGGram1010.PowerOFF();

	}

}
