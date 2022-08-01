package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

  private Television television;

  @Before
  public void setUp() throws Exception {
    // inside the setup, create an instance of television
    television = new Television("Sony", 50, DisplayType.OLED);
  }

  @Test
  public void getBrand() {
  }

  @Test
  public void setBrand() {
  }

  @Test
  public void getVolume() {
  }

  // often have two test methods for anything that should throw an exception
  @Test
  public void setVolume_valid() {
    television.setVolume(Television.MIN_VOLUME + 1);
    assertEquals(Television.MIN_VOLUME + 1, television.getVolume());
  }

  @Test(expected = IllegalArgumentException.class)
  public void setVolume_invalid() {
    // not asserting anything, telling junit that when it invokes this test, it should expect an illegal argument exception.
    // if it doesn't, the test fails
    television.setVolume(Television.MIN_VOLUME - 1);
  }

  @Test
  public void getCurrentChannel() {
  }

  @Test
  public void changeChannel() {
  }

  @Test
  public void getDisplay() {
  }

  @Test
  public void setDisplay() {
  }

  @Test
  public void compareTo() {
  }

  @Test
  public void testHashCode() {
  }

  @Test
  public void testEquals() {
  }
}