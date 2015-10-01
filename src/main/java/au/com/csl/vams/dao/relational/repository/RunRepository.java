package au.com.csl.vams.dao.relational.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import au.com.csl.vams.model.relational.Run;

@NoRepositoryBean
@Repo
public interface RunRepository extends JpaRepository<Run, String>  {

}
