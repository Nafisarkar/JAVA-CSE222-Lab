
public class Loop9 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%6==0 && i!=30 && i!=60 && i!= 90) {
				System.out.println(i);
			}
		}
	}
}
