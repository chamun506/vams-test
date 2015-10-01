package au.com.csl.vams.model.relational;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import au.com.csl.vams.scaffold.AbstractMasterEntity;

/**
 * @author chamun
 *
 */

@Entity
public class Plate extends AbstractMasterEntity<String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	
	private String plateName;
	
	@ManyToOne
	private Run run;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "PLATE_ID")
    private List<PlateElement> plateElmns;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlateName() {
		return plateName;
	}

	public void setPlateName(String plateName) {
		this.plateName = plateName;
	}
		
	public Run getRun() {
		return run;
	}

	public void setRun(Run run) {
		this.run = run;
	}

	public List<PlateElement> getPlateElmns() {
		return plateElmns;
	}

	public void setPlateElmns(List<PlateElement> plateElmns) {
		this.plateElmns = plateElmns;
	}
		
	@Override
	public String getSearchResultInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
