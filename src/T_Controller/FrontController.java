package T_Controller;

import java.util.HashMap;
import java.util.Map;

import T_Domain.DTO;

public class FrontController {
	
	//요청 정보 - 하위 컨트롤러 Mapping 저장필요
	private Map<String,SubController> map = new HashMap();
	
	//생성자 실행시 init함수 호출
	public FrontController() {
		init();
	}
	//요청 서비스별 처리 Controller를 저장 보관 하기위한 함수
	private void init() {
		map.put("/Member", new MemberController());
		map.put("/Book", new BookController());
	}
	
	//사용자로부터 요청서비스명, 서비스번호(SN)를 받아 요청처리 Controller를 실행
	public Object ExSubController(String menu,int SN,DTO dto) {
		
		//서비스 선별
		SubController sub = map.get(menu);	//업캐스팅
		//SN 전달 excute
		Object obj = sub.excute(SN,dto); // 1,2,3,4,etc..
		
		return obj;
	}
	
}
