package T_Domain;

public class MemberDTO extends DTO {
	private String memId;
	private String pwd;
	private int role;	//0 íė , 1 ėŽė
	
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
	
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	public MemberDTO(String memId, String pwd) {
		super();
		this.memId = memId;
		this.pwd = pwd;
		this.role = 0;
	}
	
	public MemberDTO(String memId, String pwd, int role) {
		super();
		this.memId = memId;
		this.pwd = pwd;
		this.role = role;
	}
		
	public MemberDTO(){}
	
	@Override
	public String toString() {
		return "MemberDTO [memId=" + memId + ", pwd=" + pwd + ", role=" + role + "]";
	}
	
	
		

}
