package Phase2.AssisstedPractice.Projects;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDataTables {
	 private List<Map<String, String>> items;
	    private int totalQuantity;

	    private List<Map<String, String>> productsAndPrices;
	    private int totalCost;

	    @DataTableType
	    public ItemQuantity itemQuantityEntry(Map<String, String> entry) {
	        return new ItemQuantity(entry.get("Item"), Integer.parseInt(entry.get("Quantity")));
	    }

	    @DataTableType
	    public ProductPrice productPriceEntry(Map<String, String> entry) {
	        return new ProductPrice(entry.get("Product"), Integer.parseInt(entry.get("Price")));
	    }

	    @Given("I have the following items:")
	    public void givenIHaveTheFollowingItems(List<ItemQuantity> itemQuantities) {
	        this.items = itemQuantities;
	    }

	    @When("I calculate the total quantity")
	    public void whenICalculateTotalQuantity() {
	        totalQuantity = items.stream().mapToInt(ItemQuantity::getQuantity).sum();
	    }

	    @Then("the total quantity should be {int}")
	    public void thenTotalQuantityShouldBe(int expectedTotalQuantity) {
	        assertEquals(expectedTotalQuantity, totalQuantity);
	    }

	    @Given("the following products and their prices:")
	    public void givenTheFollowingProductsAndTheirPrices(List<ProductPrice> productPrices) {
	        this.productsAndPrices = productPrices;
	    }

	    @When("I calculate the total cost")
	    public void whenICalculateTotalCost() {
	        totalCost = productsAndPrices.stream().mapToInt(ProductPrice::getPrice).sum();
	    }

	    @Then("the total cost should be {int}")
	    public void thenTotalCostShouldBe(int expectedTotalCost) {
	        assertEquals(expectedTotalCost, totalCost);
	    }

	    private static class ItemQuantity {
	        private final String item;
	        private final int quantity;

	        public ItemQuantity(String item, int quantity) {
	            this.item = item;
	            this.quantity = quantity;
	        }

	        public int getQuantity() {
	            return quantity;
	        }
	    }

	    private static class ProductPrice {
	        private final String product;
	        private final int price;

	        public ProductPrice(String product, int price) {
	            this.product = product;
	            this.price = price;
	        }

	        public int getPrice() {
	            return price;
	        }
	    }

}
