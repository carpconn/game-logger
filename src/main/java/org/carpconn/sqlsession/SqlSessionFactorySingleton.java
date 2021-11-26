package org.carpconn.sqlsession;

/**
 * SqlSessionFactorySingleton
 *
 * Singleton for the application's sql session factory. Do not try to get around this singleton pattern!
 *
 * @author carpc on 11/25/2021
 */
public class SqlSessionFactorySingleton {
    private static SqlSessionFactorySingleton instance = new SqlSessionFactorySingleton();

    private SqlSessionFactorySingleton() {}

    public static SqlSessionFactorySingleton getInstance() {
        return instance;
    }
}
