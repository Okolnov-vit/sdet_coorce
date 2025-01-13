package org.example;
import java.sql.*;

public class Main {


    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connect();
            createTableCars();
            createTableModels();

            insertIntoCars();
            insertIntoModels();

            readEx("SELECT cars.make, count(models.id) " +
                    "FROM cars INNER JOIN models ON models.car_id = cars.id " +
                    "GROUP BY cars.make;");

            readEx("SELECT * FROM models");
            deleteEx("DELETE FROM models WHERE car_id = 1;");
            readEx("SELECT * FROM models");
            updateEx("UPDATE models SET description='This is a new model. ' || description WHERE car_id = 3;");
            readEx("SELECT * FROM models");

            dropTableEx("models");
            dropTableEx("cars");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }

    }

    private static void connect() throws SQLException {
        System.out.println("> Create connection");
        connection = DriverManager.getConnection("jdbc:sqlite:my_db.cars_db");
        statement = connection.createStatement();
    }

    private static void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null) {
                connection.close();
                System.out.println("> Connection close");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTableCars() throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS cars (\n" +
                " id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                " make TEXT\n" +
                " );");
        System.out.println("> Create cars table");
    }

    private static void createTableModels() throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS models (\n" +
                " id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                " name TEXT,\n" +
                " description TEXT,\n" +
                " car_id INTEGER\n" +
                " );");
        System.out.println("> Create models table");
    }

    private static void dropTableEx(String table) throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS " + table + ";");
        System.out.println("> Drop " + table + " table");
    }

    private static void insertIntoCars() throws SQLException {
        statement.executeUpdate("INSERT INTO cars (make) VALUES ('Toyota');");
        statement.executeUpdate("INSERT INTO cars (make) VALUES ('Ford');");
        statement.executeUpdate("INSERT INTO cars (make) VALUES ('Chevrolet');");
    }

    private static void insertIntoModels() throws SQLException {
        statement.executeUpdate("INSERT INTO models (name,description, car_id) VALUES ('Corolla', 'Sedan car', 1);");
        statement.executeUpdate("INSERT INTO models (name,description, car_id) VALUES ('F-150', 'Pickup truck', 2);");
        statement.executeUpdate("INSERT INTO models (name,description, car_id) VALUES ('Camaro', 'Sports car', 3);");
        statement.executeUpdate("INSERT INTO models (name,description, car_id) VALUES ('Camry', 'Hybrid car', 1);");
        statement.executeUpdate("INSERT INTO models (name,description, car_id) VALUES ('Escape', 'SUV', 2);");
        statement.executeUpdate("INSERT INTO models (name,description, car_id) VALUES ('Equinox', 'Compact SUV', 3);");
    }

    private static void readEx(String query) throws SQLException {
        System.out.println("\n> Data:");
        try (ResultSet rs = statement.executeQuery(query)
        ) {
            while (rs.next()) {
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); ++i) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void deleteEx(String query) throws SQLException {
        System.out.println("> Delete operation");
        statement.executeUpdate(query);
    }

    private static void updateEx(String query) throws SQLException {
        System.out.println("> Update operation");
        statement.executeUpdate(query);
    }
}