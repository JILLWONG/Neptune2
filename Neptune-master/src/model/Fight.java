package model;

import java.util.ArrayList;

public class Fight {
	/** ��ͼ*/
	private int[][] map;
	/** ��ͼ��*/
	private int mapLength;
	/** ��ͼ��*/
	private int mapWidth;
	/** ���*/
	private Player player;
	/** �����б�*/
	private ArrayList<Enemy> EnemyList;
	/** ����ӵ�*/
	private final int pBullet=11;
	/** �����ӵ�*/
	private final int eBullet=21;
	/** ��ұ�־*/
	private final int playerFlag=1;
	/** ���˱�־*/
	private final int enemyFlag=2;
	/** ��������*/
	private int enemyCount;
	
	public Fight(int mLength,int mWidth) {
		this.setMapLength(mLength);
		this.setMapWidth(mWidth);
		this.setMap();
		ArrayList<Enemy> enemyList=new ArrayList<Enemy>();
		for(int i=0;i<5;i++) {
			enemyList.add(new Enemy(0, 0, 100, 10, 10, 10, 5,3));
		}
		this.setEnemyList(enemyList);
	}

	public int[][] getMap() {
		return map;
	}

	public void setMap() {
		this.map =new int[this.mapLength][this.mapWidth];
	}

	public int getMapLength() {
		return mapLength;
	}

	public void setMapLength(int mapLength) {
		this.mapLength = mapLength;
	}

	public int getMapWidth() {
		return mapWidth;
	}

	public void setMapWidth(int mapWidth) {
		this.mapWidth = mapWidth;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public ArrayList<Enemy> getEnemyList() {
		return EnemyList;
	}

	public void setEnemyList(ArrayList<Enemy> enemyList) {
		EnemyList = enemyList;
	}

	public int getEnemyCount() {
		return enemyCount;
	}

	public void setEnemyCount(int enemyCount) {
		this.enemyCount = enemyCount;
	}

	public int getpBullet() {
		return pBullet;
	}

	public int geteBullet() {
		return eBullet;
	}

	public int getPlayerFlag() {
		return playerFlag;
	}

	public int getEnemyFlag() {
		return enemyFlag;
	}
	
	
}
