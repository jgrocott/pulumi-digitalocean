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
    public sealed class GetAppSpecServiceLogDestinationDatadogResult
    {
        public readonly string ApiKey;
        public readonly string? Endpoint;

        [OutputConstructor]
        private GetAppSpecServiceLogDestinationDatadogResult(
            string apiKey,

            string? endpoint)
        {
            ApiKey = apiKey;
            Endpoint = endpoint;
        }
    }
}
