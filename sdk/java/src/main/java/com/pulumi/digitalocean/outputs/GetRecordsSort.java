// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRecordsSort {
    /**
     * @return The sort direction. This may be either `asc` or `desc`.
     * 
     */
    private final @Nullable String direction;
    /**
     * @return Sort the DNS records by this key. This may be one of `domain`, `flags`, `name`, `port`,
     * `priority`, `tag`, `ttl`, `type`, `value`, or `weight`.
     * 
     */
    private final String key;

    @CustomType.Constructor
    private GetRecordsSort(
        @CustomType.Parameter("direction") @Nullable String direction,
        @CustomType.Parameter("key") String key) {
        this.direction = direction;
        this.key = key;
    }

    /**
     * @return The sort direction. This may be either `asc` or `desc`.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return Sort the DNS records by this key. This may be one of `domain`, `flags`, `name`, `port`,
     * `priority`, `tag`, `ttl`, `type`, `value`, or `weight`.
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecordsSort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String direction;
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecordsSort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.key = defaults.key;
        }

        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }        public GetRecordsSort build() {
            return new GetRecordsSort(direction, key);
        }
    }
}