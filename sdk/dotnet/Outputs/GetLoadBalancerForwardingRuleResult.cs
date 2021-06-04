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
    public sealed class GetLoadBalancerForwardingRuleResult
    {
        public readonly string CertificateId;
        public readonly string CertificateName;
        public readonly int EntryPort;
        public readonly string EntryProtocol;
        public readonly int TargetPort;
        public readonly string TargetProtocol;
        public readonly bool TlsPassthrough;

        [OutputConstructor]
        private GetLoadBalancerForwardingRuleResult(
            string certificateId,

            string certificateName,

            int entryPort,

            string entryProtocol,

            int targetPort,

            string targetProtocol,

            bool tlsPassthrough)
        {
            CertificateId = certificateId;
            CertificateName = certificateName;
            EntryPort = entryPort;
            EntryProtocol = entryProtocol;
            TargetPort = targetPort;
            TargetProtocol = targetProtocol;
            TlsPassthrough = tlsPassthrough;
        }
    }
}
