/**
 * 
 */
package com.light.yardsale.transaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.light.yardsale.transaction.entity.PostTransaction;

/**
 * @author kiranlal
 *
 */
@Component
public interface PostTransactionRepository extends JpaRepository<PostTransaction, Long>{

	@Query("select count(u), u.itemCode from PostTransaction u group by u.itemCode")
    List<Object[]> findSummaryDetails();
    
    
	@Query("select u from PostTransaction u where u.postType=:postType and u.itemCode = :itemCode  order by u.createdDate desc ")
    List<PostTransaction> findTransactions(@Param("postType") String postType, @Param("itemCode") String itemCode);
}
