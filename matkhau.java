import java.util.Scanner;
public class matkhau {

	public static void main(String[] args) {
		String tendn="" , mk="";
		Scanner ban_phim= new Scanner(System.in);
		do
		{
			System.out.print(" tên đăng nhập :");
			tendn=ban_phim.nextLine();
			System.out.print(" mật khẩu :");
			mk=ban_phim.nextLine();
			
		}
		while ((tendn.compareTo("DHCN1C")!=0)|| (mk.compareTo("123")!=0));
	
		System.out.println("welcom");
	}

}
