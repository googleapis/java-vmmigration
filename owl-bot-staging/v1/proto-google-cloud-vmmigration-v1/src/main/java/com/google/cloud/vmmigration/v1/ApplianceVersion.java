// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

/**
 * <pre>
 * Describes an appliance version.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmmigration.v1.ApplianceVersion}
 */
public final class ApplianceVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmmigration.v1.ApplianceVersion)
    ApplianceVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApplianceVersion.newBuilder() to construct.
  private ApplianceVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplianceVersion() {
    version_ = "";
    uri_ = "";
    releaseNotesUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApplianceVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApplianceVersion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            uri_ = s;
            break;
          }
          case 24: {

            critical_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            releaseNotesUri_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ApplianceVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ApplianceVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmmigration.v1.ApplianceVersion.class, com.google.cloud.vmmigration.v1.ApplianceVersion.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object version_;
  /**
   * <pre>
   * The appliance version.
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The appliance version.
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object uri_;
  /**
   * <pre>
   * A link for downloading the version.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A link for downloading the version.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CRITICAL_FIELD_NUMBER = 3;
  private boolean critical_;
  /**
   * <pre>
   * Determine whether it's critical to upgrade the appliance to this version.
   * </pre>
   *
   * <code>bool critical = 3;</code>
   * @return The critical.
   */
  @java.lang.Override
  public boolean getCritical() {
    return critical_;
  }

  public static final int RELEASE_NOTES_URI_FIELD_NUMBER = 4;
  private volatile java.lang.Object releaseNotesUri_;
  /**
   * <pre>
   * Link to a page that contains the version release notes.
   * </pre>
   *
   * <code>string release_notes_uri = 4;</code>
   * @return The releaseNotesUri.
   */
  @java.lang.Override
  public java.lang.String getReleaseNotesUri() {
    java.lang.Object ref = releaseNotesUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      releaseNotesUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Link to a page that contains the version release notes.
   * </pre>
   *
   * <code>string release_notes_uri = 4;</code>
   * @return The bytes for releaseNotesUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReleaseNotesUriBytes() {
    java.lang.Object ref = releaseNotesUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      releaseNotesUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uri_);
    }
    if (critical_ != false) {
      output.writeBool(3, critical_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(releaseNotesUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, releaseNotesUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uri_);
    }
    if (critical_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, critical_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(releaseNotesUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, releaseNotesUri_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.vmmigration.v1.ApplianceVersion)) {
      return super.equals(obj);
    }
    com.google.cloud.vmmigration.v1.ApplianceVersion other = (com.google.cloud.vmmigration.v1.ApplianceVersion) obj;

    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (!getUri()
        .equals(other.getUri())) return false;
    if (getCritical()
        != other.getCritical()) return false;
    if (!getReleaseNotesUri()
        .equals(other.getReleaseNotesUri())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (37 * hash) + CRITICAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCritical());
    hash = (37 * hash) + RELEASE_NOTES_URI_FIELD_NUMBER;
    hash = (53 * hash) + getReleaseNotesUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vmmigration.v1.ApplianceVersion parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.vmmigration.v1.ApplianceVersion prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Describes an appliance version.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmmigration.v1.ApplianceVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmmigration.v1.ApplianceVersion)
      com.google.cloud.vmmigration.v1.ApplianceVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ApplianceVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ApplianceVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmmigration.v1.ApplianceVersion.class, com.google.cloud.vmmigration.v1.ApplianceVersion.Builder.class);
    }

    // Construct using com.google.cloud.vmmigration.v1.ApplianceVersion.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      version_ = "";

      uri_ = "";

      critical_ = false;

      releaseNotesUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto.internal_static_google_cloud_vmmigration_v1_ApplianceVersion_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.ApplianceVersion getDefaultInstanceForType() {
      return com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.ApplianceVersion build() {
      com.google.cloud.vmmigration.v1.ApplianceVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.ApplianceVersion buildPartial() {
      com.google.cloud.vmmigration.v1.ApplianceVersion result = new com.google.cloud.vmmigration.v1.ApplianceVersion(this);
      result.version_ = version_;
      result.uri_ = uri_;
      result.critical_ = critical_;
      result.releaseNotesUri_ = releaseNotesUri_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vmmigration.v1.ApplianceVersion) {
        return mergeFrom((com.google.cloud.vmmigration.v1.ApplianceVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmmigration.v1.ApplianceVersion other) {
      if (other == com.google.cloud.vmmigration.v1.ApplianceVersion.getDefaultInstance()) return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        onChanged();
      }
      if (other.getCritical() != false) {
        setCritical(other.getCritical());
      }
      if (!other.getReleaseNotesUri().isEmpty()) {
        releaseNotesUri_ = other.releaseNotesUri_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vmmigration.v1.ApplianceVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vmmigration.v1.ApplianceVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * The appliance version.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The appliance version.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The appliance version.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The appliance version.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The appliance version.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * A link for downloading the version.
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A link for downloading the version.
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A link for downloading the version.
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A link for downloading the version.
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      
      uri_ = getDefaultInstance().getUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A link for downloading the version.
     * </pre>
     *
     * <code>string uri = 2;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uri_ = value;
      onChanged();
      return this;
    }

    private boolean critical_ ;
    /**
     * <pre>
     * Determine whether it's critical to upgrade the appliance to this version.
     * </pre>
     *
     * <code>bool critical = 3;</code>
     * @return The critical.
     */
    @java.lang.Override
    public boolean getCritical() {
      return critical_;
    }
    /**
     * <pre>
     * Determine whether it's critical to upgrade the appliance to this version.
     * </pre>
     *
     * <code>bool critical = 3;</code>
     * @param value The critical to set.
     * @return This builder for chaining.
     */
    public Builder setCritical(boolean value) {
      
      critical_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Determine whether it's critical to upgrade the appliance to this version.
     * </pre>
     *
     * <code>bool critical = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCritical() {
      
      critical_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object releaseNotesUri_ = "";
    /**
     * <pre>
     * Link to a page that contains the version release notes.
     * </pre>
     *
     * <code>string release_notes_uri = 4;</code>
     * @return The releaseNotesUri.
     */
    public java.lang.String getReleaseNotesUri() {
      java.lang.Object ref = releaseNotesUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        releaseNotesUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Link to a page that contains the version release notes.
     * </pre>
     *
     * <code>string release_notes_uri = 4;</code>
     * @return The bytes for releaseNotesUri.
     */
    public com.google.protobuf.ByteString
        getReleaseNotesUriBytes() {
      java.lang.Object ref = releaseNotesUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        releaseNotesUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Link to a page that contains the version release notes.
     * </pre>
     *
     * <code>string release_notes_uri = 4;</code>
     * @param value The releaseNotesUri to set.
     * @return This builder for chaining.
     */
    public Builder setReleaseNotesUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      releaseNotesUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Link to a page that contains the version release notes.
     * </pre>
     *
     * <code>string release_notes_uri = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReleaseNotesUri() {
      
      releaseNotesUri_ = getDefaultInstance().getReleaseNotesUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Link to a page that contains the version release notes.
     * </pre>
     *
     * <code>string release_notes_uri = 4;</code>
     * @param value The bytes for releaseNotesUri to set.
     * @return This builder for chaining.
     */
    public Builder setReleaseNotesUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      releaseNotesUri_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.vmmigration.v1.ApplianceVersion)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmmigration.v1.ApplianceVersion)
  private static final com.google.cloud.vmmigration.v1.ApplianceVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmmigration.v1.ApplianceVersion();
  }

  public static com.google.cloud.vmmigration.v1.ApplianceVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplianceVersion>
      PARSER = new com.google.protobuf.AbstractParser<ApplianceVersion>() {
    @java.lang.Override
    public ApplianceVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApplianceVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApplianceVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplianceVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmmigration.v1.ApplianceVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

