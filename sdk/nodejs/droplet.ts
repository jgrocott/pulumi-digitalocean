// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Droplet resource. This can be used to create,
 * modify, and delete Droplets.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * // Create a new Web Droplet in the nyc2 region
 * const web = new digitalocean.Droplet("web", {
 *     image: "ubuntu-18-04-x64",
 *     region: "nyc2",
 *     size: "s-1vcpu-1gb",
 * });
 * ```
 *
 * ## Import
 *
 * Droplets can be imported using the Droplet `id`, e.g.
 *
 * ```sh
 *  $ pulumi import digitalocean:index/droplet:Droplet mydroplet 100823
 * ```
 */
export class Droplet extends pulumi.CustomResource {
    /**
     * Get an existing Droplet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DropletState, opts?: pulumi.CustomResourceOptions): Droplet {
        return new Droplet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/droplet:Droplet';

    /**
     * Returns true if the given object is an instance of Droplet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Droplet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Droplet.__pulumiType;
    }

    /**
     * Boolean controlling if backups are made. Defaults to
     * false.
     */
    public readonly backups!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The size of the instance's disk in GB
     */
    public /*out*/ readonly disk!: pulumi.Output<number>;
    /**
     * The uniform resource name of the Droplet
     * * `name`- The name of the Droplet
     */
    public /*out*/ readonly dropletUrn!: pulumi.Output<string>;
    /**
     * The Droplet image ID or slug.
     */
    public readonly image!: pulumi.Output<string>;
    /**
     * The IPv4 address
     */
    public /*out*/ readonly ipv4Address!: pulumi.Output<string>;
    /**
     * The private networking IPv4 address
     */
    public /*out*/ readonly ipv4AddressPrivate!: pulumi.Output<string>;
    /**
     * Boolean controlling if IPv6 is enabled. Defaults to false.
     */
    public readonly ipv6!: pulumi.Output<boolean | undefined>;
    /**
     * The IPv6 address
     */
    public /*out*/ readonly ipv6Address!: pulumi.Output<string>;
    /**
     * Is the Droplet locked
     */
    public /*out*/ readonly locked!: pulumi.Output<boolean>;
    public /*out*/ readonly memory!: pulumi.Output<number>;
    /**
     * Boolean controlling whether monitoring agent is installed.
     * Defaults to false.
     */
    public readonly monitoring!: pulumi.Output<boolean | undefined>;
    /**
     * The Droplet name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Droplet hourly price
     */
    public /*out*/ readonly priceHourly!: pulumi.Output<number>;
    /**
     * Droplet monthly price
     */
    public /*out*/ readonly priceMonthly!: pulumi.Output<number>;
    /**
     * Boolean controlling if private networking
     * is enabled. When VPC is enabled on an account, this will provision the
     * Droplet inside of your account's default VPC for the region. Use the
     * `vpcUuid` attribute to specify a different VPC.
     */
    public readonly privateNetworking!: pulumi.Output<boolean>;
    /**
     * The region to start in.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     */
    public readonly resizeDisk!: pulumi.Output<boolean | undefined>;
    /**
     * The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://developers.digitalocean.com/documentation/v2/#list-all-sizes).
     */
    public readonly size!: pulumi.Output<string>;
    /**
     * A list of SSH key IDs or fingerprints to enable in
     * the format `[12345, 123456]`. To retrieve this info, use the
     * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
     * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
     * be added or removed via this provider. Modifying this field will prompt you
     * to destroy and recreate the Droplet.
     */
    public readonly sshKeys!: pulumi.Output<string[] | undefined>;
    /**
     * The status of the Droplet
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A list of the tags to be applied to this Droplet.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * A string of the desired User Data for the Droplet.
     */
    public readonly userData!: pulumi.Output<string | undefined>;
    /**
     * The number of the instance's virtual CPUs
     */
    public /*out*/ readonly vcpus!: pulumi.Output<number>;
    /**
     * A list of the IDs of each block storage volume to be attached to the Droplet.
     */
    public readonly volumeIds!: pulumi.Output<string[]>;
    /**
     * The ID of the VPC where the Droplet will be located.
     */
    public readonly vpcUuid!: pulumi.Output<string>;

    /**
     * Create a Droplet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DropletArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DropletArgs | DropletState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DropletState | undefined;
            inputs["backups"] = state ? state.backups : undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["disk"] = state ? state.disk : undefined;
            inputs["dropletUrn"] = state ? state.dropletUrn : undefined;
            inputs["image"] = state ? state.image : undefined;
            inputs["ipv4Address"] = state ? state.ipv4Address : undefined;
            inputs["ipv4AddressPrivate"] = state ? state.ipv4AddressPrivate : undefined;
            inputs["ipv6"] = state ? state.ipv6 : undefined;
            inputs["ipv6Address"] = state ? state.ipv6Address : undefined;
            inputs["locked"] = state ? state.locked : undefined;
            inputs["memory"] = state ? state.memory : undefined;
            inputs["monitoring"] = state ? state.monitoring : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["priceHourly"] = state ? state.priceHourly : undefined;
            inputs["priceMonthly"] = state ? state.priceMonthly : undefined;
            inputs["privateNetworking"] = state ? state.privateNetworking : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["resizeDisk"] = state ? state.resizeDisk : undefined;
            inputs["size"] = state ? state.size : undefined;
            inputs["sshKeys"] = state ? state.sshKeys : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["userData"] = state ? state.userData : undefined;
            inputs["vcpus"] = state ? state.vcpus : undefined;
            inputs["volumeIds"] = state ? state.volumeIds : undefined;
            inputs["vpcUuid"] = state ? state.vpcUuid : undefined;
        } else {
            const args = argsOrState as DropletArgs | undefined;
            if ((!args || args.image === undefined) && !opts.urn) {
                throw new Error("Missing required property 'image'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            inputs["backups"] = args ? args.backups : undefined;
            inputs["image"] = args ? args.image : undefined;
            inputs["ipv6"] = args ? args.ipv6 : undefined;
            inputs["monitoring"] = args ? args.monitoring : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["privateNetworking"] = args ? args.privateNetworking : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["resizeDisk"] = args ? args.resizeDisk : undefined;
            inputs["size"] = args ? args.size : undefined;
            inputs["sshKeys"] = args ? args.sshKeys : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["userData"] = args ? args.userData : undefined;
            inputs["volumeIds"] = args ? args.volumeIds : undefined;
            inputs["vpcUuid"] = args ? args.vpcUuid : undefined;
            inputs["createdAt"] = undefined /*out*/;
            inputs["disk"] = undefined /*out*/;
            inputs["dropletUrn"] = undefined /*out*/;
            inputs["ipv4Address"] = undefined /*out*/;
            inputs["ipv4AddressPrivate"] = undefined /*out*/;
            inputs["ipv6Address"] = undefined /*out*/;
            inputs["locked"] = undefined /*out*/;
            inputs["memory"] = undefined /*out*/;
            inputs["priceHourly"] = undefined /*out*/;
            inputs["priceMonthly"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
            inputs["vcpus"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Droplet.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Droplet resources.
 */
export interface DropletState {
    /**
     * Boolean controlling if backups are made. Defaults to
     * false.
     */
    backups?: pulumi.Input<boolean>;
    createdAt?: pulumi.Input<string>;
    /**
     * The size of the instance's disk in GB
     */
    disk?: pulumi.Input<number>;
    /**
     * The uniform resource name of the Droplet
     * * `name`- The name of the Droplet
     */
    dropletUrn?: pulumi.Input<string>;
    /**
     * The Droplet image ID or slug.
     */
    image?: pulumi.Input<string>;
    /**
     * The IPv4 address
     */
    ipv4Address?: pulumi.Input<string>;
    /**
     * The private networking IPv4 address
     */
    ipv4AddressPrivate?: pulumi.Input<string>;
    /**
     * Boolean controlling if IPv6 is enabled. Defaults to false.
     */
    ipv6?: pulumi.Input<boolean>;
    /**
     * The IPv6 address
     */
    ipv6Address?: pulumi.Input<string>;
    /**
     * Is the Droplet locked
     */
    locked?: pulumi.Input<boolean>;
    memory?: pulumi.Input<number>;
    /**
     * Boolean controlling whether monitoring agent is installed.
     * Defaults to false.
     */
    monitoring?: pulumi.Input<boolean>;
    /**
     * The Droplet name.
     */
    name?: pulumi.Input<string>;
    /**
     * Droplet hourly price
     */
    priceHourly?: pulumi.Input<number>;
    /**
     * Droplet monthly price
     */
    priceMonthly?: pulumi.Input<number>;
    /**
     * Boolean controlling if private networking
     * is enabled. When VPC is enabled on an account, this will provision the
     * Droplet inside of your account's default VPC for the region. Use the
     * `vpcUuid` attribute to specify a different VPC.
     */
    privateNetworking?: pulumi.Input<boolean>;
    /**
     * The region to start in.
     */
    region?: pulumi.Input<string | enums.Region>;
    /**
     * Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     */
    resizeDisk?: pulumi.Input<boolean>;
    /**
     * The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://developers.digitalocean.com/documentation/v2/#list-all-sizes).
     */
    size?: pulumi.Input<string | enums.DropletSlug>;
    /**
     * A list of SSH key IDs or fingerprints to enable in
     * the format `[12345, 123456]`. To retrieve this info, use the
     * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
     * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
     * be added or removed via this provider. Modifying this field will prompt you
     * to destroy and recreate the Droplet.
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of the Droplet
     */
    status?: pulumi.Input<string>;
    /**
     * A list of the tags to be applied to this Droplet.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A string of the desired User Data for the Droplet.
     */
    userData?: pulumi.Input<string>;
    /**
     * The number of the instance's virtual CPUs
     */
    vcpus?: pulumi.Input<number>;
    /**
     * A list of the IDs of each block storage volume to be attached to the Droplet.
     */
    volumeIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the VPC where the Droplet will be located.
     */
    vpcUuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Droplet resource.
 */
export interface DropletArgs {
    /**
     * Boolean controlling if backups are made. Defaults to
     * false.
     */
    backups?: pulumi.Input<boolean>;
    /**
     * The Droplet image ID or slug.
     */
    image: pulumi.Input<string>;
    /**
     * Boolean controlling if IPv6 is enabled. Defaults to false.
     */
    ipv6?: pulumi.Input<boolean>;
    /**
     * Boolean controlling whether monitoring agent is installed.
     * Defaults to false.
     */
    monitoring?: pulumi.Input<boolean>;
    /**
     * The Droplet name.
     */
    name?: pulumi.Input<string>;
    /**
     * Boolean controlling if private networking
     * is enabled. When VPC is enabled on an account, this will provision the
     * Droplet inside of your account's default VPC for the region. Use the
     * `vpcUuid` attribute to specify a different VPC.
     */
    privateNetworking?: pulumi.Input<boolean>;
    /**
     * The region to start in.
     */
    region: pulumi.Input<string | enums.Region>;
    /**
     * Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     */
    resizeDisk?: pulumi.Input<boolean>;
    /**
     * The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://developers.digitalocean.com/documentation/v2/#list-all-sizes).
     */
    size: pulumi.Input<string | enums.DropletSlug>;
    /**
     * A list of SSH key IDs or fingerprints to enable in
     * the format `[12345, 123456]`. To retrieve this info, use the
     * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
     * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
     * be added or removed via this provider. Modifying this field will prompt you
     * to destroy and recreate the Droplet.
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of the tags to be applied to this Droplet.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A string of the desired User Data for the Droplet.
     */
    userData?: pulumi.Input<string>;
    /**
     * A list of the IDs of each block storage volume to be attached to the Droplet.
     */
    volumeIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the VPC where the Droplet will be located.
     */
    vpcUuid?: pulumi.Input<string>;
}
