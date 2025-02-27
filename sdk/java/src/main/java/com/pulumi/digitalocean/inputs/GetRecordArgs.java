// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRecordArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRecordArgs Empty = new GetRecordArgs();

    /**
     * The domain name of the record.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The domain name of the record.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The name of the record.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the record.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetRecordArgs() {}

    private GetRecordArgs(GetRecordArgs $) {
        this.domain = $.domain;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRecordArgs $;

        public Builder() {
            $ = new GetRecordArgs();
        }

        public Builder(GetRecordArgs defaults) {
            $ = new GetRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The domain name of the record.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain name of the record.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param name The name of the record.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the record.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetRecordArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
