// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface SubmitJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.SubmitJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 3;</code>
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 3;</code>
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Required. The job resource.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
   */
  boolean hasJob();
  /**
   *
   *
   * <pre>
   * Required. The job resource.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
   */
  com.google.cloud.dataproc.v1.Job getJob();
  /**
   *
   *
   * <pre>
   * Required. The job resource.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
   */
  com.google.cloud.dataproc.v1.JobOrBuilder getJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A unique id used to identify the request. If the server
   * receives two [SubmitJobRequest][google.cloud.dataproc.v1.SubmitJobRequest] requests  with the same
   * id, then the second request will be ignored and the
   * first [Job][google.cloud.dataproc.v1.Job] created and stored in the backend
   * is returned.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A unique id used to identify the request. If the server
   * receives two [SubmitJobRequest][google.cloud.dataproc.v1.SubmitJobRequest] requests  with the same
   * id, then the second request will be ignored and the
   * first [Job][google.cloud.dataproc.v1.Job] created and stored in the backend
   * is returned.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
