# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Vpc(pulumi.CustomResource):
    created_at: pulumi.Output[str]
    """
    The date and time of when the VPC was created.
    """
    default: pulumi.Output[bool]
    """
    A boolean indicating whether or not the VPC is the default one for the region.
    """
    description: pulumi.Output[str]
    """
    A free-form text field up to a limit of 255 characters to describe the VPC.
    """
    ip_range: pulumi.Output[str]
    """
    The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
    """
    name: pulumi.Output[str]
    """
    A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
    """
    region: pulumi.Output[str]
    """
    The DigitalOcean region slug for the VPC's location.
    """
    vpc_urn: pulumi.Output[str]
    """
    The uniform resource name (URN) for the VPC.
    """
    def __init__(__self__, resource_name, opts=None, description=None, ip_range=None, name=None, region=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a [DigitalOcean VPC](https://developers.digitalocean.com/documentation/v2/#vpcs) resource.

        VPCs are virtual networks containing resources that can communicate with each
        other in full isolation, using private IP addresses.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example = digitalocean.Vpc("example",
            ip_range="10.10.10.0/24",
            region="nyc3")
        ```

        ### Resource Assignment

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example_vpc = digitalocean.Vpc("exampleVpc", region="nyc3")
        example_droplet = digitalocean.Droplet("exampleDroplet",
            size="s-1vcpu-1gb",
            image="ubuntu-18-04-x64",
            region="nyc3",
            vpc_uuid=example_vpc.id)
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A free-form text field up to a limit of 255 characters to describe the VPC.
        :param pulumi.Input[str] ip_range: The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        :param pulumi.Input[str] name: A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        :param pulumi.Input[str] region: The DigitalOcean region slug for the VPC's location.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            __props__['ip_range'] = ip_range
            __props__['name'] = name
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['created_at'] = None
            __props__['default'] = None
            __props__['vpc_urn'] = None
        super(Vpc, __self__).__init__(
            'digitalocean:index/vpc:Vpc',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, created_at=None, default=None, description=None, ip_range=None, name=None, region=None, vpc_urn=None):
        """
        Get an existing Vpc resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: The date and time of when the VPC was created.
        :param pulumi.Input[bool] default: A boolean indicating whether or not the VPC is the default one for the region.
        :param pulumi.Input[str] description: A free-form text field up to a limit of 255 characters to describe the VPC.
        :param pulumi.Input[str] ip_range: The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        :param pulumi.Input[str] name: A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        :param pulumi.Input[str] region: The DigitalOcean region slug for the VPC's location.
        :param pulumi.Input[str] vpc_urn: The uniform resource name (URN) for the VPC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["created_at"] = created_at
        __props__["default"] = default
        __props__["description"] = description
        __props__["ip_range"] = ip_range
        __props__["name"] = name
        __props__["region"] = region
        __props__["vpc_urn"] = vpc_urn
        return Vpc(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

