package persistence;

import java.util.List;

public interface ContractDaoI extends CommonDaoI<Contract>{
	
	public List<cliente> searchByclienteId(final long Id);
	
	

}
