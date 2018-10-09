import java.util.Scanner;

public class main {
	public static void main(String [] args){
		//common data
		int p=0, a=0, y1=0, y2=0;
		//users
		User user1 = new User() ,user2 = new User();
		int k1=0, k2=0;
		System.out.println("***Алгоритм Диффи-Хеллмана***");
		System.out.print("Введите простое число для расчёта P >>");
		Scanner in = new Scanner(System.in);
		if(in.hasNextInt()){
			p=2*in.nextInt()+1;
		}
		System.out.println();
		System.out.print("Введите А, такое что 1<A<"+(p-1)+" >>");
		if(in.hasNextInt()){
			a=in.nextInt();
			if((a<1)||a>(p-1)){
				throw new IllegalArgumentException();
			}
		}
		System.out.println();
		System.out.println("Пользователь 1 генерирует секретное чило "+user1.generate(p));
		y1=user1.count(p, a);
		System.out.println("Пользователь 1 вычисляет y1 "+y1);
		System.out.println("Пользователь 2 генерирует секретное число "+user2.generate(p));
		y2=user2.count(p, a);
		System.out.println("Пользователь 2 вычисляет y2 "+y2);
		System.out.println("Пользователи обмениваются y...");
		k1=user1.key(y2, p);
		k2=user2.key(y1, p);
		System.out.println("Пользователь 1 считает ключ "+k1);
		System.out.println("Пользователь 2 считает ключ "+k2);
		if(k1==k2) System.out.println("Ключи равны");
		else System.out.println("Ключи не равны =(");
	
	}
}
