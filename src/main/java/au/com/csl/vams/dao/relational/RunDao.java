package au.com.csl.vams.dao.relational;

import javax.annotation.PostConstruct;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import au.com.csl.vams.dao.Dao;
import au.com.csl.vams.dao.IRunDao;
import au.com.csl.vams.dao.relational.repository.RunRepository;
import au.com.csl.vams.model.relational.Run;

@Dao
public class RunDao extends AbstractDao<Run, String, RunRepository> implements IRunDao{
	@Override
	@PostConstruct
	public void init() {
		JpaRepositoryFactory factory = new JpaRepositoryFactory(getEntityManager());
		setRepository(factory.getRepository(RunRepository.class));
	}

}
