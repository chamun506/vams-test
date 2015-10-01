package au.com.csl.vams.model.relational;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import au.com.csl.vams.scaffold.AbstractMasterEntity;

/**
 * @author chamun
 *
 */
@Entity
public class Sample extends AbstractMasterEntity<String>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SAMPLE_ID")
	private String id;
	
	@Column(name="SAMPLE_NAME")
	private String sampleName;
	
	@Column(name="INITIAL_DIL")
	private Integer initialDil;
	
	@Column(name="DIL_INTERVALS")
	private Integer dilIntervals;
	
	@Column(name="VOL_TESTED")
	private Integer volTested;
	
	@Column(name="CALC_LOD")
	private String calcLOD;
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public Integer getInitialDil() {
		return initialDil;
	}

	public void setInitialDil(Integer initialDil) {
		this.initialDil = initialDil;
	}

	public Integer getDilIntervals() {
		return dilIntervals;
	}

	public void setDilIntervals(Integer dilIntervals) {
		this.dilIntervals = dilIntervals;
	}

	public Integer getVolTested() {
		return volTested;
	}

	public void setVolTested(Integer volTested) {
		this.volTested = volTested;
	}

	public String getCalcLOD() {
		return calcLOD;
	}

	public void setCalcLOD(String calcLOD) {
		this.calcLOD = calcLOD;
	}
	
	@Override
	public String getSearchResultInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
