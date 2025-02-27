// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.DatabaseFirewallRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DatabaseFirewallArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseFirewallArgs Empty = new DatabaseFirewallArgs();

    /**
     * The ID of the target database cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID of the target database cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<DatabaseFirewallRuleArgs>> rules;

    /**
     * @return A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
     * 
     */
    public Output<List<DatabaseFirewallRuleArgs>> rules() {
        return this.rules;
    }

    private DatabaseFirewallArgs() {}

    private DatabaseFirewallArgs(DatabaseFirewallArgs $) {
        this.clusterId = $.clusterId;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseFirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseFirewallArgs $;

        public Builder() {
            $ = new DatabaseFirewallArgs();
        }

        public Builder(DatabaseFirewallArgs defaults) {
            $ = new DatabaseFirewallArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the target database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the target database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param rules A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<DatabaseFirewallRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
         * 
         * @return builder
         * 
         */
        public Builder rules(List<DatabaseFirewallRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
         * 
         * @return builder
         * 
         */
        public Builder rules(DatabaseFirewallRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public DatabaseFirewallArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
