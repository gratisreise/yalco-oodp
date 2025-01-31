package org._12_abstract_factory.ex02;

// Abstract factory
interface DatabaseFactory {
    Connection createConnection();
    Command createCommand();
    ResultSet createResultSet();
}