[![Build Status](https://travis-ci.com/pulumi/pulumi-digitalocean.svg?token=eHg7Zp5zdDDJfTjY8ejq&branch=master)](https://travis-ci.com/pulumi/pulumi-digitalocean)

# DigitalOcean provider

The DigitalOcean resource provider for Pulumi lets you use DigitalOcean resources in your cloud programs.  To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/digitalocean

or `yarn`:

    $ yarn add @pulumi/digitalocean

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_digitalocean

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-digitalocean/sdk/go/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Digitalocean

## Configuration

The following configuration points are available:

- `digitalocean:token` - (Required) This is the DO API token. Alternatively, this can also be specified using environment
  variables, ordered by precedence, `DIGITALOCEAN_TOKEN` or `DIGITALOCEAN_ACCESS_TOKEN`.
- `digitalocean:spacesAccessId` - (Optional) The access key ID used for Spaces API operations. May be set via the
  `SPACES_ACCESS_KEY_ID` environment variable.
- `digitalocean:spacesSecretKey` - (Optional) The secret key used for Spaces API operations. May be set via the 
  `SPACES_SECRET_ACCESS_KEY` environment variable.
- `digitalocean:apiEndpoint` - (Optional) This can be used to override the base URL for DigitalOcean API requests. May
  be set via the `DIGITALOCEAN_API_URL` environment variable. Default is `https://api.digitalocean.com`.

## Concepts

The `@pulumi/digitalocean` package provides a strongly-typed means to create cloud applications that create and interact
closely with DigitalOcean resources.  Resources are exposed for the entirety of DigitalOcean resources and their
properties, including (but not limited to), 'droplet', 'floatingIp', 'firewalls', etc.  Many convenience APIs have also
been added to make development easier and to help avoid common mistakes, and to get stronger typing.

## Reference

For further information, please visit [the DigitalOcean provider docs](https://www.pulumi.com/docs/intro/cloud-providers/digitalocean) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/digitalocean).
