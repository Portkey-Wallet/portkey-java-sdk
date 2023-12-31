package io.aelf.portkey.internal.model.guardian;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.aelf.portkey.internal.model.common.AccountOriginalType;

public class GuardianDTO {

    @JsonProperty("guardianIdentifier")
    private String guardianIdentifier;
    @JsonProperty("identifierHash")
    private String identifierHash;
    @JsonProperty("isLoginGuardian")
    private boolean isLoginGuardian;
    @JsonProperty("salt")
    private String salt;
    /**
     * @see AccountOriginalType
     */
    @JsonProperty("type")
    private String type;
    @JsonProperty("verifierId")
    private String verifierId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVerifierId() {
        return verifierId;
    }

    public void setVerifierId(String verifierId) {
        this.verifierId = verifierId;
    }

    public String getGuardianIdentifier() {
        return guardianIdentifier;
    }

    public void setGuardianIdentifier(String guardianIdentifier) {
        this.guardianIdentifier = guardianIdentifier;
    }

    public String getIdentifierHash() {
        return identifierHash;
    }

    public void setIdentifierHash(String identifierHash) {
        this.identifierHash = identifierHash;
    }

    public boolean getIsLoginGuardian() {
        return isLoginGuardian;
    }

    public void setIsLoginGuardian(boolean loginGuardian) {
        isLoginGuardian = loginGuardian;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}