# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = [
    'GetVolumeSnapshotResult',
    'AwaitableGetVolumeSnapshotResult',
    'get_volume_snapshot',
]

@pulumi.output_type
class GetVolumeSnapshotResult:
    """
    A collection of values returned by getVolumeSnapshot.
    """
    def __init__(__self__, created_at=None, id=None, min_disk_size=None, most_recent=None, name=None, name_regex=None, region=None, regions=None, size=None, tags=None, volume_id=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if min_disk_size and not isinstance(min_disk_size, int):
            raise TypeError("Expected argument 'min_disk_size' to be a int")
        pulumi.set(__self__, "min_disk_size", min_disk_size)
        if most_recent and not isinstance(most_recent, bool):
            raise TypeError("Expected argument 'most_recent' to be a bool")
        pulumi.set(__self__, "most_recent", most_recent)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if regions and not isinstance(regions, list):
            raise TypeError("Expected argument 'regions' to be a list")
        pulumi.set(__self__, "regions", regions)
        if size and not isinstance(size, float):
            raise TypeError("Expected argument 'size' to be a float")
        pulumi.set(__self__, "size", size)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if volume_id and not isinstance(volume_id, str):
            raise TypeError("Expected argument 'volume_id' to be a str")
        pulumi.set(__self__, "volume_id", volume_id)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        The date and time the volume snapshot was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="minDiskSize")
    def min_disk_size(self) -> int:
        """
        The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
        """
        return pulumi.get(self, "min_disk_size")

    @property
    @pulumi.getter(name="mostRecent")
    def most_recent(self) -> Optional[bool]:
        return pulumi.get(self, "most_recent")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def regions(self) -> Sequence[str]:
        """
        A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter
    def size(self) -> float:
        """
        The billable size of the volume snapshot in gigabytes.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        A list of the tags associated to the volume snapshot.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> str:
        """
        The ID of the volume from which the volume snapshot originated.
        """
        return pulumi.get(self, "volume_id")


class AwaitableGetVolumeSnapshotResult(GetVolumeSnapshotResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVolumeSnapshotResult(
            created_at=self.created_at,
            id=self.id,
            min_disk_size=self.min_disk_size,
            most_recent=self.most_recent,
            name=self.name,
            name_regex=self.name_regex,
            region=self.region,
            regions=self.regions,
            size=self.size,
            tags=self.tags,
            volume_id=self.volume_id)


def get_volume_snapshot(most_recent: Optional[bool] = None,
                        name: Optional[str] = None,
                        name_regex: Optional[str] = None,
                        region: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVolumeSnapshotResult:
    """
    Volume snapshots are saved instances of a block storage volume. Use this data
    source to retrieve the ID of a DigitalOcean volume snapshot for use in other
    resources.

    ## Example Usage

    Get the volume snapshot:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    snapshot = digitalocean.get_volume_snapshot(most_recent=True,
        name_regex="^web",
        region="nyc3")
    ```

    Reuse the data about a volume snapshot to create a new volume based on it:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    snapshot = digitalocean.get_volume_snapshot(name_regex="^web",
        region="nyc3",
        most_recent=True)
    foobar = digitalocean.Volume("foobar",
        region="nyc3",
        size=100,
        snapshot_id=snapshot.id)
    ```


    :param bool most_recent: If more than one result is returned, use the most recent volume snapshot.
    :param str name: The name of the volume snapshot.
    :param str name_regex: A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
    :param str region: A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
    """
    __args__ = dict()
    __args__['mostRecent'] = most_recent
    __args__['name'] = name
    __args__['nameRegex'] = name_regex
    __args__['region'] = region
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getVolumeSnapshot:getVolumeSnapshot', __args__, opts=opts, typ=GetVolumeSnapshotResult).value

    return AwaitableGetVolumeSnapshotResult(
        created_at=__ret__.created_at,
        id=__ret__.id,
        min_disk_size=__ret__.min_disk_size,
        most_recent=__ret__.most_recent,
        name=__ret__.name,
        name_regex=__ret__.name_regex,
        region=__ret__.region,
        regions=__ret__.regions,
        size=__ret__.size,
        tags=__ret__.tags,
        volume_id=__ret__.volume_id)
