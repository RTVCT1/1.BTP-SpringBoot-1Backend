package com.btp.backend.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.btp.backend.entities.Vendor;

@RepositoryRestResource(collectionResourceRel="vendor", path="newVendor")
public interface IVendorServiceNew extends JpaRepository<Vendor, Long> {

}
