package game;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String args[]) {

		// North America
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

		//Africa
		Province north_africa = new Province("North Africa");
		Province egypt = new Province("Egypt");
		Province east_africa = new Province("East Africa");
		Province congo = new Province("Congo");
		Province south_africa = new Province("South Africa");
		Province madagascar = new Province("Madagascar");
		
		//Europe
		Province great_britain = new Province("Great Britian");
		Province iceland = new Province("Ice Land");
		Province western_europe = new Province("Western Europe");
		Province northern_europe = new Province("Northern Europe");
		Province southern_europe = new Province("Southern Europe");
		Province scandinavia = new Province("Scandinavia");
		Province ukraine = new Province("Ukraine");
		
		//Asia
		Province middle_east = new Province("Middle East");
		Province afghanistan = new Province("Afghanistan");
		Province ural = new Province("Ural");
		Province siberia = new Province("Siberia");
		Province yakutsk = new Province("Yakutsk");
		Province kamchatka = new Province("Kamchatka");
		Province irkutsk = new Province("Irkutsk");
		Province mongolia = new Province("Mongola");
		Province japan = new Province("Japan");
		Province china = new Province("China");
		Province india = new Province("India");
		Province siam = new Province("Siam");
		
		//Oceania
		Province indonesia = new Province("Indonesia");
		Province new_guinea = new Province("New Guinea");
		Province western_australia = new Province("Western Australia");
		Province eastern_australia = new Province("Eastern Australia");
		
		//Borders

			//North America
		alaska.setBorders(new ArrayList<>(Arrays.asList(kamchatka, northwest_territory, alberta)));
		northwest_territory.setBorders(new ArrayList<>(Arrays.asList(alaska,greenland,alberta,ontario)));
		alberta.setBorders(new ArrayList<>(Arrays.asList(alaska, northwest_territory,ontario,western_united_states)));
		greenland.setBorders(new ArrayList<>(Arrays.asList(northwest_territory, ontario, quebec)));
		ontario.setBorders(new ArrayList<>(Arrays.asList(northwest_territory, greenland, alberta, quebec, western_united_states,eastern_united_states)));
		quebec.setBorders(new ArrayList<>(Arrays.asList(greenland, ontario, eastern_united_states)));
		western_united_states.setBorders(new ArrayList<>(Arrays.asList(alberta, ontario, eastern_united_states, central_america)));
		eastern_united_states.setBorders(new ArrayList<>(Arrays.asList(quebec, ontario, western_united_states, central_america)));
		central_america.setBorders(new ArrayList<>(Arrays.asList(western_united_states, eastern_united_states, venezuela)));
			//South America
		venezuela.setBorders(new ArrayList<>(Arrays.asList(central_america, brazil, peru)));
		peru.setBorders(new ArrayList<>(Arrays.asList(venezuela, brazil, argentina)));
		brazil.setBorders(new ArrayList<>(Arrays.asList(venezuela, peru, argentina, north_africa)));
		argentina.setBorders(new ArrayList<>(Arrays.asList(peru, brazil)));
		north_africa.setBorders(new ArrayList<>(Arrays.asList(brazil, egypt, western_europe, southern_europe, east_africa, congo)));
		egypt.setBorders(new ArrayList<>(Arrays.asList(north_africa, southern_europe, middle_east, east_africa)));
		east_africa.setBorders(new ArrayList<>(Arrays.asList(north_africa, egypt, middle_east,congo,south_africa, madagascar)));
		congo.setBorders(new ArrayList<>(Arrays.asList(north_africa, east_africa, south_africa)));
		south_africa.setBorders(new ArrayList<>(Arrays.asList(congo, east_africa, madagascar)));
		madagascar.setBorders(new ArrayList<>(Arrays.asList(south_africa, east_africa)));
			//Asia
		siberia.setBorders(new ArrayList<>(Arrays.asList(ural, china, mongolia, irkutsk, yakutsk)));
		ural.setBorders(new ArrayList<>(Arrays.asList(ukraine, afghanistan, china, siberia)));
		yakutsk.setBorders(new ArrayList<>(Arrays.asList(siberia, irkutsk, kamchatka)));
		kamchatka.setBorders(new ArrayList<>(Arrays.asList(yakutsk, irkutsk, mongolia, japan)));
		irkutsk.setBorders(new ArrayList<>(Arrays.asList(siberia, yakutsk, kamchatka, mongolia)));
		mongolia.setBorders(new ArrayList<>(Arrays.asList(irkutsk, kamchatka, japan, china, siberia)));
		china.setBorders(new ArrayList<>(Arrays.asList(afghanistan, ural, siberia, mongolia, india, siam)));
		middle_east.setBorders(new ArrayList<>(Arrays.asList(ukraine, southern_europe, egypt, east_africa, india, afghanistan)));
		india.setBorders(new ArrayList<>(Arrays.asList(middle_east, afghanistan, china, siam)));
		siam.setBorders(new ArrayList<>(Arrays.asList(india, china, indonesia)));

			//Europe
		iceland.setBorders((new ArrayList<>(Arrays.asList(great_britain, greenland, scandinavia))));
		great_britain.setBorders((new ArrayList<>(Arrays.asList(iceland, northern_europe, western_europe, scandinavia))));
		scandinavia.setBorders((new ArrayList<>(Arrays.asList(great_britain,iceland,northern_europe, ukraine))));
		western_europe.setBorders((new ArrayList<>(Arrays.asList(great_britain, northern_europe, southern_europe, north_africa))));
		northern_europe.setBorders((new ArrayList<>(Arrays.asList(great_britain, western_europe, scandinavia, southern_europe, ukraine))));
		southern_europe.setBorders((new ArrayList<>(Arrays.asList(western_europe, north_africa, egypt, middle_east, ukraine, northern_europe))));
		ukraine.setBorders((new ArrayList<>(Arrays.asList(northern_europe, southern_europe, middle_east, afghanistan, ural, scandinavia))));
		
			//Oceania
		indonesia.setBorders((new ArrayList<>(Arrays.asList(siam, new_guinea, western_australia))));
		new_guinea.setBorders((new ArrayList<>(Arrays.asList(indonesia, western_australia, eastern_australia))));
		western_australia.setBorders((new ArrayList<>(Arrays.asList(indonesia, eastern_australia, new_guinea))));
		eastern_australia.setBorders((new ArrayList<>(Arrays.asList(western_australia, new_guinea))));

		
	}

}
