// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getRecord(args: GetRecordArgs, opts?: pulumi.InvokeOptions): Promise<GetRecordResult> & GetRecordResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetRecordResult> = pulumi.runtime.invoke("digitalocean:index/getRecord:getRecord", {
        "domain": args.domain,
        "name": args.name,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getRecord.
 */
export interface GetRecordArgs {
    /**
     * The domain name of the record.
     */
    readonly domain: string;
    /**
     * The name of the record.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getRecord.
 */
export interface GetRecordResult {
    readonly data: string;
    readonly domain: string;
    readonly flags: number;
    readonly name: string;
    readonly port: number;
    readonly priority: number;
    readonly tag: string;
    readonly ttl: number;
    readonly type: string;
    readonly weight: number;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
