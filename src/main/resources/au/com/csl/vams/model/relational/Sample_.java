package au.com.csl.vams.model.relational;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-22T21:28:10.324+1000")
@StaticMetamodel(Sample.class)
public class Sample_ {
	public static volatile SingularAttribute<Sample, Long> id;
	public static volatile SingularAttribute<Sample, String> sampleName;
	public static volatile SingularAttribute<Sample, Integer> initialDil;
	public static volatile SingularAttribute<Sample, Integer> dilIntervals;
	public static volatile SingularAttribute<Sample, Integer> volTested;
	public static volatile SingularAttribute<Sample, String> calcLOD;
}
