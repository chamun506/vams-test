package au.com.csl.vams.web.forms.ui;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import au.com.csl.vams.model.relational.Study;
import au.com.csl.vams.scaffold.AbstractMaintenanceForm;
import au.com.csl.vams.scaffold.IService;
import au.com.csl.vams.service.IStudySvc;
import au.com.csl.vams.web.forms.Mode;
import au.com.csl.vams.model.relational.PageDetails;
import au.com.csl.vams.model.relational.Run;



@ManagedBean(name = "studyForm")
@ViewScoped
public class StudyForm  extends AbstractMaintenanceForm<String, Study>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private IStudySvc studySvc;
	private static final String RUN_URI = "ui/study/run.xhtml";
	private Map<String,String> studies;
	private Run run;
	
	public void newRun()
	{
		System.out.println("helloo");
		studies = new HashMap<String, String>();
		studies.put("study1", "study1");
		studies.put("study2", "study2");
		/*List<Study> studyLst = studySvc.getAll();
		if (!studyLst.isEmpty()) {
			for (Study study : studyLst) {
				studies.put(study.getId(), study.getStudyName());
			}
		}*/
		getSessionModel().addPage(new PageDetails(RUN_URI, null, null));
		getSessionModel().setContent(RUN_URI);
		getSessionModel().setMode(Mode.NEW);
	}
	
	public void saveNewRun()
	{
		
	}
	
	public void saveNewStudy()
	{
		
	}
	
	public void updateStudy()
	{
		
	}
	
	public void getStudyData()
	{
		/*Study study=studySvc.getDao().findByStudyIDAndRunID(getSessionModel().getModel().getId(),getSessionModel().getModel().getRuns().get(0).getId());
		getSessionModel().setModel(study);*/
	}
	
	public IStudySvc getStudySvc() {
		return studySvc;
	}

	public void setStudySvc(IStudySvc studySvc) {
		this.studySvc = studySvc;
	}
	
	public Map<String, String> getStudies() {
		return studies;
	}

	public void setStudies(Map<String, String> studies) {
		this.studies = studies;
	}

	public Run getRun() {
		return run;
	}

	public void setRun(Run run) {
		this.run = run;
	}

	@Override
	public Study getNewOne() {
		return new Study();
	}

	@Override
	public List<Study> getDefaultSearchResults() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEntityBusinessName() {
		return "Study";
	}

	@SuppressWarnings("rawtypes")
	@Override
	public IService getService() {
		return studySvc;
	}
	@Override
	public String getViewForOne() {
		return "ui/study/study.xhtml";
	}

	@Override
	public String getViewForList() {
		return  "ui/study/studyList.xhtml";
	}
	
	@Override
	public void viewNewOne() {
		super.viewNewOne();
		setRun(new Run());
	}
}
