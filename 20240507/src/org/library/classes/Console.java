package org.library.classes;

public class Console {
	
	private Runnable run = ()->{};
	public Boolean isClose = false;
	
	public void setRun(Runnable run) {
		this.run = run;
	}
	
	public void Run() {
		run.run();
	}
}
