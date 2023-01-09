// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface ReplicatingStepOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.ReplicatingStep)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Total bytes to be handled in the step.
   * </pre>
   *
   * <code>int64 total_bytes = 1;</code>
   * @return The totalBytes.
   */
  long getTotalBytes();

  /**
   * <pre>
   * Replicated bytes in the step.
   * </pre>
   *
   * <code>int64 replicated_bytes = 2;</code>
   * @return The replicatedBytes.
   */
  long getReplicatedBytes();

  /**
   * <pre>
   * The source disks replication rate for the last 2 minutes in bytes per
   * second.
   * </pre>
   *
   * <code>int64 last_two_minutes_average_bytes_per_second = 3;</code>
   * @return The lastTwoMinutesAverageBytesPerSecond.
   */
  long getLastTwoMinutesAverageBytesPerSecond();

  /**
   * <pre>
   * The source disks replication rate for the last 30 minutes in bytes per
   * second.
   * </pre>
   *
   * <code>int64 last_thirty_minutes_average_bytes_per_second = 4;</code>
   * @return The lastThirtyMinutesAverageBytesPerSecond.
   */
  long getLastThirtyMinutesAverageBytesPerSecond();
}
