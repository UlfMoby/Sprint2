package projektArbete;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreSteps {
	Store storeTest = new Store();

	@Given("^Environment is up and running$")
	public void environment_is_up_and_running() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
	}

	@When("^Learn that \"([^\"]*)\" should answer with \"([^\"]*)\"$")
	public void learn_should_answer_with(String arg1, String arg2) throws Throwable {
		storeTest.learnResponse(arg1, arg2);
	}

	@Then("^The Response of \"([^\"]*)\" should answers with \"([^\"]*)\"$")
	public void should_answers_with(String arg1, String arg2) throws Throwable {
		assertEquals(arg2, storeTest.getResponse(arg1));
	}
	
	@When("^Learn that request test should answer with Yes$")
	public void learn_that_request_test_should_answer_with_Yes() throws Throwable {
		storeTest.learnResponse("test", "Yes");
	}

	@When("^Unlearn the request$")
	public void unlearn_the_request() throws Throwable {
	    storeTest.unlearnAll();
	}

	@Then("^The Response of Test should answers with null$")
	public void the_Response_of_Test_should_answers_with_null() throws Throwable {
		assertEquals(null, storeTest.getResponse("test"));
	}

}
