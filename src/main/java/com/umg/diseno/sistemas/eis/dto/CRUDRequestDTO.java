package com.umg.diseno.sistemas.eis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CRUDRequestDTO extends AbstractDTO {

    private String nameEntity;
    private Object entity;

    public String getNameEntity() {
        return nameEntity;
    }

    public void setNameEntity(String nameEntity) {
        this.nameEntity = nameEntity;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public CRUDRequestDTO() {
        super();
    }

    public CRUDRequestDTO(@JsonProperty(required = true, value = "nameEntity") String nameEntity, @JsonProperty(required = true, value = "entity") Object entity) {
        super();
        this.nameEntity = nameEntity;
        this.entity = entity;
    }

}
