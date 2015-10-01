package au.com.csl.vams.dao;


import au.com.csl.vams.dao.relational.repository.PlateRepository;
import au.com.csl.vams.model.relational.Plate;
import au.com.csl.vams.scaffold.IDao;

public interface IPlateDao extends IDao<Plate, String, PlateRepository> , PlateRepository{
	
}
