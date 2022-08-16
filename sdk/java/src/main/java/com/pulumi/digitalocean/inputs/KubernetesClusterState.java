// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.enums.Region;
import com.pulumi.digitalocean.inputs.KubernetesClusterKubeConfigArgs;
import com.pulumi.digitalocean.inputs.KubernetesClusterMaintenancePolicyArgs;
import com.pulumi.digitalocean.inputs.KubernetesClusterNodePoolArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterState extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterState Empty = new KubernetesClusterState();

    /**
     * A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
     * 
     */
    @Import(name="autoUpgrade")
    private @Nullable Output<Boolean> autoUpgrade;

    /**
     * @return A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
     * 
     */
    public Optional<Output<Boolean>> autoUpgrade() {
        return Optional.ofNullable(this.autoUpgrade);
    }

    /**
     * The range of IP addresses in the overlay network of the Kubernetes cluster.
     * 
     */
    @Import(name="clusterSubnet")
    private @Nullable Output<String> clusterSubnet;

    /**
     * @return The range of IP addresses in the overlay network of the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> clusterSubnet() {
        return Optional.ofNullable(this.clusterSubnet);
    }

    /**
     * The uniform resource name (URN) for the Kubernetes cluster.
     * 
     */
    @Import(name="clusterUrn")
    private @Nullable Output<String> clusterUrn;

    /**
     * @return The uniform resource name (URN) for the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> clusterUrn() {
        return Optional.ofNullable(this.clusterUrn);
    }

    /**
     * The date and time when the node was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time when the node was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The base URL of the API server on the Kubernetes master node.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The base URL of the API server on the Kubernetes master node.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Enable/disable the high availability control plane for a cluster. High availability can only be set when creating a cluster. Any update will create a new cluster. Default: false
     * 
     */
    @Import(name="ha")
    private @Nullable Output<Boolean> ha;

    /**
     * @return Enable/disable the high availability control plane for a cluster. High availability can only be set when creating a cluster. Any update will create a new cluster. Default: false
     * 
     */
    public Optional<Output<Boolean>> ha() {
        return Optional.ofNullable(this.ha);
    }

    /**
     * The public IPv4 address of the Kubernetes master node. This will not be set if high availability is configured on the cluster (v1.21+)
     * 
     */
    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

    /**
     * @return The public IPv4 address of the Kubernetes master node. This will not be set if high availability is configured on the cluster (v1.21+)
     * 
     */
    public Optional<Output<String>> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    @Import(name="kubeConfigs")
    private @Nullable Output<List<KubernetesClusterKubeConfigArgs>> kubeConfigs;

    public Optional<Output<List<KubernetesClusterKubeConfigArgs>>> kubeConfigs() {
        return Optional.ofNullable(this.kubeConfigs);
    }

    /**
     * A block representing the cluster&#39;s maintenance window. Updates will be applied within this window. If not specified, a default maintenance window will be chosen. `auto_upgrade` must be set to `true` for this to have an effect.
     * 
     */
    @Import(name="maintenancePolicy")
    private @Nullable Output<KubernetesClusterMaintenancePolicyArgs> maintenancePolicy;

    /**
     * @return A block representing the cluster&#39;s maintenance window. Updates will be applied within this window. If not specified, a default maintenance window will be chosen. `auto_upgrade` must be set to `true` for this to have an effect.
     * 
     */
    public Optional<Output<KubernetesClusterMaintenancePolicyArgs>> maintenancePolicy() {
        return Optional.ofNullable(this.maintenancePolicy);
    }

    /**
     * A name for the node pool.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the node pool.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A block representing the cluster&#39;s default node pool. Additional node pools may be added to the cluster using the `digitalocean.KubernetesNodePool` resource. The following arguments may be specified:
     * 
     */
    @Import(name="nodePool")
    private @Nullable Output<KubernetesClusterNodePoolArgs> nodePool;

    /**
     * @return A block representing the cluster&#39;s default node pool. Additional node pools may be added to the cluster using the `digitalocean.KubernetesNodePool` resource. The following arguments may be specified:
     * 
     */
    public Optional<Output<KubernetesClusterNodePoolArgs>> nodePool() {
        return Optional.ofNullable(this.nodePool);
    }

    /**
     * The slug identifier for the region where the Kubernetes cluster will be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<Either<String,Region>> region;

    /**
     * @return The slug identifier for the region where the Kubernetes cluster will be created.
     * 
     */
    public Optional<Output<Either<String,Region>>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The range of assignable IP addresses for services running in the Kubernetes cluster.
     * 
     */
    @Import(name="serviceSubnet")
    private @Nullable Output<String> serviceSubnet;

    /**
     * @return The range of assignable IP addresses for services running in the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> serviceSubnet() {
        return Optional.ofNullable(this.serviceSubnet);
    }

    /**
     * A string indicating the current status of the individual node.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return A string indicating the current status of the individual node.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Enable/disable surge upgrades for a cluster. Default: false
     * 
     */
    @Import(name="surgeUpgrade")
    private @Nullable Output<Boolean> surgeUpgrade;

    /**
     * @return Enable/disable surge upgrades for a cluster. Default: false
     * 
     */
    public Optional<Output<Boolean>> surgeUpgrade() {
        return Optional.ofNullable(this.surgeUpgrade);
    }

    /**
     * A list of tag names to be applied to the Kubernetes cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tag names to be applied to the Kubernetes cluster.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The date and time when the node was last updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The date and time when the node was last updated.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The ID of the VPC where the Kubernetes cluster will be located.
     * 
     */
    @Import(name="vpcUuid")
    private @Nullable Output<String> vpcUuid;

    /**
     * @return The ID of the VPC where the Kubernetes cluster will be located.
     * 
     */
    public Optional<Output<String>> vpcUuid() {
        return Optional.ofNullable(this.vpcUuid);
    }

    private KubernetesClusterState() {}

    private KubernetesClusterState(KubernetesClusterState $) {
        this.autoUpgrade = $.autoUpgrade;
        this.clusterSubnet = $.clusterSubnet;
        this.clusterUrn = $.clusterUrn;
        this.createdAt = $.createdAt;
        this.endpoint = $.endpoint;
        this.ha = $.ha;
        this.ipv4Address = $.ipv4Address;
        this.kubeConfigs = $.kubeConfigs;
        this.maintenancePolicy = $.maintenancePolicy;
        this.name = $.name;
        this.nodePool = $.nodePool;
        this.region = $.region;
        this.serviceSubnet = $.serviceSubnet;
        this.status = $.status;
        this.surgeUpgrade = $.surgeUpgrade;
        this.tags = $.tags;
        this.updatedAt = $.updatedAt;
        this.version = $.version;
        this.vpcUuid = $.vpcUuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterState $;

        public Builder() {
            $ = new KubernetesClusterState();
        }

        public Builder(KubernetesClusterState defaults) {
            $ = new KubernetesClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpgrade A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(@Nullable Output<Boolean> autoUpgrade) {
            $.autoUpgrade = autoUpgrade;
            return this;
        }

        /**
         * @param autoUpgrade A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(Boolean autoUpgrade) {
            return autoUpgrade(Output.of(autoUpgrade));
        }

        /**
         * @param clusterSubnet The range of IP addresses in the overlay network of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterSubnet(@Nullable Output<String> clusterSubnet) {
            $.clusterSubnet = clusterSubnet;
            return this;
        }

        /**
         * @param clusterSubnet The range of IP addresses in the overlay network of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterSubnet(String clusterSubnet) {
            return clusterSubnet(Output.of(clusterSubnet));
        }

        /**
         * @param clusterUrn The uniform resource name (URN) for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterUrn(@Nullable Output<String> clusterUrn) {
            $.clusterUrn = clusterUrn;
            return this;
        }

        /**
         * @param clusterUrn The uniform resource name (URN) for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterUrn(String clusterUrn) {
            return clusterUrn(Output.of(clusterUrn));
        }

        /**
         * @param createdAt The date and time when the node was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time when the node was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param endpoint The base URL of the API server on the Kubernetes master node.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The base URL of the API server on the Kubernetes master node.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param ha Enable/disable the high availability control plane for a cluster. High availability can only be set when creating a cluster. Any update will create a new cluster. Default: false
         * 
         * @return builder
         * 
         */
        public Builder ha(@Nullable Output<Boolean> ha) {
            $.ha = ha;
            return this;
        }

        /**
         * @param ha Enable/disable the high availability control plane for a cluster. High availability can only be set when creating a cluster. Any update will create a new cluster. Default: false
         * 
         * @return builder
         * 
         */
        public Builder ha(Boolean ha) {
            return ha(Output.of(ha));
        }

        /**
         * @param ipv4Address The public IPv4 address of the Kubernetes master node. This will not be set if high availability is configured on the cluster (v1.21+)
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        /**
         * @param ipv4Address The public IPv4 address of the Kubernetes master node. This will not be set if high availability is configured on the cluster (v1.21+)
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        public Builder kubeConfigs(@Nullable Output<List<KubernetesClusterKubeConfigArgs>> kubeConfigs) {
            $.kubeConfigs = kubeConfigs;
            return this;
        }

        public Builder kubeConfigs(List<KubernetesClusterKubeConfigArgs> kubeConfigs) {
            return kubeConfigs(Output.of(kubeConfigs));
        }

        public Builder kubeConfigs(KubernetesClusterKubeConfigArgs... kubeConfigs) {
            return kubeConfigs(List.of(kubeConfigs));
        }

        /**
         * @param maintenancePolicy A block representing the cluster&#39;s maintenance window. Updates will be applied within this window. If not specified, a default maintenance window will be chosen. `auto_upgrade` must be set to `true` for this to have an effect.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(@Nullable Output<KubernetesClusterMaintenancePolicyArgs> maintenancePolicy) {
            $.maintenancePolicy = maintenancePolicy;
            return this;
        }

        /**
         * @param maintenancePolicy A block representing the cluster&#39;s maintenance window. Updates will be applied within this window. If not specified, a default maintenance window will be chosen. `auto_upgrade` must be set to `true` for this to have an effect.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(KubernetesClusterMaintenancePolicyArgs maintenancePolicy) {
            return maintenancePolicy(Output.of(maintenancePolicy));
        }

        /**
         * @param name A name for the node pool.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the node pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodePool A block representing the cluster&#39;s default node pool. Additional node pools may be added to the cluster using the `digitalocean.KubernetesNodePool` resource. The following arguments may be specified:
         * 
         * @return builder
         * 
         */
        public Builder nodePool(@Nullable Output<KubernetesClusterNodePoolArgs> nodePool) {
            $.nodePool = nodePool;
            return this;
        }

        /**
         * @param nodePool A block representing the cluster&#39;s default node pool. Additional node pools may be added to the cluster using the `digitalocean.KubernetesNodePool` resource. The following arguments may be specified:
         * 
         * @return builder
         * 
         */
        public Builder nodePool(KubernetesClusterNodePoolArgs nodePool) {
            return nodePool(Output.of(nodePool));
        }

        /**
         * @param region The slug identifier for the region where the Kubernetes cluster will be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<Either<String,Region>> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The slug identifier for the region where the Kubernetes cluster will be created.
         * 
         * @return builder
         * 
         */
        public Builder region(Either<String,Region> region) {
            return region(Output.of(region));
        }

        /**
         * @param region The slug identifier for the region where the Kubernetes cluster will be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Either.ofLeft(region));
        }

        /**
         * @param region The slug identifier for the region where the Kubernetes cluster will be created.
         * 
         * @return builder
         * 
         */
        public Builder region(Region region) {
            return region(Either.ofRight(region));
        }

        /**
         * @param serviceSubnet The range of assignable IP addresses for services running in the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder serviceSubnet(@Nullable Output<String> serviceSubnet) {
            $.serviceSubnet = serviceSubnet;
            return this;
        }

        /**
         * @param serviceSubnet The range of assignable IP addresses for services running in the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder serviceSubnet(String serviceSubnet) {
            return serviceSubnet(Output.of(serviceSubnet));
        }

        /**
         * @param status A string indicating the current status of the individual node.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status A string indicating the current status of the individual node.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param surgeUpgrade Enable/disable surge upgrades for a cluster. Default: false
         * 
         * @return builder
         * 
         */
        public Builder surgeUpgrade(@Nullable Output<Boolean> surgeUpgrade) {
            $.surgeUpgrade = surgeUpgrade;
            return this;
        }

        /**
         * @param surgeUpgrade Enable/disable surge upgrades for a cluster. Default: false
         * 
         * @return builder
         * 
         */
        public Builder surgeUpgrade(Boolean surgeUpgrade) {
            return surgeUpgrade(Output.of(surgeUpgrade));
        }

        /**
         * @param tags A list of tag names to be applied to the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tag names to be applied to the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tag names to be applied to the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param updatedAt The date and time when the node was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The date and time when the node was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param version The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param vpcUuid The ID of the VPC where the Kubernetes cluster will be located.
         * 
         * @return builder
         * 
         */
        public Builder vpcUuid(@Nullable Output<String> vpcUuid) {
            $.vpcUuid = vpcUuid;
            return this;
        }

        /**
         * @param vpcUuid The ID of the VPC where the Kubernetes cluster will be located.
         * 
         * @return builder
         * 
         */
        public Builder vpcUuid(String vpcUuid) {
            return vpcUuid(Output.of(vpcUuid));
        }

        public KubernetesClusterState build() {
            return $;
        }
    }

}