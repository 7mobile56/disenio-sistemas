package com.umg.diseno.sistemas.bs.service.impl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.umg.diseno.sistemas.bs.dao.GenericDao;
import com.umg.diseno.sistemas.bs.service.GenericService;
import com.umg.diseno.sistemas.eis.bo.AbstractBO;
import com.umg.diseno.sistemas.eis.dto.AbstractDTO;
import com.umg.diseno.sistemas.eis.dto.CRUDRequestDTO;

@Service
public class GenericServiceImpl implements GenericService {

    @Autowired
    private GenericDao genericDao;

    private static String complemento_class = "com.umg.diseno.sistemas.eis.bo.";

    public final Map<String, Class<?>> cache = new HashMap<String, Class<?>>();

    private ObjectMapper mapper = new ObjectMapper();

    public boolean getLogin(String user, String password) {
        // TODO Auto-generated method stub
        return false;
    }

    @Transactional(readOnly = true)
    public List<AbstractBO> getRegistros(String nameEntity) {
        List<AbstractBO> lista = null;
        try {
            lista = genericDao.getRegistros(getEntityFromName(complemento_class + nameEntity));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public GenericDao getGenericDao() {
        return genericDao;
    }

    public void setGenericDao(GenericDao genericDao) {
        this.genericDao = genericDao;
    }

    public AbstractDTO copyPropertiesDTO(AbstractBO origen, AbstractDTO destino) {
        BeanUtils.copyProperties(destino, origen);
        return destino;
    }

    @Transactional
    public void saveObject(CRUDRequestDTO save) {
        try {
            AbstractBO bo = getEntityFromName(complemento_class + save.getNameEntity());
            bo = mapper.convertValue(save.getEntity(), bo.getClass());
            genericDao.saveObject(bo);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Transactional
    public void updateObject(CRUDRequestDTO update) {
        try {
            AbstractBO bo = getEntityFromName(complemento_class + update.getNameEntity());
            bo = mapper.convertValue(update.getEntity(), bo.getClass());
            genericDao.updateObject(bo);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Transactional
    public void saveObject(AbstractBO bo) {
        genericDao.saveObject(bo);
    }

    @Transactional
    public void updateObject(AbstractBO bo) {
        genericDao.updateObject(bo);
    }

    @Transactional
    public void deleteObject(String entidad, Integer id) {
        try {
            AbstractBO bo = getEntityFromName(complemento_class + entidad);
            bo = genericDao.getRegistro(bo, id);
            genericDao.deleteObject(bo);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Class<?> getClassforName(String clazz) throws ClassNotFoundException {
        if (cache.containsKey(clazz)) {
            return cache.get(clazz);
        } else {
            Class<?> clase = Class.forName(clazz);
            cache.put(clazz, clase);
            return clase;
        }
    }

    public String getValorFromName(AbstractBO entity, String nameAtribute) {
        try {
            Field idField = entity.getClass().getDeclaredField(nameAtribute);
            idField.setAccessible(true);
            Object obj = idField.get(entity);
            return obj == null ? "" : obj.toString();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return "";
    }

    public AbstractBO getEntityFromName(String nameEntity) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> dynamicClass = getClassforName(nameEntity);
        AbstractBO cast = (AbstractBO) dynamicClass.newInstance();
        return cast;
    }

}
