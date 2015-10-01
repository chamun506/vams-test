package au.com.csl.vams.model.relational;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-24T17:01:47.894+1000")
@StaticMetamodel(StudyType.class)
public class StudyType_ {
	public static volatile SingularAttribute<StudyType, String> id;
	public static volatile SingularAttribute<StudyType, String> name;
	public static volatile ListAttribute<StudyType, Algorithm> algorithms;
	public static volatile ListAttribute<StudyType, PlateType> plateTypes;
}
