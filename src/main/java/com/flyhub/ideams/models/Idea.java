package com.flyhub.ideams.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "idea_table")
public class Idea {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "idea_id")
	private String idea_id;
	
	@ManyToOne
	@JoinColumn(name="global_user_id", insertable = false, updatable = false)
	private User user;
	
	private String global_user_id;

	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "executive_summary")
	private String executiveSummary;
	@Column(name = "background_idea_description")
	private String backgroundIdeaDescription;
	@Column(name = "submission_date")
	private String submissionDate;
	@Column(name = "priority_id")
	private String priorityId;
	@Column(name = "approval_status")
	private String approvalStatus;
	@Column(name = "workflow_status")
	private String workflowStatus;
	@Column(name = "has_attachment")
	private boolean hasAttchment;

	@Column(name = "tenant_id")
	private String tenant_id;

	// Audit fields
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "created_by_global_user_id")
	private String createdBy;
	@Column(name = "modified_date")
	private Date modifiedDate;
	@Column(name = "modified_by_global_user_id")
	private String modifiedBy;
	@Column(name = "status_id")
	private Integer status_id;
	@Column(name = "modified_reason")
	private String modifiedReason;

	public String getIdea_id() {
		return idea_id;
	}

	public void setIdea_id(String idea_id) {
		this.idea_id = idea_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExecutiveSummary() {
		return executiveSummary;
	}

	public void setExecutiveSummary(String executiveSummary) {
		this.executiveSummary = executiveSummary;
	}

	public String getBackgroundIdeaDescription() {
		return backgroundIdeaDescription;
	}

	public void setBackgroundIdeaDescription(String backgroundIdeaDescription) {
		this.backgroundIdeaDescription = backgroundIdeaDescription;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(String priorityId) {
		this.priorityId = priorityId;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getWorkflowStatus() {
		return workflowStatus;
	}

	public void setWorkflowStatus(String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	public boolean isHasAttchment() {
		return hasAttchment;
	}

	public void setHasAttchment(boolean hasAttchment) {
		this.hasAttchment = hasAttchment;
	}

	public String getTenant_id() {
		return tenant_id;
	}

	public void setTenant_id(String tenant_id) {
		this.tenant_id = tenant_id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Integer getStatus_id() {
		return status_id;
	}

	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}

	public String getModifiedReason() {
		return modifiedReason;
	}

	public void setModifiedReason(String modifiedReason) {
		this.modifiedReason = modifiedReason;
	}

}
