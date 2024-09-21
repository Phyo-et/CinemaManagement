package com.cinema.dao;

import com.cinema.model.Movie;

import java.sql.SQLException;
import java.util.List;

public class MovieDao extends AbstractDao<Movie>{
    @Override
    public Movie findbyId(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Movie> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public void create(Movie entity) throws SQLException {

    }

    @Override
    public void delete(Movie entity) throws SQLException {

    }
}
