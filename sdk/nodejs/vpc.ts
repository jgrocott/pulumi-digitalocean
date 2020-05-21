// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a [DigitalOcean VPC](https://developers.digitalocean.com/documentation/v2/#vpcs) resource.
 *
 * VPCs are virtual networks containing resources that can communicate with each
 * other in full isolation, using private IP addresses.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = new digitalocean.Vpc("example", {
 *     ipRange: "10.10.10.0/24",
 *     region: "nyc3",
 * });
 * ```
 *
 * ### Resource Assignment
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const exampleVpc = new digitalocean.Vpc("exampleVpc", {region: "nyc3"});
 * const exampleDroplet = new digitalocean.Droplet("exampleDroplet", {
 *     size: "s-1vcpu-1gb",
 *     image: "ubuntu-18-04-x64",
 *     region: "nyc3",
 *     vpcUuid: exampleVpc.id,
 * });
 * ```
 */
export class Vpc extends pulumi.CustomResource {
    /**
     * Get an existing Vpc resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcState, opts?: pulumi.CustomResourceOptions): Vpc {
        return new Vpc(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/vpc:Vpc';

    /**
     * Returns true if the given object is an instance of Vpc.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Vpc {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Vpc.__pulumiType;
    }

    /**
     * The date and time of when the VPC was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * A boolean indicating whether or not the VPC is the default one for the region.
     */
    public /*out*/ readonly default!: pulumi.Output<boolean>;
    /**
     * A free-form text field up to a limit of 255 characters to describe the VPC.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
     */
    public readonly ipRange!: pulumi.Output<string>;
    /**
     * A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The DigitalOcean region slug for the VPC's location.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The uniform resource name (URN) for the VPC.
     */
    public /*out*/ readonly urn!: pulumi.Output<string>;

    /**
     * Create a Vpc resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcArgs | VpcState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as VpcState | undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["default"] = state ? state.default : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["ipRange"] = state ? state.ipRange : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["urn"] = state ? state.urn : undefined;
        } else {
            const args = argsOrState as VpcArgs | undefined;
            if (!args || args.region === undefined) {
                throw new Error("Missing required property 'region'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["ipRange"] = args ? args.ipRange : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["createdAt"] = undefined /*out*/;
            inputs["default"] = undefined /*out*/;
            inputs["urn"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Vpc.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Vpc resources.
 */
export interface VpcState {
    /**
     * The date and time of when the VPC was created.
     */
    readonly createdAt?: pulumi.Input<string>;
    /**
     * A boolean indicating whether or not the VPC is the default one for the region.
     */
    readonly default?: pulumi.Input<boolean>;
    /**
     * A free-form text field up to a limit of 255 characters to describe the VPC.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
     */
    readonly ipRange?: pulumi.Input<string>;
    /**
     * A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The DigitalOcean region slug for the VPC's location.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The uniform resource name (URN) for the VPC.
     */
    readonly urn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Vpc resource.
 */
export interface VpcArgs {
    /**
     * A free-form text field up to a limit of 255 characters to describe the VPC.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
     */
    readonly ipRange?: pulumi.Input<string>;
    /**
     * A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The DigitalOcean region slug for the VPC's location.
     */
    readonly region: pulumi.Input<string>;
}