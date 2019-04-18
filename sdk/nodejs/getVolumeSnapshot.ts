// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Volume snapshots are saved instances of a block storage volume. Use this data
 * source to retrieve the ID of a DigitalOcean volume snapshot for use in other
 * resources.
 * 
 * ## Example Usage
 * 
 * Get the volume snapshot:
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 * 
 * const snapshot = pulumi.output(digitalocean.getVolumeSnapshot({
 *     mostRecent: true,
 *     nameRegex: "^web",
 *     region: "nyc3",
 * }));
 * ```
 * 
 * Reuse the data about a volume snapshot to create a new volume based on it:
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 * 
 * const snapshot = pulumi.output(digitalocean.getVolumeSnapshot({
 *     mostRecent: true,
 *     nameRegex: "^web",
 *     region: "nyc3",
 * }));
 * const foobar = new digitalocean.Volume("foobar", {
 *     region: "nyc3",
 *     size: 100,
 *     snapshotId: snapshot.apply(snapshot => snapshot.id),
 * });
 * ```
 */
export function getVolumeSnapshot(args?: GetVolumeSnapshotArgs, opts?: pulumi.InvokeOptions): Promise<GetVolumeSnapshotResult> {
    args = args || {};
    return pulumi.runtime.invoke("digitalocean:index/getVolumeSnapshot:getVolumeSnapshot", {
        "mostRecent": args.mostRecent,
        "name": args.name,
        "nameRegex": args.nameRegex,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getVolumeSnapshot.
 */
export interface GetVolumeSnapshotArgs {
    /**
     * If more than one result is returned, use the most recent volume snapshot.
     */
    readonly mostRecent?: boolean;
    /**
     * The name of the volume snapshot.
     */
    readonly name?: string;
    /**
     * A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     */
    readonly nameRegex?: string;
    /**
     * A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
     */
    readonly region?: string;
}

/**
 * A collection of values returned by getVolumeSnapshot.
 */
export interface GetVolumeSnapshotResult {
    /**
     * The date and time the volume snapshot was created.
     */
    readonly createdAt: string;
    /**
     * The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
     */
    readonly minDiskSize: number;
    readonly mostRecent?: boolean;
    readonly name?: string;
    readonly nameRegex?: string;
    readonly region?: string;
    /**
     * A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
     */
    readonly regions: string[];
    /**
     * The billable size of the volume snapshot in gigabytes.
     */
    readonly size: number;
    /**
     * The ID of the volume from which the volume snapshot originated.
     */
    readonly volumeId: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
