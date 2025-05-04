import java.util.*;

public class Task06_PopulationCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, Long> countryPopulation = new LinkedHashMap<>();
		LinkedHashMap<String, LinkedHashMap<String, Long>> totalPopulation = new LinkedHashMap<>();
		System.out.println("Enter city information: ");
		String input = sc.nextLine();
		while(!input.equals("report")){
			String[] cityInformation = input.split("\\|");
			String cityName = cityInformation[0];
			String countryName = cityInformation[1];
			long population = Long.parseLong(cityInformation[2]);
			LinkedHashMap<String, Long> cityPopulation = new LinkedHashMap<>();
			if(countryPopulation.containsKey(countryName)){
				long currentPopulation = countryPopulation.get(countryName);
				countryPopulation.put(countryName, currentPopulation + population);
				cityPopulation = totalPopulation.get(countryName);
				cityPopulation.put(cityName, population);
				totalPopulation.put(countryName, cityPopulation);
			} else {
				countryPopulation.put(countryName, population);
				cityPopulation.put(cityName, population);
				totalPopulation.put(countryName, cityPopulation);
			}
			System.out.println("Enter city information: ");
			input = sc.nextLine();
		}
/*
		TreeMap<Long, String> orderedCountires = new TreeMap<>(Collections.reverseOrder());
		for (Map.Entry<String, Long> country : countryPopulation.entrySet()){
			orderedCountires.put(country.getValue(), country.getKey());
		}
*/

			totalPopulation.entrySet().stream().sorted(
					(a, b) -> {
					long populationA = countryPopulation.get(a.getKey());
					long populationB = countryPopulation.get(b.getKey());
					return Long.compare(populationB, populationA);
					}).forEach( countryEntry -> {
				String country = countryEntry.getKey();
				System.out.printf("%s (total population: %d)%n", country, countryPopulation.get(country));

				countryEntry.getValue().entrySet().stream().sorted(
						(a,b) -> {
							long populationA = a.getValue();
							long populationB = b.getValue();
							return Long.compare(populationB, populationA);
						}).forEach(cityEntry -> {
							String city = cityEntry.getKey();
							long population = cityEntry.getValue();
					System.out.printf("=> %s: %d%n", city, population);
				});


			});

	}
}
