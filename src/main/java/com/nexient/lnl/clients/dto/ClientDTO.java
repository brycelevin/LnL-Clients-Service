package com.nexient.lnl.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientDTO {
    @JsonProperty("ClientId")
    Integer clientId;

    @JsonProperty("ClientName")
    String clientName;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
