package com.upc.springfield.rest;

import com.upc.springfield.entidades.TipoIncidencia;
import com.upc.springfield.negocio.ServicioTipoIncidenciaCore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class ServicioTipoIncidenciaRest {
    @Autowired
    private ServicioTipoIncidenciaCore servicioTipoIncidenciaCore;

    @PostMapping("/tipoincidencia")
    public TipoIncidencia registrar(@RequestBody TipoIncidencia tipoIncidencia){
        return servicioTipoIncidenciaCore.registrarTipoIncidencia(tipoIncidencia);
    }

    @GetMapping("/tiposIncidencia/listar")
    public List<TipoIncidencia> listarTiposIncidencia(){
        return servicioTipoIncidenciaCore.listarTiposIncidencia();
    }

}
