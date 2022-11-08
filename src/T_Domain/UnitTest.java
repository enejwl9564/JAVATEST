package T_Domain;

public class UnitTest {
	
	public static void main(String[] args) {
		
		//DAO Tests
		BookDAO dao = BookDAO.getInstance();
		boolean flag = dao.Insert(new BookDTO(1000,"자바의정석"));
		
		if(flag) {
			System.out.println("INSERT 성공!");
		}
		
	}

}
