package project.main;

// 자바 프로젝트의 구조
// 자바 프로젝트는 기본적으로 루트 폴더라는것이 존재
// 자바에서는 어느정도 완성된 패키지는 외부로 추출하는 방법이 존재 -> export
// export란 단순하게 패키지만 외부로 추출하는게 아니라
// 내가 어떤 목적을 가지고 완성한 폴더의 묶음을 외부로 추출하는 기능

// 실행용(Runnable)이 아닌 패키지 구분용 자바 아카이브
// 추출용 아카이브(또는 모든) 패키지는 공통되어야 한다
// project.main
// project.main.classes
// 패키지 명칭을 역순으로 적는다
// 웹사이트명을 많이 이용
// hostname/subpath/subpath
// sub.sub.main.org(or com)
// pickup.kafolio.kr -> kr.kafolio.pickup

// 외부 라이브러리 -> 미리 만들어군 코드 집합
// 이미 누군가가 만들어둔것중에 이러한 편리한것들이 많이 존재할것이다

// 패키지 정리
// java.lang
// 자동 생략이 가능한 패키지명
// java language -> 자바 언어에서 많이 이용되는것들을 모아놓은 폴더
// System -> 운영체제 클래스

// java.text -> 글자관련해서 기능
// java.util -> 유틸리티 기능(Random, Scanner ... etc)
// java.util.regex -> regex(정규표현식) 기능
// 정규 표현식 이용시 글자를 다른 방식으로 표현이 가능

// 정규 표현식 사용시 2가지 방법 -> String 이용, Pattern 이용

import org.archive.main.Compare;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainApp {

	public static void main(String[] args) {

		System.out.println(Compare.isRegist("551235-123456"));
		System.out.println(Compare.isRegist("551235-1234567"));
		

		System.out.println(Compare.isPhone("02-123-1234"));
		System.out.println(Compare.isPhone("031-123-1234"));
		System.out.println(Compare.isPhone("010-1234-1234"));
		System.out.println(Compare.isPhone("+8210-1234-1234"));
		
		System.out.println(Compare.RegistToDate("951225-1123456").toLocaleString());
		
		// 정규표현식은 글자를 특수문자의 조합으로 표현하는 방식
		
//		String temp1 = "ABCD", temp2 = "ABBD", email="ABCD@naver.com";

		// 1. 글자는 그대로 글자 1개
//		System.out.println(temp1.matches("ABCD"));
//		System.out.println(temp2.matches("ABCD"));

		// 2. [] 대괄호 안에 적은 글자들은 or -> 해당하는 글자중 한개라는 의미
//		System.out.println(temp1.matches("AB[BC]D"));
//		System.out.println(temp2.matches("AB[BC]D"));
		
		// 3. [^] 대괄호 안에 첫번째 글자로 ^를 적으면 not(or) -> 해당하는 글자를 제외한
//		System.out.println(temp1.matches("AB[^AB]D"));
//		System.out.println(temp2.matches("AB[^AB]D"));
		
		// 4. ^ 가 맨 앞에 적히면 해당하는 위치부터 글자가 시작
//		System.out.println(temp1.matches("^B[BC]D"));
//		System.out.println(temp2.matches("B[BC]D"));
//		System.out.println(temp1.replaceAll("^B[BC]D", "REPLACE"));
		
		// 5. $ 가 맨 뒤에 적히면 해당하는 위치까지 글자가 존재
//		System.out.println(temp1.replaceAll("AB[BC]D$", "REPLACE"));
//		System.out.println(temp1.replaceAll("AB[BC]$", "REPLACE"));
		
		// 6. . 아무글자나 1글자
		// java에서는 \ -> \\
//		System.out.println(temp1.matches("...\\."));
//		System.out.println(temp2.matches("...."));
		
		// 7. 수량제한
		// ? -> 0 또는 1개
		// * -> 0 또는 n개
		// + -> 1 또는 n개
//		System.out.println(temp1.matches(".*"));
//		System.out.println(temp2.matches("AB+D"));
//		// {숫자} -> 해당 개수
//		// {최소,최대}
//		// {최소,} -> 최소개수 이상 
//		System.out.println(temp1.matches(".{2,3}"));
//		System.out.println(temp2.matches(".{3,4}"));
		
//		System.out.println(email.matches(".*@.*.com"));
		// [ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefg]
		
		// 8. 범위 지정
		// a-zA-Z0-9 -> 해당하는 범위의 글자
		
		// 9. 특수 토큰
		// \w, \W, \d, \D
		// \d -> decimal -> [0-9]
		// \D -> decimal -> [^0-9]
//		System.out.println(temp1.matches("\\d{4}"));
//		System.out.println(temp2.matches("\\D{4}"));
		// \w -> write character -> [a-zA-Z0-9_]
		// \W -> write character -> [^a-zA-Z0-9_] 
//		System.out.println(temp1.matches("\\w{4}"));
//		System.out.println(temp2.matches("\\W{4}"));
		
		// ^\d*$ -> 전체 숫자인지
		// ^\w*$ -> 전체 네이밍 룰을 지키는지
		// ^[01]{3}-\d{4}-\d{4}$
		
		// 10. | 는 또는
//		System.out.println(temp1.matches("ABCD|ABBD"));
//		System.out.println(temp2.matches("ABCD|ABBD"));
		//[AB] -> A | B
		
		// 11. () 는 서브 정규표현식 -> 그룹
//		System.out.println(temp1.matches("AB(B|C)D")); // -> ABBD|ABCD
//		System.out.println(temp2.matches("AB(B|C)D"));

		
		// Pattern을 이용하기위해선 -> Pattern과 Matcher
		// Pattern.matches("AB(B|C)D", "ABCD");
//		Pattern pattern = Pattern.compile("\\d(\\d)\\d");
//		// matches -> 전체 검사 -> false
//		
//		Matcher matcher = pattern.matcher("0123456789");
//		// Matcher.matches -> 규칙대로 문자열을 비교했을때의 결과
//		// Matcher.group -> Matcher.find와 함께 이용
//		// Matcher.find(); 이후 Matcher.group();
//		// find -> 부분검사 -> 일치하는 부분을 찾아라
//		while(matcher.find()) {
//			// group에 0 또는 없으면 전체
//			// 1번 이후 숫자는 그룹화한 번호()
//			System.out.println(matcher.group());
//			System.out.println(matcher.group(1));
//		}
		
		// 주민번호 검사
//		Pattern pattern = Pattern.compile("^(\\d{2})(\\d{2})(\\d{2})-(\\d)\\d{6}$");
//		Matcher matcher = pattern.matcher("850520-1123456");
//		while(matcher.find()) {
//			System.out.println(matcher.group());
//			int gender = Integer.parseInt(matcher.group(4));
//			int year = (gender == 3 || gender == 4 || gender == 7 || gender == 8? 2000 : 1900) +
//					Integer.parseInt(matcher.group(1));
//			int month = Integer.parseInt(matcher.group(2));
//			int day = Integer.parseInt(matcher.group(3));
//			if(month > 12) break;
//			if(day > 31) break;
//			System.out.print(year);
//			System.out.print("년 ");
//			System.out.print(month);
//			System.out.print("월 ");
//			System.out.print(day);
//			System.out.print("일 ");
//			System.out.println(gender % 2 == 0 ? "여성" : "남성");
//		}
		
//		try(Scanner scan = new Scanner(System.in);){
//			String input = scan.next();
//			if(input.matches("^(\\+\\d{2,3})?\\d{2,3}-?\\d{3,4}-?\\d{4}$")) {
//				System.out.println("전화번호 : ".concat(input));
//			}
//			else {
//				System.out.println("잘못된 입력 : ".concat(input));				
//			}
//			
//		}catch(Exception e) {}
		
		// 배열 복사
		// 시간도 획득 가능
//		System.gc();
//		System.exit(0); // 종료
//		System.currentTimeMillis(); System.nanoTime();
//		System.out.println(System.getProperties().toString());
		//System.getProperties(); // 운영체제 속성
//		System.getenv(); // 환경 변수
//		System.arraycopy(args, 0, args, 0, 0);
//		java.lang.System.out.println("java.lang");
//		Book a = new Book("어린왕자", "생텍쥐베리");
//		a.Show();
	}

}























