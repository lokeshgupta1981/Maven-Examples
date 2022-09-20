package com.howtodoinjava;


import static org.junit.Assert.assertTrue;

import lombok.extern.java.Log;
import org.junit.Test;

@Log
public class ModuleOneTests
{
    @Test
    public void testMethodOne()
    {
        log.info("Executing ModuleOneTests#testMethodOne");
        assertTrue( true );
    }

    @Test
    public void testMethodTwo()
    {
        log.info("Executing ModuleOneTests#testMethodTwo");
        assertTrue( true );
    }
}
