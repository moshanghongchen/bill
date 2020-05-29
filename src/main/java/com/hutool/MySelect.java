package com.hutool;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public class MySelect {
    public static void main(String[] args) throws SQLException{
        select();
    }

    public static void select()throws SQLException {
        List<Entity> demo = Db.use().find(new Entity().create("DEMO"));
        System.out.println(demo);

    }
}
