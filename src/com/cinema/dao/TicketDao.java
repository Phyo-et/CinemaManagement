package com.cinema.dao;

import com.cinema.model.Ticket;

import java.sql.SQLException;
import java.util.List;

public class TicketDao extends AbstractDao<Ticket>{

    @Override
    public Ticket findbyId(int id) {
        return null;
    }

    @Override
    public List<Ticket> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public void create(Ticket entity) throws SQLException {

    }

    @Override
    public void delete(Ticket entity) throws SQLException {

    }
}
