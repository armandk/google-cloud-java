// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/source.proto

package com.google.cloud.securitycenter.v1beta1;

public interface SourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.Source)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/123/sources/456"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/123/sources/456"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The source's display name.
   * A source's display name must be unique amongst its siblings, for example,
   * two sources with the same parent can't share the same display name.
   * The display name must start and end with a letter or digit, may contain
   * letters, digits, spaces, hyphens, and underscores, and can be no longer
   * than 30 characters. This is captured by the regular expression:
   * [&#92;p{L}&#92;p{N}]({&#92;p{L}&#92;p{N}_- ]{0,28}[&#92;p{L}&#92;p{N}])?.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The source's display name.
   * A source's display name must be unique amongst its siblings, for example,
   * two sources with the same parent can't share the same display name.
   * The display name must start and end with a letter or digit, may contain
   * letters, digits, spaces, hyphens, and underscores, and can be no longer
   * than 30 characters. This is captured by the regular expression:
   * [&#92;p{L}&#92;p{N}]({&#92;p{L}&#92;p{N}_- ]{0,28}[&#92;p{L}&#92;p{N}])?.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The description of the source (max of 1024 characters).
   * Example:
   * "Cloud Security Scanner is a web security scanner for common
   * vulnerabilities in App Engine applications. It can automatically
   * scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
   * outdated/insecure libraries."
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the source (max of 1024 characters).
   * Example:
   * "Cloud Security Scanner is a web security scanner for common
   * vulnerabilities in App Engine applications. It can automatically
   * scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
   * outdated/insecure libraries."
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
