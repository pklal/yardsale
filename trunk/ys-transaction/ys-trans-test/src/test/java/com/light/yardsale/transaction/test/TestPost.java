package com.light.yardsale.transaction.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.IOP.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class TestPost {

    final Logger logger = LoggerFactory.getLogger(TestPost.class);

    @Autowired
    private TransactionService transService = null;

    /**
     * Tests message.
     */
    @Test
    public void testMessage() {   
     //   assertNotNull("Constructor message instance is null.", message);
        
        //String msg = message.getMessage();
        
      //  assertNotNull("Message is null.", msg);
        
        String expectedMessage = "Spring is fun.";
        
    //    assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);

      //  logger.info("message='{}'", msg);
    }
    
}
