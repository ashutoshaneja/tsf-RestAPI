import org.springframework.data.jpa.repository.JpaRepository;

import com.ashutosh.demo.model.Student;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
