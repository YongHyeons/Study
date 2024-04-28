package project.main;

import project.main.classes.CarBuilder;

public class MainApp {
	public static void main(String[] args) {
		// 생성자의 단점 -> 동일한 자료형은 구분이 힘들다, 무엇을 넣고 빼는지 선택이 힘들다
		// 빌더 패턴
		
//		UnitBuilder builder = new UnitBuilder();
//		Unit a = builder.hp(50).name("유닛").build();
//		Unit b = builder.name("이름").build();
//		
		// 조립 패턴 -> 여러개의 빌더 패턴을 혼합한 빌더 패턴
		
		CarBuilder builder = new CarBuilder();
//		builder
//			.name("아반떼")
//			.wheel()
//				.name("금호타이어")
//				.owner()
//			.name("포르셰")
//			.build();
//		builder.wheel().name("넥센").owner().build();
		
		
//		System.out.println(builder.name);
//		System.out.println(builder.wheel().name);
//		System.out.println(builder.name("아반떼").name);
//		System.out.println(builder.name);
		
		builder
			.name("아반떼")
			.wheel()
				.name("금호타이어")
				.owner()
			.glass()
				.bulletproof(true)
				.owner()
			.sheet()
				.leather(true)
				.owner()
			.build();
		
		builder.glass().bulletproof(false);
		builder.sheet().leather(false);
		System.out.println("차종 : " + builder.name);
		System.out.println("휠 브랜드 : " + builder.wheel().name);
		System.out.println("방탄 유리 유무 : " + (builder.glass().bulletproof_Glass ? "O" : "X"));
		System.out.println("가죽 시트 유무 : " + (builder.sheet().leather_Sheet ? "O" : "X"));
		
		/*
		 * 자동차 조립패턴으로 생성
		 * 자동차는 휠, 이름, 유리, 시트
		 * 휠은 제조사명
		 * 유리는 방탄유리 여부
		 * 시트는 가죽 여부
		 * 자동차를 내 입력으로 생성한 후 출력하는 프로그램
		 */
	}
}
