
public class Main {
	public static void main(String args[]) {
		LoginView vis=new LoginView();
		Login log=new Login();
		LoginController l=new LoginController(vis,log);
		l.updateView();
	}

}
