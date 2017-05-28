package com.umg.diseno.sistemas.bs.service;

import java.util.List;

import com.umg.diseno.sistemas.eis.bo.AbstractBO;
import com.umg.diseno.sistemas.eis.dto.CRUDRequestDTO;

public interface GenericService {

	public boolean getLogin(String user, String password);

	public List<AbstractBO> getRegistros(String nameEntity);

	public void saveObject(CRUDRequestDTO save);

	public void updateObject(CRUDRequestDTO update);

	public void deleteObject(String entidad, Integer id);


}
