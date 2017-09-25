import javax.faces.bean.ManagedBean;

@ManagedBean(name="login1")
public class Login {
	
	private String u_name;
	private String pwd;
	
	
	public Login(){
		
	}


	public String getU_name() {
		return u_name;
	}


	public void setU_name(String u_name) {
		this.u_name = u_name;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String checkValidity() { 
		if ((u_name.equals("admin") || u_name.equals("Admin")) && (pwd.equals("admin") || pwd.equals("Admin"))){ 
			return ("Loginsuccessfull");
		}
		else{
			return("Loginfailure");
		}

	}	
}
