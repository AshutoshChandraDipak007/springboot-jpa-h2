package com.example.demo.repos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Project;


@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

}
