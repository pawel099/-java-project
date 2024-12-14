package jaknauczycsieprogramowania.user;

public class users {

	protected String login ;
	protected String password ;
	protected String role ;

	public String user(String login,String password) {

		this.login = login;
		this.password = password;
		return login;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public String setLogin(String login) {
		this.login = login;
		return login;
	}

	public String setPassword(String password) {
		this.password = password;
		return password;
	}
}





