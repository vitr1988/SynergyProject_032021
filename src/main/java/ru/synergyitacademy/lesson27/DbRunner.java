package ru.synergyitacademy.lesson27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbRunner {

    public static void main(String[] args) throws SQLException {
        try (final Connection connection =
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "password");
             final PreparedStatement statement = connection.prepareStatement("select e.emp_id, e.emp_name, e.salary, d.name department_name from employee e " +
                     "left join department d on e.department_id = d.id " +
                     "where e.emp_id > ?"); // -1 or (d)
             ) {
            statement.setInt(1, 1);
            final ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(String.format("ID: %d Name: %s Salary: %f DepartmentName: %s",
                        resultSet.getInt("emp_id"),
                        resultSet.getString("emp_name"),
                        resultSet.getBigDecimal("salary"),
                        resultSet.getString("department_name")));
            }
            resultSet.close();
        }
    }
}
