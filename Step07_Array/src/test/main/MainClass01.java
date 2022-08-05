package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//int type 5개를 저장하고 있는 배열
		int[] nums= {10,20,30,40,50};
		//double type 5개를 저장하고 있는 배열
		double[] nums2= {10.1, 10.2, 10.3, 10.4, 10.5};
		//boolean type 5개를 저장하고 있는 배열
		boolean [] truth= {true, true, true, false, false};
		//String type(참조데이터type) 5개를 저장하고 있는 배열
		String[] names= {"정다정", "정하오","룰루","랄라","999"};
		
		//특정 데이터를 참조하는 방법 (배열의 각각의 방 참조하기
		int result1=nums[0];
		double result2=nums2[1];
		boolean result3=truth[2];
		String result4=names[1];
		
		//nums배열을 복제해서 새로운 배열을 얻어내기
		int[] a=nums.clone();
		//nums 안에 있는 배열의 참조값을 b에 대입하기
		int[] b=nums;
		
		//배열의 인덱스 갯수(방의 갯수) 참조
		int size=nums.length;
	}
}
