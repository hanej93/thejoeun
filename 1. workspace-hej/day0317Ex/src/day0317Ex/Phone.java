package day0317Ex;

public abstract class Phone {
	
	protected String owner;
	protected String target;
	
	
	public String getOwner() {
		return owner;
	}
	
	public abstract void call();
	
	@Override
	public String toString() {
		return "주인: " + owner +" , 타겟: " + target;
	}
	
}
