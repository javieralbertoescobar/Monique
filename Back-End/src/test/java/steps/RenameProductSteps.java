package steps;

import Application.Model.Product;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class RenameProductSteps {
    private  Product product = new Product();
    private String input_name;

    @Given("I want to change the name of a product to {string}")
    public void i_want_to_change_the_name_from_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.input_name = string;
    }

    @When("I enter the name {string} in the system")
    public void i_enter_the_name_in_the_system(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.product.setName(string);
    }

    @Then("the name of the product should be {string}")
    public void the_name_of_the_product_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(this.product.getName().equalsIgnoreCase(this.input_name));
    }
}