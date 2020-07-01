// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Returns a list of tags in your DigitalOcean account, with the ability to
// filter and sort the results. If no filters are specified, all tags will be
// returned.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v2/go/digitalocean"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		list, err := digitalocean.GetTags(ctx, &digitalocean.GetTagsArgs{
// 			Sorts: []digitalocean.GetTagsSort{
// 				digitalocean.GetTagsSort{
// 					Key:       "total_resource_count",
// 					Direction: "asc",
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("sortedTags", list.Tags)
// 		return nil
// 	})
// }
// ```
func GetTags(ctx *pulumi.Context, args *GetTagsArgs, opts ...pulumi.InvokeOption) (*GetTagsResult, error) {
	var rv GetTagsResult
	err := ctx.Invoke("digitalocean:index/getTags:getTags", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTags.
type GetTagsArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters []GetTagsFilter `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts []GetTagsSort `pulumi:"sorts"`
}

// A collection of values returned by getTags.
type GetTagsResult struct {
	Filters []GetTagsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id    string        `pulumi:"id"`
	Sorts []GetTagsSort `pulumi:"sorts"`
	Tags  []GetTagsTag  `pulumi:"tags"`
}