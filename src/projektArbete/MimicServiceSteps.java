package projektArbete;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MimicServiceSteps {
	
	private final static String host="http://localhost:8080/"; 
	private HttpServiceCaller service;
	
	private String result = "";

	/**
	 * Check that Calculatur.jar is running by testing to get a response from localhost:1235/operators
	 * @throws Throwable
	 */
	@Given("^Environment is up and running$")
	public void environment_is_up_and_running() throws Throwable {
		//service=new HttpServiceCaller();
		//String request=host+"operators";
		//result = service.executeGetRequest(request);
		//assertEquals("add, sub, mult, div", result);

	    
	}
	// ([^\"\"]*)
	@When("^Learn that \"([^\"]*)\" should answer with \"([^\"]*)\"$")
	public void learn_should_answer_with(String arg1, String arg2) throws Throwable {
		service=new HttpServiceCaller();
		String request=host+"LearnNextResponse?text="+arg2;
		service.executeGetRequest(request);
		String request2=host+arg1;
		service.executeGetRequest(request2);
		
	}

	@Then("^The Response of \"([^\"]*)\" should answers with \"([^\"]*)\"$")
	public void should_answers_with(String arg1, String arg2) throws Throwable {
		service=new HttpServiceCaller();
		String request=host+arg1;
		result = service.executeGetRequest(request);
		assertTrue(result.equals(arg2));
	}
	
	@When("^Learn that request test should answer with Yes$")
	public void learn_that_request_test_should_answer_with_Yes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^Unlearn the request$")
	public void unlearn_the_request() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^The Response of Test should answers with null$")
	public void the_Response_of_Test_should_answers_with_null() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
