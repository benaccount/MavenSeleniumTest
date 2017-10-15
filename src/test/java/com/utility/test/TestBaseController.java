package com.utility.test;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.time.Duration;
import java.time.Instant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestBaseController {

	private static final Logger log = LogManager.getLogger(TestBaseController.class);
	private static Instant start;
    private static Instant stop;
	
	
    @Before
    public void setUp(Scenario scenario) {

        log.info("=====================================================");
        log.info("Starting Scenario:> " + scenario.getName());
        log.info("=====================================================");
        start = Instant.now();
    }
    
    @After
    public void tearDown(Scenario scenario) {   	

        stop = Instant.now();
        Duration totalTime = Duration.between(start, stop);       
        log.info("=====================================================");
        log.info("Completed Scenario:" + scenario.getName());
        log.info("Scenario Test time duration is:>  " + totalTime.toMinutes() + " Minutes : " + totalTime.toMillis() / 1000 + " Seconds : " + totalTime.toMillis() + " Milliseconds");                                                                                                          
        log.info("=====================================================");

    }
}
