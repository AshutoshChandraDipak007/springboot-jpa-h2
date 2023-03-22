package com.example.demo.repos;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.ProjectDto;
import com.example.demo.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	@Query(value = "select p.projectkey, p.bu_name, c.category_id from project p, category c where p.bu_name = (c.bu_name)", nativeQuery = true)
	public List<String> findAllProjectWithCategoryId();

}
