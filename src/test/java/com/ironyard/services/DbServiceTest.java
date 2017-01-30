package com.ironyard.services;

import org.junit.Assert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.Assert.*;

/**
 * Created by jasonskipper on 9/29/16.
 */
public class DbServiceTest {
    @org.junit.Test
    public void getConnection() throws Exception {
        DbService dbService = new DbService();
        Connection con = dbService.getConnection();
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM helloworld.pets");

        boolean foundSomething = false;
        while(rs.next()){
            foundSomething = true;
            //pet_name, pet_type, pet_age, pet_own_name, pet_color, pet_id,
            System.out.print(rs.getString("pet_name")+", ");
            System.out.print(rs.getString("pet_type")+", ");
            System.out.print(rs.getString("pet_own_name")+", ");
            System.out.print(rs.getString("pet_color")+", ");
            System.out.print(rs.getInt("pet_age")+", ");
            System.out.println(rs.getLong("pet_id"));
        }
        Assert.assertTrue(foundSomething);

    }

}