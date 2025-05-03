import java.util.*;
import java.util.stream.Collectors;

public class Task05_HandsOfCards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter players hand: ");
		String input = sc.nextLine();
		HashMap<String, List<String>> cards = new HashMap<>();
		while (!input.equals("JOKER")) {
			String[] inputHand = input.split(": ");
			String name = inputHand[0];
			String[] hand = inputHand[1].split(", ");
			cards = addToMap(name, hand, cards);
			// System.out.println(name + String.join(", ", cards.get(name)));
			System.out.println("Enter players hand: ");
			input = sc.nextLine();
		}
		printResults(cards);
	}

	public static HashMap<String, List<String>> addToMap(String name, String[] hand, HashMap<String, List<String>> cards) {
		List<String> cardsInHand = new ArrayList<>();
		List<String> oldHand = new ArrayList<>();
		for (String card : hand) {
			cardsInHand.add(card);
		}

		if (cards.containsKey(name)) {
			oldHand = cards.get(name);
			oldHand.addAll(cardsInHand);
		} else {
			cards.put(name, cardsInHand);
			return cards;
		}
		return cards;
	}

	public static void printResults(HashMap<String, List<String>> allCards) {
		for (Map.Entry<String, List<String>> entry : allCards.entrySet()) {
			String name = entry.getKey();
			List<String> cards = entry.getValue();
			List<String> uniqueCards = cards.stream().distinct().collect(Collectors.toList());
			int totalValue = 0;
			for (int i = 0; i < uniqueCards.size(); i++) {
				totalValue += valueOfCard(uniqueCards.get(i));
			}
			System.out.printf("%s: %d \r\n", name, totalValue);
		}
	}

	public static int valueOfCard(String card) {
		String power, type;
		if (card.length() == 3){
			power = "10";
			type = Character.toString(card.charAt(2));
		} else {
		power = Character.toString(card.charAt(0));
		type = Character.toString(card.charAt(1));
		}
		int valuePower = 0;
		int valueType = 0;
		switch (power) {
			case "J":
				valuePower = 11;
				break;
			case "Q":
				valuePower = 12;
				break;
			case "K":
				valuePower = 13;
				break;
			case "A":
				valuePower = 14;
				break;
			default:
				valuePower = Integer.parseInt(power);
				break;
		}
		switch (type) {
			case "S":
				valueType = 4;
				break;
			case "H":
				valueType = 3;
				break;
			case "D":
				valueType = 2;
				break;
			case "C":
				valueType = 1;
				break;
		}
		return valuePower * valueType;
	}
}
