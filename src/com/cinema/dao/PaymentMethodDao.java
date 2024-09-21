package com.cinema.dao;

import com.cinema.model.Payment;

import java.sql.SQLException;
import java.util.List;

public class PaymentMethodDao extends AbstractDao<Payment>{
    @Override
    public Payment findbyId(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Payment> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public void create(Payment entity) throws SQLException {

    }

    @Override
    public void delete(Payment entity) throws SQLException {

    }
}
