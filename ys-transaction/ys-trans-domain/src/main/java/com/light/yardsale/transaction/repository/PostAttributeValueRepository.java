/**
 * 
 */
package com.light.yardsale.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.light.yardsale.transaction.entity.PostAttributeValue;

/**
 * @author kiranlal
 *
 */
@Component
public interface PostAttributeValueRepository extends JpaRepository<PostAttributeValue, Long>{

}
