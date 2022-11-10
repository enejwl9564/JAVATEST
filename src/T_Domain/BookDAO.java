package T_Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDAO {
	// 연결관련 정보 저장용 변수
		String id = "root"; // DB연결 id
		String pw = "1234"; // DB연결 pw
		String url = "jdbc:mysql://localhost:3306/libdb"; // 연결URL(DBMS마다 상이함)

		// DB연결객체 관련 참조변수
		Connection conn = null; // DB연결객체용 참조변수
		PreparedStatement pstmt = null; // SQL쿼리 전송객체용 참조변수
		ResultSet rs = null; // 쿼리결과(Select결과)수신용 참조변수

		//싱글톤 패턴 코드 추가
		private static BookDAO instance;
		public static BookDAO getInstance() {
			if(instance==null);
				instance = new BookDAO();
			return instance;
		}
		
		private BookDAO() {
			// CONN객체 연결
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, id, pw);
				System.out.println("Connected...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//전체 조회
		//선택 조회
		//등록 하기
		public int Insert(BookDTO dto) {
			int result = 0;
			//pstmt
			try {
				pstmt = conn.prepareStatement("insert into tbl_book values(?,?,1)");
				pstmt.setInt(1, dto.getBookCode());
				pstmt.setString(2, dto.getBookName());
				result = pstmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}	
			return result;
		}
		//수정 하기
		//삭제 하기

		public BookDTO Select(int bookCode) {
			BookDTO dto = null;
			
			try {
				pstmt = conn.prepareStatement("select * from tbl_book where bookCode =?");
				pstmt.setInt(1, bookCode);
				rs = pstmt.executeQuery();
				if(rs != null) {
					rs.next();
					dto = new BookDTO();
					dto.setBookCode(rs.getInt("bookCode"));
					dto.setBookName(rs.getString("bookname"));
					int islend = rs.getInt("isLend");
					if(islend == 1) {
						dto.setLend(true);
					}
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {rs.close();}catch(Exception e) {e.printStackTrace();}
				try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
			}
			return dto;
		}
		
		public int Update(BookDTO dto) {
			int result = 0;
			//pstmt
			try {
				pstmt = conn.prepareStatement("update tbl_book set bookname = ?, isLend = ? where bookcode = ?");
				pstmt.setString(1, dto.getBookName());
				if(dto.isLend()) {		//true - 대여불가
					pstmt.setInt(2, 1);	//1값을 넣음
				}else {					//false - 대여가능
					pstmt.setInt(2, 0);	//0값을 넣음
				}
				pstmt.setInt(3, dto.getBookCode());
				result = pstmt.executeUpdate();				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
			}
			return result;
		}
		
		
}
