package com.light.yardsale.transaction.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.light.yardsale.transaction.exceptions.ValidationException;
import com.light.yardsale.transaction.services.TransactionService;
import com.light.yardsale.transaction.transferobjects.AttributeSO;
import com.light.yardsale.transaction.transferobjects.PostCommentSO;
import com.light.yardsale.transaction.transferobjects.PostListSO;
import com.light.yardsale.transaction.transferobjects.PostQuerySO;
import com.light.yardsale.transaction.transferobjects.PostTransactionSO;
import com.light.yardsale.transaction.transferobjects.PostSummarySO;

@RunWith(SpringJUnit4ClassRunner.class)
//ApplicationContext will be loaded from "classpath:/app-config.xml"
@ContextConfiguration("/app-config.xml")
@ActiveProfiles("dev")
public class TestPost {

    final Logger logger = LoggerFactory.getLogger(TestPost.class);

    @Autowired
    private TransactionService transService = null;

    @Test
    public void testTransactions() {   
    	try {
    		PostQuerySO arg0 = new PostQuerySO();
    		arg0.setItemCode("AUTOMOBILES");
    		arg0.setPageNumber(1);
    		arg0.setPageSize(3);
    		arg0.setPostType("SELL");
			PostListSO postList = transService.listTransactions(arg0);
			System.out.println("-------- "+postList);
		} catch (Exception ne) {
			// TODO Auto-generated catch block
			ne.printStackTrace();
		}
    }
    /**
     * Tests message.
     */
    @Test
    public void testListTransactions() {   
    	try {
			PostSummarySO summarySO = transService.showSummary();
			System.out.println("-------- "+summarySO);
		} catch (Exception ne) {
			// TODO Auto-generated catch block
			ne.printStackTrace();
		}
    }
    /**
     * Tests message.
     */
    @Test
    public void testTransaction() {   
     //   assertNotNull("Constructor message instance is null.", message);
        
        //String msg = message.getMessage();
        
      //  assertNotNull("Message is null.", msg);
        
        String expectedMessage = "Spring is fun.";
        PostTransactionSO postReqSO = new PostTransactionSO();
        postReqSO.setCreatedDate(Calendar.getInstance().getTime());
        postReqSO.setDetailedDesc(" 2007 old car with 20000 milage.");
        postReqSO.setItemCode("AUTOMOBILES");
        postReqSO.setLocationCode("Doha");
        postReqSO.setLocationDesc("Airport road");
        postReqSO.setPostTitle("very good car for sale");
        postReqSO.setPostType("SELL");
        postReqSO.setSubitemCode("SEDAN");
        postReqSO.setUserCode("KIRAN");
        List<AttributeSO> attributes = new ArrayList();
        AttributeSO attr = new AttributeSO();
        attr.setAttribCode("MODEL");
        attr.setAttribVal("HONDA");
        attributes.add(attr);
        postReqSO.setAttributes(attributes);
		try {
			transService.submitPost(postReqSO);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       // transService.
        
    //    assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);

      //  logger.info("message='{}'", msg);
    }
    
    @Test
    public void testPostComment() {   
     //   assertNotNull("Constructor message instance is null.", message);
        
        //String msg = message.getMessage();
        
      //  assertNotNull("Message is null.", msg);
        
    	PostCommentSO pC = new PostCommentSO();
    	pC.setCommentDescription(" I want this car. please call me ");
    	pC.setPostedDate(Calendar.getInstance().getTime());
    	pC.setUserCode("SYED");
    	pC.setPostId(new Long(100));
		try {
			transService.submitComment(pC);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       // transService.
        
    //    assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);

      //  logger.info("message='{}'", msg);
    }
}
