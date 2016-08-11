package org.openstack4j.model.network.ext;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ListenerProtocol {
    HTTP,
    HTTPS,
    TERMINATED_HTTPS,
    TCP;

    @JsonCreator
    public static ListenerProtocol forValue(String value) {
        if (value != null)
        {
            for (ListenerProtocol s : ListenerProtocol.values()) {
                if (s.name().equalsIgnoreCase(value)) {
                    return s;
                }
            }
        }
        return ListenerProtocol.HTTP;
    }
}
