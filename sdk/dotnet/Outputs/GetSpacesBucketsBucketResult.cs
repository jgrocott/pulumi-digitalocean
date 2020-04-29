// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Outputs
{

    [OutputType]
    public sealed class GetSpacesBucketsBucketResult
    {
        public readonly string BucketDomainName;
        public readonly string Name;
        public readonly string Region;
        public readonly string Urn;

        [OutputConstructor]
        private GetSpacesBucketsBucketResult(
            string bucketDomainName,

            string name,

            string region,

            string urn)
        {
            BucketDomainName = bucketDomainName;
            Name = name;
            Region = region;
            Urn = urn;
        }
    }
}
