package com.app.test2.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.test2.model.Manager;
import com.app.test2.model.Pet;
import com.app.test2.model.PetCareCenter;
import com.app.test2.model.PetOwner;
import com.app.test2.model.Document;
import com.app.test2.model.PetService;
import com.app.test2.enums.PetServiceType;
import com.app.test2.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterServices")
@Table(schema = "\"test2\"", name = "\"PetCareCenterServices\"")
@Data
public class PetCareCenterServices{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"ServiceId\"")
    private Integer serviceId;
 
}