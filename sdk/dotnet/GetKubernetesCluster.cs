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
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/d/kubernetes_cluster.html.markdown.
        /// </summary>
        public static Task<GetKubernetesClusterResult> GetKubernetesCluster(GetKubernetesClusterArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetKubernetesClusterResult>("digitalocean:index/getKubernetesCluster:getKubernetesCluster", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetKubernetesClusterArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of Kubernetes cluster.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private List<string>? _tags;
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        public GetKubernetesClusterArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetKubernetesClusterResult
    {
        /// <summary>
        /// The range of IP addresses in the overlay network of the Kubernetes cluster.
        /// </summary>
        public readonly string ClusterSubnet;
        /// <summary>
        /// The date and time when the Kubernetes cluster was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The base URL of the API server on the Kubernetes master node.
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// The public IPv4 address of the Kubernetes master node.
        /// </summary>
        public readonly string Ipv4Address;
        public readonly ImmutableArray<Outputs.GetKubernetesClusterKubeConfigsResult> KubeConfigs;
        public readonly string Name;
        /// <summary>
        /// A list of node pools associated with the cluster. Each node pool exports the following attributes:
        /// - `id` -  The unique ID that can be used to identify and reference the node pool.
        /// - `name` - The name of the node pool.
        /// - `size` - The slug identifier for the type of Droplet used as workers in the node pool.
        /// - `node_count` - The number of Droplet instances in the node pool.
        /// - `actual_node_count` - The actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
        /// - `auto_scale` - A boolean indicating whether auto-scaling is enabled on the node pool.
        /// - `min_nodes` - If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        /// - `max_nodes` - If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        /// - `tags` - A list of tag names applied to the node pool.
        /// - `nodes` - A list of nodes in the pool. Each node exports the following attributes:
        /// + `id` -  A unique ID that can be used to identify and reference the node.
        /// + `name` - The auto-generated name for the node.
        /// + `status` -  A string indicating the current status of the individual node.
        /// + `created_at` - The date and time when the node was created.
        /// + `updated_at` - The date and time when the node was last updated.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKubernetesClusterNodePoolsResult> NodePools;
        /// <summary>
        /// The slug identifier for the region where the Kubernetes cluster is located.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The range of assignable IP addresses for services running in the Kubernetes cluster.
        /// </summary>
        public readonly string ServiceSubnet;
        /// <summary>
        /// A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A list of tag names to be applied to the Kubernetes cluster.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The date and time when the Kubernetes cluster was last updated.
        /// * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
        /// - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
        /// - `host` - The URL of the API server on the Kubernetes master node.
        /// - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
        /// - `token` - The DigitalOcean API access token used by clients to access the cluster.
        /// - `client_key` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
        /// - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
        /// - `expires_at` - The date and time when the credentials will expire and need to be regenerated.
        /// </summary>
        public readonly string UpdatedAt;
        /// <summary>
        /// The slug identifier for the version of Kubernetes used for the cluster.
        /// </summary>
        public readonly string Version;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetKubernetesClusterResult(
            string clusterSubnet,
            string createdAt,
            string endpoint,
            string ipv4Address,
            ImmutableArray<Outputs.GetKubernetesClusterKubeConfigsResult> kubeConfigs,
            string name,
            ImmutableArray<Outputs.GetKubernetesClusterNodePoolsResult> nodePools,
            string region,
            string serviceSubnet,
            string status,
            ImmutableArray<string> tags,
            string updatedAt,
            string version,
            string id)
        {
            ClusterSubnet = clusterSubnet;
            CreatedAt = createdAt;
            Endpoint = endpoint;
            Ipv4Address = ipv4Address;
            KubeConfigs = kubeConfigs;
            Name = name;
            NodePools = nodePools;
            Region = region;
            ServiceSubnet = serviceSubnet;
            Status = status;
            Tags = tags;
            UpdatedAt = updatedAt;
            Version = version;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetKubernetesClusterKubeConfigsResult
    {
        public readonly string ClientCertificate;
        public readonly string ClientKey;
        public readonly string ClusterCaCertificate;
        public readonly string ExpiresAt;
        public readonly string Host;
        public readonly string RawConfig;
        public readonly string Token;

        [OutputConstructor]
        private GetKubernetesClusterKubeConfigsResult(
            string clientCertificate,
            string clientKey,
            string clusterCaCertificate,
            string expiresAt,
            string host,
            string rawConfig,
            string token)
        {
            ClientCertificate = clientCertificate;
            ClientKey = clientKey;
            ClusterCaCertificate = clusterCaCertificate;
            ExpiresAt = expiresAt;
            Host = host;
            RawConfig = rawConfig;
            Token = token;
        }
    }

    [OutputType]
    public sealed class GetKubernetesClusterNodePoolsNodesResult
    {
        /// <summary>
        /// The date and time when the Kubernetes cluster was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The unique ID that can be used to identify and reference a Kubernetes cluster.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of Kubernetes cluster.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The date and time when the Kubernetes cluster was last updated.
        /// * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
        /// - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
        /// - `host` - The URL of the API server on the Kubernetes master node.
        /// - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
        /// - `token` - The DigitalOcean API access token used by clients to access the cluster.
        /// - `client_key` - The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
        /// - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
        /// - `expires_at` - The date and time when the credentials will expire and need to be regenerated.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetKubernetesClusterNodePoolsNodesResult(
            string createdAt,
            string id,
            string name,
            string status,
            string updatedAt)
        {
            CreatedAt = createdAt;
            Id = id;
            Name = name;
            Status = status;
            UpdatedAt = updatedAt;
        }
    }

    [OutputType]
    public sealed class GetKubernetesClusterNodePoolsResult
    {
        public readonly int ActualNodeCount;
        public readonly bool AutoScale;
        /// <summary>
        /// The unique ID that can be used to identify and reference a Kubernetes cluster.
        /// </summary>
        public readonly string Id;
        public readonly int MaxNodes;
        public readonly int MinNodes;
        /// <summary>
        /// The name of Kubernetes cluster.
        /// </summary>
        public readonly string Name;
        public readonly int NodeCount;
        public readonly ImmutableArray<GetKubernetesClusterNodePoolsNodesResult> Nodes;
        public readonly string Size;
        /// <summary>
        /// A list of tag names to be applied to the Kubernetes cluster.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetKubernetesClusterNodePoolsResult(
            int actualNodeCount,
            bool autoScale,
            string id,
            int maxNodes,
            int minNodes,
            string name,
            int nodeCount,
            ImmutableArray<GetKubernetesClusterNodePoolsNodesResult> nodes,
            string size,
            ImmutableArray<string> tags)
        {
            ActualNodeCount = actualNodeCount;
            AutoScale = autoScale;
            Id = id;
            MaxNodes = maxNodes;
            MinNodes = minNodes;
            Name = name;
            NodeCount = nodeCount;
            Nodes = nodes;
            Size = size;
            Tags = tags;
        }
    }
    }
}
