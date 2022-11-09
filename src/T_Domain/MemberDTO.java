package T_Domain;

public class MemberDTO extends DTO {
	private String memId;
	private String pwd;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public MemberDTO(String memId, String pwd) {
		super();
		this.memId = memId;
		this.pwd = pwd;
	}
	
	public MemberDTO(){}
	
	@Override
	public String toString() {
		return "MemberDTO [memId=" + memId + ", pwd=" + pwd + "]";
	}
		

}
