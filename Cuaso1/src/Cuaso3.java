import java.awt.*;
public class Cuaso3 {

	public static void main(String[] args) {
		Frame f= new Frame();
		f.setTitle(" chương trình");
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		
		TextField txtTen = new TextField();
		f.add(txtTen);
		Button btnOK= new Button ("OK");
		f.add(btnOK);
		f.setVisible(true);
		

	}

}
