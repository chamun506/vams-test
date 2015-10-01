package au.com.csl.vams.model.relational;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-25T09:05:08.161+1000")
@StaticMetamodel(Run.class)
public class Run_ {
	public static volatile SingularAttribute<Run, Long> id;
	public static volatile SingularAttribute<Run, Long> studyId;
	public static volatile ListAttribute<Run, Plate> plates;
}
