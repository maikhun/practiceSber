package com.sbertech.credit_payment.repos;


import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepo extends CrudRepository<User, Long> {

}
