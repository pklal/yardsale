/**
 * 
 */
package com.light.yardsale.transaction.transferobjects;

import java.util.List;

/**
 * @author kiranlal
 *
 */
public class PostSummarySO {

	private List<SummarySO> postSummaries;

	public List<SummarySO> getPostSummaries() {
		return postSummaries;
	}

	public void setPostSummaries(List<SummarySO> postSummaries) {
		this.postSummaries = postSummaries;
	}

	@Override
	public String toString() {
		return "PostSummarySO [postSummaries=" + postSummaries + "]";
	}
	
}
