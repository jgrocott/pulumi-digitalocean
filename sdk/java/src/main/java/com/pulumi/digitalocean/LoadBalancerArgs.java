// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.enums.Algorithm;
import com.pulumi.digitalocean.enums.Region;
import com.pulumi.digitalocean.inputs.LoadBalancerForwardingRuleArgs;
import com.pulumi.digitalocean.inputs.LoadBalancerHealthcheckArgs;
import com.pulumi.digitalocean.inputs.LoadBalancerStickySessionsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `round_robin`
     * or `least_connections`. The default value is `round_robin`.
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<Either<String,Algorithm>> algorithm;

    /**
     * @return The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `round_robin`
     * or `least_connections`. The default value is `round_robin`.
     * 
     */
    public Optional<Output<Either<String,Algorithm>>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * A boolean value indicating whether to disable automatic DNS record creation for Let&#39;s Encrypt certificates that are added to the load balancer. Default value is `false`.
     * 
     */
    @Import(name="disableLetsEncryptDnsRecords")
    private @Nullable Output<Boolean> disableLetsEncryptDnsRecords;

    /**
     * @return A boolean value indicating whether to disable automatic DNS record creation for Let&#39;s Encrypt certificates that are added to the load balancer. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> disableLetsEncryptDnsRecords() {
        return Optional.ofNullable(this.disableLetsEncryptDnsRecords);
    }

    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     * 
     */
    @Import(name="dropletIds")
    private @Nullable Output<List<Integer>> dropletIds;

    /**
     * @return A list of the IDs of each droplet to be attached to the Load Balancer.
     * 
     */
    public Optional<Output<List<Integer>>> dropletIds() {
        return Optional.ofNullable(this.dropletIds);
    }

    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     * 
     */
    @Import(name="dropletTag")
    private @Nullable Output<String> dropletTag;

    /**
     * @return The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     * 
     */
    public Optional<Output<String>> dropletTag() {
        return Optional.ofNullable(this.dropletTag);
    }

    /**
     * A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
     * 
     */
    @Import(name="enableBackendKeepalive")
    private @Nullable Output<Boolean> enableBackendKeepalive;

    /**
     * @return A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> enableBackendKeepalive() {
        return Optional.ofNullable(this.enableBackendKeepalive);
    }

    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     * 
     */
    @Import(name="enableProxyProtocol")
    private @Nullable Output<Boolean> enableProxyProtocol;

    /**
     * @return A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> enableProxyProtocol() {
        return Optional.ofNullable(this.enableProxyProtocol);
    }

    /**
     * A list of `forwarding_rule` to be assigned to the
     * Load Balancer. The `forwarding_rule` block is documented below.
     * 
     */
    @Import(name="forwardingRules", required=true)
    private Output<List<LoadBalancerForwardingRuleArgs>> forwardingRules;

    /**
     * @return A list of `forwarding_rule` to be assigned to the
     * Load Balancer. The `forwarding_rule` block is documented below.
     * 
     */
    public Output<List<LoadBalancerForwardingRuleArgs>> forwardingRules() {
        return this.forwardingRules;
    }

    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     * 
     */
    @Import(name="healthcheck")
    private @Nullable Output<LoadBalancerHealthcheckArgs> healthcheck;

    /**
     * @return A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     * 
     */
    public Optional<Output<LoadBalancerHealthcheckArgs>> healthcheck() {
        return Optional.ofNullable(this.healthcheck);
    }

    /**
     * The Load Balancer name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Load Balancer name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     * 
     */
    @Import(name="redirectHttpToHttps")
    private @Nullable Output<Boolean> redirectHttpToHttps;

    /**
     * @return A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> redirectHttpToHttps() {
        return Optional.ofNullable(this.redirectHttpToHttps);
    }

    /**
     * The region to start in
     * 
     */
    @Import(name="region", required=true)
    private Output<Either<String,Region>> region;

    /**
     * @return The region to start in
     * 
     */
    public Output<Either<String,Region>> region() {
        return this.region;
    }

    /**
     * The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `size_unit` may be provided.
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `size_unit` may be provided.
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `size_unit` may be provided.
     * 
     */
    @Import(name="sizeUnit")
    private @Nullable Output<Integer> sizeUnit;

    /**
     * @return The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `size_unit` may be provided.
     * 
     */
    public Optional<Output<Integer>> sizeUnit() {
        return Optional.ofNullable(this.sizeUnit);
    }

    /**
     * A `sticky_sessions` block to be assigned to the
     * Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
     * 
     */
    @Import(name="stickySessions")
    private @Nullable Output<LoadBalancerStickySessionsArgs> stickySessions;

    /**
     * @return A `sticky_sessions` block to be assigned to the
     * Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
     * 
     */
    public Optional<Output<LoadBalancerStickySessionsArgs>> stickySessions() {
        return Optional.ofNullable(this.stickySessions);
    }

    /**
     * The ID of the VPC where the load balancer will be located.
     * 
     */
    @Import(name="vpcUuid")
    private @Nullable Output<String> vpcUuid;

    /**
     * @return The ID of the VPC where the load balancer will be located.
     * 
     */
    public Optional<Output<String>> vpcUuid() {
        return Optional.ofNullable(this.vpcUuid);
    }

    private LoadBalancerArgs() {}

    private LoadBalancerArgs(LoadBalancerArgs $) {
        this.algorithm = $.algorithm;
        this.disableLetsEncryptDnsRecords = $.disableLetsEncryptDnsRecords;
        this.dropletIds = $.dropletIds;
        this.dropletTag = $.dropletTag;
        this.enableBackendKeepalive = $.enableBackendKeepalive;
        this.enableProxyProtocol = $.enableProxyProtocol;
        this.forwardingRules = $.forwardingRules;
        this.healthcheck = $.healthcheck;
        this.name = $.name;
        this.redirectHttpToHttps = $.redirectHttpToHttps;
        this.region = $.region;
        this.size = $.size;
        this.sizeUnit = $.sizeUnit;
        this.stickySessions = $.stickySessions;
        this.vpcUuid = $.vpcUuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerArgs $;

        public Builder() {
            $ = new LoadBalancerArgs();
        }

        public Builder(LoadBalancerArgs defaults) {
            $ = new LoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm The load balancing algorithm used to determine
         * which backend Droplet will be selected by a client. It must be either `round_robin`
         * or `least_connections`. The default value is `round_robin`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable Output<Either<String,Algorithm>> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm The load balancing algorithm used to determine
         * which backend Droplet will be selected by a client. It must be either `round_robin`
         * or `least_connections`. The default value is `round_robin`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(Either<String,Algorithm> algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param algorithm The load balancing algorithm used to determine
         * which backend Droplet will be selected by a client. It must be either `round_robin`
         * or `least_connections`. The default value is `round_robin`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(String algorithm) {
            return algorithm(Either.ofLeft(algorithm));
        }

        /**
         * @param algorithm The load balancing algorithm used to determine
         * which backend Droplet will be selected by a client. It must be either `round_robin`
         * or `least_connections`. The default value is `round_robin`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(Algorithm algorithm) {
            return algorithm(Either.ofRight(algorithm));
        }

        /**
         * @param disableLetsEncryptDnsRecords A boolean value indicating whether to disable automatic DNS record creation for Let&#39;s Encrypt certificates that are added to the load balancer. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableLetsEncryptDnsRecords(@Nullable Output<Boolean> disableLetsEncryptDnsRecords) {
            $.disableLetsEncryptDnsRecords = disableLetsEncryptDnsRecords;
            return this;
        }

        /**
         * @param disableLetsEncryptDnsRecords A boolean value indicating whether to disable automatic DNS record creation for Let&#39;s Encrypt certificates that are added to the load balancer. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableLetsEncryptDnsRecords(Boolean disableLetsEncryptDnsRecords) {
            return disableLetsEncryptDnsRecords(Output.of(disableLetsEncryptDnsRecords));
        }

        /**
         * @param dropletIds A list of the IDs of each droplet to be attached to the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder dropletIds(@Nullable Output<List<Integer>> dropletIds) {
            $.dropletIds = dropletIds;
            return this;
        }

        /**
         * @param dropletIds A list of the IDs of each droplet to be attached to the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder dropletIds(List<Integer> dropletIds) {
            return dropletIds(Output.of(dropletIds));
        }

        /**
         * @param dropletIds A list of the IDs of each droplet to be attached to the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder dropletIds(Integer... dropletIds) {
            return dropletIds(List.of(dropletIds));
        }

        /**
         * @param dropletTag The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder dropletTag(@Nullable Output<String> dropletTag) {
            $.dropletTag = dropletTag;
            return this;
        }

        /**
         * @param dropletTag The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder dropletTag(String dropletTag) {
            return dropletTag(Output.of(dropletTag));
        }

        /**
         * @param enableBackendKeepalive A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBackendKeepalive(@Nullable Output<Boolean> enableBackendKeepalive) {
            $.enableBackendKeepalive = enableBackendKeepalive;
            return this;
        }

        /**
         * @param enableBackendKeepalive A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBackendKeepalive(Boolean enableBackendKeepalive) {
            return enableBackendKeepalive(Output.of(enableBackendKeepalive));
        }

        /**
         * @param enableProxyProtocol A boolean value indicating whether PROXY
         * Protocol should be used to pass information from connecting client requests to
         * the backend service. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableProxyProtocol(@Nullable Output<Boolean> enableProxyProtocol) {
            $.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        /**
         * @param enableProxyProtocol A boolean value indicating whether PROXY
         * Protocol should be used to pass information from connecting client requests to
         * the backend service. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
            return enableProxyProtocol(Output.of(enableProxyProtocol));
        }

        /**
         * @param forwardingRules A list of `forwarding_rule` to be assigned to the
         * Load Balancer. The `forwarding_rule` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder forwardingRules(Output<List<LoadBalancerForwardingRuleArgs>> forwardingRules) {
            $.forwardingRules = forwardingRules;
            return this;
        }

        /**
         * @param forwardingRules A list of `forwarding_rule` to be assigned to the
         * Load Balancer. The `forwarding_rule` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder forwardingRules(List<LoadBalancerForwardingRuleArgs> forwardingRules) {
            return forwardingRules(Output.of(forwardingRules));
        }

        /**
         * @param forwardingRules A list of `forwarding_rule` to be assigned to the
         * Load Balancer. The `forwarding_rule` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder forwardingRules(LoadBalancerForwardingRuleArgs... forwardingRules) {
            return forwardingRules(List.of(forwardingRules));
        }

        /**
         * @param healthcheck A `healthcheck` block to be assigned to the
         * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
         * 
         * @return builder
         * 
         */
        public Builder healthcheck(@Nullable Output<LoadBalancerHealthcheckArgs> healthcheck) {
            $.healthcheck = healthcheck;
            return this;
        }

        /**
         * @param healthcheck A `healthcheck` block to be assigned to the
         * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
         * 
         * @return builder
         * 
         */
        public Builder healthcheck(LoadBalancerHealthcheckArgs healthcheck) {
            return healthcheck(Output.of(healthcheck));
        }

        /**
         * @param name The Load Balancer name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Load Balancer name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redirectHttpToHttps A boolean value indicating whether
         * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
         * Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder redirectHttpToHttps(@Nullable Output<Boolean> redirectHttpToHttps) {
            $.redirectHttpToHttps = redirectHttpToHttps;
            return this;
        }

        /**
         * @param redirectHttpToHttps A boolean value indicating whether
         * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
         * Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder redirectHttpToHttps(Boolean redirectHttpToHttps) {
            return redirectHttpToHttps(Output.of(redirectHttpToHttps));
        }

        /**
         * @param region The region to start in
         * 
         * @return builder
         * 
         */
        public Builder region(Output<Either<String,Region>> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region to start in
         * 
         * @return builder
         * 
         */
        public Builder region(Either<String,Region> region) {
            return region(Output.of(region));
        }

        /**
         * @param region The region to start in
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Either.ofLeft(region));
        }

        /**
         * @param region The region to start in
         * 
         * @return builder
         * 
         */
        public Builder region(Region region) {
            return region(Either.ofRight(region));
        }

        /**
         * @param size The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `size_unit` may be provided.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `size_unit` may be provided.
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param sizeUnit The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `size_unit` may be provided.
         * 
         * @return builder
         * 
         */
        public Builder sizeUnit(@Nullable Output<Integer> sizeUnit) {
            $.sizeUnit = sizeUnit;
            return this;
        }

        /**
         * @param sizeUnit The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `size_unit` may be provided.
         * 
         * @return builder
         * 
         */
        public Builder sizeUnit(Integer sizeUnit) {
            return sizeUnit(Output.of(sizeUnit));
        }

        /**
         * @param stickySessions A `sticky_sessions` block to be assigned to the
         * Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
         * 
         * @return builder
         * 
         */
        public Builder stickySessions(@Nullable Output<LoadBalancerStickySessionsArgs> stickySessions) {
            $.stickySessions = stickySessions;
            return this;
        }

        /**
         * @param stickySessions A `sticky_sessions` block to be assigned to the
         * Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
         * 
         * @return builder
         * 
         */
        public Builder stickySessions(LoadBalancerStickySessionsArgs stickySessions) {
            return stickySessions(Output.of(stickySessions));
        }

        /**
         * @param vpcUuid The ID of the VPC where the load balancer will be located.
         * 
         * @return builder
         * 
         */
        public Builder vpcUuid(@Nullable Output<String> vpcUuid) {
            $.vpcUuid = vpcUuid;
            return this;
        }

        /**
         * @param vpcUuid The ID of the VPC where the load balancer will be located.
         * 
         * @return builder
         * 
         */
        public Builder vpcUuid(String vpcUuid) {
            return vpcUuid(Output.of(vpcUuid));
        }

        public LoadBalancerArgs build() {
            $.forwardingRules = Objects.requireNonNull($.forwardingRules, "expected parameter 'forwardingRules' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}