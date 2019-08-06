package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		int i=1;
		int init=0;
		while(i<100) {
			int quo=1;
			int dis=i;
			while(quo>0) {						
				quo = dis/10;
				dis = dis-quo*10;
				if((dis==3||dis==6||dis==9)&&init==0) {
					System.out.println();
					System.out.print(i);
					System.out.print("¦");
					init=1;
				}else if(dis==3||dis==6||dis==9) {
					System.out.print("¦");
				}
				dis=quo;
			}
			i++;
			init=0;
		}
	}
}
