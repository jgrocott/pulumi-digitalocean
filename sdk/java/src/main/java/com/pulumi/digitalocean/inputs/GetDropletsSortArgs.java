// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDropletsSortArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDropletsSortArgs Empty = new GetDropletsSortArgs();

    /**
     * The sort direction. This may be either `asc` or `desc`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return The sort direction. This may be either `asc` or `desc`.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Sort the Droplets by this key. This may be one of `backups`, `created_at`, `disk`, `id`,
     * `image`, `ipv4_address`, `ipv4_address_private`, `ipv6`, `ipv6_address`, `ipv6_address_private`, `locked`,
     * `memory`, `monitoring`, `name`, `price_hourly`, `price_monthly`, `private_networking`, `region`, `size`,
     * `status`, `urn`, `vcpus`, or `vpc_uuid`.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Sort the Droplets by this key. This may be one of `backups`, `created_at`, `disk`, `id`,
     * `image`, `ipv4_address`, `ipv4_address_private`, `ipv6`, `ipv6_address`, `ipv6_address_private`, `locked`,
     * `memory`, `monitoring`, `name`, `price_hourly`, `price_monthly`, `private_networking`, `region`, `size`,
     * `status`, `urn`, `vcpus`, or `vpc_uuid`.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    private GetDropletsSortArgs() {}

    private GetDropletsSortArgs(GetDropletsSortArgs $) {
        this.direction = $.direction;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDropletsSortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDropletsSortArgs $;

        public Builder() {
            $ = new GetDropletsSortArgs();
        }

        public Builder(GetDropletsSortArgs defaults) {
            $ = new GetDropletsSortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction The sort direction. This may be either `asc` or `desc`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The sort direction. This may be either `asc` or `desc`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param key Sort the Droplets by this key. This may be one of `backups`, `created_at`, `disk`, `id`,
         * `image`, `ipv4_address`, `ipv4_address_private`, `ipv6`, `ipv6_address`, `ipv6_address_private`, `locked`,
         * `memory`, `monitoring`, `name`, `price_hourly`, `price_monthly`, `private_networking`, `region`, `size`,
         * `status`, `urn`, `vcpus`, or `vpc_uuid`.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Sort the Droplets by this key. This may be one of `backups`, `created_at`, `disk`, `id`,
         * `image`, `ipv4_address`, `ipv4_address_private`, `ipv6`, `ipv6_address`, `ipv6_address_private`, `locked`,
         * `memory`, `monitoring`, `name`, `price_hourly`, `price_monthly`, `private_networking`, `region`, `size`,
         * `status`, `urn`, `vcpus`, or `vpc_uuid`.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public GetDropletsSortArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
