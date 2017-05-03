
public class Phanso {
	private int tuso;
	private int mauso;
	
	// hàm tạo không tham so
		public Phanso()
		{
			tuso=0;
			mauso=1;
		}
		// hàm tạo có tham so
		public Phanso( int ts, int ms)
		{
			tuso=ts;
			mauso=ms;
		}
		public String toString()
		{
			String tam="";
			tam=String.valueOf(tuso)+"/"+ String.valueOf(mauso);
			return tam;
		}
		
		int uscln ( int a, int b)
		{
			while(a!=b)
			{
				if(a>b)
					a=a-b;
				else
					b=b-a;
			}
			return a;
			
			}
		
	public Phanso ToiGian()
	{
		Phanso p= new Phanso();
		p.tuso=tuso/uscln(this.tuso,this.mauso);
		p.mauso=mauso/uscln(this.tuso,this.mauso);
		
	return p;
}
	// cong voi mot phan so khac
	public Phanso Cong(Phanso ps)
	{
		Phanso p=new Phanso();
		p.tuso=ps.tuso*this.mauso + ps.mauso*this.tuso;
		p.mauso=ps.mauso*this.mauso;
		return p;
	}
	// so sanh 
	public int sosanh(Phanso ps){
	int kq=0;
	// quy dinh: lon hon tra ve 1, bang tra ve 0, va nho hon tra ve -1
	double so1=(double)this.tuso/this.mauso;
	double so2 =(double)ps.tuso/ps.mauso;
	if(so1==so2) kq=0;
	if(so1<so2) kq=-1;
	if(so1>so2) kq=1;
	return kq;
	}
			

	public static void main(String[] args) {
		Phanso ps1=new Phanso(2,3);
		Phanso ps2=new Phanso(3,2);
		
		System.out.println("Phan so 1: "+ps1.toString());
		System.out.println("Phan so 2: "+ps2.toString());
		// tih tong 2 phan so va in ra man hinh
		Phanso psTong= ps1.Cong(ps2);
		System.out.print("Tong la: "+psTong.toString());
		
		// so sanh 
		int kq=ps1.sosanh(ps2);
		if(kq==0) System.out.println("hai phan so bang nhau");
		if(kq==1) System.out.println("phan so 1 lon hon");
		if(kq==-1) System.out.println("phan so 1 nho hon");
		
	}			
}

