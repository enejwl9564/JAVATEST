package T_Controller;

import T_Domain.BookDTO;
import T_Domain.DTO;
import T_Service.BookService;

public class BookController implements SubController {

	//BookService 연결
	BookService service = new BookService();
	
	@Override
	public Object excute(int SN,DTO dto) {
		
		Object obj = null;
		boolean flag = false;
		
		switch(SN) {
		case 1:	//도서등록
//			System.out.println("도서등록 서비스 요청");
			BookDTO dwon = (BookDTO)dto;
			flag = service.RegisterBook(dwon, 3);
			System.out.println("도서 등록 성공 여부 : " +flag);
			if(flag) {
				obj ="도서 등록이 완료되었습니다.";
			}else {
				obj ="도서 등록이 되지않았습니다.";
			}
			break;
		case 2:	//도서조회
			System.out.println("도서조회 서비스 요청");
			break;
		case 3:	//도서수정
			System.out.println("도서수정 서비스 요청");
			break;
		case 4:	//도서삭제
			System.out.println("도서삭제 서비스 요청");
			break;
		default:
			System.out.println("잘못된 서비스 요청입니다.");
		}
		return obj;
		
	}
	
	
	
}
