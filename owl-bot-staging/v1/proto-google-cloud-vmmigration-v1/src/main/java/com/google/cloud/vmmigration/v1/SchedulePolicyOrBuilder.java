// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface SchedulePolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.SchedulePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The idle duration between replication stages.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_duration = 1;</code>
   * @return Whether the idleDuration field is set.
   */
  boolean hasIdleDuration();
  /**
   * <pre>
   * The idle duration between replication stages.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_duration = 1;</code>
   * @return The idleDuration.
   */
  com.google.protobuf.Duration getIdleDuration();
  /**
   * <pre>
   * The idle duration between replication stages.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_duration = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getIdleDurationOrBuilder();

  /**
   * <pre>
   * A flag to indicate whether to skip OS adaptation during the replication
   * sync. OS adaptation is a process where the VM's operating system undergoes
   * changes and adaptations to fully function on Compute Engine.
   * </pre>
   *
   * <code>bool skip_os_adaptation = 2;</code>
   * @return The skipOsAdaptation.
   */
  boolean getSkipOsAdaptation();
}