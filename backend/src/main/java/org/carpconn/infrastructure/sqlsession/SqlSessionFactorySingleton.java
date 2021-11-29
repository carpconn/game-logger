package org.carpconn.infrastructure.sqlsession;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * SqlSessionFactorySingleton
 *
 * Singleton for the application's sql session factory. Do not try to get around this singleton pattern!
 *
 * @author carpc on 11/25/2021
 */
public class SqlSessionFactorySingleton {
    private static SqlSessionFactory instance;

    private SqlSessionFactorySingleton() {}

    public static SqlSessionFactory getInstance() {
        try {
            instance = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mapper/sql-map-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
