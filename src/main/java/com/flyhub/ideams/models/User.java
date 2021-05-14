package com.flyhub.ideams.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_table")
public class User {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "global_user_id")
	private String global_user_id;

	// Login details
	@Column(name = "user_name")
	private String username;
	@Column(name = "password")
	private String password;

	// Personal details
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "other_name")
	private String otherName;
	@Column(name = "full_name")
	private String fullName;
	@Column(name = "gender_id")
	private Integer gender_id;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	@Column(name = "nin")
	private String nin;
	@Column(name = "card_number")
	private String cardNumber;
	@Column(name = "country_id")
	private Integer country_id;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "native_language")
	private String nativeLanguage;
	@Column(name = "prefix_id")
	private String prefix_id;
	@Column(name = "postfix_id")
	private Integer postfix_id;

	// Contact details
	@Column(name = "primary_phone")
	private String primaryPhone;
	@Column(name = "secondary_phone")
	private String secondaryPhone;
	@Column(name = "primary_email")
	private String primaryEmail;
	@Column(name = "secondary_email")
	private String secondaryEmail;
	@Column(name = "preferred_whatsapp_number")
	private String whatsappNumber;

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

	// Role Details
	@Column(name = "tenant_id")
	private Integer tenant_id;
	@Column(name = "is_admin")
	private String isAdmin;
	@Column(name = "is_super_admin")
	private String isSuperAdmin;
	@Column(name = "is_end_user")
	private String isEndUser;
	@Column(name = "is_system_account")
	private String isSystemAccount;
	@Column(name = "is_employee")
	private String isEmployee;

//	@Column(name="user_id")
//	private String user_id;
//	@Column(name="user_id")
//	private String user_id;

	public String getGlobal_user_id() {
		return global_user_id;
	}

	public void setGlobal_user_id(String global_user_id) {
		this.global_user_id = global_user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getGender_id() {
		return gender_id;
	}

	public void setGender_id(Integer gender_id) {
		this.gender_id = gender_id;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNin() {
		return nin;
	}

	public void setNin(String nin) {
		this.nin = nin;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNativeLanguage() {
		return nativeLanguage;
	}

	public void setNativeLanguage(String nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}

	public String getPrefix_id() {
		return prefix_id;
	}

	public void setPrefix_id(String prefix_id) {
		this.prefix_id = prefix_id;
	}

	public Integer getPostfix_id() {
		return postfix_id;
	}

	public void setPostfix_id(Integer postfix_id) {
		this.postfix_id = postfix_id;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getSecondaryPhone() {
		return secondaryPhone;
	}

	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public String getWhatsappNumber() {
		return whatsappNumber;
	}

	public void setWhatsappNumber(String whatsappNumber) {
		this.whatsappNumber = whatsappNumber;
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

	public Integer getTenant_id() {
		return tenant_id;
	}

	public void setTenant_id(Integer tenant_id) {
		this.tenant_id = tenant_id;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getIsSuperAdmin() {
		return isSuperAdmin;
	}

	public void setIsSuperAdmin(String isSuperAdmin) {
		this.isSuperAdmin = isSuperAdmin;
	}

	public String getIsEndUser() {
		return isEndUser;
	}

	public void setIsEndUser(String isEndUser) {
		this.isEndUser = isEndUser;
	}

	public String getIsSystemAccount() {
		return isSystemAccount;
	}

	public void setIsSystemAccount(String isSystemAccount) {
		this.isSystemAccount = isSystemAccount;
	}

	public String getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(String isEmployee) {
		this.isEmployee = isEmployee;
	}

}
