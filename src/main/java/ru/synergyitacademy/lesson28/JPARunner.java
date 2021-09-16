package ru.synergyitacademy.lesson28;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.synergyitacademy.lesson28.entity.Department;
import ru.synergyitacademy.lesson28.entity.Employee;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class JPARunner {

    public static void main(String[] args) {
        runInsideSession(session -> {
            Department department = new Department();
            department.setId(188);
            department.setName("Test department");
            session.save(department);
            System.out.println(department);

            Employee employee = new Employee();
            employee.setEmpName("trwtrw");
            employee.setDepartment(department);
            employee.setSalary(new BigDecimal("1000000"));
            session.save(employee);
        });

        runInsideSession(session -> {
            final Department firstDepartment = session.find(Department.class, 188);
            System.out.println(firstDepartment.getEmployees());
        });
    }

    public static void runInsideSession(Consumer<Session> consumer) {
        try (final Session session = getCurrentSessionFromConfig()) {
            Transaction transaction = session.beginTransaction();
            consumer.accept(session);
            transaction.commit();
        }
    }

    public static Session getCurrentSessionFromConfig() {
        // SessionFactory in Hibernate 5 example
        Configuration config = new Configuration();
        config.configure();
        // local SessionFactory bean created
        SessionFactory sessionFactory = config.buildSessionFactory();
        return sessionFactory.getCurrentSession();
    }
}
