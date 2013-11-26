/**
 * 
 */
package com.light.yardsale.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.light.yardsale.transaction.entity.PostTransaction;

/**
 * @author kiranlal
 *
 */
public interface PostTransactionRepository extends JpaRepository<PostTransaction, Long>{

}
