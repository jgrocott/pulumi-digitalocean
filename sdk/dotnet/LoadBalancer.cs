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
    /// Provides a DigitalOcean Load Balancer resource. This can be used to create,
    /// modify, and delete Load Balancers.
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
    ///         var web = new DigitalOcean.Droplet("web", new DigitalOcean.DropletArgs
    ///         {
    ///             Size = "s-1vcpu-1gb",
    ///             Image = "ubuntu-18-04-x64",
    ///             Region = "nyc3",
    ///         });
    ///         var @public = new DigitalOcean.LoadBalancer("public", new DigitalOcean.LoadBalancerArgs
    ///         {
    ///             Region = "nyc3",
    ///             ForwardingRules = 
    ///             {
    ///                 new DigitalOcean.Inputs.LoadBalancerForwardingRuleArgs
    ///                 {
    ///                     EntryPort = 80,
    ///                     EntryProtocol = "http",
    ///                     TargetPort = 80,
    ///                     TargetProtocol = "http",
    ///                 },
    ///             },
    ///             Healthcheck = new DigitalOcean.Inputs.LoadBalancerHealthcheckArgs
    ///             {
    ///                 Port = 22,
    ///                 Protocol = "tcp",
    ///             },
    ///             DropletIds = 
    ///             {
    ///                 web.Id,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// When managing certificates attached to the load balancer, make sure to add the `create_before_destroy`
    /// lifecycle property in order to ensure the certificate is correctly updated when changed. The order of
    /// operations will then be: `Create new certificate` &gt; `Update loadbalancer with new certificate` -&gt;
    /// `Delete old certificate`. When doing so, you must also change the name of the certificate,
    /// as there cannot be multiple certificates with the same name in an account.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var cert = new DigitalOcean.Certificate("cert", new DigitalOcean.CertificateArgs
    ///         {
    ///             PrivateKey = "file('key.pem')",
    ///             LeafCertificate = "file('cert.pem')",
    ///         });
    ///         var web = new DigitalOcean.Droplet("web", new DigitalOcean.DropletArgs
    ///         {
    ///             Size = "s-1vcpu-1gb",
    ///             Image = "ubuntu-18-04-x64",
    ///             Region = "nyc3",
    ///         });
    ///         var @public = new DigitalOcean.LoadBalancer("public", new DigitalOcean.LoadBalancerArgs
    ///         {
    ///             Region = "nyc3",
    ///             ForwardingRules = 
    ///             {
    ///                 new DigitalOcean.Inputs.LoadBalancerForwardingRuleArgs
    ///                 {
    ///                     EntryPort = 443,
    ///                     EntryProtocol = "https",
    ///                     TargetPort = 80,
    ///                     TargetProtocol = "http",
    ///                     CertificateName = cert.Name,
    ///                 },
    ///             },
    ///             Healthcheck = new DigitalOcean.Inputs.LoadBalancerHealthcheckArgs
    ///             {
    ///                 Port = 22,
    ///                 Protocol = "tcp",
    ///             },
    ///             DropletIds = 
    ///             {
    ///                 web.Id,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Load Balancers can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import digitalocean:index/loadBalancer:LoadBalancer myloadbalancer 4de7ac8b-495b-4884-9a69-1050c6793cd6
    /// ```
    /// </summary>
    public partial class LoadBalancer : Pulumi.CustomResource
    {
        /// <summary>
        /// The load balancing algorithm used to determine
        /// which backend Droplet will be selected by a client. It must be either `round_robin`
        /// or `least_connections`. The default value is `round_robin`.
        /// </summary>
        [Output("algorithm")]
        public Output<string?> Algorithm { get; private set; } = null!;

        /// <summary>
        /// A list of the IDs of each droplet to be attached to the Load Balancer.
        /// </summary>
        [Output("dropletIds")]
        public Output<ImmutableArray<int>> DropletIds { get; private set; } = null!;

        /// <summary>
        /// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        /// </summary>
        [Output("dropletTag")]
        public Output<string?> DropletTag { get; private set; } = null!;

        /// <summary>
        /// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
        /// </summary>
        [Output("enableBackendKeepalive")]
        public Output<bool?> EnableBackendKeepalive { get; private set; } = null!;

        /// <summary>
        /// A boolean value indicating whether PROXY
        /// Protocol should be used to pass information from connecting client requests to
        /// the backend service. Default value is `false`.
        /// </summary>
        [Output("enableProxyProtocol")]
        public Output<bool?> EnableProxyProtocol { get; private set; } = null!;

        /// <summary>
        /// A list of `forwarding_rule` to be assigned to the
        /// Load Balancer. The `forwarding_rule` block is documented below.
        /// </summary>
        [Output("forwardingRules")]
        public Output<ImmutableArray<Outputs.LoadBalancerForwardingRule>> ForwardingRules { get; private set; } = null!;

        /// <summary>
        /// A `healthcheck` block to be assigned to the
        /// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        /// </summary>
        [Output("healthcheck")]
        public Output<Outputs.LoadBalancerHealthcheck> Healthcheck { get; private set; } = null!;

        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        /// <summary>
        /// The uniform resource name for the Load Balancer
        /// </summary>
        [Output("loadBalancerUrn")]
        public Output<string> LoadBalancerUrn { get; private set; } = null!;

        /// <summary>
        /// The Load Balancer name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A boolean value indicating whether
        /// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
        /// Default value is `false`.
        /// </summary>
        [Output("redirectHttpToHttps")]
        public Output<bool?> RedirectHttpToHttps { get; private set; } = null!;

        /// <summary>
        /// The region to start in
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`.
        /// </summary>
        [Output("size")]
        public Output<string?> Size { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A `sticky_sessions` block to be assigned to the
        /// Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        /// </summary>
        [Output("stickySessions")]
        public Output<Outputs.LoadBalancerStickySessions> StickySessions { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC where the load balancer will be located.
        /// </summary>
        [Output("vpcUuid")]
        public Output<string> VpcUuid { get; private set; } = null!;


        /// <summary>
        /// Create a LoadBalancer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadBalancer(string name, LoadBalancerArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/loadBalancer:LoadBalancer", name, args ?? new LoadBalancerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadBalancer(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/loadBalancer:LoadBalancer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadBalancer Get(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadBalancer(name, id, state, options);
        }
    }

    public sealed class LoadBalancerArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The load balancing algorithm used to determine
        /// which backend Droplet will be selected by a client. It must be either `round_robin`
        /// or `least_connections`. The default value is `round_robin`.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        [Input("dropletIds")]
        private InputList<int>? _dropletIds;

        /// <summary>
        /// A list of the IDs of each droplet to be attached to the Load Balancer.
        /// </summary>
        public InputList<int> DropletIds
        {
            get => _dropletIds ?? (_dropletIds = new InputList<int>());
            set => _dropletIds = value;
        }

        /// <summary>
        /// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        /// </summary>
        [Input("dropletTag")]
        public Input<string>? DropletTag { get; set; }

        /// <summary>
        /// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
        /// </summary>
        [Input("enableBackendKeepalive")]
        public Input<bool>? EnableBackendKeepalive { get; set; }

        /// <summary>
        /// A boolean value indicating whether PROXY
        /// Protocol should be used to pass information from connecting client requests to
        /// the backend service. Default value is `false`.
        /// </summary>
        [Input("enableProxyProtocol")]
        public Input<bool>? EnableProxyProtocol { get; set; }

        [Input("forwardingRules", required: true)]
        private InputList<Inputs.LoadBalancerForwardingRuleArgs>? _forwardingRules;

        /// <summary>
        /// A list of `forwarding_rule` to be assigned to the
        /// Load Balancer. The `forwarding_rule` block is documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerForwardingRuleArgs> ForwardingRules
        {
            get => _forwardingRules ?? (_forwardingRules = new InputList<Inputs.LoadBalancerForwardingRuleArgs>());
            set => _forwardingRules = value;
        }

        /// <summary>
        /// A `healthcheck` block to be assigned to the
        /// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        /// </summary>
        [Input("healthcheck")]
        public Input<Inputs.LoadBalancerHealthcheckArgs>? Healthcheck { get; set; }

        /// <summary>
        /// The Load Balancer name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A boolean value indicating whether
        /// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
        /// Default value is `false`.
        /// </summary>
        [Input("redirectHttpToHttps")]
        public Input<bool>? RedirectHttpToHttps { get; set; }

        /// <summary>
        /// The region to start in
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`.
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// A `sticky_sessions` block to be assigned to the
        /// Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        /// </summary>
        [Input("stickySessions")]
        public Input<Inputs.LoadBalancerStickySessionsArgs>? StickySessions { get; set; }

        /// <summary>
        /// The ID of the VPC where the load balancer will be located.
        /// </summary>
        [Input("vpcUuid")]
        public Input<string>? VpcUuid { get; set; }

        public LoadBalancerArgs()
        {
        }
    }

    public sealed class LoadBalancerState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The load balancing algorithm used to determine
        /// which backend Droplet will be selected by a client. It must be either `round_robin`
        /// or `least_connections`. The default value is `round_robin`.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        [Input("dropletIds")]
        private InputList<int>? _dropletIds;

        /// <summary>
        /// A list of the IDs of each droplet to be attached to the Load Balancer.
        /// </summary>
        public InputList<int> DropletIds
        {
            get => _dropletIds ?? (_dropletIds = new InputList<int>());
            set => _dropletIds = value;
        }

        /// <summary>
        /// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        /// </summary>
        [Input("dropletTag")]
        public Input<string>? DropletTag { get; set; }

        /// <summary>
        /// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
        /// </summary>
        [Input("enableBackendKeepalive")]
        public Input<bool>? EnableBackendKeepalive { get; set; }

        /// <summary>
        /// A boolean value indicating whether PROXY
        /// Protocol should be used to pass information from connecting client requests to
        /// the backend service. Default value is `false`.
        /// </summary>
        [Input("enableProxyProtocol")]
        public Input<bool>? EnableProxyProtocol { get; set; }

        [Input("forwardingRules")]
        private InputList<Inputs.LoadBalancerForwardingRuleGetArgs>? _forwardingRules;

        /// <summary>
        /// A list of `forwarding_rule` to be assigned to the
        /// Load Balancer. The `forwarding_rule` block is documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerForwardingRuleGetArgs> ForwardingRules
        {
            get => _forwardingRules ?? (_forwardingRules = new InputList<Inputs.LoadBalancerForwardingRuleGetArgs>());
            set => _forwardingRules = value;
        }

        /// <summary>
        /// A `healthcheck` block to be assigned to the
        /// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        /// </summary>
        [Input("healthcheck")]
        public Input<Inputs.LoadBalancerHealthcheckGetArgs>? Healthcheck { get; set; }

        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// The uniform resource name for the Load Balancer
        /// </summary>
        [Input("loadBalancerUrn")]
        public Input<string>? LoadBalancerUrn { get; set; }

        /// <summary>
        /// The Load Balancer name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A boolean value indicating whether
        /// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
        /// Default value is `false`.
        /// </summary>
        [Input("redirectHttpToHttps")]
        public Input<bool>? RedirectHttpToHttps { get; set; }

        /// <summary>
        /// The region to start in
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`.
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// A `sticky_sessions` block to be assigned to the
        /// Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        /// </summary>
        [Input("stickySessions")]
        public Input<Inputs.LoadBalancerStickySessionsGetArgs>? StickySessions { get; set; }

        /// <summary>
        /// The ID of the VPC where the load balancer will be located.
        /// </summary>
        [Input("vpcUuid")]
        public Input<string>? VpcUuid { get; set; }

        public LoadBalancerState()
        {
        }
    }
}
