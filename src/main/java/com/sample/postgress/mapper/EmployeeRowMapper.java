package com.sample.postgress.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sample.postgress.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
        Employee emp = new Employee();
        emp.setEmployeeId(rs.getString("EmpID"));
        emp.setEmployeeName(rs.getString("EmpName"));
        emp.setEmployeeOrg(rs.getString("Org"));

        return emp;
    }
}
