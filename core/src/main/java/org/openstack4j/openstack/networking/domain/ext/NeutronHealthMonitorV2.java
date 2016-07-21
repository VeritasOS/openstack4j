package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.Objects;
import org.openstack4j.model.network.ext.HealthMonitorV2;
import org.openstack4j.model.network.ext.HealthMonitorV2Type;
import org.openstack4j.model.network.ext.LbPoolV2;
import org.openstack4j.model.network.ext.builder.HealthMonitorV2Builder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * A lbaas v2 health monitor entity
 * @author ashleykasim
 */
@JsonRootName("health_monitor_v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronHealthMonitorV2 implements HealthMonitorV2{
    private String id;

    @JsonProperty("tenant_id")
    private String tenantId;

    private HealthMonitorV2Type type;
    private Integer delay;
    private Integer timeout;

    /**
     * Number of allowed connection failures before changing the status of the member to INACTIVE. A valid value is from 1 to 10.
     */
    @JsonProperty("max_retries")
    private Integer maxRetries;

    /**
     * The HTTP method that the monitor uses for requests.
     */
    @JsonProperty("http_method")
    private String httpMethod ;

    /**
     * URL
     */
    @JsonProperty("url_path")
    private String urlPath ;

    /**
     * default 200
     */
    @JsonProperty("expected_codes")
    private String expectedCodes  ;

    /**
     * The administrative state of the health monitor, which is up (true) or down (false)
     */
    @JsonProperty("admin_state_up")
    private boolean adminStateUp ;

    private List<LbPoolV2> pools;

    @Override
    public String getId(){
        return id;
    }

    @Override
    public String getTenantId(){
        return tenantId;
    }

    @Override
    public HealthMonitorV2Type getType(){
        return type;
    }

    @Override
    public Integer getDelay(){
        return delay;
    }

    @Override
    public Integer getTimeout(){
        return timeout;
    }

    @Override
    public Integer getMaxRetries(){
        return maxRetries;
    }

    @Override
    public String getHttpMethod(){
        return httpMethod;
    }

    @Override
    public String getUrlPath(){
        return urlPath;
    }

    @Override
    public String getExpectedCodes(){
        return expectedCodes;
    }

    @Override
    public boolean isAdminStateUp(){
        return adminStateUp;
    }

    @Override
    public List<LbPoolV2> getPools(){
        return pools;
    }


    /**
     * wrap this healthMonitorV2 to a builder
     * @return HealthMonitorV2Builder
     */
    @Override
    public HealthMonitorV2Builder toBuilder(){
        return new HealthMonitorV2Concretebuilder(this);
    }

    /**
     * @return HealthMonitorV2Builder
     */
    public static HealthMonitorV2Builder builder(){
        return new HealthMonitorV2Concretebuilder();
    }

    @Override
    public String toString(){
        return "NeutronHealthMonitorV2{" +
                "id='" + id + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", type=" + type +
                ", delay=" + delay +
                ", timeout=" + timeout +
                ", maxRetries=" + maxRetries +
                ", httpMethod='" + httpMethod + '\'' +
                ", urlPath='" + urlPath + '\'' +
                ", expectedCodes='" + expectedCodes + '\'' +
                ", adminStateUp=" + adminStateUp +
                ", pools=" + pools +
                '}';
    }

    public static class HealthMonitorsV2 extends ListResult<NeutronHealthMonitorV2> {

        @JsonProperty("health_monitors_v2")
        List<NeutronHealthMonitorV2> healthMonitors;
        @Override
        public List<NeutronHealthMonitorV2> value() {
            return healthMonitors;
        }
        @Override
        public String toString() {
            return Objects.toStringHelper(this).omitNullValues()
                    .add("healthMonitorsV2", healthMonitors).toString();
        }
    }

    public static class HealthMonitorV2Concretebuilder implements HealthMonitorV2Builder {
        NeutronHealthMonitorV2 m;
        @Override
        public HealthMonitorV2 build() {
            return m;
        }
        public HealthMonitorV2Concretebuilder(){
            this(new NeutronHealthMonitorV2());
        }
        public HealthMonitorV2Concretebuilder(NeutronHealthMonitorV2 m){
            this.m = m;
        }
        @Override
        public HealthMonitorV2Builder from(HealthMonitorV2 in) {
            this.m = (NeutronHealthMonitorV2)in;
            return this;
        }
        /**
         *
         * {@inheritDoc}
         */
        @Override
        public HealthMonitorV2Builder tenantId(String tenantId) {
            m.tenantId = tenantId;
            return this;
        }

        /**
         *
         * {@inheritDoc}
         */
        @Override
        public HealthMonitorV2Builder type(HealthMonitorV2Type type) {
            m.type = type;
            return this;
        }

        /**
         *
         * {@inheritDoc}
         */
        @Override
        public HealthMonitorV2Builder delay(Integer delay) {
            m.delay = delay;
            return this;
        }

        /**
         *
         * {@inheritDoc}
         */
        @Override
        public HealthMonitorV2Builder timeout(Integer timeout) {
            m.timeout = timeout;
            return this;
        }

        /**
         *
         * {@inheritDoc}
         */
        @Override
        public HealthMonitorV2Builder maxRetries(Integer maxRetries) {
            m.maxRetries = maxRetries;
            return this;
        }

        /**
         *
         * {@inheritDoc}
         */
        @Override
        public HealthMonitorV2Builder urlPath(String urlPath) {
            m.urlPath = urlPath;
            return this;
        }

        /**
         *
         * {@inheritDoc}
         */
        @Override
        public HealthMonitorV2Builder expectedCodes(String expectedCodes) {
            m.expectedCodes = expectedCodes;
            return this;
        }

        /**
         *
         * {@inheritDoc}2
         */
        @Override
        public HealthMonitorV2Builder httpMethod(String httpMethod) {
            m.httpMethod = httpMethod;
            return this;
        }

        /**
         *
         * {@inheritDoc}
         */
        @Override
        public HealthMonitorV2Builder adminStateUp(boolean adminStateUp) {
            m.adminStateUp = adminStateUp;
            return this;
        }

        /**
         *
         * {@inheritDoc}
         */
        @Override
        public HealthMonitorV2Builder pools(List<LbPoolV2> pools) {
            m.pools = pools;
            return this;
        }
    }
}
