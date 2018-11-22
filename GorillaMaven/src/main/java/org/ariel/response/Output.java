package org.ariel.response;
import java.util.ArrayList;
import java.util.List;

public class Output {
	
	private List<Video> output = new ArrayList<Video>();
	
	public Output(){
		
	}
	
	public Output(List<Video> output) {
		super();
		this.output = output;
	}

	public List<Video> getOutput() {
		return output;
	}

	public void setOutput(List<Video> output) {
		this.output = output;
	}
	
}
