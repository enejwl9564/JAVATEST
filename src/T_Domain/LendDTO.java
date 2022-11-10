package T_Domain;

public class LendDTO {
	private int Lid;
	private int bookcode;
	private String memId;
	private String startDate;
	private String endDate;
	
	//Getter and Setter
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public int getBookcode() {
		return bookcode;
	}
	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getendDate() {
		return endDate;
	}
	public void setendDate(String endDate) {
		this.endDate = endDate;
	}	
	
	//toString
	@Override
	public String toString() {
		return "endDTO [Lid=" + Lid + ", bookcode=" + bookcode + ", memId=" + memId + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
	//기본 생성자, 모든인자 생성자
	public LendDTO(int lid, int bookcode, String memId, String startDate, String endDate) {
		super();
		Lid = lid;
		this.bookcode = bookcode;
		this.memId = memId;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public LendDTO() {}
	
}
