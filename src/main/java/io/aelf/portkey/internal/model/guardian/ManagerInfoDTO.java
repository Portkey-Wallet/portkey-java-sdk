package io.aelf.portkey.internal.model.guardian;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nullable;

public class ManagerInfoDTO {

    @JsonProperty("address")
    private String address;
    @JsonProperty("extraData")
    private String extraData;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public @Nullable String getExtraData() {
        return extraData;
    }

    public void setExtraData(@Nullable String extraData) {
        this.extraData = extraData;
    }
}
