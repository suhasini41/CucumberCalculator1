package calculator1;

import java.util.List;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition 
{
	int a1,a2,a3,a4,a5,a6;
	@Given("^six numbers to add$")
	public void six_numbers_to_add(DataTable table) throws Throwable {
	    List<List<String>> list = table.raw();
	    a1 =Integer.parseInt(list.get(0).get(0));
	    a2 =Integer.parseInt(list.get(0).get(1));
	    a3 =Integer.parseInt(list.get(0).get(2));
	    a4 =Integer.parseInt(list.get(0).get(3));
	    a5 =Integer.parseInt(list.get(0).get(4));
	    a6 =Integer.parseInt(list.get(0).get(5));
	}

	int sum;
	@When("^added$")
	public void added() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sum = a1 + a2 + a3 + a4 + a5 + a6;
	}

	@Then("^the sum is (\\d+)$")
	public void the_answer_is(int expectedSum) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the sum of "+a1+" , "+a2+" , "+a3+" , "+a4+" , "+a5+" , "+a6+" is "+sum);
	   Assert.assertEquals(sum, expectedSum);
	}

	int s1,s2;
	@Given("^any two (\\d+) and (\\d+)$")
	public void any_two_and(int param1, int param2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    s1 = param1;
	    s2 = param2;
	}

	int difference;
	@When("^they are subtracted$")
	public void they_are_subtracted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   difference = s1 - s2;
	}

	@Then("^the difference is (\\d+)$")
	public void the_answer_is_diffrence(int expectedDifference) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the difference of "+s1+" and "+s2+" is "+difference);
	   Assert.assertEquals(difference, expectedDifference);
	}

	int m1,m2,m3,m4;
	@Given("^four numbers to multiply$")
	public void four_numbers_to_multiply(DataTable table) throws Throwable {
	   List<List<String>> list = table.raw();
	   m1 = Integer.parseInt(list.get(0).get(0));
	   m2 = Integer.parseInt(list.get(0).get(1));
	   m3 = Integer.parseInt(list.get(0).get(2));
	   m4 = Integer.parseInt(list.get(0).get(3));
	}

	int product;
	@When("^they are multiplied$")
	public void they_are_multiplied() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   product = m1 * m2 * m3 * m4;
	}
	
	@Then("^the product is (\\d+)$")
	public void the_product_is(int expectedProduct) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the product of "+m1+" , "+m2+" , "+m3+" , "+m4+" is "+product);

	    Assert.assertEquals(product, expectedProduct);
	}


	int dividend, divider;
	@Given("^two numbers (\\d+) and (\\d+)$")
	public void two_numbers_and(int d1, int d2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   dividend = d1;
	   divider = d2;
	}

	int quotient;
	@When("^divided$")
	public void divided() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		quotient = dividend / divider;
	}

	@Then("^the quotient is (\\d+)$")
	public void the_answer_must_be(int expectedQuotient) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the quotient of "+dividend+" divided by "+divider+" is "+quotient);
	  Assert.assertEquals(quotient, expectedQuotient);  
	}



}
