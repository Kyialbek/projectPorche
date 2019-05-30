package interfaceExample;

import java.util.List;

public abstract class phone implements faceOfRecognition, memory {
	
	abstract void hi();
	
	List contacList ;
	public String name;
	public String model;
	public int memory;
	
	public abstract void lock();
	public abstract void call(long number);
    public abstract void text();
	public abstract void takePicture();

}
