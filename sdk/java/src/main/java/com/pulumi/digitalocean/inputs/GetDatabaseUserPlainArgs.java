// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseUserPlainArgs Empty = new GetDatabaseUserPlainArgs();

    /**
     * The ID of the database cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The ID of the database cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * The name of the database user.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the database user.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetDatabaseUserPlainArgs() {}

    private GetDatabaseUserPlainArgs(GetDatabaseUserPlainArgs $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseUserPlainArgs $;

        public Builder() {
            $ = new GetDatabaseUserPlainArgs();
        }

        public Builder(GetDatabaseUserPlainArgs defaults) {
            $ = new GetDatabaseUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param name The name of the database user.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetDatabaseUserPlainArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
