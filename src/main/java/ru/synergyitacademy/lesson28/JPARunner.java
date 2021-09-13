package ru.synergyitacademy.lesson28;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.synergyitacademy.lesson28.entity.Department;
import ru.synergyitacademy.lesson28.entity.Employee;

import java.math.BigDecimal;

public class JPARunner {

    public static void main(String[] args) {
        try (final Session session = getCurrentSessionFromConfig()) {
            final Transaction transaction = session.beginTransaction();
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
