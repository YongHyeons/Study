package project.main.classes;

public enum Calculator implements Calc{
	PLUS("+"){
		@Override
		public double apply(double first, double second) {
			return first + second;
		}
	},
	MINUS("-"){
		@Override
		public double apply(double first, double second) {
			return first - second;
		}
	},
	MULTIPLY("*"){
		@Override
		public double apply(double first, double second) {
			return first * second;
		}
	},
	DEVIDE("/"){
		@Override
		public double apply(double first, double second) {
			return first / second;
		}
	}
	;
	private final String operator;
	Calculator(String operator){ this.operator = operator; }
	public String get() { return operator; }
}
