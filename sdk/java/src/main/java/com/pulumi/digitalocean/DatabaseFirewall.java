// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabaseFirewallArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabaseFirewallState;
import com.pulumi.digitalocean.outputs.DatabaseFirewallRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean database firewall resource allowing you to restrict
 * connections to your database to trusted sources. You may limit connections to
 * specific Droplets, Kubernetes clusters, or IP addresses.
 * 
 * ## Example Usage
 * ### Create a new database firewall allowing multiple IP addresses
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
 * import com.pulumi.digitalocean.DatabaseFirewall;
 * import com.pulumi.digitalocean.DatabaseFirewallArgs;
 * import com.pulumi.digitalocean.inputs.DatabaseFirewallRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var postgres_example = new DatabaseCluster(&#34;postgres-example&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;pg&#34;)
 *             .version(&#34;11&#34;)
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .region(&#34;nyc1&#34;)
 *             .nodeCount(1)
 *             .build());
 * 
 *         var example_fw = new DatabaseFirewall(&#34;example-fw&#34;, DatabaseFirewallArgs.builder()        
 *             .clusterId(postgres_example.id())
 *             .rules(            
 *                 DatabaseFirewallRuleArgs.builder()
 *                     .type(&#34;ip_addr&#34;)
 *                     .value(&#34;192.168.1.1&#34;)
 *                     .build(),
 *                 DatabaseFirewallRuleArgs.builder()
 *                     .type(&#34;ip_addr&#34;)
 *                     .value(&#34;192.0.2.0&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create a new database firewall allowing a Droplet
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
 * import com.pulumi.digitalocean.DatabaseFirewall;
 * import com.pulumi.digitalocean.DatabaseFirewallArgs;
 * import com.pulumi.digitalocean.inputs.DatabaseFirewallRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var web = new Droplet(&#34;web&#34;, DropletArgs.builder()        
 *             .size(&#34;s-1vcpu-1gb&#34;)
 *             .image(&#34;ubuntu-22-04-x64&#34;)
 *             .region(&#34;nyc3&#34;)
 *             .build());
 * 
 *         var postgres_example = new DatabaseCluster(&#34;postgres-example&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;pg&#34;)
 *             .version(&#34;11&#34;)
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .region(&#34;nyc1&#34;)
 *             .nodeCount(1)
 *             .build());
 * 
 *         var example_fw = new DatabaseFirewall(&#34;example-fw&#34;, DatabaseFirewallArgs.builder()        
 *             .clusterId(postgres_example.id())
 *             .rules(DatabaseFirewallRuleArgs.builder()
 *                 .type(&#34;droplet&#34;)
 *                 .value(web.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create a new database firewall for a database replica
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
 * import com.pulumi.digitalocean.DatabaseReplica;
 * import com.pulumi.digitalocean.DatabaseReplicaArgs;
 * import com.pulumi.digitalocean.DatabaseFirewall;
 * import com.pulumi.digitalocean.DatabaseFirewallArgs;
 * import com.pulumi.digitalocean.inputs.DatabaseFirewallRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var postgres_example = new DatabaseCluster(&#34;postgres-example&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;pg&#34;)
 *             .version(&#34;11&#34;)
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .region(&#34;nyc1&#34;)
 *             .nodeCount(1)
 *             .build());
 * 
 *         var replica_example = new DatabaseReplica(&#34;replica-example&#34;, DatabaseReplicaArgs.builder()        
 *             .clusterId(postgres_example.id())
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .region(&#34;nyc1&#34;)
 *             .build());
 * 
 *         var example_fw = new DatabaseFirewall(&#34;example-fw&#34;, DatabaseFirewallArgs.builder()        
 *             .clusterId(replica_example.uuid())
 *             .rules(DatabaseFirewallRuleArgs.builder()
 *                 .type(&#34;ip_addr&#34;)
 *                 .value(&#34;192.168.1.1&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Database firewalls can be imported using the `id` of the target database cluster For example
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/databaseFirewall:DatabaseFirewall example-fw 5f55c6cd-863b-4907-99b8-7e09b0275d54
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databaseFirewall:DatabaseFirewall")
public class DatabaseFirewall extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the target database cluster.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
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
    @Export(name="rules", refs={List.class,DatabaseFirewallRule.class}, tree="[0,1]")
    private Output<List<DatabaseFirewallRule>> rules;

    /**
     * @return A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
     * 
     */
    public Output<List<DatabaseFirewallRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseFirewall(String name) {
        this(name, DatabaseFirewallArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseFirewall(String name, DatabaseFirewallArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseFirewall(String name, DatabaseFirewallArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseFirewall:DatabaseFirewall", name, args == null ? DatabaseFirewallArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseFirewall(String name, Output<String> id, @Nullable DatabaseFirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseFirewall:DatabaseFirewall", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DatabaseFirewall get(String name, Output<String> id, @Nullable DatabaseFirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseFirewall(name, id, state, options);
    }
}
