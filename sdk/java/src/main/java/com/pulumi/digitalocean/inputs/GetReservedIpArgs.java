// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReservedIpArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReservedIpArgs Empty = new GetReservedIpArgs();

    /**
     * The allocated IP address of the specific reserved IP to retrieve.
     * 
     */
    @Import(name="ipAddress", required=true)
    private Output<String> ipAddress;

    /**
     * @return The allocated IP address of the specific reserved IP to retrieve.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }

    private GetReservedIpArgs() {}

    private GetReservedIpArgs(GetReservedIpArgs $) {
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReservedIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReservedIpArgs $;

        public Builder() {
            $ = new GetReservedIpArgs();
        }

        public Builder(GetReservedIpArgs defaults) {
            $ = new GetReservedIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddress The allocated IP address of the specific reserved IP to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The allocated IP address of the specific reserved IP to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public GetReservedIpArgs build() {
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            return $;
        }
    }

}
