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
		
		
		

		Province south_africa = new Province("South_Africa");
		Province madagascar = new Province("Madagascar");
		Province middle_east = new Province("Middle East");
		Province afghanistan = new Province("Afghanistan");
		Province ural = new Province("Ural");
		Province siberia = new Province("Siberia");
		Province yakutsk = new Province("Yakutsk");
		Province Kamchatka = new Province("Kamchatka");
		Province irkutsk = new Province("Irkutsk");
		Province mongolia = new Province("Mongola");
		Province japan = new Province("Japan");
		Province china = new Province("China");
		Province india = new Province("India");
		Province siam = new Province("Siam");
		Province indonesia = new Province("Indonesia");
		Province new_guinea = new Province("New Guinea");
		Province western_australia = new Province("Western Australia");
		Province eastern_australia = new Province("Eastern Australia");

	}

}
