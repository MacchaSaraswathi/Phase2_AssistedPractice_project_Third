package Phase2.AssisstedPractice.Projects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Comments_TagsIn_Cucumber {
	 @Given("the user is on the homepage")
	    public void givenUserIsOnHomepage() {
	        // Implementation for navigating to the homepage
	        System.out.println("User is on the homepage");
	    }

	    @When("the user adds a product to the cart")
	    public void whenUserAddsProductToCart() {
	        // Implementation for adding a product to the cart
	        System.out.println("User adds a product to the cart");
	    }

	    @Then("the product should be in the shopping cart")
	    public void thenProductShouldBeInShoppingCart() {
	        // Implementation for verifying the product is in the shopping cart
	        System.out.println("Product is in the shopping cart");
	    }

	    @Given("the user has items in the shopping cart")
	    public void givenUserHasItemsInShoppingCart() {
	        // Implementation for having items in the shopping cart
	        System.out.println("User has items in the shopping cart");
	    }

	    @When("the user removes a product from the cart")
	    public void whenUserRemovesProductFromCart() {
	        // Implementation for removing a product from the cart
	        System.out.println("User removes a product from the cart");
	    }

	    @Then("the product should be removed from the shopping cart")
	    public void thenProductShouldBeRemovedFromShoppingCart() {
	        // Implementation for verifying the product is removed from the shopping cart
	        System.out.println("Product is removed from the shopping cart");
	    }
	}


