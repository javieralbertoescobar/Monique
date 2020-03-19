package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngularTitleSteps {
    private final WebDriver driver = new ChromeDriver();
    private String titleTest;

    @Given("I visit monique list-product page: {string}")
    public void i_visit_monique_main_page(String url) {
        driver.get(url);
    }

    @When("I check the title main page on Google Chrome")

    public void i_check_the_title_main_page_on_Google_Chrome() {
        this.titleTest = driver.getTitle();
    }

    @Then("the title main page should be {string}\"")
    public void the_title_main_page_should_be(String title_main_page) {
        boolean result = this.titleTest.equalsIgnoreCase(new StringBuilder(title_main_page).toString());
        Assert.assertTrue(result);
        this.driver.close();
    }

}