import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SegreteriaController implements ActionListener{
	SegreteriaView seView;
	tipoArticoloView artView;
	public SegreteriaController(SegreteriaView seView,tipoArticoloView artView) {
		this.seView=new SegreteriaView();
		this.artView=new tipoArticoloView();
	}
	
	public void updateView() {
		seView.frame.setVisible(true);
		seView.btn1.addActionListener(this);
		artView.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == seView.btn1) {
			seView.frame.setVisible(false);
			artView.frame.setVisible(true);
			
		}
		if(event.getSource() == artView.btn2) {
			seView.frame.setVisible(true);
			artView.frame.setVisible(false);
		}
		
	}

}
