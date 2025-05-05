import java.util.*;

public class Task10_CitiesByContinentAndCountry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, LinkedHashSet<String>> listOfCountries = new LinkedHashMap<>();
		Map<String, LinkedHashSet<String>> listOfCities = new LinkedHashMap<>();
		System.out.println("Enter number of entries: ");
		int numberOfEntries = Integer.parseInt(sc.nextLine());
		System.out.println("Enter cities information: ");
		for (int i = 0; i < numberOfEntries; i++) {
			String[] input = sc.nextLine().split(" ");
			String continent = input[0];
			String country = input[1];
			String city = input[2];
			if (listOfCountries.containsKey(continent)){
				LinkedHashSet<String> currentCountries = listOfCountries.get(continent);
				currentCountries.add(country);
				listOfCountries.put(continent, currentCountries);
			} else {
				LinkedHashSet<String> currentCountries = new LinkedHashSet<>();
				currentCountries.add(country);
				listOfCountries.put(continent, currentCountries);
			}

			if (listOfCities.containsKey(country)){
				LinkedHashSet<String> currentCities = listOfCities.get(country);
				currentCities.add(city);
				listOfCities.put(country, currentCities);
			} else {
				LinkedHashSet<String> currentCities = new LinkedHashSet<>();
				currentCities.add(city);
				listOfCities.put(country, currentCities);
			}
		}

		for (Map.Entry<String, LinkedHashSet<String>> countries : listOfCountries.entrySet()){
			String continent = countries.getKey();
			LinkedHashSet<String> listOfCurrentCities = listOfCountries.get(continent);
			System.out.println(continent + ":");
			for (String city : listOfCurrentCities){
				LinkedHashSet<String> listOfCitiesInCountry = listOfCities.get(city);
				System.out.println(" " + city + " -> "+ String.join(", ", listOfCitiesInCountry.stream().toList()));
			}
		}
	}
}
