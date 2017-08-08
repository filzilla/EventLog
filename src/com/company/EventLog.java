package com.company;

import java.util.ArrayList;
import java.util.List;
import static com.company.Event.*;

/**
 * Created by phillipdelia on 7/27/17.
 */
public class EventLog {



    private static List<Event>  eventList= new ArrayList<>();

    public static boolean addEvent(Event event) {

        if (event == null || name == null || action == null) {
            throw new IllegalArgumentException();


        } else if (action == "Face2Face") {

            eventList.add(event);
            System.out.println(event);

        } else if (action == "PhoneCall") {

            eventList.add(event);
            System.out.println(event);
        } else if (action == "TextMessage") {

            eventList.add(event);
            System.out.println(event);

        } else if(action == "Unknown") {

            eventList.add(event);
            System.out.println(event);

        }

        return true;

    }

    public int getNumEvents (){

        return  eventList.size();
    }                                            //which returns the size of the list


    public  EventLog (){

    Event Event = new Event();

    }                                           //which initializes the list





}
