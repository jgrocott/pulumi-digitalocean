// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterNodePoolNode {
    /**
     * @return The date and time when the node was created.
     * 
     */
    private @Nullable String createdAt;
    /**
     * @return The id of the node&#39;s droplet
     * 
     */
    private @Nullable String dropletId;
    /**
     * @return A unique ID that can be used to identify and reference the node.
     * 
     */
    private @Nullable String id;
    /**
     * @return A name for the node pool.
     * 
     */
    private @Nullable String name;
    /**
     * @return A string indicating the current status of the individual node.
     * 
     */
    private @Nullable String status;
    /**
     * @return The date and time when the node was last updated.
     * 
     */
    private @Nullable String updatedAt;

    private KubernetesClusterNodePoolNode() {}
    /**
     * @return The date and time when the node was created.
     * 
     */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return The id of the node&#39;s droplet
     * 
     */
    public Optional<String> dropletId() {
        return Optional.ofNullable(this.dropletId);
    }
    /**
     * @return A unique ID that can be used to identify and reference the node.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return A name for the node pool.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return A string indicating the current status of the individual node.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The date and time when the node was last updated.
     * 
     */
    public Optional<String> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterNodePoolNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String createdAt;
        private @Nullable String dropletId;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String status;
        private @Nullable String updatedAt;
        public Builder() {}
        public Builder(KubernetesClusterNodePoolNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.dropletId = defaults.dropletId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder dropletId(@Nullable String dropletId) {
            this.dropletId = dropletId;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(@Nullable String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public KubernetesClusterNodePoolNode build() {
            final var _resultValue = new KubernetesClusterNodePoolNode();
            _resultValue.createdAt = createdAt;
            _resultValue.dropletId = dropletId;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.status = status;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}
