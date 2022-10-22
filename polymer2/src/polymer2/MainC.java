package polymer2;
public class MainC {

	public static void main(String[] args) {
		Book []b1=new Book[4];
		
		b1[0]=new Book(600);
		b1[1]=new Ebook(300);
		b1[2]=new Paperbook(1200);
		b1[3]=new Ebook(200);
		
		for(int i=0; i<b1.length; i++) {
			b1[i].calPrice();
			System.out.println(b1[i].toString());
		}
	}

}
