package com.flyhub.ideams.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private Integer country_id;

	@Column(name = "continentid")
	private String continentid;

	@Column(name = "country_alias")
	private String countryAlias;
	@Column(name = "country_code")
	private String countryCode;
	@Column(name = "country_description")
	private String countryDescription;
	@Column(name = "country_dialing_code")
	private String countrydialingCode;
	@Column(name = "country_initial")
	private String countryInitial;
	@Column(name = "country_label")
	private String countryLabel;
	@Column(name = "country_name")
	private String countryName;

	// Lookup table fields
	@Column(name = "country_status")
	private String countryStatus;
	@Column(name = "sequence_number")
	private Integer sequenceNumber;
	@Column(name = "is_default")
	private Boolean isDefault;
	@Column(name = "restrict_customization")
	private Boolean restrictCustomization;
	@Column(name = "tenant_id")
	private String tenant_id;

	// Audit fields
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "modified_date")
	private Date modifiedDate;
	@Column(name = "modified_by")
	private String modifiedBy;
	@Column(name = "modified_reason")
	private String modifiedReason;

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public String getContinentid() {
		return continentid;
	}

	public void setContinentid(String continentid) {
		this.continentid = continentid;
	}

	public String getCountryAlias() {
		return countryAlias;
	}

	public void setCountryAlias(String countryAlias) {
		this.countryAlias = countryAlias;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryDescription() {
		return countryDescription;
	}

	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
	}

	public String getCountrydialingCode() {
		return countrydialingCode;
	}

	public void setCountrydialingCode(String countrydialingCode) {
		this.countrydialingCode = countrydialingCode;
	}

	public String getCountryInitial() {
		return countryInitial;
	}

	public void setCountryInitial(String countryInitial) {
		this.countryInitial = countryInitial;
	}

	public String getCountryLabel() {
		return countryLabel;
	}

	public void setCountryLabel(String countryLabel) {
		this.countryLabel = countryLabel;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryStatus() {
		return countryStatus;
	}

	public void setCountryStatus(String countryStatus) {
		this.countryStatus = countryStatus;
	}

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
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

	public String getModifiedReason() {
		return modifiedReason;
	}

	public void setModifiedReason(String modifiedReason) {
		this.modifiedReason = modifiedReason;
	}

}
