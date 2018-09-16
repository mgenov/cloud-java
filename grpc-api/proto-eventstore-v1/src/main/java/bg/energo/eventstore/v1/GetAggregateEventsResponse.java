// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventstore.proto

package bg.energo.eventstore.v1;

/**
 * <pre>
 * The Aggregate get response
 * </pre>
 *
 * Protobuf type {@code bg.energo.eventstore.v1.GetAggregateEventsResponse}
 */
public  final class GetAggregateEventsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bg.energo.eventstore.v1.GetAggregateEventsResponse)
    GetAggregateEventsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAggregateEventsResponse.newBuilder() to construct.
  private GetAggregateEventsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAggregateEventsResponse() {
    aggregates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAggregateEventsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              aggregates_ = new java.util.ArrayList<bg.energo.eventstore.v1.Aggregate>();
              mutable_bitField0_ |= 0x00000001;
            }
            aggregates_.add(
                input.readMessage(bg.energo.eventstore.v1.Aggregate.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        aggregates_ = java.util.Collections.unmodifiableList(aggregates_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_GetAggregateEventsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_GetAggregateEventsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bg.energo.eventstore.v1.GetAggregateEventsResponse.class, bg.energo.eventstore.v1.GetAggregateEventsResponse.Builder.class);
  }

  public static final int AGGREGATES_FIELD_NUMBER = 1;
  private java.util.List<bg.energo.eventstore.v1.Aggregate> aggregates_;
  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  public java.util.List<bg.energo.eventstore.v1.Aggregate> getAggregatesList() {
    return aggregates_;
  }
  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  public java.util.List<? extends bg.energo.eventstore.v1.AggregateOrBuilder> 
      getAggregatesOrBuilderList() {
    return aggregates_;
  }
  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  public int getAggregatesCount() {
    return aggregates_.size();
  }
  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  public bg.energo.eventstore.v1.Aggregate getAggregates(int index) {
    return aggregates_.get(index);
  }
  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  public bg.energo.eventstore.v1.AggregateOrBuilder getAggregatesOrBuilder(
      int index) {
    return aggregates_.get(index);
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
    for (int i = 0; i < aggregates_.size(); i++) {
      output.writeMessage(1, aggregates_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < aggregates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, aggregates_.get(i));
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
    if (!(obj instanceof bg.energo.eventstore.v1.GetAggregateEventsResponse)) {
      return super.equals(obj);
    }
    bg.energo.eventstore.v1.GetAggregateEventsResponse other = (bg.energo.eventstore.v1.GetAggregateEventsResponse) obj;

    boolean result = true;
    result = result && getAggregatesList()
        .equals(other.getAggregatesList());
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
    if (getAggregatesCount() > 0) {
      hash = (37 * hash) + AGGREGATES_FIELD_NUMBER;
      hash = (53 * hash) + getAggregatesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bg.energo.eventstore.v1.GetAggregateEventsResponse parseFrom(
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
  public static Builder newBuilder(bg.energo.eventstore.v1.GetAggregateEventsResponse prototype) {
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
   * The Aggregate get response
   * </pre>
   *
   * Protobuf type {@code bg.energo.eventstore.v1.GetAggregateEventsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bg.energo.eventstore.v1.GetAggregateEventsResponse)
      bg.energo.eventstore.v1.GetAggregateEventsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_GetAggregateEventsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_GetAggregateEventsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bg.energo.eventstore.v1.GetAggregateEventsResponse.class, bg.energo.eventstore.v1.GetAggregateEventsResponse.Builder.class);
    }

    // Construct using bg.energo.eventstore.v1.GetAggregateEventsResponse.newBuilder()
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
        getAggregatesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (aggregatesBuilder_ == null) {
        aggregates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        aggregatesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bg.energo.eventstore.v1.Eventstore.internal_static_bg_energo_eventstore_v1_GetAggregateEventsResponse_descriptor;
    }

    public bg.energo.eventstore.v1.GetAggregateEventsResponse getDefaultInstanceForType() {
      return bg.energo.eventstore.v1.GetAggregateEventsResponse.getDefaultInstance();
    }

    public bg.energo.eventstore.v1.GetAggregateEventsResponse build() {
      bg.energo.eventstore.v1.GetAggregateEventsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public bg.energo.eventstore.v1.GetAggregateEventsResponse buildPartial() {
      bg.energo.eventstore.v1.GetAggregateEventsResponse result = new bg.energo.eventstore.v1.GetAggregateEventsResponse(this);
      int from_bitField0_ = bitField0_;
      if (aggregatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          aggregates_ = java.util.Collections.unmodifiableList(aggregates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aggregates_ = aggregates_;
      } else {
        result.aggregates_ = aggregatesBuilder_.build();
      }
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
      if (other instanceof bg.energo.eventstore.v1.GetAggregateEventsResponse) {
        return mergeFrom((bg.energo.eventstore.v1.GetAggregateEventsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bg.energo.eventstore.v1.GetAggregateEventsResponse other) {
      if (other == bg.energo.eventstore.v1.GetAggregateEventsResponse.getDefaultInstance()) return this;
      if (aggregatesBuilder_ == null) {
        if (!other.aggregates_.isEmpty()) {
          if (aggregates_.isEmpty()) {
            aggregates_ = other.aggregates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAggregatesIsMutable();
            aggregates_.addAll(other.aggregates_);
          }
          onChanged();
        }
      } else {
        if (!other.aggregates_.isEmpty()) {
          if (aggregatesBuilder_.isEmpty()) {
            aggregatesBuilder_.dispose();
            aggregatesBuilder_ = null;
            aggregates_ = other.aggregates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            aggregatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAggregatesFieldBuilder() : null;
          } else {
            aggregatesBuilder_.addAllMessages(other.aggregates_);
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
      bg.energo.eventstore.v1.GetAggregateEventsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bg.energo.eventstore.v1.GetAggregateEventsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<bg.energo.eventstore.v1.Aggregate> aggregates_ =
      java.util.Collections.emptyList();
    private void ensureAggregatesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        aggregates_ = new java.util.ArrayList<bg.energo.eventstore.v1.Aggregate>(aggregates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        bg.energo.eventstore.v1.Aggregate, bg.energo.eventstore.v1.Aggregate.Builder, bg.energo.eventstore.v1.AggregateOrBuilder> aggregatesBuilder_;

    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public java.util.List<bg.energo.eventstore.v1.Aggregate> getAggregatesList() {
      if (aggregatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(aggregates_);
      } else {
        return aggregatesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public int getAggregatesCount() {
      if (aggregatesBuilder_ == null) {
        return aggregates_.size();
      } else {
        return aggregatesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public bg.energo.eventstore.v1.Aggregate getAggregates(int index) {
      if (aggregatesBuilder_ == null) {
        return aggregates_.get(index);
      } else {
        return aggregatesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public Builder setAggregates(
        int index, bg.energo.eventstore.v1.Aggregate value) {
      if (aggregatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAggregatesIsMutable();
        aggregates_.set(index, value);
        onChanged();
      } else {
        aggregatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public Builder setAggregates(
        int index, bg.energo.eventstore.v1.Aggregate.Builder builderForValue) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        aggregates_.set(index, builderForValue.build());
        onChanged();
      } else {
        aggregatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public Builder addAggregates(bg.energo.eventstore.v1.Aggregate value) {
      if (aggregatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAggregatesIsMutable();
        aggregates_.add(value);
        onChanged();
      } else {
        aggregatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public Builder addAggregates(
        int index, bg.energo.eventstore.v1.Aggregate value) {
      if (aggregatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAggregatesIsMutable();
        aggregates_.add(index, value);
        onChanged();
      } else {
        aggregatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public Builder addAggregates(
        bg.energo.eventstore.v1.Aggregate.Builder builderForValue) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        aggregates_.add(builderForValue.build());
        onChanged();
      } else {
        aggregatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public Builder addAggregates(
        int index, bg.energo.eventstore.v1.Aggregate.Builder builderForValue) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        aggregates_.add(index, builderForValue.build());
        onChanged();
      } else {
        aggregatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public Builder addAllAggregates(
        java.lang.Iterable<? extends bg.energo.eventstore.v1.Aggregate> values) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aggregates_);
        onChanged();
      } else {
        aggregatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public Builder clearAggregates() {
      if (aggregatesBuilder_ == null) {
        aggregates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        aggregatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public Builder removeAggregates(int index) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        aggregates_.remove(index);
        onChanged();
      } else {
        aggregatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public bg.energo.eventstore.v1.Aggregate.Builder getAggregatesBuilder(
        int index) {
      return getAggregatesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public bg.energo.eventstore.v1.AggregateOrBuilder getAggregatesOrBuilder(
        int index) {
      if (aggregatesBuilder_ == null) {
        return aggregates_.get(index);  } else {
        return aggregatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public java.util.List<? extends bg.energo.eventstore.v1.AggregateOrBuilder> 
         getAggregatesOrBuilderList() {
      if (aggregatesBuilder_ != null) {
        return aggregatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(aggregates_);
      }
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public bg.energo.eventstore.v1.Aggregate.Builder addAggregatesBuilder() {
      return getAggregatesFieldBuilder().addBuilder(
          bg.energo.eventstore.v1.Aggregate.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public bg.energo.eventstore.v1.Aggregate.Builder addAggregatesBuilder(
        int index) {
      return getAggregatesFieldBuilder().addBuilder(
          index, bg.energo.eventstore.v1.Aggregate.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of returned aggregates.
     * </pre>
     *
     * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
     */
    public java.util.List<bg.energo.eventstore.v1.Aggregate.Builder> 
         getAggregatesBuilderList() {
      return getAggregatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        bg.energo.eventstore.v1.Aggregate, bg.energo.eventstore.v1.Aggregate.Builder, bg.energo.eventstore.v1.AggregateOrBuilder> 
        getAggregatesFieldBuilder() {
      if (aggregatesBuilder_ == null) {
        aggregatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            bg.energo.eventstore.v1.Aggregate, bg.energo.eventstore.v1.Aggregate.Builder, bg.energo.eventstore.v1.AggregateOrBuilder>(
                aggregates_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        aggregates_ = null;
      }
      return aggregatesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bg.energo.eventstore.v1.GetAggregateEventsResponse)
  }

  // @@protoc_insertion_point(class_scope:bg.energo.eventstore.v1.GetAggregateEventsResponse)
  private static final bg.energo.eventstore.v1.GetAggregateEventsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bg.energo.eventstore.v1.GetAggregateEventsResponse();
  }

  public static bg.energo.eventstore.v1.GetAggregateEventsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAggregateEventsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAggregateEventsResponse>() {
    public GetAggregateEventsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAggregateEventsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAggregateEventsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAggregateEventsResponse> getParserForType() {
    return PARSER;
  }

  public bg.energo.eventstore.v1.GetAggregateEventsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

