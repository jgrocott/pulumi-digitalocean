// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Get information on a tag. This data source provides the name as configured on
// your DigitalOcean account. This is useful if the tag name in question is not
// managed by Terraform or you need validate if the tag exists in the account.
// 
// An error is triggered if the provided tag name does not exist.
func LookupTag(ctx *pulumi.Context, args *GetTagArgs) (*GetTagResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["name"] = args.Name
	}
	outputs, err := ctx.Invoke("digitalocean:index/getTag:getTag", inputs)
	if err != nil {
		return nil, err
	}
	return &GetTagResult{
		Name: outputs["name"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getTag.
type GetTagArgs struct {
	// The name of the tag.
	Name interface{}
}

// A collection of values returned by getTag.
type GetTagResult struct {
	Name interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}
