package au.com.csl.vams.dao.relational.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import au.com.csl.vams.model.relational.Sample;
import au.com.csl.vams.model.relational.Study;
import au.com.csl.vams.dao.relational.repository.Repo;

@NoRepositoryBean
@Repo
public interface StudyRepository extends JpaRepository<Study, String>{

	//Study findByStudyIDAndRunID(String p_ID, String p_runID);

}
