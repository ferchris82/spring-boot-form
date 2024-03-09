package com.bolsadeideas.springoboot.app.springbootform.controllers.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bolsadeideas.springoboot.app.springbootform.services.RoleService;


@Component
public class RolesEditor extends PropertyEditorSupport{

    @Autowired
    private RoleService service;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            Integer id = Integer.parseInt(text);
            setValue(service.obtenerPorId(id));
        } catch (NumberFormatException e) {
            setValue(null);
        }
    }
    
}
