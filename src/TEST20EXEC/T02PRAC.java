package TEST20EXEC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class T02PRAC {

	//tbl_customer에 id가 2인행의 name='SeoGilDong',addr='ulsan',phone='none' 으로 수정하세요
	//tbl_customer에 id가 3인행을 삭제합니다.
	
	public static void main(String[] args) throws Exception {
		//연결관련 정보 저장용 변수
		String id = "root";	//DB연결 id
		String pw = "1234";	//DB연결 pw
		String url = "jdbc:mysql://localhost:3306/shopdb"; //연결URL(DBMS마다 상이함)

		//DB연결객체 관련 참조변수
		Connection conn = null;						//DB연결객체용 참조변수
		PreparedStatement pstmt = null;				//SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;						//쿼리결과(Select결과)수신용 참조변수
		
		
		//연결하기
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			//DB 드라이버 로드
			System.out.println("Driver Loading Success!!");
			conn = DriverManager.getConnection(url,id,pw); 		//DB Connection 객체 받기
			
			conn.setAutoCommit(false);
			
			System.out.println("DB Connected...");
			//tbl_customer에 id가 2인행의 name='SeoGilDong',addr='ulsan',phone='none' 으로 수정하세요
			pstmt = conn.prepareStatement("update tbl_customer set name=?,addr=?,phone=? where id = ?");
			pstmt.setString(1, "SeoGilDong%%");
			pstmt.setString(2, "ulsan%%");
			pstmt.setString(3, "none%%");
			pstmt.setInt(4, 2);
			int result = pstmt.executeUpdate();
			if(result!=0) {
				System.out.println("Update 성공");
			}else {
				System.out.println("Update 실패");
			}
			
			//tbl_customer에 id가 3인행을 삭제합니다.
			pstmt = conn.prepareStatement("delete d from tbl_customer where id = 3");
			result = pstmt.executeUpdate();
			if(result!=0) {
				System.out.println("Delete 성공");
			}else {
				System.out.println("Delete 실패");
			}
			
			conn.setAutoCommit(true);
//			conn.commit();
			
		}catch(Exception e) {
			try{
				conn.rollback();
				System.out.println("Rollback..!!");
				}catch(Exception e1) {e1.printStackTrace();}
			e.printStackTrace();
		}finally {
			try{pstmt.close();}catch(Exception e) {e.printStackTrace();}
			try{conn.close();}catch(Exception e) {e.printStackTrace();}
		}
		
	}

}
