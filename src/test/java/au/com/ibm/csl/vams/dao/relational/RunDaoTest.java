package au.com.ibm.csl.vams.dao.relational;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import au.com.csl.vams.dao.Dao;
import au.com.csl.vams.model.relational.Plate;
import au.com.csl.vams.model.relational.Run;
import au.com.ibm.csl.vams.dao.RelationalTests;
import au.com.csl.vams.dao.IRunDao;

public class RunDaoTest extends RelationalTests{
	
	@Inject
	@Dao
	IRunDao dao;
	
	@Test
	public void saveTest()
	{
		Run run = new Run();
		Plate plate = new Plate();
		plate.setPlateName("PlateName1");

		plate.setRun(run);
		List<Plate> plateLst = new ArrayList<Plate>();
		plateLst.add(plate);
		run.setPlates(plateLst);

		//run.setStudy(study);
		
		dao.saveAndFlush(run);
		
		Run newRun=dao.findOne("1");
		
		
	}

}
