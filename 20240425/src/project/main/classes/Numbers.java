package project.main.classes;

public class Numbers {
	private int[] numbers;
	public Numbers(int...args) {
		numbers = args;
	}
	public void forEach(project.main.interfaces.Act act) {
		for(int number : numbers) {
			act.act2(number);
		}
	}
}
