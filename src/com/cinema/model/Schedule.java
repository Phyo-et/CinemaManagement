package com.cinema.model;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private int it;
    private Movie movie;
    private Threatre threatre;
    private TimeZone timezone;
    private List<Ticket> tickets = new ArrayList<Ticket>();
    private int ticketsCount;

    public Schedule(Movie movie,Threatre threatre, TimeZone timezone){
        this.movie=movie;
        this.threatre=threatre;
        this.timezone=timezone;
    }


    public void Schduleinfo(){
        System.out.println("Movie name : "+ movie);
        System.out.println("Threatre Name : "+ threatre);
        System.out.println("Movie Time : "+ timezone);
        System.out.println("Avaiable Tickets : "+ ticketsCount );
    }
}
