package com.app.test2.function;

import com.app.test2.model.Manager;
import com.app.test2.model.Pet;
import com.app.test2.model.PetCareCenter;
import com.app.test2.model.PetOwner;
import com.app.test2.model.Document;
import com.app.test2.model.PetService;
import com.app.test2.enums.PetServiceType;
import com.app.test2.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.test2.repository.PetServiceRepository;
import com.app.test2.repository.PetOwnerRepository;
import com.app.test2.repository.PetCareCenterRepository;
import com.app.test2.repository.ManagerRepository;
import com.app.test2.repository.DocumentRepository;
import com.app.test2.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
