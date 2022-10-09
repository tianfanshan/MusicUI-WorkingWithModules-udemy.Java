module academy.learnprogramming.db {
    requires java.sql;
    requires sqlite.jdbc;
    requires transitive academy.learnprograming.common;

    exports academy.learnprogramming.db;
    opens academy.learnprogramming.db to javafx.base;
}