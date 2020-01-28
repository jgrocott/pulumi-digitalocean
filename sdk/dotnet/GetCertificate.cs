// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static partial class Invokes
    {
        /// <summary>
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/d/certificate.html.markdown.
        /// </summary>
        public static Task<GetCertificateResult> GetCertificate(GetCertificateArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCertificateResult>("digitalocean:index/getCertificate:getCertificate", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetCertificateArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of certificate.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetCertificateArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetCertificateResult
    {
        public readonly ImmutableArray<string> Domains;
        public readonly string Name;
        public readonly string NotAfter;
        public readonly string Sha1Fingerprint;
        public readonly string State;
        public readonly string Type;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetCertificateResult(
            ImmutableArray<string> domains,
            string name,
            string notAfter,
            string sha1Fingerprint,
            string state,
            string type,
            string id)
        {
            Domains = domains;
            Name = name;
            NotAfter = notAfter;
            Sha1Fingerprint = sha1Fingerprint;
            State = state;
            Type = type;
            Id = id;
        }
    }
}