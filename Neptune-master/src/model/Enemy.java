package model;

public class Enemy {
	/** ����ֵ*/
	private int hp;
	/** ʳ����*/
	private int food;
	/** ˮ*/
	private int water;
	/** ��Ǯ*/
	private int money;
	/** λ��x*/
	private int x;
	/** λ��y*/
	private int y;
	/** ����*/
	private int span;
	/** ������*/
	private int attack;
	
	public Enemy(int x,int y,int hp,int food,int water, int money,int attack,int span) {
		this.setX(x);
		this.setY(y);
		this.setAttack(attack);
		this.setFood(food);
		this.setHp(hp);
		this.setMoney(money);
		this.setSpan(span);
	}
	
	public void eMove(){
		
		
	}
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
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
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getSpan() {
		return span;
	}

	public void setSpan(int span) {
		this.span = span;
	}
	
	
}
