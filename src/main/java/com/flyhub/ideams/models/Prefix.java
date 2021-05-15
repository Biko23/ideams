package com.flyhub.ideams.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "admin_lookup_prefix")
public class Prefix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prefix_id")
	private Integer prefix_id;

	@Column(name = "prefix_name")
	private String prefixName;
	@Column(name = "prefix_code")
	private String prefixCode;
	@Column(name = "prefix_label")
	private String prefixLabel;
	@Column(name = "prefix_description")
	private String prefixDescription;

	// Lookup table fields
	@Column(name = "prefix_status")
	private String prefixStatus;
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

	public Integer getPrefix_id() {
		return prefix_id;
	}

	public void setPrefix_id(Integer prefix_id) {
		this.prefix_id = prefix_id;
	}

	public String getPrefixName() {
		return prefixName;
	}

	public void setPrefixName(String prefixName) {
		this.prefixName = prefixName;
	}

	public String getPrefixCode() {
		return prefixCode;
	}

	public void setPrefixCode(String prefixCode) {
		this.prefixCode = prefixCode;
	}

	public String getPrefixLabel() {
		return prefixLabel;
	}

	public void setPrefixLabel(String prefixLabel) {
		this.prefixLabel = prefixLabel;
	}

	public String getPrefixDescription() {
		return prefixDescription;
	}

	public void setPrefixDescription(String prefixDescription) {
		this.prefixDescription = prefixDescription;
	}

	public String getPrefixStatus() {
		return prefixStatus;
	}

	public void setPrefixStatus(String prefixStatus) {
		this.prefixStatus = prefixStatus;
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
