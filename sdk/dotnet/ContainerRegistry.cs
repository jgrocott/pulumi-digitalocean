// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a DigitalOcean Container Registry resource. A Container Registry is
    /// a secure, private location to store your containers for rapid deployment.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new container registry
    ///         var foobar = new DigitalOcean.ContainerRegistry("foobar", new DigitalOcean.ContainerRegistryArgs
    ///         {
    ///             SubscriptionTierSlug = "starter",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Container Registries can be imported using the `name`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import digitalocean:index/containerRegistry:ContainerRegistry myregistry registryname
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/containerRegistry:ContainerRegistry")]
    public partial class ContainerRegistry : Pulumi.CustomResource
    {
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The name of the container_registry
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("serverUrl")]
        public Output<string> ServerUrl { get; private set; } = null!;

        /// <summary>
        /// The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
        /// </summary>
        [Output("subscriptionTierSlug")]
        public Output<string> SubscriptionTierSlug { get; private set; } = null!;


        /// <summary>
        /// Create a ContainerRegistry resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ContainerRegistry(string name, ContainerRegistryArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/containerRegistry:ContainerRegistry", name, args ?? new ContainerRegistryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ContainerRegistry(string name, Input<string> id, ContainerRegistryState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/containerRegistry:ContainerRegistry", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ContainerRegistry resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ContainerRegistry Get(string name, Input<string> id, ContainerRegistryState? state = null, CustomResourceOptions? options = null)
        {
            return new ContainerRegistry(name, id, state, options);
        }
    }

    public sealed class ContainerRegistryArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the container_registry
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
        /// </summary>
        [Input("subscriptionTierSlug", required: true)]
        public Input<string> SubscriptionTierSlug { get; set; } = null!;

        public ContainerRegistryArgs()
        {
        }
    }

    public sealed class ContainerRegistryState : Pulumi.ResourceArgs
    {
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// The name of the container_registry
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("serverUrl")]
        public Input<string>? ServerUrl { get; set; }

        /// <summary>
        /// The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
        /// </summary>
        [Input("subscriptionTierSlug")]
        public Input<string>? SubscriptionTierSlug { get; set; }

        public ContainerRegistryState()
        {
        }
    }
}
