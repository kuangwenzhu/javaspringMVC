package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-11-29T02:56:20.966Z")

@RestSchema(schemaId = "project5eu0")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Project5eu0Impl {

    @Autowired
    private Project5eu0Delegate userProject5eu0Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject5eu0Delegate.helloworld(name);
    }

}
