package com.ibrahimkuley.controller;

import com.ibrahimkuley.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by hikuley on 02.11.2014.
 */

@Component
@Path("/kitap")
public class JerseyController {

    @Autowired
    BookDAO bookDAO;

    @GET
    @Produces("application/json;charset=utf-8")
    @Path("/list")
    public List savePayment() {

        List list = bookDAO.bookList();

        return list;
    }

}