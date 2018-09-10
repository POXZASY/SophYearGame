package game;

import java.util.Arrays;
import java.util.ArrayList;

public class Province {
	private String name;
	private ArrayList<Province> borders;
	private int troopNums;
	private Player owner;
	
	public Province(String name){
		this.name = name;
		this.troopNums = 0;
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
