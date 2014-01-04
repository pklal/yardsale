/**
 * 
 */
package com.light.yardsale.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.light.yardsale.transaction.entity.PostTransaction;

/**
 * @author kiranlal
 *
 */
@Component
public interface PostTransactionRepository extends JpaRepository<PostTransaction, Long>{

}
