package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class MainClass16 {
	public static void main(String[] args) {
		//1. HashSet객체를 생성하여 참조값을 정수를 저장할 수 있는 Set인터페이스 type에 저장
		HashSet<Integer> ranNum=new HashSet<>();
		//2.반복문 돌면서 1-45사이의 랜덤한 정수를 얻어내서 HashSet객체에 담기
		//총 6개가 담길 때까지 반복문, 동일한 숫자가 나오면 하나만 저장하기
		Random ran=new Random();
		while (true) {
			ranNum.add(ran.nextInt(45)+1);
			if(ranNum.size()>6) {
				break;
			}
		}
		/*for (int i=0;i<6;i++) {
			int set=ran.nextInt(45)+1;
			ranNum.add(set);
		} : 정확한 반복횟수가 있다면 for*/	
		
		//3.HashSet객체에 담긴 숫자를 콘솔창에 하나씩 모두 출력
		Iterator<Integer>print=ranNum.iterator();

		while(print.hasNext()) {
			Integer item=print.next();
			System.out.println(item);
		}
	}
}
