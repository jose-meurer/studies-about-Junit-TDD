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

	@Test
	public void setTotalAmountShouldUpdateTotalAmountWhenValidData() {
		
		double expectedEntry = 10000.0;
		double expectedQuota = 500.0;
		Financing f = FinancingFactory.createWith80Months();
		
		f.setTotalAmount(50000.0);
		
		Assertions.assertTrue(expectedEntry == f.entry());
		Assertions.assertTrue(expectedQuota == f.quota());
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = FinancingFactory.createWith80Months();
			f.setTotalAmount(101000.0);
					});
		}
	
	@Test
	public void setIncomeShouldUpdateValueWhenValidData() {
		
		double expectedEntry = 20000.0;
		double expectedQuota = 1000.0;
		Financing f = FinancingFactory.createWith80Months();
		
		f.setIncome(2001.0);
		
		Assertions.assertEquals(expectedEntry, f.entry());
		Assertions.assertEquals(expectedQuota, f.quota());
	}
	
	@Test
	public void setIncomeShouldThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = FinancingFactory.createWith80Months();
			f.setIncome(1999.0);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateValueWhenValidData() {
		
		double expectedEntry = 20000.0;
		double expectedQuota = 987.6543209876543;
		Financing f = FinancingFactory.createWith80Months();
		
		f.setMonths(81);
		
		Assertions.assertEquals(expectedEntry, f.entry());
		Assertions.assertEquals(expectedQuota, f.quota());
	}
	
	@Test
	public void setMonthsShouldThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = FinancingFactory.createWith80Months();
			f.setMonths(79);
		});
	}
}

