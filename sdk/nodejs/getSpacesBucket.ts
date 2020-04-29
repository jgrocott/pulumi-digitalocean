// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getSpacesBucket(args: GetSpacesBucketArgs, opts?: pulumi.InvokeOptions): Promise<GetSpacesBucketResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("digitalocean:index/getSpacesBucket:getSpacesBucket", {
        "name": args.name,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getSpacesBucket.
 */
export interface GetSpacesBucketArgs {
    /**
     * The name of the Spaces bucket.
     */
    readonly name: string;
    /**
     * The slug of the region where the bucket is stored.
     */
    readonly region: string;
}

/**
 * A collection of values returned by getSpacesBucket.
 */
export interface GetSpacesBucketResult {
    /**
     * The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
     */
    readonly bucketDomainName: string;
    /**
     * The name of the Spaces bucket
     */
    readonly name: string;
    /**
     * The slug of the region where the bucket is stored.
     */
    readonly region: string;
    /**
     * The uniform resource name of the bucket
     */
    readonly urn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
