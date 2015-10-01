package au.com.csl.vams.model.relational;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-09-22T16:02:16.263+1000")
@StaticMetamodel(AppUser.class)
public class AppUser_ {
	public static volatile SingularAttribute<AppUser, String> login;
	public static volatile SingularAttribute<AppUser, String> password;
	public static volatile SingularAttribute<AppUser, String> roles;
	public static volatile SingularAttribute<AppUser, Integer> version;
}
