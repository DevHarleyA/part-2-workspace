/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.billing;

public enum Location {
  // syntactical sugar that the compiler expands on during compiling
  // sub class of location (IS-A relationship)
  USA {
    @Override
    public TaxCalculator getTaxCalculator() {
      return new USATax();
    }
  },
  EUROPE {
    @Override
    public TaxCalculator getTaxCalculator() {
      return new EuropeTax();
    }
  },
  ONLINE {
    @Override
    public TaxCalculator getTaxCalculator() {
      return new OnlineTax();
    }
  };

  // abstract methods don't have braces. No implementation.
  public abstract TaxCalculator getTaxCalculator();
}