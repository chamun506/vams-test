package au.com.csl.vams.dao.relational;

import javax.annotation.PostConstruct;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import au.com.csl.vams.dao.IPlateDao;
import au.com.csl.vams.dao.relational.repository.PlateRepository;
import au.com.csl.vams.model.relational.Plate;

public class PlateDao extends AbstractDao<Plate, String, PlateRepository> implements IPlateDao{
	
	@Override
	@PostConstruct
	public void init() {
		JpaRepositoryFactory factory = new JpaRepositoryFactory(getEntityManager());
		setRepository(factory.getRepository(PlateRepository.class));
	}

}
