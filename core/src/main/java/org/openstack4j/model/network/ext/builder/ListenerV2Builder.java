package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.network.ext.ListenerV2;
import org.openstack4j.model.network.ext.Protocol;

public interface ListenerV2Builder extends Buildable.Builder<ListenerV2Builder, ListenerV2> {
    /**
     * @param tenantId
     *            Owner of the listener. Only an administrative user can specify a
     *            tenant ID other than its own.
     * @return ListenerV2Builder
     */
    ListenerV2Builder tenantId(String tenantId);

    /**
     * @param protocol
     *            The protocol of the VIP address. A valid value is TCP, HTTP,
     *            or HTTPS.
     * @return ListenerV2Builder
     */
    ListenerV2Builder protocol(Protocol protocol);

    /**
     * The port in which the frontend will be listening. Must be an integer in the range of 1-65535
     * @param protocolPort
     * @return ListenerV2Builder
     */
    ListenerV2Builder protocolPort(Integer protocolPort);

    /**
     * The load balancer this listener will be provisioned on. A tenant can only create listeners on
     * load balancers authorized by policy (e.g. her own load balancers).
     * @param loadbalancerId
     * @return ListenerV2Builder
     */
    ListenerV2Builder loadBalancerId(String loadbalancerId);

    /**
     * Optional
     * @param adminStateUp
     *            The administrative state of the VIP. A valid value is true
     *            (UP) or false (DOWN). Default is true
     * @return ListenerV2Builder
     */
    ListenerV2Builder adminStateUp(boolean adminStateUp);

    /**
     *  Optional
     *
     * @param name
     *            Pool name. Does not have to be unique.
     * @return ListenerV2Builder
     */
    ListenerV2Builder name(String name);

    /**
     * Optional
     *
     * @param description
     *            Description for the pool.
     * @return ListenerV2Builder
     */
    ListenerV2Builder description(String description);

    /**
     * Optional
     *
     * The default value for this attribute will be -1, indicating an infinite limit.
     * @param connectionLimit
     * @return ListenerV2Builder
     */
    ListenerV2Builder connectionLimit(Integer connectionLimit);
}
