package org.carpconn;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * SqlSessionFactoryTestingSingleton
 *
 * @author carpc on 12/16/2021
 */
public class SqlSessionFactoryTestingSingleton {
    private static SqlSessionFactory instance;

    private SqlSessionFactoryTestingSingleton() {}

    public static SqlSessionFactory getInstance() {
        try {
            instance = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mapper/sql-map-testing-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
