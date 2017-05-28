package com.umg.diseno.sistemas.bs.dao;

import java.util.List;

import com.umg.diseno.sistemas.eis.bo.AbstractBO;


public interface GenericDao {

	public boolean getLogin(String user, String password);

	public List<AbstractBO> getRegistros(AbstractBO bo);

	public AbstractBO getRegistro(AbstractBO bo, Integer id);
	
	public void saveObject(AbstractBO bo);

	public void updateObject(AbstractBO bo);

	public void deleteObject(AbstractBO bo);


}
