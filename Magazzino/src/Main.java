
public class Main {
	public static void main(String args[]) {
		LoginView vis=new LoginView();
		Login log=new Login();
		SegreteriaView seView=new SegreteriaView();
		tipoArticoloView artView=new tipoArticoloView();
		SegreteriaController seCtrl=new SegreteriaController();
		
		LoginController l=new LoginController(vis,log,seView,seCtrl,artView);
		l.updateView(true);
	}

}
