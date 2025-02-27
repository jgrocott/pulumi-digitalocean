// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainsSort extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainsSort Empty = new GetDomainsSort();

    /**
     * The sort direction. This may be either `asc` or `desc`.
     * 
     */
    @Import(name="direction")
    private @Nullable String direction;

    /**
     * @return The sort direction. This may be either `asc` or `desc`.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Sort the domains by this key. This may be one of `name`, `urn`, and `ttl`.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return Sort the domains by this key. This may be one of `name`, `urn`, and `ttl`.
     * 
     */
    public String key() {
        return this.key;
    }

    private GetDomainsSort() {}

    private GetDomainsSort(GetDomainsSort $) {
        this.direction = $.direction;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainsSort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainsSort $;

        public Builder() {
            $ = new GetDomainsSort();
        }

        public Builder(GetDomainsSort defaults) {
            $ = new GetDomainsSort(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction The sort direction. This may be either `asc` or `desc`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable String direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param key Sort the domains by this key. This may be one of `name`, `urn`, and `ttl`.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public GetDomainsSort build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
