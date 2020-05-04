package com.optum.propel.rulesengine.credentialing.models;

import java.io.Serializable;

/**
 * @author svince15
 * The credentialing request model
 */

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
public class DetermineCredentialingRequest implements Serializable {
    private String credType;
    private boolean isActiveContracts;
    private DetermineCredentialingResponse response;

    public String getCredType() {
        return credType;
    }

    public void setCredType(String credType) {
        this.credType = credType;
    }

    public boolean isActiveContracts() {
        return isActiveContracts;
    }

    public void setActiveContracts(boolean activeContracts) {
        isActiveContracts = activeContracts;
    }

    public DetermineCredentialingResponse getResponse() {
        return response;
    }

    public void setResponse(DetermineCredentialingResponse response) {
        this.response = response;
    }
}
