package com.cinema.dao;

import com.cinema.model.Cinema;

import java.sql.SQLException;
import java.util.List;

public class CinemaDao extends AbstractDao<Cinema>{

    @Override
    public Cinema findbyId(int id) {
        return null;
    }

    @Override
    public List<Cinema> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public void create(Cinema entity) throws SQLException {

    }

    @Override
    public void delete(Cinema entity) throws SQLException {

    }
}
