// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventstore.proto

package bg.energo.eventstore.v1;

/**
 * <pre>
 * Represents a single event.
 * </pre>
 *
 * Protobuf type {@code bg.energo.eventstore.v1.EventPayload}
 */
public  final class EventPayload extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bg.energo.eventstore.v1.EventPayload)
    EventPayloadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventPayload.newBuilder() to construct.
  private EventPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventPayload() {
    kind_ = "";
    timestamp_ = 0L;
    identityId_ = "";
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventPayload(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            kind_ = s;
            break;
          }
          case 16: {

            timestamp_ = input.readUInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            identityId_ = s;
            break;
          }
          case 34: {

            payload_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
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
    return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_EventPayload_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_EventPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bg.energo.eventstore.v1.EventPayload.class, bg.energo.eventstore.v1.EventPayload.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;
  private volatile java.lang.Object kind_;
  /**
   * <code>string kind = 1;</code>
   */
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   * <code>string kind = 1;</code>
   */
  public com.google.protobuf.ByteString
      getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_;
  /**
   * <code>uint64 timestamp = 2;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int IDENTITYID_FIELD_NUMBER = 3;
  private volatile java.lang.Object identityId_;
  /**
   * <code>string identityId = 3;</code>
   */
  public java.lang.String getIdentityId() {
    java.lang.Object ref = identityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identityId_ = s;
      return s;
    }
  }
  /**
   * <code>string identityId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getIdentityIdBytes() {
    java.lang.Object ref = identityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identityId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString payload_;
  /**
   * <code>bytes payload = 4;</code>
   */
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getKindBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(2, timestamp_);
    }
    if (!getIdentityIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, identityId_);
    }
    if (!payload_.isEmpty()) {
      output.writeBytes(4, payload_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKindBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, timestamp_);
    }
    if (!getIdentityIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, identityId_);
    }
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, payload_);
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
    if (!(obj instanceof bg.energo.eventstore.v1.EventPayload)) {
      return super.equals(obj);
    }
    bg.energo.eventstore.v1.EventPayload other = (bg.energo.eventstore.v1.EventPayload) obj;

    boolean result = true;
    result = result && getKind()
        .equals(other.getKind());
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && getIdentityId()
        .equals(other.getIdentityId());
    result = result && getPayload()
        .equals(other.getPayload());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + IDENTITYID_FIELD_NUMBER;
    hash = (53 * hash) + getIdentityId().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bg.energo.eventstore.v1.EventPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bg.energo.eventstore.v1.EventPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.EventPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bg.energo.eventstore.v1.EventPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.EventPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bg.energo.eventstore.v1.EventPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.EventPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bg.energo.eventstore.v1.EventPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.EventPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bg.energo.eventstore.v1.EventPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.EventPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bg.energo.eventstore.v1.EventPayload parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(bg.energo.eventstore.v1.EventPayload prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Represents a single event.
   * </pre>
   *
   * Protobuf type {@code bg.energo.eventstore.v1.EventPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bg.energo.eventstore.v1.EventPayload)
      bg.energo.eventstore.v1.EventPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_EventPayload_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_EventPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bg.energo.eventstore.v1.EventPayload.class, bg.energo.eventstore.v1.EventPayload.Builder.class);
    }

    // Construct using bg.energo.eventstore.v1.EventPayload.newBuilder()
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
    public Builder clear() {
      super.clear();
      kind_ = "";

      timestamp_ = 0L;

      identityId_ = "";

      payload_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_EventPayload_descriptor;
    }

    public bg.energo.eventstore.v1.EventPayload getDefaultInstanceForType() {
      return bg.energo.eventstore.v1.EventPayload.getDefaultInstance();
    }

    public bg.energo.eventstore.v1.EventPayload build() {
      bg.energo.eventstore.v1.EventPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public bg.energo.eventstore.v1.EventPayload buildPartial() {
      bg.energo.eventstore.v1.EventPayload result = new bg.energo.eventstore.v1.EventPayload(this);
      result.kind_ = kind_;
      result.timestamp_ = timestamp_;
      result.identityId_ = identityId_;
      result.payload_ = payload_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bg.energo.eventstore.v1.EventPayload) {
        return mergeFrom((bg.energo.eventstore.v1.EventPayload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bg.energo.eventstore.v1.EventPayload other) {
      if (other == bg.energo.eventstore.v1.EventPayload.getDefaultInstance()) return this;
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (!other.getIdentityId().isEmpty()) {
        identityId_ = other.identityId_;
        onChanged();
      }
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      bg.energo.eventstore.v1.EventPayload parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bg.energo.eventstore.v1.EventPayload) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object kind_ = "";
    /**
     * <code>string kind = 1;</code>
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kind = 1;</code>
     */
    public com.google.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kind = 1;</code>
     */
    public Builder setKind(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kind = 1;</code>
     */
    public Builder clearKind() {
      
      kind_ = getDefaultInstance().getKind();
      onChanged();
      return this;
    }
    /**
     * <code>string kind = 1;</code>
     */
    public Builder setKindBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kind_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 2;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 2;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 2;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object identityId_ = "";
    /**
     * <code>string identityId = 3;</code>
     */
    public java.lang.String getIdentityId() {
      java.lang.Object ref = identityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string identityId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIdentityIdBytes() {
      java.lang.Object ref = identityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string identityId = 3;</code>
     */
    public Builder setIdentityId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      identityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string identityId = 3;</code>
     */
    public Builder clearIdentityId() {
      
      identityId_ = getDefaultInstance().getIdentityId();
      onChanged();
      return this;
    }
    /**
     * <code>string identityId = 3;</code>
     */
    public Builder setIdentityIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      identityId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 4;</code>
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 4;</code>
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 4;</code>
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bg.energo.eventstore.v1.EventPayload)
  }

  // @@protoc_insertion_point(class_scope:bg.energo.eventstore.v1.EventPayload)
  private static final bg.energo.eventstore.v1.EventPayload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bg.energo.eventstore.v1.EventPayload();
  }

  public static bg.energo.eventstore.v1.EventPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventPayload>
      PARSER = new com.google.protobuf.AbstractParser<EventPayload>() {
    public EventPayload parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventPayload(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventPayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventPayload> getParserForType() {
    return PARSER;
  }

  public bg.energo.eventstore.v1.EventPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

