
public class SegreteriaController {
	SegreteriaView seView;
	public SegreteriaController(SegreteriaView seView) {
		this.seView=new SegreteriaView();
	}
	
	public void updateView() {
		seView.frame.setVisible(true);
		
	}

}
