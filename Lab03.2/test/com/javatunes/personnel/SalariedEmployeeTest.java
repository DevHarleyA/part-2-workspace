package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new SalariedEmployee("Bob", Date.valueOf("2022-07-26"), 50000.0);
  }

  @Test
  public void testPay() {
    assertEquals(50000.0, employee.pay(), 0.005);
  }

  @Test
  public void testPayTaxes() {
    assertEquals(1000 * TaxPayer.SALARIED_TAX_RATE, employee.payTaxes(), 0.005);
  }
}