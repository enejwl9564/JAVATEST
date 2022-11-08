package T_Service;

import T_Domain.BookDAO;
import T_Domain.BookDTO;

public class BookService {
	
	BookDAO dao = BookDAO.getInstance();
	
	//도서 조회하기
	//도서 등록하기
	//(권한 확인 후 도서 등록) - 내일
	public boolean RegisterBook(BookDTO dto, int permission) {
		
		boolean isRegisterOK = true;
		//권한 체크(등록가능한지여부)
		
		if(permission >= 3) {
			return dao.Insert(dto);
		}
		
		return false;
	}
	
	//도서 수정하기
	//도서 삭제하기
	//기타..

}
