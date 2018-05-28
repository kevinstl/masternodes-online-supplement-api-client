package com.cryptocurrencyservices.masternodessuplement.api.cucumber.stepdefs;


import com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.ClientConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;


@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ClientConfiguration.class)
public abstract class StepDefs {

//    protected ResultActions actions;




}
