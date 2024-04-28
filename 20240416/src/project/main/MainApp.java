package project.main;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 변수를 만드는데 필요한건 -> 공간 + 주소
		// 한개씩 따로 만들지 않고 여러개를 한번에 만들어도 상관이 없다.
		// 변수를 크게 만들어서 쪼개어서 쓰는 기능 -> 배열
		// 배열은 주소타입
		// 편리하게 만들기 위해서 배열의 모든 자료형은 동일하다.
		// 배열 -> 모양(자료형 -> 모양 1개 + 배열이다[])
		// 배열 -> int[] -> int형 변수의 모양을 여려개 묶은것 같은 배열
//		int[] arr; // 배열형 변수(주소 타입) arr를 만들었다.
//		String a; // 주소를 가질 수 있는 변수
//		// 주소 타입 변수는 원시타입과 다르게 new를 쓴다.
//		arr = new int[5];
//		int[] arr2 = new int[5];
		
		// 배열은 다른 주소타입 변수와는 다르게 실제로는 한 덩어리
		// 다른 주소타입과 다르게 한 덩어리이다 보니 덩어리 크기를 재는 개수만 필요하다.
		// 사용법도 일반적인 주소타입과는 다른 사용법을 가지고 있다.
		// 일반적인 주소 타입은 여러개를 묶을때 해당하는 대상이 각각 이름을 가지고 있다.
		// 배열은 커다란 덩어리 한개를 쪼개어서 사용하고 싶은것
		// 각각이 이름을 가지고 있지 않고 쪼개어서 몇번째를 이용할지 작성하는 방법으로 사용
		// 배열에서 몇번째를 이용할지 정하는 방식 -> 인덱싱
		// 인덱싱 -> 커다란 덩어리를 만들때 사용했던 갯수로 나눈 후 몇번째를 사용하는지 선택
		// 배열명[인덱스] = 5; 배열 변수를 선택할 수 있다.
		// 인덱싱으로 선택하는 변수는 0번부터 시작(정수)
		// 배열이 몇번째 칸인지 선택이 아닌 몇칸을 첫번째 칸으로부터 이동하는지를 선택
		// 1 ~ 10까지의 숫자를 저장후 역순 출력
//		int[] arr = new int[10];
//		for(int i = 1; i <=10; i+=1) arr[i-1] = i;
//		for(int i = 9; i >= 0; i-=1) System.out.println(arr[i]);
		
		/*
		 * 배열 연습 문제
		 * 1 ~ 1000까지의 숫자를 입력
		 * 숫자중 3의 배수를 저장
		 * 저장된 3의 배수 중 4의 배수만 출력
		 */
		
//		int[] arr = new int[500];
//		
//		for(int i = 1, j = 0; i <=1000; i+=1) {
//			if(i % 3 == 0) {
//				arr[j] = i;
//				j+=1;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i+=1) {
//			if(arr[i] % 4 == 0 && arr[i] != 0 ) System.out.println(arr[i]);
//		}
		
		// 배열 리터럴 초기화
		// 원시 데이터 -> 리터럴
		
		// 배열 리터럴 초기화를 위해서 새로운 기법
		// {} 중괄호 원시데이터
		// 값이 채워져있는 배열
//		int[] arr = new int[] {1,2,3,4,5};
//		// 직접 값을 넣어서 몇칸짜리인지와 어떤 값이 들어 있는지를 말할 수 있다.
//		int[] arr2 = {1,2,3,4,5};
//		
//		String[] str = {
//				new String("ABCD"), "DEFG"
//		};
//		// 배열은 (자료형 + []) + []
//		// 배열의 배열을 만들면 자료형 X 개수 X 개수
//		int[][] arr3 = new int[5][8];
//		
//		// 다차원 배열을 사용 -> 변수 선택
//		// arr[]를 먼저 쪼개고 그 이후에 뒤에 []를 쪼개는 것이 아닌 arr[][]를 먼저 쪼개고 그 후에 arr[]를 쪼개는 방식
//		arr3[4][7] = 5;
		// 다차원 배열을 쓸때는 표면적인 오류보다 보이지 않는 오류로 인한 문제
		
//		int[][] arr = new int[][] {
//			new int[] {1,2,3,4},
//			new int[] {5,6,7,8}
//		};
		
//		int[][] arr2 = new int[][] {{1,2,3,4},{5,6,7,8}};
		
//		int[][] arr3 = {{1,2,3,4},{5,6,7,8}};
		
		/*
		 * 배열을 이용해서 구구단을 저장 후 출력하는 프로그램
		 * 숫자 두개를 입력하면 배열에서 두 숫자를 이용한 변수를 선택 후 저장된 값 출력
		 * 저장된 값은 숫자 두개가 곱해진 값
		 * 배열은 int[], int[][] 둘중 한개를 이용
		 */
//		int a = scan.nextInt(), b = scan.nextInt();
//		
//		int[][] arr = new int[9][9];
//		for(int i = 1; i<=9; i++) {
//			for(int j = 1; j<=9; j++) arr[i-1][j-1] = i*j;
//		}
//		
//		System.out.println(arr[a-1][b-1]);
		
		// 배열처럼 여러개짜리를 반복문과 함께 이용할 때 편리하게 이용하기 위한 기능
		// for-each
//		int[] arr = {1,2,3,4,5};
		// 배열 뿐만이 아니라 동일한 형태를 묶어둔 Collection 형태라면
//		for(int i: arr) System.out.println(i);
		
//		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//		for(int[] arr1 : arr) {
//			for(int value : arr1) {
//				System.out.println(value);
//			}
//		}
	
		/*
		 * 1 ~ 1000까지의 숫자를 출력하는 프로그램
		 * 짝수는 arr1 배열에 저장한 후 출력
		 * 홀수는 arr2 배열에 저장한 후 출력
		 * 3의 배수는 arr3 배열에 저장한 후 출력 안함
		 * 전체 출력 후 짝수만 따로 모두 출력, 홀수만 따로 모두 출력, 3의 배수만 따로 모두 출력
		 */
//		int[] arr1 = new int[500];
//		int[] arr2 = new int[500];
//		int[] arr3 = new int[333];
//		for(int i = 1, j = 0; i<=1000; i+=1) {
//			if(i%3 == 0) {
//				arr3[j] = i;
//				j+=1;
//			}
//		}
//		for(int i = 1, j = 0; i<=1000; i+=1) {
//			if(i%2 == 0) {
//				arr1[j] = i;
//				System.out.print(arr1[j] + " ");
//				j+=1;
//			}
//		}
//		System.out.println();
//		for(int i = 1, j = 0; i<=1000; i+=1) {
//			if(i%2 == 1) {
//				arr2[j] = i;
//				System.out.print(arr2[j] + " ");
//				j+=1;
//			}
//		}
//		System.out.println();
//		for(int i: arr1) System.out.print(i + " ");
//		System.out.println();
//		for(int i: arr2) System.out.print(i + " ");
//		System.out.println();
//		for(int i: arr3) System.out.print(i + " ");
//		
		
		int[] even = new int[1000/2];
		int[] odd = new int[1000/2];
		int[] three = new int[1000/3];
		int evenIndex = 0, oddIndex = 0, threeIndex = 0;
		for(int i = 1; i<= 1000; i +=1) {
			if(i%2 == 0) {
				even[evenIndex] = i;
				evenIndex += 1;
				if(i%3 == 0) {
					three[threeIndex] = i;
					threeIndex += 1;
				}
				else System.out.print(i + " ");
			}else {
				odd[oddIndex] = i;
				oddIndex += 1;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for(int i: even) System.out.print(i + " ");
		System.out.println();
		for(int i: odd) System.out.print(i + " ");
		System.out.println();
		for(int i: three) System.out.print(i + " ");
	}
}
