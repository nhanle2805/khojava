import java.awt.*;

import java.awt.event.*;


public class PhepToanAWT extends Frame implements ActionListener,WindowListener {

	private Label lblA;
	private Label lblB;
	private Label lblkq;
	private TextField txtA;
	private TextField txtB;
	private TextField txtkq;
        private Button btnCong;
        private Button btnTru;
        private Button btnChia;
	private Button btnNhan;
	
	
	
	private float kq;

	public PhepToanAWT(){
		setKq(0);
		setLayout(new FlowLayout());
		
		lblA = new Label("a =");
		add(lblA);
		
		txtA = new TextField(10);
		txtA.setEditable(true);
		add(txtA);	
		
		lblB = new Label("b =");
		add(lblB);
		
		txtB = new TextField(10);
		txtB.setEditable(true);
		add(txtB);
		
		btnCong = new Button("+");
		add(btnCong);
		btnCong.addActionListener(this);
		
		btnTru = new Button("-");
		add(btnTru);
		btnTru.addActionListener(this);
		
		btnNhan = new Button("*");
		add(btnNhan);
		btnNhan.addActionListener(this);
		
		btnChia = new Button("/");
		add(btnChia);
		btnChia.addActionListener(this);
		
		
		addWindowListener(this);
		
		lblkq = new Label("kq = ");
		add(lblkq);
		txtkq = new TextField(10);
		txtkq.setEditable(false);
		add(txtkq);
		
		setTitle("Phep Toan");
		setSize(270, 100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		float A = 0;
		float B = 0;
		
		A = Float.parseFloat(txtA.getText());
		B = Float.parseFloat(txtB.getText());
		
		if(e.getSource()==btnCong){
			setKq(A + B);
			txtkq.setText(getKq()+"");
		}
		else if (e.getSource()==btnTru){
			setKq(A - B);
			txtkq.setText(getKq()+"");
		}
		else if (e.getSource()==btnNhan){
			setKq(A * B);
			txtkq.setText(getKq()+"");
		}
		else if (e.getSource()==btnChia){
			if (B == 0){
				txtkq.setText("Loi~");
			}
			else{
				setKq(A / B);
				txtkq.setText(getKq()+"");
			}
		}
	}
	
	public Label getLblA() {
		return lblA;
	}


	public void setLbla(Label lblA) {
		this.lblA = lblA;
	}


	public Label getLblkq() {
		return lblkq;
	}


	public void setLblkq(Label lblkq) {
		this.lblkq = lblkq;
	}


	public Label getLblB() {
		return lblB;
	}


	public void setLblB(Label lblB) {
		this.lblB = lblB;
	}


	public TextField getTxtA() {
		return txtA;
	}


	public void setTxtA(TextField txtA) {
		this.txtA = txtA;
	}


	public TextField getTxtB() {
		return txtB;
	}


	public void setTxtB(TextField txtB) {
		this.txtB = txtB;
	}


	public TextField getTfkq() {
		return txtkq;
	}


	public void setTxtkq(TextField txtkq) {
		this.txtkq = txtkq;
	}


	public Button getBtnNhan() {
		return btnNhan;
	}


	public void setBtnNhan(Button btnNhan) {
		this.btnNhan = btnNhan;
	}


	public Button getBtnChia() {
		return btnChia;
	}


	public void setBtnChia(Button btnChia) {
		this.btnChia = btnChia;
	}


	public Button getBtnCong() {
		return btnCong;
	}


	public void setBtnCong(Button btnCong) {
		this.btnCong = btnCong;
	}


	public Button getBtnTru() {
		return btnTru;
	}


	public void setBtnTru(Button btnTru) {
		this.btnTru = btnTru;
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public float getKq() {
		return kq;
	}

	public void setKq(float kq) {
		this.kq = kq;
	}
}