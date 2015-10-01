package au.com.csl.vams.model.OpStatus;

import java.util.HashMap;
import java.util.Map;

public class OpStatus {
	public static final String NOT_APPLICABLE = "Not Applicable";
	public static final String ERROR = "Error";
	public static final String SUCCESS = "Success";
	public static final String PARTIAL_SUCCESS = "Partial Success";
	public static final String INVALID = "Invalid Input";
	
	public static final String OBJECT_TYPE_STUDY = "Study";
	public static final String OBJECT_TYPE_SAMPLE = "Sample";
	

	private String staus;
	
	private String description;
	
	private Map<String, Object> result = new HashMap<>();

	public OpStatus() {
	}

	public OpStatus(String staus, String description) {
		super();
		this.staus = staus;
		this.description = description;
	}

	public String getStaus() {
		return staus;
	}

	public void setStaus(String staus) {
		this.staus = staus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}
	
	public Object getResult(String key) {
		return result.get(key);
	}
	
	public void setResult(String key, Object value) {
		result.put(key, value);
	}

	public boolean failure() {
		if(! staus.equals(SUCCESS)) {
			return true;
		}
		return false;
	}
	
	public boolean success() {
		if(staus.equals(SUCCESS)) {
			return true;
		}
		return false;
	}

	public void copyResult(String objectType, OpStatus status) {
		setResult(objectType, status.getResult(objectType));		
	}

}
