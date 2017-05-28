package com.umg.diseno.sistemas.eis.dto;

import java.util.ArrayList;
import java.util.List;

import com.umg.diseno.sistemas.eis.bo.AbstractBO;

public class ListaRegistroResponseDTO {

    private List<AbstractBO> listaRegistros = new ArrayList<AbstractBO>();

    public List<AbstractBO> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<AbstractBO> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
}
