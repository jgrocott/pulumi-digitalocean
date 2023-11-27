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
    public sealed class AppSpecIngressRuleComponent
    {
        /// <summary>
        /// The name of the component.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// An optional flag to preserve the path that is forwarded to the backend service.
        /// </summary>
        public readonly bool? PreservePathPrefix;
        /// <summary>
        /// An optional field that will rewrite the path of the component to be what is specified here. This is mutually exclusive with `preserve_path_prefix`.
        /// </summary>
        public readonly string? Rewrite;

        [OutputConstructor]
        private AppSpecIngressRuleComponent(
            string? name,

            bool? preservePathPrefix,

            string? rewrite)
        {
            Name = name;
            PreservePathPrefix = preservePathPrefix;
            Rewrite = rewrite;
        }
    }
}