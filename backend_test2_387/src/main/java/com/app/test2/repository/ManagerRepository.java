package com.app.test2.repository;

import com.app.test2.model.Manager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ManagerRepository extends SimpleJpaRepository<Manager, String> {
    private final EntityManager em;
    public ManagerRepository(EntityManager em) {
        super(Manager.class, em);
        this.em = em;
    }
    @Override
    public List<Manager> findAll() {
        return em.createNativeQuery("Select * from \"test2\".\"Manager\"", Manager.class).getResultList();
    }
}