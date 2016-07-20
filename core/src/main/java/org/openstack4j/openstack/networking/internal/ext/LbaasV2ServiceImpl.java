package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.Apis;
import org.openstack4j.api.networking.ext.HealthMonitorV2Service;
import org.openstack4j.api.networking.ext.LbPoolV2Service;
import org.openstack4j.api.networking.ext.LbaasV2Service;
import org.openstack4j.api.networking.ext.ListenerService;
import org.openstack4j.api.networking.ext.LoadBalancerV2Service;
import org.openstack4j.api.networking.ext.MemberV2Service;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

/**
 * OpenStack (Neutron) lbaas v2 service implementation
 * @author emjburns
 */
public class LbaasV2ServiceImpl extends BaseNetworkingServices implements LbaasV2Service{
    /**
     * {@inheritDoc}
     */
    @Override
    public MemberV2Service memberV2(){
        return Apis.get(MemberV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListenerService listener(){
        return Apis.get(ListenerService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LbPoolV2Service lbPoolV2(){
        return Apis.get(LbPoolV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthMonitorV2Service healthMonitorV2(){
        return Apis.get(HealthMonitorV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2Service loadbalancerV2(){
        return Apis.get(LoadBalancerV2Service.class);
    }
}
