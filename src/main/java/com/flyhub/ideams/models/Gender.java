package com.flyhub.ideams.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_lookup_gender")
public class Gender {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gender_id")
	private Integer gender_id;

	@Column(name = "gender_code")
	private String genderCode;
	@Column(name = "gender_label")
	private String genderLabel;
	@Column(name = "gender_description")
	private String genderDescription;

	// Lookup table fields
	@Column(name = "gender_status")
	private String genderStatus;
	@Column(name = "sequence_number")
	private Integer sequenceNumbe;
	@Column(name = "is_default")
	private Boolean isDefault;
	@Column(name = "restrict_customization")
	private Boolean restrictCustomization;

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

	public Integer getGender_id() {
		return gender_id;
	}

	public void setGender_id(Integer gender_id) {
		this.gender_id = gender_id;
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderLabel() {
		return genderLabel;
	}

	public void setGenderLabel(String genderLabel) {
		this.genderLabel = genderLabel;
	}

	public String getGenderDescription() {
		return genderDescription;
	}

	public void setGenderDescription(String genderDescription) {
		this.genderDescription = genderDescription;
	}

	public String getGenderStatus() {
		return genderStatus;
	}

	public void setGenderStatus(String genderStatus) {
		this.genderStatus = genderStatus;
	}

	public Integer getSequenceNumbe() {
		return sequenceNumbe;
	}

	public void setSequenceNumbe(Integer sequenceNumbe) {
		this.sequenceNumbe = sequenceNumbe;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Boolean getRestrictCustomization() {
		return restrictCustomization;
	}

	public void setRestrictCustomization(Boolean restrictCustomization) {
		this.restrictCustomization = restrictCustomization;
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
