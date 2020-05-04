package com.optum.propel.rulesengine.credentialing.models;

import java.io.Serializable;

/**
 * @author svince15
 * The credentialing response
 */

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
public class DetermineCredentialingResponse implements Serializable {
    private String credentialingRequired;
    private String credentialingEntity;
    private String message;
    private String credentialingEntityUrl;
    private String credEntityPhoneNumber;
    private String salesForceRecordType;

    public String getCredentialingRequired() {
        return credentialingRequired;
    }

    public void setCredentialingRequired(String credentialingRequired) {
        this.credentialingRequired = credentialingRequired;
    }

    public String getCredentialingEntity() {
        return credentialingEntity;
    }

    public void setCredentialingEntity(String credentialingEntity) {
        this.credentialingEntity = credentialingEntity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCredentialingEntityUrl() {
        return credentialingEntityUrl;
    }

    public void setCredentialingEntityUrl(String credentialingEntityUrl) {
        this.credentialingEntityUrl = credentialingEntityUrl;
    }

    public String getCredEntityPhoneNumber() {
        return credEntityPhoneNumber;
    }

    public void setCredEntityPhoneNumber(String credEntityPhoneNumber) {
        this.credEntityPhoneNumber = credEntityPhoneNumber;
    }

    public String getSalesForceRecordType() {
        return salesForceRecordType;
    }

    public void setSalesForceRecordType(String salesForceRecordType) {
        this.salesForceRecordType = salesForceRecordType;
    }
}
