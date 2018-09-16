// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventstore.proto

package bg.energo.eventstore.v1;

/**
 * <pre>
 * The request containing aggregate metadata and events in binary format for persisting them
 * in the eventstore.
 * </pre>
 *
 * Protobuf type {@code bg.energo.eventstore.v1.SaveEventsRequest}
 */
public  final class SaveEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bg.energo.eventstore.v1.SaveEventsRequest)
    SaveEventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveEventsRequest.newBuilder() to construct.
  private SaveEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveEventsRequest() {
    aggregateId_ = "";
    aggregateType_ = "";
    version_ = 0;
    events_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaveEventsRequest(
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

            aggregateId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            aggregateType_ = s;
            break;
          }
          case 24: {

            version_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              events_ = new java.util.ArrayList<bg.energo.eventstore.v1.EventPayload>();
              mutable_bitField0_ |= 0x00000008;
            }
            events_.add(
                input.readMessage(bg.energo.eventstore.v1.EventPayload.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        events_ = java.util.Collections.unmodifiableList(events_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_SaveEventsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_SaveEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bg.energo.eventstore.v1.SaveEventsRequest.class, bg.energo.eventstore.v1.SaveEventsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int AGGREGATEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object aggregateId_;
  /**
   * <pre>
   * The id of the aggregate
   * </pre>
   *
   * <code>string aggregateId = 1;</code>
   */
  public java.lang.String getAggregateId() {
    java.lang.Object ref = aggregateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aggregateId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The id of the aggregate
   * </pre>
   *
   * <code>string aggregateId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAggregateIdBytes() {
    java.lang.Object ref = aggregateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aggregateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGGREGATETYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object aggregateType_;
  /**
   * <pre>
   * The type of the aggregate, e.g Order, Invoice and etc.
   * </pre>
   *
   * <code>string aggregateType = 2;</code>
   */
  public java.lang.String getAggregateType() {
    java.lang.Object ref = aggregateType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aggregateType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The type of the aggregate, e.g Order, Invoice and etc.
   * </pre>
   *
   * <code>string aggregateType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAggregateTypeBytes() {
    java.lang.Object ref = aggregateType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aggregateType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private int version_;
  /**
   * <pre>
   * Used to perform a consistent read-modify-write.
   * </pre>
   *
   * <code>int32 version = 3;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int EVENTS_FIELD_NUMBER = 4;
  private java.util.List<bg.energo.eventstore.v1.EventPayload> events_;
  /**
   * <pre>
   * List of events associated with aggregate.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
   */
  public java.util.List<bg.energo.eventstore.v1.EventPayload> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * List of events associated with aggregate.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
   */
  public java.util.List<? extends bg.energo.eventstore.v1.EventPayloadOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * List of events associated with aggregate.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
   */
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * List of events associated with aggregate.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
   */
  public bg.energo.eventstore.v1.EventPayload getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * List of events associated with aggregate.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
   */
  public bg.energo.eventstore.v1.EventPayloadOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
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
    if (!getAggregateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, aggregateId_);
    }
    if (!getAggregateTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, aggregateType_);
    }
    if (version_ != 0) {
      output.writeInt32(3, version_);
    }
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(4, events_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAggregateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, aggregateId_);
    }
    if (!getAggregateTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, aggregateType_);
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, version_);
    }
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, events_.get(i));
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
    if (!(obj instanceof bg.energo.eventstore.v1.SaveEventsRequest)) {
      return super.equals(obj);
    }
    bg.energo.eventstore.v1.SaveEventsRequest other = (bg.energo.eventstore.v1.SaveEventsRequest) obj;

    boolean result = true;
    result = result && getAggregateId()
        .equals(other.getAggregateId());
    result = result && getAggregateType()
        .equals(other.getAggregateType());
    result = result && (getVersion()
        == other.getVersion());
    result = result && getEventsList()
        .equals(other.getEventsList());
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
    hash = (37 * hash) + AGGREGATEID_FIELD_NUMBER;
    hash = (53 * hash) + getAggregateId().hashCode();
    hash = (37 * hash) + AGGREGATETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAggregateType().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bg.energo.eventstore.v1.SaveEventsRequest parseFrom(
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
  public static Builder newBuilder(bg.energo.eventstore.v1.SaveEventsRequest prototype) {
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
   * The request containing aggregate metadata and events in binary format for persisting them
   * in the eventstore.
   * </pre>
   *
   * Protobuf type {@code bg.energo.eventstore.v1.SaveEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bg.energo.eventstore.v1.SaveEventsRequest)
      bg.energo.eventstore.v1.SaveEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_SaveEventsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_SaveEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bg.energo.eventstore.v1.SaveEventsRequest.class, bg.energo.eventstore.v1.SaveEventsRequest.Builder.class);
    }

    // Construct using bg.energo.eventstore.v1.SaveEventsRequest.newBuilder()
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
        getEventsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      aggregateId_ = "";

      aggregateType_ = "";

      version_ = 0;

      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_SaveEventsRequest_descriptor;
    }

    public bg.energo.eventstore.v1.SaveEventsRequest getDefaultInstanceForType() {
      return bg.energo.eventstore.v1.SaveEventsRequest.getDefaultInstance();
    }

    public bg.energo.eventstore.v1.SaveEventsRequest build() {
      bg.energo.eventstore.v1.SaveEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public bg.energo.eventstore.v1.SaveEventsRequest buildPartial() {
      bg.energo.eventstore.v1.SaveEventsRequest result = new bg.energo.eventstore.v1.SaveEventsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.aggregateId_ = aggregateId_;
      result.aggregateType_ = aggregateType_;
      result.version_ = version_;
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof bg.energo.eventstore.v1.SaveEventsRequest) {
        return mergeFrom((bg.energo.eventstore.v1.SaveEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bg.energo.eventstore.v1.SaveEventsRequest other) {
      if (other == bg.energo.eventstore.v1.SaveEventsRequest.getDefaultInstance()) return this;
      if (!other.getAggregateId().isEmpty()) {
        aggregateId_ = other.aggregateId_;
        onChanged();
      }
      if (!other.getAggregateType().isEmpty()) {
        aggregateType_ = other.aggregateType_;
        onChanged();
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000008);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
          }
        }
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
      bg.energo.eventstore.v1.SaveEventsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bg.energo.eventstore.v1.SaveEventsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object aggregateId_ = "";
    /**
     * <pre>
     * The id of the aggregate
     * </pre>
     *
     * <code>string aggregateId = 1;</code>
     */
    public java.lang.String getAggregateId() {
      java.lang.Object ref = aggregateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aggregateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The id of the aggregate
     * </pre>
     *
     * <code>string aggregateId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAggregateIdBytes() {
      java.lang.Object ref = aggregateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aggregateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The id of the aggregate
     * </pre>
     *
     * <code>string aggregateId = 1;</code>
     */
    public Builder setAggregateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aggregateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the aggregate
     * </pre>
     *
     * <code>string aggregateId = 1;</code>
     */
    public Builder clearAggregateId() {
      
      aggregateId_ = getDefaultInstance().getAggregateId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the aggregate
     * </pre>
     *
     * <code>string aggregateId = 1;</code>
     */
    public Builder setAggregateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aggregateId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object aggregateType_ = "";
    /**
     * <pre>
     * The type of the aggregate, e.g Order, Invoice and etc.
     * </pre>
     *
     * <code>string aggregateType = 2;</code>
     */
    public java.lang.String getAggregateType() {
      java.lang.Object ref = aggregateType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aggregateType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The type of the aggregate, e.g Order, Invoice and etc.
     * </pre>
     *
     * <code>string aggregateType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAggregateTypeBytes() {
      java.lang.Object ref = aggregateType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aggregateType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The type of the aggregate, e.g Order, Invoice and etc.
     * </pre>
     *
     * <code>string aggregateType = 2;</code>
     */
    public Builder setAggregateType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aggregateType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the aggregate, e.g Order, Invoice and etc.
     * </pre>
     *
     * <code>string aggregateType = 2;</code>
     */
    public Builder clearAggregateType() {
      
      aggregateType_ = getDefaultInstance().getAggregateType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the aggregate, e.g Order, Invoice and etc.
     * </pre>
     *
     * <code>string aggregateType = 2;</code>
     */
    public Builder setAggregateTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aggregateType_ = value;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <pre>
     * Used to perform a consistent read-modify-write.
     * </pre>
     *
     * <code>int32 version = 3;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * Used to perform a consistent read-modify-write.
     * </pre>
     *
     * <code>int32 version = 3;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to perform a consistent read-modify-write.
     * </pre>
     *
     * <code>int32 version = 3;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<bg.energo.eventstore.v1.EventPayload> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        events_ = new java.util.ArrayList<bg.energo.eventstore.v1.EventPayload>(events_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bg.energo.eventstore.v1.EventPayload, bg.energo.eventstore.v1.EventPayload.Builder, bg.energo.eventstore.v1.EventPayloadOrBuilder> eventsBuilder_;

    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public java.util.List<bg.energo.eventstore.v1.EventPayload> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public bg.energo.eventstore.v1.EventPayload getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public Builder setEvents(
        int index, bg.energo.eventstore.v1.EventPayload value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public Builder setEvents(
        int index, bg.energo.eventstore.v1.EventPayload.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public Builder addEvents(bg.energo.eventstore.v1.EventPayload value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public Builder addEvents(
        int index, bg.energo.eventstore.v1.EventPayload value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public Builder addEvents(
        bg.energo.eventstore.v1.EventPayload.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public Builder addEvents(
        int index, bg.energo.eventstore.v1.EventPayload.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends bg.energo.eventstore.v1.EventPayload> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public bg.energo.eventstore.v1.EventPayload.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public bg.energo.eventstore.v1.EventPayloadOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public java.util.List<? extends bg.energo.eventstore.v1.EventPayloadOrBuilder> 
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public bg.energo.eventstore.v1.EventPayload.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          bg.energo.eventstore.v1.EventPayload.getDefaultInstance());
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public bg.energo.eventstore.v1.EventPayload.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, bg.energo.eventstore.v1.EventPayload.getDefaultInstance());
    }
    /**
     * <pre>
     * List of events associated with aggregate.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.EventPayload events = 4;</code>
     */
    public java.util.List<bg.energo.eventstore.v1.EventPayload.Builder> 
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bg.energo.eventstore.v1.EventPayload, bg.energo.eventstore.v1.EventPayload.Builder, bg.energo.eventstore.v1.EventPayloadOrBuilder> 
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bg.energo.eventstore.v1.EventPayload, bg.energo.eventstore.v1.EventPayload.Builder, bg.energo.eventstore.v1.EventPayloadOrBuilder>(
                events_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bg.energo.eventstore.v1.SaveEventsRequest)
  }

  // @@protoc_insertion_point(class_scope:bg.energo.eventstore.v1.SaveEventsRequest)
  private static final bg.energo.eventstore.v1.SaveEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bg.energo.eventstore.v1.SaveEventsRequest();
  }

  public static bg.energo.eventstore.v1.SaveEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<SaveEventsRequest>() {
    public SaveEventsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaveEventsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveEventsRequest> getParserForType() {
    return PARSER;
  }

  public bg.energo.eventstore.v1.SaveEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
