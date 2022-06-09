package teste;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	
 Metodos metodos = new Metodos ();
 
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl ) {
	   metodos.abrirNavegador(appUrl);
	   }

	@When("pesquisar no da escola")
	public void pesquisar_no_da_escola() {
	    
	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {
	  
	}
	
}