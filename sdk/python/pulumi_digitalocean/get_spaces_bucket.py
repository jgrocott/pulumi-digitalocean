# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetSpacesBucketResult:
    """
    A collection of values returned by getSpacesBucket.
    """
    def __init__(__self__, bucket_domain_name=None, id=None, name=None, region=None, urn=None):
        if bucket_domain_name and not isinstance(bucket_domain_name, str):
            raise TypeError("Expected argument 'bucket_domain_name' to be a str")
        __self__.bucket_domain_name = bucket_domain_name
        """
        The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        """
        The name of the Spaces bucket
        """
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        __self__.region = region
        """
        The slug of the region where the bucket is stored.
        """
        if urn and not isinstance(urn, str):
            raise TypeError("Expected argument 'urn' to be a str")
        __self__.urn = urn
        """
        The uniform resource name of the bucket
        """
class AwaitableGetSpacesBucketResult(GetSpacesBucketResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSpacesBucketResult(
            bucket_domain_name=self.bucket_domain_name,
            id=self.id,
            name=self.name,
            region=self.region,
            urn=self.urn)

def get_spaces_bucket(name=None,region=None,opts=None):
    """
    Use this data source to access information about an existing resource.

    :param str name: The name of the Spaces bucket.
    :param str region: The slug of the region where the bucket is stored.
    """
    __args__ = dict()


    __args__['name'] = name
    __args__['region'] = region
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getSpacesBucket:getSpacesBucket', __args__, opts=opts).value

    return AwaitableGetSpacesBucketResult(
        bucket_domain_name=__ret__.get('bucketDomainName'),
        id=__ret__.get('id'),
        name=__ret__.get('name'),
        region=__ret__.get('region'),
        urn=__ret__.get('urn'))
