package au.com.ibm.csl.vams.dao.relational;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import au.com.csl.vams.dao.Dao;
import au.com.csl.vams.dao.ISampleDao;
import au.com.csl.vams.dao.IStudyDao;
import au.com.csl.vams.dao.IStudyTypeDao;
import au.com.csl.vams.model.relational.Algorithm;
import au.com.csl.vams.model.relational.Plate;
import au.com.csl.vams.model.relational.PlateType;
import au.com.csl.vams.model.relational.Run;
import au.com.csl.vams.model.relational.Sample;
import au.com.csl.vams.model.relational.Study;
import au.com.csl.vams.model.relational.StudyType;
import au.com.ibm.csl.vams.dao.RelationalTests;

public class StudyDaoTest extends RelationalTests {
	
	@Inject
	@Dao
	IStudyDao dao;
		
	@Inject
	@Dao
	ISampleDao sampleDao;
	
	@Inject
	@Dao
	IStudyTypeDao studyTypeDao;
				
	@Test
	public void saveStudyTest()
	{
		try {
			
			Study study = new Study();
			study.setStudyName("study1");
			study.setStudyNbr("1");
			
			study.setCreateDate(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
					
			dao.saveAndFlush(study);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	

}
