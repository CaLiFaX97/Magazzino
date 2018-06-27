
public class Main {
	public static void main(String args[]) {
		LoginView vis=new LoginView();
		Login log=new Login();
		SegreteriaView seView=new SegreteriaView();
		SegreteriaController seCtrl=new SegreteriaController(seView);
		LoginController l=new LoginController(vis,log,seView,seCtrl);
		l.updateView(true);
	}

}
