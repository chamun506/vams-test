package au.com.csl.vams.model.relational;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-25T08:43:51.313+1000")
@StaticMetamodel(Plate.class)
public class Plate_ {
	public static volatile SingularAttribute<Plate, Long> id;
	public static volatile SingularAttribute<Plate, String> plateName;
	public static volatile SingularAttribute<Plate, Long> runId;
	public static volatile ListAttribute<Plate, PlateElement> plateElmns;
	public static volatile ListAttribute<Plate, PlateVersion> plateVers;
}
