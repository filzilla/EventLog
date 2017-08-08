package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by phillipdelia on 7/27/17.
 */
public class EventLogTest {

    Event event = new Event();

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Cleaning up");
    }


@Rule
   public ExpectedException thrown = ExpectedException.none();

    @Test
    public  void stringTest() throws Exception {
        System.out.println("running basic test now");
        event.name = "July4th";
        event.action = "Face2Face";

        assertTrue(EventLog.addEvent(event));
    }


    @Test
    public  void faceTest() throws Exception {
        System.out.println("running basic test now");

        event.name = "Joe";
        event.action = "FaceFace";
        assertTrue(EventLog.addEvent(event));

    }
    @Test
    public  void faceTest2() throws Exception {
        System.out.println("running basic test now");

        event.name = "Joe";
        event.action = "FaceTwoFace";

        thrown.expect(AssertionError.class);
        assertFalse(EventLog.addEvent(event));

    }



    @Test
    public  void phoneTest() throws Exception {
        System.out.println("running basic test now");

        event.name = "Joe";
        event.action = "PhoneCall";
        assertTrue(EventLog.addEvent(event));

    }

    @Test
    public  void phoneTest2() throws Exception {
        System.out.println("running basic test now");

        event.name = "Joe";
        event.action = "Phone";

        thrown.expect(AssertionError.class);
        assertFalse(EventLog.addEvent(event));

    }


    @Test
    public  void textTest() throws Exception {
        System.out.println("running basic test now");

        event.name = "Joe";
        event.action = "TextMessaging";
        assertTrue(EventLog.addEvent(event));

    }
    @Test
    public  void textTest2() throws Exception {
        System.out.println("running basic test now");

        event.name = "Joe";
        event.action = "test";

        thrown.expect(AssertionError.class);
        assertFalse(EventLog.addEvent(event));

    }

    @Test
    public  void unknownTest() throws Exception {
        System.out.println("running basic test now");

        event.name = "Joe";
        event.action = "Unknown";
        assertTrue(EventLog.addEvent(event));

    }
    @Test
    public  void unknownTest2() throws Exception {
        System.out.println("running basic test now");

        event.name = "Joe";
        event.action = "unkon";

        thrown.expect(AssertionError.class);
        assertFalse(EventLog.addEvent(event));

    }


    }


