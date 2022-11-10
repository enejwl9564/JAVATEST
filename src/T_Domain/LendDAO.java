package T_Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LendDAO {
	// 연결관련 정보 저장용 변수
	String id = "root"; // DB연결 id
	String pw = "1234"; // DB연결 pw
	String url = "jdbc:mysql://localhost:3306/libdb"; // 연결URL(DBMS마다 상이함)
		// DB연결객체 관련 참조변수
	Connection conn = null; // DB연결객체용 참조변수
	PreparedStatement pstmt = null; // SQL쿼리 전송객체용 참조변수
	ResultSet rs = null; // 쿼리결과(Select결과)수신용 참조변수
		//싱글톤 패턴 코드 추가
	private static LendDAO instance;
	public static LendDAO getInstance() {
		if(instance==null);
			instance = new LendDAO();
		return instance;
	}
	
	private LendDAO() {
		// CONN객체 연결
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("Connected...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//대여처리(대여처리 x)
	public int Insert(LendDTO dto) {
		int result = 0;
		//pstmt
		try {
			pstmt = conn.prepareStatement("insert into tbl_Lend values(null,?,?,?,?)");
			pstmt.setInt(1, dto.getBookcode());
			pstmt.setString(2, dto.getMemId());
			pstmt.setString(3, dto.getStartDate());
			pstmt.setString(4, dto.getendDate());
			result = pstmt.executeUpdate();			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return result;
	}
	
	public int Insert(BookDTO bdto, LendDTO dto) {
		int result = 0;
		//pstmt
		try {
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement("update tbl_book set bookname = ?, isLend = ? where bookcode = ?");
			pstmt.setString(1, bdto.getBookName());
			if(bdto.isLend()) {		//true - 대여불가
				pstmt.setInt(2, 1);	//1값을 넣음
			}else {					//false - 대여가능
				pstmt.setInt(2, 0);	//0값을 넣음
			}
			pstmt.setInt(3, bdto.getBookCode());
			result = pstmt.executeUpdate();
			

			//tbl_lend의 대여정보 추가
			pstmt = conn.prepareStatement("insert into tbl_Lend values(null,?,?,?,?)");
			pstmt.setInt(1, dto.getBookcode());
			pstmt.setString(2, dto.getMemId());
			pstmt.setString(3, dto.getStartDate());
			pstmt.setString(4, dto.getendDate());
			result = pstmt.executeUpdate();
//			throw new SQLException();	//SQL 예외발생!
			
			conn.commit();
			
		} catch (Exception e) {			
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
		return result;
	}
	
	
}
