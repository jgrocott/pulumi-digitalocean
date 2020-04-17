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
    public sealed class LoadBalancerStickySessions
    {
        /// <summary>
        /// The name to be used for the cookie sent to the client. This attribute is required when using `cookies` for the sticky sessions type.
        /// </summary>
        public readonly string? CookieName;
        /// <summary>
        /// The number of seconds until the cookie set by the Load Balancer expires. This attribute is required when using `cookies` for the sticky sessions type.
        /// </summary>
        public readonly int? CookieTtlSeconds;
        /// <summary>
        /// An attribute indicating how and if requests from a client will be persistently served by the same backend Droplet. The possible values are `cookies` or `none`. If not specified, the default value is `none`.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private LoadBalancerStickySessions(
            string? cookieName,

            int? cookieTtlSeconds,

            string? type)
        {
            CookieName = cookieName;
            CookieTtlSeconds = cookieTtlSeconds;
            Type = type;
        }
    }
}