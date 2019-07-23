import org.springframework.data.jpa.repository.JpaRepository;

import com.ashutosh.demo.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
