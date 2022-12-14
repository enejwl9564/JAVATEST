package T_Service;

import T_Domain.MemberDAO;
import T_Domain.MemberDTO;

public class MemberService {
	
	private MemberDAO dao = MemberDAO.getInstance();
	
	//싱글톤 패턴 코드 추가
	private static MemberService instance;
	public static MemberService getInstance() {
		if(instance == null)
			instance = new MemberService();
		return instance;
	}
	private MemberService() {}
	
	
	//멤버 등록하기
	//(권한 확인 후 도서 등록) - 내일
	public boolean RegisterMember(MemberDTO dto) {
		
		int result = dao.Insert(dto);
		if(result > 0) {
			return true;
		}
		return false;
	}
	//(ID/PW인증 이후 Role 전달)
	public Integer LoginCheck(String id,String pwd) {
		MemberDTO dto = null;
		dto = dao.Select(id);
		//ID or PW 일치여부 확인
		if(id.equals(dto.getMemId())&&pwd.equals(dto.getPwd())) {
			return dto.getRole();
		}
		//Role 반환 ( 0 or 1 or Null)
		return null;
	}
	
	//멤버 수정하기
	//멤버 삭제하기
	//기타..

}
