import java.util.Scanner;

public class main {
	public static void main(String [] args){
		//common data
		int p=0, a=0, y1=0, y2=0;
		//users
		User user1 = new User() ,user2 = new User();
		int k1=0, k2=0;
		System.out.println("***�������� �����-��������***");
		System.out.print("������� ������� ����� ��� ������� P >>");
		Scanner in = new Scanner(System.in);
		if(in.hasNextInt()){
			p=2*in.nextInt()+1;
		}
		System.out.println();
		System.out.print("������� �, ����� ��� 1<A<"+(p-1)+" >>");
		if(in.hasNextInt()){
			a=in.nextInt();
			if((a<1)||a>(p-1)){
				throw new IllegalArgumentException();
			}
		}
		System.out.println();
		System.out.println("������������ 1 ���������� ��������� ���� "+user1.generate(p));
		y1=user1.count(p, a);
		System.out.println("������������ 1 ��������� y1 "+y1);
		System.out.println("������������ 2 ���������� ��������� ����� "+user2.generate(p));
		y2=user2.count(p, a);
		System.out.println("������������ 2 ��������� y2 "+y2);
		System.out.println("������������ ������������ y...");
		k1=user1.key(y2, p);
		k2=user2.key(y1, p);
		System.out.println("������������ 1 ������� ���� "+k1);
		System.out.println("������������ 2 ������� ���� "+k2);
		if(k1==k2) System.out.println("����� �����");
		else System.out.println("����� �� ����� =(");
	
	}
}
