package T_Service;

import T_Domain.MemberDAO;
import T_Domain.MemberDTO;

public class MemberService {
	
	private MemberDAO dao = MemberDAO.getInstance();
	
	//싱글톤 패턴 코드 추가
	private MemberService instance;
	public MemberService getInstance() {
		if(instance == null)
			instance = new MemberService();
		return instance;
	}
	private MemberService() {}
	
	//도서 조회하기
	//도서 등록하기
	//(권한 확인 후 도서 등록) - 내일
	public boolean RegisterMember(MemberDTO dto) {
		
		int result = dao.Insert(dto);
		if(result > 0) {
			return true;
		}
		return false;
	}
	
	//도서 수정하기
	//도서 삭제하기
	//기타..

}
