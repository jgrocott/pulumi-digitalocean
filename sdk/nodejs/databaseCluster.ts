// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean database cluster resource.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 * 
 * // Create a new database cluster
 * const example = new digitalocean.DatabaseCluster("example", {
 *     engine: "pg",
 *     nodeCount: 1,
 *     region: "nyc1",
 *     size: "db-s-1vcpu-1gb",
 *     version: "11",
 * });
 * ```
 */
export class DatabaseCluster extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseClusterState, opts?: pulumi.CustomResourceOptions): DatabaseCluster {
        return new DatabaseCluster(name, <any>state, { ...opts, id: id });
    }

    /**
     * Name of the cluster's default database.
     */
    public /*out*/ readonly database!: pulumi.Output<string>;
    /**
     * Database engine used by the cluster (ex. `pg` for PostreSQL).
     */
    public readonly engine!: pulumi.Output<string>;
    /**
     * Database cluster's hostname.
     */
    public /*out*/ readonly host!: pulumi.Output<string>;
    /**
     * Defines when the automatic maintenance should be performed for the database cluster.
     */
    public readonly maintenanceWindows!: pulumi.Output<{ day: string, hour: string }[] | undefined>;
    /**
     * The name of the database cluster.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Number of nodes that will be included in the cluster.
     */
    public readonly nodeCount!: pulumi.Output<number>;
    /**
     * Password for the cluster's default user.
     */
    public /*out*/ readonly password!: pulumi.Output<string>;
    /**
     * Network port that the database cluster is listening on.
     */
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * DigitalOcean region where the cluster will reside.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Database droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`).
     */
    public readonly size!: pulumi.Output<string>;
    /**
     * The full URI for connecting to the database cluster.
     */
    public /*out*/ readonly uri!: pulumi.Output<string>;
    /**
     * Username for the cluster's default user.
     */
    public /*out*/ readonly user!: pulumi.Output<string>;
    /**
     * Engine version used by the cluster (ex. `11` for PostgreSQL 11).
     */
    public readonly version!: pulumi.Output<string>;

    /**
     * Create a DatabaseCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseClusterArgs | DatabaseClusterState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as DatabaseClusterState | undefined;
            inputs["database"] = state ? state.database : undefined;
            inputs["engine"] = state ? state.engine : undefined;
            inputs["host"] = state ? state.host : undefined;
            inputs["maintenanceWindows"] = state ? state.maintenanceWindows : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["nodeCount"] = state ? state.nodeCount : undefined;
            inputs["password"] = state ? state.password : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["size"] = state ? state.size : undefined;
            inputs["uri"] = state ? state.uri : undefined;
            inputs["user"] = state ? state.user : undefined;
            inputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as DatabaseClusterArgs | undefined;
            if (!args || args.engine === undefined) {
                throw new Error("Missing required property 'engine'");
            }
            if (!args || args.nodeCount === undefined) {
                throw new Error("Missing required property 'nodeCount'");
            }
            if (!args || args.region === undefined) {
                throw new Error("Missing required property 'region'");
            }
            if (!args || args.size === undefined) {
                throw new Error("Missing required property 'size'");
            }
            if (!args || args.version === undefined) {
                throw new Error("Missing required property 'version'");
            }
            inputs["engine"] = args ? args.engine : undefined;
            inputs["maintenanceWindows"] = args ? args.maintenanceWindows : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["nodeCount"] = args ? args.nodeCount : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["size"] = args ? args.size : undefined;
            inputs["version"] = args ? args.version : undefined;
            inputs["database"] = undefined /*out*/;
            inputs["host"] = undefined /*out*/;
            inputs["password"] = undefined /*out*/;
            inputs["port"] = undefined /*out*/;
            inputs["uri"] = undefined /*out*/;
            inputs["user"] = undefined /*out*/;
        }
        super("digitalocean:index/databaseCluster:DatabaseCluster", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseCluster resources.
 */
export interface DatabaseClusterState {
    /**
     * Name of the cluster's default database.
     */
    readonly database?: pulumi.Input<string>;
    /**
     * Database engine used by the cluster (ex. `pg` for PostreSQL).
     */
    readonly engine?: pulumi.Input<string>;
    /**
     * Database cluster's hostname.
     */
    readonly host?: pulumi.Input<string>;
    /**
     * Defines when the automatic maintenance should be performed for the database cluster.
     */
    readonly maintenanceWindows?: pulumi.Input<pulumi.Input<{ day: pulumi.Input<string>, hour: pulumi.Input<string> }>[]>;
    /**
     * The name of the database cluster.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Number of nodes that will be included in the cluster.
     */
    readonly nodeCount?: pulumi.Input<number>;
    /**
     * Password for the cluster's default user.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * Network port that the database cluster is listening on.
     */
    readonly port?: pulumi.Input<number>;
    /**
     * DigitalOcean region where the cluster will reside.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * Database droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`).
     */
    readonly size?: pulumi.Input<string>;
    /**
     * The full URI for connecting to the database cluster.
     */
    readonly uri?: pulumi.Input<string>;
    /**
     * Username for the cluster's default user.
     */
    readonly user?: pulumi.Input<string>;
    /**
     * Engine version used by the cluster (ex. `11` for PostgreSQL 11).
     */
    readonly version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseCluster resource.
 */
export interface DatabaseClusterArgs {
    /**
     * Database engine used by the cluster (ex. `pg` for PostreSQL).
     */
    readonly engine: pulumi.Input<string>;
    /**
     * Defines when the automatic maintenance should be performed for the database cluster.
     */
    readonly maintenanceWindows?: pulumi.Input<pulumi.Input<{ day: pulumi.Input<string>, hour: pulumi.Input<string> }>[]>;
    /**
     * The name of the database cluster.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Number of nodes that will be included in the cluster.
     */
    readonly nodeCount: pulumi.Input<number>;
    /**
     * DigitalOcean region where the cluster will reside.
     */
    readonly region: pulumi.Input<string>;
    /**
     * Database droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`).
     */
    readonly size: pulumi.Input<string>;
    /**
     * Engine version used by the cluster (ex. `11` for PostgreSQL 11).
     */
    readonly version: pulumi.Input<string>;
}
