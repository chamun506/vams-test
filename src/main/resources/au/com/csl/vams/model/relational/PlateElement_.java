package au.com.csl.vams.model.relational;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-25T08:44:02.069+1000")
@StaticMetamodel(PlateElement.class)
public class PlateElement_ {
	public static volatile SingularAttribute<PlateElement, Long> id;
	public static volatile SingularAttribute<PlateElement, Integer> row;
	public static volatile SingularAttribute<PlateElement, Integer> column;
	public static volatile SingularAttribute<PlateElement, Integer> value;
	public static volatile SingularAttribute<PlateElement, Long> plateId;
}
