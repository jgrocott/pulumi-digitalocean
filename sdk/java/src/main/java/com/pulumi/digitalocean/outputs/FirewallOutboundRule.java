// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallOutboundRule {
    /**
     * @return An array of strings containing the IPv4
     * addresses, IPv6 addresses, IPv4 CIDRs, and/or IPv6 CIDRs to which the
     * outbound traffic will be allowed.
     * 
     */
    private @Nullable List<String> destinationAddresses;
    /**
     * @return An array containing the IDs of
     * the Droplets to which the outbound traffic will be allowed.
     * 
     */
    private @Nullable List<Integer> destinationDropletIds;
    /**
     * @return An array containing the IDs of
     * the Kubernetes clusters to which the outbound traffic will be allowed.
     * 
     */
    private @Nullable List<String> destinationKubernetesIds;
    /**
     * @return An array containing the IDs
     * of the Load Balancers to which the outbound traffic will be allowed.
     * 
     */
    private @Nullable List<String> destinationLoadBalancerUids;
    /**
     * @return An array containing the names of Tags
     * corresponding to groups of Droplets to which the outbound traffic will
     * be allowed.
     * 
     */
    private @Nullable List<String> destinationTags;
    /**
     * @return The ports on which traffic will be allowed
     * specified as a string containing a single port, a range (e.g. &#34;8000-9000&#34;),
     * or &#34;1-65535&#34; to open all ports for a protocol. Required for when protocol is
     * `tcp` or `udp`.
     * 
     */
    private @Nullable String portRange;
    /**
     * @return The type of traffic to be allowed.
     * This may be one of &#34;tcp&#34;, &#34;udp&#34;, or &#34;icmp&#34;.
     * 
     */
    private String protocol;

    private FirewallOutboundRule() {}
    /**
     * @return An array of strings containing the IPv4
     * addresses, IPv6 addresses, IPv4 CIDRs, and/or IPv6 CIDRs to which the
     * outbound traffic will be allowed.
     * 
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    /**
     * @return An array containing the IDs of
     * the Droplets to which the outbound traffic will be allowed.
     * 
     */
    public List<Integer> destinationDropletIds() {
        return this.destinationDropletIds == null ? List.of() : this.destinationDropletIds;
    }
    /**
     * @return An array containing the IDs of
     * the Kubernetes clusters to which the outbound traffic will be allowed.
     * 
     */
    public List<String> destinationKubernetesIds() {
        return this.destinationKubernetesIds == null ? List.of() : this.destinationKubernetesIds;
    }
    /**
     * @return An array containing the IDs
     * of the Load Balancers to which the outbound traffic will be allowed.
     * 
     */
    public List<String> destinationLoadBalancerUids() {
        return this.destinationLoadBalancerUids == null ? List.of() : this.destinationLoadBalancerUids;
    }
    /**
     * @return An array containing the names of Tags
     * corresponding to groups of Droplets to which the outbound traffic will
     * be allowed.
     * 
     */
    public List<String> destinationTags() {
        return this.destinationTags == null ? List.of() : this.destinationTags;
    }
    /**
     * @return The ports on which traffic will be allowed
     * specified as a string containing a single port, a range (e.g. &#34;8000-9000&#34;),
     * or &#34;1-65535&#34; to open all ports for a protocol. Required for when protocol is
     * `tcp` or `udp`.
     * 
     */
    public Optional<String> portRange() {
        return Optional.ofNullable(this.portRange);
    }
    /**
     * @return The type of traffic to be allowed.
     * This may be one of &#34;tcp&#34;, &#34;udp&#34;, or &#34;icmp&#34;.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallOutboundRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<Integer> destinationDropletIds;
        private @Nullable List<String> destinationKubernetesIds;
        private @Nullable List<String> destinationLoadBalancerUids;
        private @Nullable List<String> destinationTags;
        private @Nullable String portRange;
        private String protocol;
        public Builder() {}
        public Builder(FirewallOutboundRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationDropletIds = defaults.destinationDropletIds;
    	      this.destinationKubernetesIds = defaults.destinationKubernetesIds;
    	      this.destinationLoadBalancerUids = defaults.destinationLoadBalancerUids;
    	      this.destinationTags = defaults.destinationTags;
    	      this.portRange = defaults.portRange;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        @CustomType.Setter
        public Builder destinationDropletIds(@Nullable List<Integer> destinationDropletIds) {
            this.destinationDropletIds = destinationDropletIds;
            return this;
        }
        public Builder destinationDropletIds(Integer... destinationDropletIds) {
            return destinationDropletIds(List.of(destinationDropletIds));
        }
        @CustomType.Setter
        public Builder destinationKubernetesIds(@Nullable List<String> destinationKubernetesIds) {
            this.destinationKubernetesIds = destinationKubernetesIds;
            return this;
        }
        public Builder destinationKubernetesIds(String... destinationKubernetesIds) {
            return destinationKubernetesIds(List.of(destinationKubernetesIds));
        }
        @CustomType.Setter
        public Builder destinationLoadBalancerUids(@Nullable List<String> destinationLoadBalancerUids) {
            this.destinationLoadBalancerUids = destinationLoadBalancerUids;
            return this;
        }
        public Builder destinationLoadBalancerUids(String... destinationLoadBalancerUids) {
            return destinationLoadBalancerUids(List.of(destinationLoadBalancerUids));
        }
        @CustomType.Setter
        public Builder destinationTags(@Nullable List<String> destinationTags) {
            this.destinationTags = destinationTags;
            return this;
        }
        public Builder destinationTags(String... destinationTags) {
            return destinationTags(List.of(destinationTags));
        }
        @CustomType.Setter
        public Builder portRange(@Nullable String portRange) {
            this.portRange = portRange;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public FirewallOutboundRule build() {
            final var _resultValue = new FirewallOutboundRule();
            _resultValue.destinationAddresses = destinationAddresses;
            _resultValue.destinationDropletIds = destinationDropletIds;
            _resultValue.destinationKubernetesIds = destinationKubernetesIds;
            _resultValue.destinationLoadBalancerUids = destinationLoadBalancerUids;
            _resultValue.destinationTags = destinationTags;
            _resultValue.portRange = portRange;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}
