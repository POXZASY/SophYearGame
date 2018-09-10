package game;

public class Player {
	String name;
	int playernum;
	int numoftroops;
	public Player(String a_name, int a_num, int troopnum){
		this.name=a_name;
		this.playernum=a_num;
		this.numoftroops=troopnum;
	}
	public String getName(){
		return name;
	}
	public int getPlayerNum(){
		return playernum;
	}
	public int getNumOfTroops(){
		return numoftroops;
	}
	public void addTroops(int adder){
		numoftroops=numoftroops+adder;
	}
}


