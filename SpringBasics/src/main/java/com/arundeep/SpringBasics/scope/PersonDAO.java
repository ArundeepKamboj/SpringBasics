package com.arundeep.SpringBasics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDAO {
    public JDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @Autowired
    public JDBCConnection jdbcConnection;
}
