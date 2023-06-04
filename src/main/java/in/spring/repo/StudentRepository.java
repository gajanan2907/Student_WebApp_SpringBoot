package in.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.spring.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>
{

}
