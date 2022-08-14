package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	
	@Test
	public void construtorShouldNewInstanceWhenValidData() {
		
		double expectedEntry = 20000.0;
		double expectedQuota = 1000.0;
		Financing f = FinancingFactory.createWith80Months();
		
		Assertions.assertTrue(expectedEntry == f.entry());
		Assertions.assertTrue(expectedQuota == f.quota());
	}
	
	@Test
	public void construtorShouldThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> FinancingFactory.createWith20Months());
	}

}
