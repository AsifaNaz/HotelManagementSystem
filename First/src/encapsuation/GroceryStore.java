package encapsuation;
import java.util.*;
class GroceryBaseReceipt{
	private Map<String,Double>prices;
	private Map<String,Integer>discounts;
	public GroceryBaseReceipt(Map<String, Double> prices, Map<String, Integer> discounts) {
		this.prices = prices;
		this.discounts = discounts;
	}
	public List<Grocery> Calculate(List<Node> shoppingList) {
		// TODO Auto-generated method stub
		return null;
	}
	public Map<String, Double> getPrices() {
		return prices;
	}
	public void setPrices(Map<String, Double> prices) {
		this.prices = prices;
	}
	public Map<String, Integer> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(Map<String, Integer> discounts) {
		this.discounts = discounts;
	}
	
}
class Grocery{
	String name;
	double price;
	double total;
	public Grocery(String name, double price, double total) {
		this.name = name;
		this.price = price;
		this.total = total;
	}
	
}
class Node{
	String fruit;
	int count;
	public Node(String fruit, int count) {
		this.fruit = fruit;
		this.count = count;
	}
	
}
class GroceryReceipts extends GroceryBaseReceipt{

	public GroceryReceipts(Map<String, Double> prices, Map<String, Integer> discounts) {
		super(prices, discounts);
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Grocery> Calculate(List<Node>shoppingList){
		Map<String,Integer> list=new TreeMap<>();
		for(Node s:shoppingList) {
			String fruit=s.fruit;
			int sum=s.count;
			if(!list.containsKey(fruit)) {
				list.put(fruit, sum);
			}else {
				list.put(fruit, list.get(fruit)+sum);
			}
		}
		List<Grocery>res=new ArrayList<>();
		for(Map.Entry<String, Integer> entry:list.entrySet()) {
			String fruit=entry.getKey();
			int sum=entry.getValue();
			double price=getPrices().get(fruit);
			double total=0;
			if(getDiscounts().containsKey(fruit)) {
				total=sum*price*(1-(double)getDiscounts().get(fruit)/100);
			}else {
				total=sum*price;
			}
			res.add(new Grocery(fruit,price,total));
		}
		return res;
	}
}

public class GroceryStore {
    public static void main(String[] args) {
        // Define prices for items
        Map<String, Double> prices = Map.of(
            "apple", 2.0,
            "banana", 1.5,
            "orange", 3.0,
            "grape", 4.0
        );

        // Define discounts for items
        Map<String, Integer> discounts = Map.of(
            "apple", 10,  // 10% discount on apples
            "banana", 5   // 5% discount on bananas
        );

        // Define the shopping list
        List<Node> shoppingList = List.of(
            new Node("apple", 3),
            new Node("banana", 2),
            new Node("apple", 2),
            new Node("orange", 1),
            new Node("grape", 4)
        );

        // Create GroceryReceipt object
        GroceryReceipts receipt = new GroceryReceipts(prices, discounts);

        // Calculate the receipt
        List<Grocery> result = receipt.Calculate(shoppingList);

        // Print the receipt
        System.out.println("Receipt:");
        for (Grocery item : result) {
            System.out.printf("%s - Price per Unit: $%.2f, Total Cost: $%.2f%n",
                              item.name, item.price, item.total);
        }
    }
}

