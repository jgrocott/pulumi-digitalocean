// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a DigitalOcean Volume Snapshot which can be used to create a snapshot from an existing volume.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/volume_snapshot.html.markdown.
    /// </summary>
    public partial class VolumeSnapshot : Pulumi.CustomResource
    {
        /// <summary>
        /// The date and time the volume snapshot was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
        /// </summary>
        [Output("minDiskSize")]
        public Output<int> MinDiskSize { get; private set; } = null!;

        /// <summary>
        /// A name for the volume snapshot.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
        /// </summary>
        [Output("regions")]
        public Output<ImmutableArray<string>> Regions { get; private set; } = null!;

        /// <summary>
        /// The billable size of the volume snapshot in gigabytes.
        /// </summary>
        [Output("size")]
        public Output<double> Size { get; private set; } = null!;

        /// <summary>
        /// A list of the tags to be applied to this volume snapshot.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the volume from which the volume snapshot originated.
        /// </summary>
        [Output("volumeId")]
        public Output<string> VolumeId { get; private set; } = null!;


        /// <summary>
        /// Create a VolumeSnapshot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VolumeSnapshot(string name, VolumeSnapshotArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/volumeSnapshot:VolumeSnapshot", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private VolumeSnapshot(string name, Input<string> id, VolumeSnapshotState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/volumeSnapshot:VolumeSnapshot", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VolumeSnapshot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VolumeSnapshot Get(string name, Input<string> id, VolumeSnapshotState? state = null, CustomResourceOptions? options = null)
        {
            return new VolumeSnapshot(name, id, state, options);
        }
    }

    public sealed class VolumeSnapshotArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A name for the volume snapshot.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of the tags to be applied to this volume snapshot.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the volume from which the volume snapshot originated.
        /// </summary>
        [Input("volumeId", required: true)]
        public Input<string> VolumeId { get; set; } = null!;

        public VolumeSnapshotArgs()
        {
        }
    }

    public sealed class VolumeSnapshotState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time the volume snapshot was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
        /// </summary>
        [Input("minDiskSize")]
        public Input<int>? MinDiskSize { get; set; }

        /// <summary>
        /// A name for the volume snapshot.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("regions")]
        private InputList<string>? _regions;

        /// <summary>
        /// A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        /// <summary>
        /// The billable size of the volume snapshot in gigabytes.
        /// </summary>
        [Input("size")]
        public Input<double>? Size { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of the tags to be applied to this volume snapshot.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the volume from which the volume snapshot originated.
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        public VolumeSnapshotState()
        {
        }
    }
}