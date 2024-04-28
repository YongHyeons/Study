package project.main;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요. ( - 는 생략)");
		
		long regist = scan.nextLong();	// 주민등록번호 입력을 받기위한 변수
		String regist_size = regist + "";	// 주민등록번호 자릿수 확인을 위한 String 변수
		int first, last;	// 주민등록번호 뒷자리와 앞자리 구분
		int year,month,day;	// 생년월일 저장을 위한 변수
		int area_num = 0;	// 지역 구분 번호
		boolean nationality = true;	// 내국인 또는 외국인 여부
		
		first = (int)(regist / 10000000L);
		last = (int)(regist % 10000000L);
		month = (first % 10000) / 100;
		day = first % 100;
		
		if(regist_size.length() > 13) {	// 주민등록번호 입력 오류
			System.out.println(regist);
			System.out.println("잘못 입력하였습니다.");
		}
		else if(month > 12 || month == 0 || day > 31 || day == 0) System.out.println(first + "-*******");	// 생년월일 오류
		else {
			year = (first/10000);
			switch(last/1000000) {	// 주민등록번호 뒤 7자리중 첫번째 자리를 구해 몇 년생인지 확인
				case 1 : 
				case 2 : 
				case 5 : 
				case 6 : year += 1900; break;
				case 3 : 
				case 4 : 
				case 7 : 
				case 8 : year += 2000; break;
				case 9 : 
				case 0 : year += 1800; break;
			}
			
			if((last/1000000) > 4 && (last/1000000) < 9) nationality = false;	// 내국인, 외국인 여부 확인
			
			System.out.print(year + "년 ");
			System.out.print(month + "월 ");
			System.out.print(day + "일 / ");
			System.out.print(((last/1000000)%2 == 1 ? "남" : "여") + " / ");
			System.out.print((nationality == true ? "내국인" : "외국인" ) + " / ");
			System.out.print((2024-year+1) + "세 / ");
			
			switch(year % 12) {	// 띠 출력
				case 0 : System.out.print("원숭이"); break;
				case 1 : System.out.print("닭"); break;
				case 2 : System.out.print("개"); break;
				case 3 : System.out.print("돼지"); break;
				case 4 : System.out.print("쥐"); break;
				case 5 : System.out.print("소"); break;
				case 6 : System.out.print("호랑이"); break;
				case 7 : System.out.print("토끼"); break;
				case 8 : System.out.print("용"); break;
				case 9 : System.out.print("뱀"); break;
				case 10 : System.out.print("말"); break;
				case 11 : System.out.print("양"); break;
			}
			
			System.out.print("띠 / ");
			
			area_num = (last % 1000000) / 10000;	// 주민등록번호에 등록된 지역번호를 통해 지역확인
			if(area_num >= 0 && area_num <= 8) System.out.print("서울특별시");
			else if(area_num >= 9 && area_num <= 12 ) System.out.print("부산광역시");
			else if(area_num == 14 || area_num == 15 ) System.out.print("인천광역시");
			else if(area_num >= 16 && area_num <= 25 ) System.out.print("경기도");
			else if(area_num >= 26 && area_num <= 34 ) System.out.print("강원특별자치도");
			else if(area_num >= 35 && area_num <= 39 ) System.out.print("충청북도");
			else if(area_num == 40 || area_num == 41 ) System.out.print("대전광역시");
			else if(area_num == 44 || area_num == 96 ) System.out.print("세종특별자치시");
			else if(area_num >= 42 && area_num <= 47 ) System.out.print("충청남도");
			else if(area_num >= 48 && area_num <= 54 ) System.out.print("전북특별자치도");
			else if(area_num == 55 || area_num == 56 || area_num == 65 || area_num == 66) System.out.print("광주광역시");
			else if(area_num >= 55 && area_num <= 64 ) System.out.print("전라남도");
			else if(area_num >= 67 && area_num <= 69 || area_num == 76 || area_num == 77 ) System.out.print("대구광역시");
			else if(area_num >= 70 && area_num <= 81 ) System.out.print("경상북도");
			else if(area_num == 85 || area_num == 90 ) System.out.print("울산광역시");
			else if(area_num >= 82 && area_num <= 93 ) System.out.print("경상남도");
			else if(area_num >= 93 && area_num <= 95 ) System.out.print("서귀포시");
			else System.out.print("알수없음");
			
		}
		scan.close();
	}
}
