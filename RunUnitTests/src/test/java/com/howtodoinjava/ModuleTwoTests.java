package com.howtodoinjava;

import static org.junit.Assert.assertTrue;

import lombok.extern.java.Log;
import org.junit.Test;

@Log
public class ModuleTwoTests {
  @Test
  public void testMethodOne()
  {
    log.info("Executing ModuleTwoTests#testMethodOne");
    assertTrue( true );
  }

  @Test
  public void testMethodTwo()
  {
    log.info("Executing ModuleTwoTests#testMethodTwo");
    assertTrue( true );
  }

  @Test
  public void testMethodThree()
  {
    log.info("Executing ModuleTwoTests#testMethodThree");
    assertTrue( true );
  }

  @Test
  public void testMethodFour()
  {
    log.info("Executing ModuleTwoTests#testMethodFour");
    assertTrue( true );
  }
}
