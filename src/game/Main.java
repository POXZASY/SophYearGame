package game;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String args[]) {
		Province alaska = new Province("Alaska");
		Province northwest_territory = new Province("Northwest Territory");
		Province alberta = new Province("Alberta");
		Province greenland = new Province("Greenland");
		Province ontario = new Province("Ontario");
		Province quebec = new Province("Quebec");
		Province western_united_states = new Province("Western United States");
		Province eastern_united_states = new Province("Eastern United States");
		Province central_america = new Province("Central America");
		Province venezuela = new Province("Venezuela");
		Province brazil = new Province("Brazil");
		Province peru = new Province("Peru");
		Province argentina = new Province("Argentina");
		Province north_africa = new Province("North Africa");
		Province egypt = new Province("Egypt");
		Province east_africa = new Province("East Africa");
		Province congo = new Province("Congo");
		Province south_africa = new Province("South Africa");
		Province madagascar = new Province("Madagascar");
		alaska.setBorders(Arrays.asList(northwest_territory,alberta,kamchatka));
		northwest_territory.setBorders(Arrays.asList(alaska,greenland,alberta,ontario));
		
		
		
	}

}
