package com.cryptocurrencyservices.masternodessuplement.api.cucumber.stepdefs;

import com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.api.MasternodesOnlineSupplementApiClient;
import com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.model.MasternodesOnlineSupplement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MasternodesOnlineSupplementClientStepDefs extends StepDefs {

    @Autowired
    private MasternodesOnlineSupplementApiClient masternodesOnlineSupplementApiClient;

    ResponseEntity<List<MasternodesOnlineSupplement>> allMasternodesOnlineSupplementsUsingGET = null;

    @Given("^I have access to the MasternodesOnlineSupplementApi client$")
    public void i_have_access_to_the_MasternodesOnlineSupplementApi_client() throws Throwable {
        assertNotNull(masternodesOnlineSupplementApiClient);
    }

    @When("^use the MasternodesOnlineSupplementApi client to get the public masternodes\\.online list$")
    public void use_the_MasternodesOnlineSupplementApi_client_to_get_the_public_masternodes_online_list() throws Throwable {
        Integer page = null;
        Integer size = null;
        List<String> sort = null;
        allMasternodesOnlineSupplementsUsingGET = masternodesOnlineSupplementApiClient.getAllMasternodesOnlineSupplementsUsingGET(page, size, sort);
    }

    @Then("^I see a list of masternodes is returned$")
    public void i_see_a_list_of_masternodes_is_returned() throws Throwable {
        assertNotNull(allMasternodesOnlineSupplementsUsingGET);
        assertNotNull(allMasternodesOnlineSupplementsUsingGET.getBody());
        assertNotNull(allMasternodesOnlineSupplementsUsingGET.getBody().get(0));
        assertNotNull(allMasternodesOnlineSupplementsUsingGET.getBody().get(0).getCoin());
        assertEquals("Dash", allMasternodesOnlineSupplementsUsingGET.getBody().get(0).getCoin());
    }


    @When("^use the MasternodesOnlineSupplementApi client to get the masternodes\\.online list$")
    public void use_the_MasternodesOnlineSupplementApi_client_to_get_the_masternodes_online_list() throws Throwable {

        String bearerToken = System.getenv("BEARER_TOKEN");
        Integer page = null;
        Integer size = null;
        List<String> sort = null;
        allMasternodesOnlineSupplementsUsingGET =
            masternodesOnlineSupplementApiClient.getAllMasternodesOnlineSupplementsUsingGET1(
                bearerToken,
                page,
                size,
                sort);
    }

}
