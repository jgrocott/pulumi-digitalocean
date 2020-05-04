# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class DatabaseUser(pulumi.CustomResource):
    cluster_id: pulumi.Output[str]
    """
    The ID of the original source database cluster.
    """
    mysql_auth_plugin: pulumi.Output[str]
    """
    The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
    """
    name: pulumi.Output[str]
    """
    The name for the database user.
    """
    password: pulumi.Output[str]
    """
    Password for the database user.
    """
    role: pulumi.Output[str]
    """
    Role for the database user. The value will be either "primary" or "normal".
    """
    def __init__(__self__, resource_name, opts=None, cluster_id=None, mysql_auth_plugin=None, name=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a DigitalOcean database user resource. When creating a new database cluster, a default admin user with name `doadmin` will be created. Then, this resource can be used to provide additional normal users inside the cluster.

        > **NOTE:** Any new users created will always have `normal` role, only the default user that comes with database cluster creation has `primary` role. Additional permissions must be managed manually.

        ## Example Usage

        ### Create a new PostgreSQL database user

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        postgres_example = digitalocean.DatabaseCluster("postgres-example",
            engine="pg",
            version="11",
            size="db-s-1vcpu-1gb",
            region="nyc1",
            node_count=1)
        user_example = digitalocean.DatabaseUser("user-example", cluster_id=postgres_example.id)
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the original source database cluster.
        :param pulumi.Input[str] mysql_auth_plugin: The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        :param pulumi.Input[str] name: The name for the database user.
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

            if cluster_id is None:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            __props__['mysql_auth_plugin'] = mysql_auth_plugin
            __props__['name'] = name
            __props__['password'] = None
            __props__['role'] = None
        super(DatabaseUser, __self__).__init__(
            'digitalocean:index:DatabaseUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, cluster_id=None, mysql_auth_plugin=None, name=None, password=None, role=None):
        """
        Get an existing DatabaseUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the original source database cluster.
        :param pulumi.Input[str] mysql_auth_plugin: The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        :param pulumi.Input[str] name: The name for the database user.
        :param pulumi.Input[str] password: Password for the database user.
        :param pulumi.Input[str] role: Role for the database user. The value will be either "primary" or "normal".
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["cluster_id"] = cluster_id
        __props__["mysql_auth_plugin"] = mysql_auth_plugin
        __props__["name"] = name
        __props__["password"] = password
        __props__["role"] = role
        return DatabaseUser(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

