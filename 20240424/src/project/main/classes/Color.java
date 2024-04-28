package project.main.classes;

// enum은 클래스를 자동으로 만들어주는 형식
// enum을 가공할 수 있는 특수한 방법 -> enum 수동 작성 기법

// enum 수동 작성 기법을 쓰면
// enum 이름 작성법이 달라진다

public enum Color implements ColorChanger{
	RED("빨간색"){
		@Override
		public String Change() {
			return "255,0,0";
		}
	},
	BLUE("파란색"){
		@Override
		public String Change() {
			return "0,255,255";
		}
	};
	private final String data;
	Color(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}


//	RED,
//	BLUE,
//	GREEN,
//	A,
//	B,
//	C,
//	D
}
