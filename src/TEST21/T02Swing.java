package TEST21;

import javax.swing.JFrame;

class T02GUI extends JFrame{
	T02GUI(){
		super("두번쨰 프레임 입니다.");
		setBounds(100,100,700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class T02Swing {

	public static void main(String[] args) {
		new T02GUI();
		

	}

}
