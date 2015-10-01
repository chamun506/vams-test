package au.com.csl.vams.model.relational;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-24T17:01:46.156+1000")
@StaticMetamodel(Study.class)
public class Study_ {
	public static volatile SingularAttribute<Study, Long> id;
	public static volatile SingularAttribute<Study, String> StudyNbr;
	public static volatile SingularAttribute<Study, String> StudyName;
	public static volatile SingularAttribute<Study, String> studyTypeId;
	public static volatile ListAttribute<Study, Run> runs;
	public static volatile SingularAttribute<Study, Sample> sample;
	public static volatile SingularAttribute<Study, String> reason;
	public static volatile SingularAttribute<Study, Date> createDate;
}
