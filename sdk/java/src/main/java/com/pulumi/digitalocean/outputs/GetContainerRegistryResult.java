// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetContainerRegistryResult {
    /**
     * @return The date and time when the registry was created
     * 
     */
    private String createdAt;
    /**
     * @return The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
     * 
     */
    private String endpoint;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the container registry
     * 
     */
    private String name;
    /**
     * @return The slug identifier for the  region
     * 
     */
    private String region;
    /**
     * @return The domain of the container registry. Ex: `registry.digitalocean.com`
     * 
     */
    private String serverUrl;
    /**
     * @return The amount of storage used in the registry in bytes.
     * 
     */
    private Integer storageUsageBytes;
    /**
     * @return The slug identifier for the subscription tier
     * 
     */
    private String subscriptionTierSlug;

    private GetContainerRegistryResult() {}
    /**
     * @return The date and time when the registry was created
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the container registry
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The slug identifier for the  region
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The domain of the container registry. Ex: `registry.digitalocean.com`
     * 
     */
    public String serverUrl() {
        return this.serverUrl;
    }
    /**
     * @return The amount of storage used in the registry in bytes.
     * 
     */
    public Integer storageUsageBytes() {
        return this.storageUsageBytes;
    }
    /**
     * @return The slug identifier for the subscription tier
     * 
     */
    public String subscriptionTierSlug() {
        return this.subscriptionTierSlug;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerRegistryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private String endpoint;
        private String id;
        private String name;
        private String region;
        private String serverUrl;
        private Integer storageUsageBytes;
        private String subscriptionTierSlug;
        public Builder() {}
        public Builder(GetContainerRegistryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.serverUrl = defaults.serverUrl;
    	      this.storageUsageBytes = defaults.storageUsageBytes;
    	      this.subscriptionTierSlug = defaults.subscriptionTierSlug;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder serverUrl(String serverUrl) {
            this.serverUrl = Objects.requireNonNull(serverUrl);
            return this;
        }
        @CustomType.Setter
        public Builder storageUsageBytes(Integer storageUsageBytes) {
            this.storageUsageBytes = Objects.requireNonNull(storageUsageBytes);
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionTierSlug(String subscriptionTierSlug) {
            this.subscriptionTierSlug = Objects.requireNonNull(subscriptionTierSlug);
            return this;
        }
        public GetContainerRegistryResult build() {
            final var _resultValue = new GetContainerRegistryResult();
            _resultValue.createdAt = createdAt;
            _resultValue.endpoint = endpoint;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.region = region;
            _resultValue.serverUrl = serverUrl;
            _resultValue.storageUsageBytes = storageUsageBytes;
            _resultValue.subscriptionTierSlug = subscriptionTierSlug;
            return _resultValue;
        }
    }
}
