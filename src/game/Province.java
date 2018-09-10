package game;

import java.util.*;

public class Province {
	private String name;
	private ArrayList<Province> borders = new ArrayList<>();
	private int troopNums;
	private Player owner;
	
	public Province(String nme, ArrayList<Province> bordering, int army, Player owning){
		name = nme;
		borders = bordering;
		troopNums = army;
		owner = owning;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Province> getBorders() {
		return borders;
	}

	public void setBorders(ArrayList<Province> borders) {
		this.borders = borders;
	}

	public int getTroopNums() {
		return troopNums;
	}

	public void setTroopNums(int troopNums) {
		this.troopNums = troopNums;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

}
