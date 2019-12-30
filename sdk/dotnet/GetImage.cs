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
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/d/image.html.markdown.
        /// </summary>
        public static Task<GetImageResult> GetImage(GetImageArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetImageResult>("digitalocean:index/getImage:getImage", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetImageArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the private image.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The slug of the official image.
        /// </summary>
        [Input("slug")]
        public string? Slug { get; set; }

        public GetImageArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetImageResult
    {
        /// <summary>
        /// The name of the distribution of the OS of the image.
        /// * `min_disk_size`: The minimum 'disk' required for the image.
        /// </summary>
        public readonly string Distribution;
        /// <summary>
        /// The id of the image.
        /// </summary>
        public readonly string Image;
        public readonly int MinDiskSize;
        public readonly string? Name;
        /// <summary>
        /// Is image a public image or not. Public images represent
        /// Linux distributions or One-Click Applications, while non-public images represent
        /// snapshots and backups and are only available within your account.
        /// * `regions`: The regions that the image is available in.
        /// * `type`: Type of the image.
        /// </summary>
        public readonly bool Private;
        public readonly ImmutableArray<string> Regions;
        public readonly string? Slug;
        public readonly string Type;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetImageResult(
            string distribution,
            string image,
            int minDiskSize,
            string? name,
            bool @private,
            ImmutableArray<string> regions,
            string? slug,
            string type,
            string id)
        {
            Distribution = distribution;
            Image = image;
            MinDiskSize = minDiskSize;
            Name = name;
            Private = @private;
            Regions = regions;
            Slug = slug;
            Type = type;
            Id = id;
        }
    }
}
