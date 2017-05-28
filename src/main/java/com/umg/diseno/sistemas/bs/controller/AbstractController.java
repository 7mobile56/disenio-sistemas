package com.umg.diseno.sistemas.bs.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.umg.diseno.sistemas.bs.service.GenericService;
import com.umg.diseno.sistemas.eis.dto.ListaRegistroResponseDTO;
import com.umg.diseno.sistemas.eis.dto.CRUDRequestDTO;

public abstract class AbstractController {

    @RequestMapping(value = "/listaRegistros", method = RequestMethod.GET)
    public ResponseEntity<ListaRegistroResponseDTO> getInformacionCobranza(@RequestParam(value = "entidad", required = true, defaultValue = "0") String entidad) {
        ListaRegistroResponseDTO response = new ListaRegistroResponseDTO();
        response.setListaRegistros(getGenericService().getRegistros(entidad));
        HttpStatus hs = (null != response ? HttpStatus.OK : HttpStatus.NOT_FOUND);
        return new ResponseEntity<ListaRegistroResponseDTO>(response, hs);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<CRUDRequestDTO> createEntity(@RequestBody CRUDRequestDTO request) {
        getGenericService().saveObject(request);
        HttpStatus hs = (null != request ? HttpStatus.OK : HttpStatus.NOT_FOUND);
        return new ResponseEntity<CRUDRequestDTO>(request, hs);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<CRUDRequestDTO> updateEntity(@RequestBody CRUDRequestDTO request) {
        getGenericService().updateObject(request);
        HttpStatus hs = (null != request ? HttpStatus.OK : HttpStatus.NOT_FOUND);
        return new ResponseEntity<CRUDRequestDTO>(request, hs);
    }

    @RequestMapping(value = "/{entidad}/{id}", method = RequestMethod.DELETE)
    public void deleteCampo(@PathVariable("entidad") String entidad, @PathVariable("id") Integer id) {
        getGenericService().deleteObject(entidad, id);
    }

    protected final Log logger = LogFactory.getLog(AbstractController.class);

    protected static final String EMPTY = "";

    @Autowired
    private GenericService genericService;

    public GenericService getGenericService() {
        return genericService;
    }

    public void setGenericService(GenericService genericService) {
        this.genericService = genericService;
    }

}