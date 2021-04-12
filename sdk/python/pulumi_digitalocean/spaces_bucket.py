# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['SpacesBucketArgs', 'SpacesBucket']

@pulumi.input_type
class SpacesBucketArgs:
    def __init__(__self__, *,
                 acl: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsRuleArgs']]]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesBucketLifecycleRuleArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 versioning: Optional[pulumi.Input['SpacesBucketVersioningArgs']] = None):
        """
        The set of arguments for constructing a SpacesBucket resource.
        :param pulumi.Input[str] acl: Canned ACL applied on bucket creation (`private` or `public-read`)
        :param pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsRuleArgs']]] cors_rules: A rule of Cross-Origin Resource Sharing (documented below).
        :param pulumi.Input[bool] force_destroy: Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
        :param pulumi.Input[Sequence[pulumi.Input['SpacesBucketLifecycleRuleArgs']]] lifecycle_rules: A configuration of object lifecycle management (documented below).
        :param pulumi.Input[str] name: The name of the bucket
        :param pulumi.Input[str] region: The region where the bucket resides (Defaults to `nyc3`)
        :param pulumi.Input['SpacesBucketVersioningArgs'] versioning: A state of versioning (documented below)
        """
        if acl is not None:
            pulumi.set(__self__, "acl", acl)
        if cors_rules is not None:
            pulumi.set(__self__, "cors_rules", cors_rules)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if lifecycle_rules is not None:
            pulumi.set(__self__, "lifecycle_rules", lifecycle_rules)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if versioning is not None:
            pulumi.set(__self__, "versioning", versioning)

    @property
    @pulumi.getter
    def acl(self) -> Optional[pulumi.Input[str]]:
        """
        Canned ACL applied on bucket creation (`private` or `public-read`)
        """
        return pulumi.get(self, "acl")

    @acl.setter
    def acl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl", value)

    @property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsRuleArgs']]]]:
        """
        A rule of Cross-Origin Resource Sharing (documented below).
        """
        return pulumi.get(self, "cors_rules")

    @cors_rules.setter
    def cors_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsRuleArgs']]]]):
        pulumi.set(self, "cors_rules", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter(name="lifecycleRules")
    def lifecycle_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SpacesBucketLifecycleRuleArgs']]]]:
        """
        A configuration of object lifecycle management (documented below).
        """
        return pulumi.get(self, "lifecycle_rules")

    @lifecycle_rules.setter
    def lifecycle_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesBucketLifecycleRuleArgs']]]]):
        pulumi.set(self, "lifecycle_rules", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bucket
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region where the bucket resides (Defaults to `nyc3`)
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def versioning(self) -> Optional[pulumi.Input['SpacesBucketVersioningArgs']]:
        """
        A state of versioning (documented below)
        """
        return pulumi.get(self, "versioning")

    @versioning.setter
    def versioning(self, value: Optional[pulumi.Input['SpacesBucketVersioningArgs']]):
        pulumi.set(self, "versioning", value)


class SpacesBucket(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsRuleArgs']]]]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketLifecycleRuleArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 versioning: Optional[pulumi.Input[pulumi.InputType['SpacesBucketVersioningArgs']]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a bucket resource for Spaces, DigitalOcean's object storage product.

        The [Spaces API](https://developers.digitalocean.com/documentation/spaces/) was
        designed to be interoperable with Amazon's AWS S3 API. This allows users to
        interact with the service while using the tools they already know. Spaces
        mirrors S3's authentication framework and requests to Spaces require a key pair
        similar to Amazon's Access ID and Secret Key.

        The authentication requirement can be met by either setting the
        `SPACES_ACCESS_KEY_ID` and `SPACES_SECRET_ACCESS_KEY` environment variables or
        the provider's `spaces_access_id` and `spaces_secret_key` arguments to the
        access ID and secret you generate via the DigitalOcean control panel. For
        example:

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        static_assets = digitalocean.SpacesBucket("static-assets")
        # ...
        ```

        For more information, See [An Introduction to DigitalOcean Spaces](https://www.digitalocean.com/community/tutorials/an-introduction-to-digitalocean-spaces)

        ## Example Usage
        ### Create a New Bucket

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesBucket("foobar", region="nyc3")
        ```
        ### Create a New Bucket With CORS Rules

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesBucket("foobar",
            cors_rules=[
                digitalocean.SpacesBucketCorsRuleArgs(
                    allowed_headers=["*"],
                    allowed_methods=["GET"],
                    allowed_origins=["*"],
                    max_age_seconds=3000,
                ),
                digitalocean.SpacesBucketCorsRuleArgs(
                    allowed_headers=["*"],
                    allowed_methods=[
                        "PUT",
                        "POST",
                        "DELETE",
                    ],
                    allowed_origins=["https://www.example.com"],
                    max_age_seconds=3000,
                ),
            ],
            region="nyc3")
        ```

        ## Import

        Buckets can be imported using the `region` and `name` attributes (delimited by a comma)

        ```sh
         $ pulumi import digitalocean:index/spacesBucket:SpacesBucket foobar `region`,`name`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: Canned ACL applied on bucket creation (`private` or `public-read`)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsRuleArgs']]]] cors_rules: A rule of Cross-Origin Resource Sharing (documented below).
        :param pulumi.Input[bool] force_destroy: Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketLifecycleRuleArgs']]]] lifecycle_rules: A configuration of object lifecycle management (documented below).
        :param pulumi.Input[str] name: The name of the bucket
        :param pulumi.Input[str] region: The region where the bucket resides (Defaults to `nyc3`)
        :param pulumi.Input[pulumi.InputType['SpacesBucketVersioningArgs']] versioning: A state of versioning (documented below)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SpacesBucketArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a bucket resource for Spaces, DigitalOcean's object storage product.

        The [Spaces API](https://developers.digitalocean.com/documentation/spaces/) was
        designed to be interoperable with Amazon's AWS S3 API. This allows users to
        interact with the service while using the tools they already know. Spaces
        mirrors S3's authentication framework and requests to Spaces require a key pair
        similar to Amazon's Access ID and Secret Key.

        The authentication requirement can be met by either setting the
        `SPACES_ACCESS_KEY_ID` and `SPACES_SECRET_ACCESS_KEY` environment variables or
        the provider's `spaces_access_id` and `spaces_secret_key` arguments to the
        access ID and secret you generate via the DigitalOcean control panel. For
        example:

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        static_assets = digitalocean.SpacesBucket("static-assets")
        # ...
        ```

        For more information, See [An Introduction to DigitalOcean Spaces](https://www.digitalocean.com/community/tutorials/an-introduction-to-digitalocean-spaces)

        ## Example Usage
        ### Create a New Bucket

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesBucket("foobar", region="nyc3")
        ```
        ### Create a New Bucket With CORS Rules

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesBucket("foobar",
            cors_rules=[
                digitalocean.SpacesBucketCorsRuleArgs(
                    allowed_headers=["*"],
                    allowed_methods=["GET"],
                    allowed_origins=["*"],
                    max_age_seconds=3000,
                ),
                digitalocean.SpacesBucketCorsRuleArgs(
                    allowed_headers=["*"],
                    allowed_methods=[
                        "PUT",
                        "POST",
                        "DELETE",
                    ],
                    allowed_origins=["https://www.example.com"],
                    max_age_seconds=3000,
                ),
            ],
            region="nyc3")
        ```

        ## Import

        Buckets can be imported using the `region` and `name` attributes (delimited by a comma)

        ```sh
         $ pulumi import digitalocean:index/spacesBucket:SpacesBucket foobar `region`,`name`
        ```

        :param str resource_name: The name of the resource.
        :param SpacesBucketArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpacesBucketArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsRuleArgs']]]]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketLifecycleRuleArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 versioning: Optional[pulumi.Input[pulumi.InputType['SpacesBucketVersioningArgs']]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['acl'] = acl
            __props__['cors_rules'] = cors_rules
            __props__['force_destroy'] = force_destroy
            __props__['lifecycle_rules'] = lifecycle_rules
            __props__['name'] = name
            __props__['region'] = region
            __props__['versioning'] = versioning
            __props__['bucket_domain_name'] = None
            __props__['bucket_urn'] = None
        super(SpacesBucket, __self__).__init__(
            'digitalocean:index/spacesBucket:SpacesBucket',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acl: Optional[pulumi.Input[str]] = None,
            bucket_domain_name: Optional[pulumi.Input[str]] = None,
            bucket_urn: Optional[pulumi.Input[str]] = None,
            cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsRuleArgs']]]]] = None,
            force_destroy: Optional[pulumi.Input[bool]] = None,
            lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketLifecycleRuleArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            versioning: Optional[pulumi.Input[pulumi.InputType['SpacesBucketVersioningArgs']]] = None) -> 'SpacesBucket':
        """
        Get an existing SpacesBucket resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: Canned ACL applied on bucket creation (`private` or `public-read`)
        :param pulumi.Input[str] bucket_domain_name: The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
        :param pulumi.Input[str] bucket_urn: The uniform resource name for the bucket
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsRuleArgs']]]] cors_rules: A rule of Cross-Origin Resource Sharing (documented below).
        :param pulumi.Input[bool] force_destroy: Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketLifecycleRuleArgs']]]] lifecycle_rules: A configuration of object lifecycle management (documented below).
        :param pulumi.Input[str] name: The name of the bucket
        :param pulumi.Input[str] region: The region where the bucket resides (Defaults to `nyc3`)
        :param pulumi.Input[pulumi.InputType['SpacesBucketVersioningArgs']] versioning: A state of versioning (documented below)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["acl"] = acl
        __props__["bucket_domain_name"] = bucket_domain_name
        __props__["bucket_urn"] = bucket_urn
        __props__["cors_rules"] = cors_rules
        __props__["force_destroy"] = force_destroy
        __props__["lifecycle_rules"] = lifecycle_rules
        __props__["name"] = name
        __props__["region"] = region
        __props__["versioning"] = versioning
        return SpacesBucket(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def acl(self) -> pulumi.Output[Optional[str]]:
        """
        Canned ACL applied on bucket creation (`private` or `public-read`)
        """
        return pulumi.get(self, "acl")

    @property
    @pulumi.getter(name="bucketDomainName")
    def bucket_domain_name(self) -> pulumi.Output[str]:
        """
        The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
        """
        return pulumi.get(self, "bucket_domain_name")

    @property
    @pulumi.getter(name="bucketUrn")
    def bucket_urn(self) -> pulumi.Output[str]:
        """
        The uniform resource name for the bucket
        """
        return pulumi.get(self, "bucket_urn")

    @property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> pulumi.Output[Optional[Sequence['outputs.SpacesBucketCorsRule']]]:
        """
        A rule of Cross-Origin Resource Sharing (documented below).
        """
        return pulumi.get(self, "cors_rules")

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
        """
        return pulumi.get(self, "force_destroy")

    @property
    @pulumi.getter(name="lifecycleRules")
    def lifecycle_rules(self) -> pulumi.Output[Optional[Sequence['outputs.SpacesBucketLifecycleRule']]]:
        """
        A configuration of object lifecycle management (documented below).
        """
        return pulumi.get(self, "lifecycle_rules")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the bucket
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[str]]:
        """
        The region where the bucket resides (Defaults to `nyc3`)
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def versioning(self) -> pulumi.Output[Optional['outputs.SpacesBucketVersioning']]:
        """
        A state of versioning (documented below)
        """
        return pulumi.get(self, "versioning")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

