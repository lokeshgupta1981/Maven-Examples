package com.howtodoinjava.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass
{
    private static Logger LOGGER = LoggerFactory.getLogger(MainClass.class);
    public static void main( String[] args )
    {
        LOGGER.info( "Hello World! from Inside a Jar..." );
    }
}
