package com.jiebbs.springLearn.baseKonwledge.chapter3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {com.jiebbs.springLearn.baseKnowledge.chapter3.config.PresistenceTestConfig.class})
@ActiveProfiles("dev")
public class PersistenceTest {

	@Test
	public void test() {
	
	}

}
