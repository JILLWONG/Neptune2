package model;

public class Bullet {
	/** λ��x*/
	private int x;
	/** λ��y*/
	private int y;
	/** ����*/
	private int span;
	
	public Bullet(int x,int y,int span) {
		this.setX(x);
		this.setY(y);
		this.setSpan(span);
	}
	public void bMove(int span) {
		int y=this.getY()+span;
		this.setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSpan() {
		return span;
	}
	public void setSpan(int span) {
		this.span = span;
	}
}
