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
    public sealed class GetAppSpecIngressRuleMatchResult
    {
        /// <summary>
        /// Paths must start with `/` and must be unique within the app.
        /// </summary>
        public readonly Outputs.GetAppSpecIngressRuleMatchPathResult Path;

        [OutputConstructor]
        private GetAppSpecIngressRuleMatchResult(Outputs.GetAppSpecIngressRuleMatchPathResult path)
        {
            Path = path;
        }
    }
}