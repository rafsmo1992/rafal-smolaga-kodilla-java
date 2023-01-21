package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Long> {

    @Query
    List<Company> findByTheFirstThreeLetters(@Param("NAME") String name);
    @Query
    List<Company> findCompaniesWithNameThatContains(@Param("ARG") String anyString);
}