# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._enums import *
from ._inputs import *

__all__ = ['KubernetesClusterArgs', 'KubernetesCluster']

@pulumi.input_type
class KubernetesClusterArgs:
    def __init__(__self__, *,
                 node_pool: pulumi.Input['KubernetesClusterNodePoolArgs'],
                 region: pulumi.Input[Union[str, 'Region']],
                 version: pulumi.Input[str],
                 auto_upgrade: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 surge_upgrade: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 vpc_uuid: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a KubernetesCluster resource.
        :param pulumi.Input['KubernetesClusterNodePoolArgs'] node_pool: A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
        :param pulumi.Input[Union[str, 'Region']] region: The slug identifier for the region where the Kubernetes cluster will be created.
        :param pulumi.Input[str] version: The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        :param pulumi.Input[bool] auto_upgrade: A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        :param pulumi.Input[str] name: A name for the node pool.
        :param pulumi.Input[bool] surge_upgrade: Enable/disable surge upgrades for a cluster. Default: false
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[str] vpc_uuid: The ID of the VPC where the Kubernetes cluster will be located.
        """
        pulumi.set(__self__, "node_pool", node_pool)
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "version", version)
        if auto_upgrade is not None:
            pulumi.set(__self__, "auto_upgrade", auto_upgrade)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if surge_upgrade is not None:
            pulumi.set(__self__, "surge_upgrade", surge_upgrade)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_uuid is not None:
            pulumi.set(__self__, "vpc_uuid", vpc_uuid)

    @property
    @pulumi.getter(name="nodePool")
    def node_pool(self) -> pulumi.Input['KubernetesClusterNodePoolArgs']:
        """
        A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
        """
        return pulumi.get(self, "node_pool")

    @node_pool.setter
    def node_pool(self, value: pulumi.Input['KubernetesClusterNodePoolArgs']):
        pulumi.set(self, "node_pool", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[Union[str, 'Region']]:
        """
        The slug identifier for the region where the Kubernetes cluster will be created.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[Union[str, 'Region']]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[str]:
        """
        The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[str]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter(name="autoUpgrade")
    def auto_upgrade(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        """
        return pulumi.get(self, "auto_upgrade")

    @auto_upgrade.setter
    def auto_upgrade(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_upgrade", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the node pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="surgeUpgrade")
    def surge_upgrade(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable/disable surge upgrades for a cluster. Default: false
        """
        return pulumi.get(self, "surge_upgrade")

    @surge_upgrade.setter
    def surge_upgrade(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "surge_upgrade", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of tag names to be applied to the Kubernetes cluster.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcUuid")
    def vpc_uuid(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC where the Kubernetes cluster will be located.
        """
        return pulumi.get(self, "vpc_uuid")

    @vpc_uuid.setter
    def vpc_uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_uuid", value)


@pulumi.input_type
class _KubernetesClusterState:
    def __init__(__self__, *,
                 auto_upgrade: Optional[pulumi.Input[bool]] = None,
                 cluster_subnet: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 ipv4_address: Optional[pulumi.Input[str]] = None,
                 kube_configs: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesClusterKubeConfigArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_pool: Optional[pulumi.Input['KubernetesClusterNodePoolArgs']] = None,
                 region: Optional[pulumi.Input[Union[str, 'Region']]] = None,
                 service_subnet: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 surge_upgrade: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None,
                 urn: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 vpc_uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KubernetesCluster resources.
        :param pulumi.Input[bool] auto_upgrade: A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        :param pulumi.Input[str] cluster_subnet: The range of IP addresses in the overlay network of the Kubernetes cluster.
        :param pulumi.Input[str] created_at: The date and time when the node was created.
        :param pulumi.Input[str] endpoint: The base URL of the API server on the Kubernetes master node.
        :param pulumi.Input[str] ipv4_address: The public IPv4 address of the Kubernetes master node.
        :param pulumi.Input[str] name: A name for the node pool.
        :param pulumi.Input['KubernetesClusterNodePoolArgs'] node_pool: A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
        :param pulumi.Input[Union[str, 'Region']] region: The slug identifier for the region where the Kubernetes cluster will be created.
        :param pulumi.Input[str] service_subnet: The range of assignable IP addresses for services running in the Kubernetes cluster.
        :param pulumi.Input[str] status: A string indicating the current status of the individual node.
        :param pulumi.Input[bool] surge_upgrade: Enable/disable surge upgrades for a cluster. Default: false
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[str] updated_at: The date and time when the node was last updated.
        :param pulumi.Input[str] urn: The uniform resource name (URN) for the Kubernetes cluster.
        :param pulumi.Input[str] version: The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        :param pulumi.Input[str] vpc_uuid: The ID of the VPC where the Kubernetes cluster will be located.
        """
        if auto_upgrade is not None:
            pulumi.set(__self__, "auto_upgrade", auto_upgrade)
        if cluster_subnet is not None:
            pulumi.set(__self__, "cluster_subnet", cluster_subnet)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if ipv4_address is not None:
            pulumi.set(__self__, "ipv4_address", ipv4_address)
        if kube_configs is not None:
            pulumi.set(__self__, "kube_configs", kube_configs)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if node_pool is not None:
            pulumi.set(__self__, "node_pool", node_pool)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if service_subnet is not None:
            pulumi.set(__self__, "service_subnet", service_subnet)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if surge_upgrade is not None:
            pulumi.set(__self__, "surge_upgrade", surge_upgrade)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if urn is not None:
            pulumi.set(__self__, "urn", urn)
        if version is not None:
            pulumi.set(__self__, "version", version)
        if vpc_uuid is not None:
            pulumi.set(__self__, "vpc_uuid", vpc_uuid)

    @property
    @pulumi.getter(name="autoUpgrade")
    def auto_upgrade(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        """
        return pulumi.get(self, "auto_upgrade")

    @auto_upgrade.setter
    def auto_upgrade(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_upgrade", value)

    @property
    @pulumi.getter(name="clusterSubnet")
    def cluster_subnet(self) -> Optional[pulumi.Input[str]]:
        """
        The range of IP addresses in the overlay network of the Kubernetes cluster.
        """
        return pulumi.get(self, "cluster_subnet")

    @cluster_subnet.setter
    def cluster_subnet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_subnet", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time when the node was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The base URL of the API server on the Kubernetes master node.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="ipv4Address")
    def ipv4_address(self) -> Optional[pulumi.Input[str]]:
        """
        The public IPv4 address of the Kubernetes master node.
        """
        return pulumi.get(self, "ipv4_address")

    @ipv4_address.setter
    def ipv4_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv4_address", value)

    @property
    @pulumi.getter(name="kubeConfigs")
    def kube_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesClusterKubeConfigArgs']]]]:
        return pulumi.get(self, "kube_configs")

    @kube_configs.setter
    def kube_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesClusterKubeConfigArgs']]]]):
        pulumi.set(self, "kube_configs", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the node pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nodePool")
    def node_pool(self) -> Optional[pulumi.Input['KubernetesClusterNodePoolArgs']]:
        """
        A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
        """
        return pulumi.get(self, "node_pool")

    @node_pool.setter
    def node_pool(self, value: Optional[pulumi.Input['KubernetesClusterNodePoolArgs']]):
        pulumi.set(self, "node_pool", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[Union[str, 'Region']]]:
        """
        The slug identifier for the region where the Kubernetes cluster will be created.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[Union[str, 'Region']]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="serviceSubnet")
    def service_subnet(self) -> Optional[pulumi.Input[str]]:
        """
        The range of assignable IP addresses for services running in the Kubernetes cluster.
        """
        return pulumi.get(self, "service_subnet")

    @service_subnet.setter
    def service_subnet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_subnet", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        A string indicating the current status of the individual node.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="surgeUpgrade")
    def surge_upgrade(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable/disable surge upgrades for a cluster. Default: false
        """
        return pulumi.get(self, "surge_upgrade")

    @surge_upgrade.setter
    def surge_upgrade(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "surge_upgrade", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of tag names to be applied to the Kubernetes cluster.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time when the node was last updated.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)

    @property
    @pulumi.getter
    def urn(self) -> Optional[pulumi.Input[str]]:
        """
        The uniform resource name (URN) for the Kubernetes cluster.
        """
        return pulumi.get(self, "urn")

    @urn.setter
    def urn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "urn", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter(name="vpcUuid")
    def vpc_uuid(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC where the Kubernetes cluster will be located.
        """
        return pulumi.get(self, "vpc_uuid")

    @vpc_uuid.setter
    def vpc_uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_uuid", value)


class KubernetesCluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_upgrade: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_pool: Optional[pulumi.Input[pulumi.InputType['KubernetesClusterNodePoolArgs']]] = None,
                 region: Optional[pulumi.Input[Union[str, 'Region']]] = None,
                 surge_upgrade: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 vpc_uuid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        Before importing a Kubernetes cluster, the cluster's default node pool must be tagged with the `terraform:default-node-pool` tag. The provider will automatically add this tag if the cluster has a single node pool. Clusters with more than one node pool, however, will require that you manually add the `terraform:default-node-pool` tag to the node pool that you intend to be the default node pool. Then the Kubernetes cluster and all of its node pools can be imported using the cluster's `id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/kubernetesCluster:KubernetesCluster mycluster 1b8b2100-0e9f-4e8f-ad78-9eb578c2a0af
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_upgrade: A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        :param pulumi.Input[str] name: A name for the node pool.
        :param pulumi.Input[pulumi.InputType['KubernetesClusterNodePoolArgs']] node_pool: A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
        :param pulumi.Input[Union[str, 'Region']] region: The slug identifier for the region where the Kubernetes cluster will be created.
        :param pulumi.Input[bool] surge_upgrade: Enable/disable surge upgrades for a cluster. Default: false
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[str] version: The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        :param pulumi.Input[str] vpc_uuid: The ID of the VPC where the Kubernetes cluster will be located.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KubernetesClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Before importing a Kubernetes cluster, the cluster's default node pool must be tagged with the `terraform:default-node-pool` tag. The provider will automatically add this tag if the cluster has a single node pool. Clusters with more than one node pool, however, will require that you manually add the `terraform:default-node-pool` tag to the node pool that you intend to be the default node pool. Then the Kubernetes cluster and all of its node pools can be imported using the cluster's `id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/kubernetesCluster:KubernetesCluster mycluster 1b8b2100-0e9f-4e8f-ad78-9eb578c2a0af
        ```

        :param str resource_name: The name of the resource.
        :param KubernetesClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KubernetesClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_upgrade: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_pool: Optional[pulumi.Input[pulumi.InputType['KubernetesClusterNodePoolArgs']]] = None,
                 region: Optional[pulumi.Input[Union[str, 'Region']]] = None,
                 surge_upgrade: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 vpc_uuid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KubernetesClusterArgs.__new__(KubernetesClusterArgs)

            __props__.__dict__["auto_upgrade"] = auto_upgrade
            __props__.__dict__["name"] = name
            if node_pool is None and not opts.urn:
                raise TypeError("Missing required property 'node_pool'")
            __props__.__dict__["node_pool"] = node_pool
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["surge_upgrade"] = surge_upgrade
            __props__.__dict__["tags"] = tags
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
            __props__.__dict__["vpc_uuid"] = vpc_uuid
            __props__.__dict__["cluster_subnet"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["endpoint"] = None
            __props__.__dict__["ipv4_address"] = None
            __props__.__dict__["kube_configs"] = None
            __props__.__dict__["service_subnet"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["updated_at"] = None
            __props__.__dict__["urn"] = None
        super(KubernetesCluster, __self__).__init__(
            'digitalocean:index/kubernetesCluster:KubernetesCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_upgrade: Optional[pulumi.Input[bool]] = None,
            cluster_subnet: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            endpoint: Optional[pulumi.Input[str]] = None,
            ipv4_address: Optional[pulumi.Input[str]] = None,
            kube_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesClusterKubeConfigArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            node_pool: Optional[pulumi.Input[pulumi.InputType['KubernetesClusterNodePoolArgs']]] = None,
            region: Optional[pulumi.Input[Union[str, 'Region']]] = None,
            service_subnet: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            surge_upgrade: Optional[pulumi.Input[bool]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            urn: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None,
            vpc_uuid: Optional[pulumi.Input[str]] = None) -> 'KubernetesCluster':
        """
        Get an existing KubernetesCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_upgrade: A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        :param pulumi.Input[str] cluster_subnet: The range of IP addresses in the overlay network of the Kubernetes cluster.
        :param pulumi.Input[str] created_at: The date and time when the node was created.
        :param pulumi.Input[str] endpoint: The base URL of the API server on the Kubernetes master node.
        :param pulumi.Input[str] ipv4_address: The public IPv4 address of the Kubernetes master node.
        :param pulumi.Input[str] name: A name for the node pool.
        :param pulumi.Input[pulumi.InputType['KubernetesClusterNodePoolArgs']] node_pool: A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
        :param pulumi.Input[Union[str, 'Region']] region: The slug identifier for the region where the Kubernetes cluster will be created.
        :param pulumi.Input[str] service_subnet: The range of assignable IP addresses for services running in the Kubernetes cluster.
        :param pulumi.Input[str] status: A string indicating the current status of the individual node.
        :param pulumi.Input[bool] surge_upgrade: Enable/disable surge upgrades for a cluster. Default: false
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[str] updated_at: The date and time when the node was last updated.
        :param pulumi.Input[str] urn: The uniform resource name (URN) for the Kubernetes cluster.
        :param pulumi.Input[str] version: The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        :param pulumi.Input[str] vpc_uuid: The ID of the VPC where the Kubernetes cluster will be located.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KubernetesClusterState.__new__(_KubernetesClusterState)

        __props__.__dict__["auto_upgrade"] = auto_upgrade
        __props__.__dict__["cluster_subnet"] = cluster_subnet
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["endpoint"] = endpoint
        __props__.__dict__["ipv4_address"] = ipv4_address
        __props__.__dict__["kube_configs"] = kube_configs
        __props__.__dict__["name"] = name
        __props__.__dict__["node_pool"] = node_pool
        __props__.__dict__["region"] = region
        __props__.__dict__["service_subnet"] = service_subnet
        __props__.__dict__["status"] = status
        __props__.__dict__["surge_upgrade"] = surge_upgrade
        __props__.__dict__["tags"] = tags
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["urn"] = urn
        __props__.__dict__["version"] = version
        __props__.__dict__["vpc_uuid"] = vpc_uuid
        return KubernetesCluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoUpgrade")
    def auto_upgrade(self) -> pulumi.Output[Optional[bool]]:
        """
        A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        """
        return pulumi.get(self, "auto_upgrade")

    @property
    @pulumi.getter(name="clusterSubnet")
    def cluster_subnet(self) -> pulumi.Output[str]:
        """
        The range of IP addresses in the overlay network of the Kubernetes cluster.
        """
        return pulumi.get(self, "cluster_subnet")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The date and time when the node was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[str]:
        """
        The base URL of the API server on the Kubernetes master node.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="ipv4Address")
    def ipv4_address(self) -> pulumi.Output[str]:
        """
        The public IPv4 address of the Kubernetes master node.
        """
        return pulumi.get(self, "ipv4_address")

    @property
    @pulumi.getter(name="kubeConfigs")
    def kube_configs(self) -> pulumi.Output[Sequence['outputs.KubernetesClusterKubeConfig']]:
        return pulumi.get(self, "kube_configs")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A name for the node pool.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodePool")
    def node_pool(self) -> pulumi.Output['outputs.KubernetesClusterNodePool']:
        """
        A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
        """
        return pulumi.get(self, "node_pool")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The slug identifier for the region where the Kubernetes cluster will be created.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="serviceSubnet")
    def service_subnet(self) -> pulumi.Output[str]:
        """
        The range of assignable IP addresses for services running in the Kubernetes cluster.
        """
        return pulumi.get(self, "service_subnet")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        A string indicating the current status of the individual node.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="surgeUpgrade")
    def surge_upgrade(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable/disable surge upgrades for a cluster. Default: false
        """
        return pulumi.get(self, "surge_upgrade")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of tag names to be applied to the Kubernetes cluster.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The date and time when the node was last updated.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def urn(self) -> pulumi.Output[str]:
        """
        The uniform resource name (URN) for the Kubernetes cluster.
        """
        return pulumi.get(self, "urn")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="vpcUuid")
    def vpc_uuid(self) -> pulumi.Output[str]:
        """
        The ID of the VPC where the Kubernetes cluster will be located.
        """
        return pulumi.get(self, "vpc_uuid")

