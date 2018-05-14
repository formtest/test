package com.formatech.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCompteChaine {

	@Test
	public void contextLoads() {
	CompteChaine testcmpt= new CompteChaine("villa web");
	CompteChaine testcmpt2= new CompteChaine("web villa");
	CompteChaine testcmpt3= new CompteChaine("villa waaab");
	Assert.assertEquals(2,testcmpt.compterNbrAB(testcmpt));
	Assert.assertEquals(2,testcmpt.compterNbrAB(testcmpt2));
	Assert.assertEquals(2,testcmpt.compterNbrAB(testcmpt3));
	}




}
