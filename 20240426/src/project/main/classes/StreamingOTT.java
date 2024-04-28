package project.main.classes;

import project.main.classes.exception.DoNotExitStreamingException;
import project.main.classes.exception.TurnOffStreamingException;

public class StreamingOTT implements AutoCloseable{
	private String targetVideo;
	private boolean on;
	public StreamingOTT() { on = false; }
	
	public void On() { on = true; }
	public void Off() { on = false; }
	
	@Override
	public void close() throws DoNotExitStreamingException{
		Off();
		Exit();
	}
	public void Watch(String targetVideo) throws TurnOffStreamingException{
		if(!on) throw new TurnOffStreamingException();
		this.targetVideo = targetVideo;
	}
	
	public void Run() {
		System.out.println(targetVideo.concat(" is watching..."));
	}
	
	public  void Exit() throws DoNotExitStreamingException{
		if(on) throw new DoNotExitStreamingException();
		System.out.println("Streaming OTT Service Exit!");
	}
}
