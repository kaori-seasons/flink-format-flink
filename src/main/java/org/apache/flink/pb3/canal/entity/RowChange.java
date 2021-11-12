// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package org.apache.flink.pb3.canal.entity;

/**
 * <pre>
 **message row每行数据变更的数据结构 *
 * </pre>
 *
 * Protobuf type {@code com.alibaba.otter.canal.protocol.RowChange}
 */
public final class RowChange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.alibaba.otter.canal.protocol.RowChange)
    RowChangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RowChange.newBuilder() to construct.
  private RowChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RowChange() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RowChange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RowChange(
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
          case 8: {

            tableId_ = input.readInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            eventTypePresentCase_ = 2;
            eventTypePresent_ = rawValue;
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
    return org.apache.flink.pb3.canal.entity.MessageOuterClass.internal_static_com_alibaba_otter_canal_protocol_RowChange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.flink.pb3.canal.entity.MessageOuterClass.internal_static_com_alibaba_otter_canal_protocol_RowChange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.flink.pb3.canal.entity.RowChange.class, org.apache.flink.pb3.canal.entity.RowChange.Builder.class);
  }

  private int eventTypePresentCase_ = 0;
  private java.lang.Object eventTypePresent_;
  public enum EventTypePresentCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EVENTTYPE(2),
    EVENTTYPEPRESENT_NOT_SET(0);
    private final int value;
    private EventTypePresentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventTypePresentCase valueOf(int value) {
      return forNumber(value);
    }

    public static EventTypePresentCase forNumber(int value) {
      switch (value) {
        case 2: return EVENTTYPE;
        case 0: return EVENTTYPEPRESENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EventTypePresentCase
  getEventTypePresentCase() {
    return EventTypePresentCase.forNumber(
        eventTypePresentCase_);
  }

  public static final int TABLEID_FIELD_NUMBER = 1;
  private long tableId_;
  /**
   * <pre>
   **tableId,由数据库产生 *
   * </pre>
   *
   * <code>int64 tableId = 1;</code>
   * @return The tableId.
   */
  @java.lang.Override
  public long getTableId() {
    return tableId_;
  }

  public static final int EVENTTYPE_FIELD_NUMBER = 2;
  /**
   * <code>.com.alibaba.otter.canal.protocol.EventType eventType = 2;</code>
   * @return Whether the eventType field is set.
   */
  public boolean hasEventType() {
    return eventTypePresentCase_ == 2;
  }
  /**
   * <code>.com.alibaba.otter.canal.protocol.EventType eventType = 2;</code>
   * @return The enum numeric value on the wire for eventType.
   */
  public int getEventTypeValue() {
    if (eventTypePresentCase_ == 2) {
      return (java.lang.Integer) eventTypePresent_;
    }
    return 0;
  }
  /**
   * <code>.com.alibaba.otter.canal.protocol.EventType eventType = 2;</code>
   * @return The eventType.
   */
  public org.apache.flink.pb3.canal.entity.EventType getEventType() {
    if (eventTypePresentCase_ == 2) {
      @SuppressWarnings("deprecation")
      org.apache.flink.pb3.canal.entity.EventType result = org.apache.flink.pb3.canal.entity.EventType.valueOf(
          (java.lang.Integer) eventTypePresent_);
      return result == null ? org.apache.flink.pb3.canal.entity.EventType.UNRECOGNIZED : result;
    }
    return org.apache.flink.pb3.canal.entity.EventType.EVENTTYPECOMPATIBLEPROTO2;
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
    if (tableId_ != 0L) {
      output.writeInt64(1, tableId_);
    }
    if (eventTypePresentCase_ == 2) {
      output.writeEnum(2, ((java.lang.Integer) eventTypePresent_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tableId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, tableId_);
    }
    if (eventTypePresentCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ((java.lang.Integer) eventTypePresent_));
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
    if (!(obj instanceof org.apache.flink.pb3.canal.entity.RowChange)) {
      return super.equals(obj);
    }
    org.apache.flink.pb3.canal.entity.RowChange other = (org.apache.flink.pb3.canal.entity.RowChange) obj;

    if (getTableId()
        != other.getTableId()) return false;
    if (!getEventTypePresentCase().equals(other.getEventTypePresentCase())) return false;
    switch (eventTypePresentCase_) {
      case 2:
        if (getEventTypeValue()
            != other.getEventTypeValue()) return false;
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + TABLEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTableId());
    switch (eventTypePresentCase_) {
      case 2:
        hash = (37 * hash) + EVENTTYPE_FIELD_NUMBER;
        hash = (53 * hash) + getEventTypeValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.pb3.canal.entity.RowChange parseFrom(
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
  public static Builder newBuilder(org.apache.flink.pb3.canal.entity.RowChange prototype) {
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
   **message row每行数据变更的数据结构 *
   * </pre>
   *
   * Protobuf type {@code com.alibaba.otter.canal.protocol.RowChange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.alibaba.otter.canal.protocol.RowChange)
      org.apache.flink.pb3.canal.entity.RowChangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.flink.pb3.canal.entity.MessageOuterClass.internal_static_com_alibaba_otter_canal_protocol_RowChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.flink.pb3.canal.entity.MessageOuterClass.internal_static_com_alibaba_otter_canal_protocol_RowChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.flink.pb3.canal.entity.RowChange.class, org.apache.flink.pb3.canal.entity.RowChange.Builder.class);
    }

    // Construct using org.apache.flink.pb3.canal.entity.RowChange.newBuilder()
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
      tableId_ = 0L;

      eventTypePresentCase_ = 0;
      eventTypePresent_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.flink.pb3.canal.entity.MessageOuterClass.internal_static_com_alibaba_otter_canal_protocol_RowChange_descriptor;
    }

    @java.lang.Override
    public org.apache.flink.pb3.canal.entity.RowChange getDefaultInstanceForType() {
      return org.apache.flink.pb3.canal.entity.RowChange.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.flink.pb3.canal.entity.RowChange build() {
      org.apache.flink.pb3.canal.entity.RowChange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.flink.pb3.canal.entity.RowChange buildPartial() {
      org.apache.flink.pb3.canal.entity.RowChange result = new org.apache.flink.pb3.canal.entity.RowChange(this);
      result.tableId_ = tableId_;
      if (eventTypePresentCase_ == 2) {
        result.eventTypePresent_ = eventTypePresent_;
      }
      result.eventTypePresentCase_ = eventTypePresentCase_;
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
      if (other instanceof org.apache.flink.pb3.canal.entity.RowChange) {
        return mergeFrom((org.apache.flink.pb3.canal.entity.RowChange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.flink.pb3.canal.entity.RowChange other) {
      if (other == org.apache.flink.pb3.canal.entity.RowChange.getDefaultInstance()) return this;
      if (other.getTableId() != 0L) {
        setTableId(other.getTableId());
      }
      switch (other.getEventTypePresentCase()) {
        case EVENTTYPE: {
          setEventTypeValue(other.getEventTypeValue());
          break;
        }
        case EVENTTYPEPRESENT_NOT_SET: {
          break;
        }
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
      org.apache.flink.pb3.canal.entity.RowChange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.flink.pb3.canal.entity.RowChange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int eventTypePresentCase_ = 0;
    private java.lang.Object eventTypePresent_;
    public EventTypePresentCase
        getEventTypePresentCase() {
      return EventTypePresentCase.forNumber(
          eventTypePresentCase_);
    }

    public Builder clearEventTypePresent() {
      eventTypePresentCase_ = 0;
      eventTypePresent_ = null;
      onChanged();
      return this;
    }


    private long tableId_ ;
    /**
     * <pre>
     **tableId,由数据库产生 *
     * </pre>
     *
     * <code>int64 tableId = 1;</code>
     * @return The tableId.
     */
    @java.lang.Override
    public long getTableId() {
      return tableId_;
    }
    /**
     * <pre>
     **tableId,由数据库产生 *
     * </pre>
     *
     * <code>int64 tableId = 1;</code>
     * @param value The tableId to set.
     * @return This builder for chaining.
     */
    public Builder setTableId(long value) {
      
      tableId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **tableId,由数据库产生 *
     * </pre>
     *
     * <code>int64 tableId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTableId() {
      
      tableId_ = 0L;
      onChanged();
      return this;
    }

    /**
     * <code>.com.alibaba.otter.canal.protocol.EventType eventType = 2;</code>
     * @return Whether the eventType field is set.
     */
    @java.lang.Override
    public boolean hasEventType() {
      return eventTypePresentCase_ == 2;
    }
    /**
     * <code>.com.alibaba.otter.canal.protocol.EventType eventType = 2;</code>
     * @return The enum numeric value on the wire for eventType.
     */
    @java.lang.Override
    public int getEventTypeValue() {
      if (eventTypePresentCase_ == 2) {
        return ((java.lang.Integer) eventTypePresent_).intValue();
      }
      return 0;
    }
    /**
     * <code>.com.alibaba.otter.canal.protocol.EventType eventType = 2;</code>
     * @param value The enum numeric value on the wire for eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventTypeValue(int value) {
      eventTypePresentCase_ = 2;
      eventTypePresent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.alibaba.otter.canal.protocol.EventType eventType = 2;</code>
     * @return The eventType.
     */
    @java.lang.Override
    public org.apache.flink.pb3.canal.entity.EventType getEventType() {
      if (eventTypePresentCase_ == 2) {
        @SuppressWarnings("deprecation")
        org.apache.flink.pb3.canal.entity.EventType result = org.apache.flink.pb3.canal.entity.EventType.valueOf(
            (java.lang.Integer) eventTypePresent_);
        return result == null ? org.apache.flink.pb3.canal.entity.EventType.UNRECOGNIZED : result;
      }
      return org.apache.flink.pb3.canal.entity.EventType.EVENTTYPECOMPATIBLEPROTO2;
    }
    /**
     * <code>.com.alibaba.otter.canal.protocol.EventType eventType = 2;</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(org.apache.flink.pb3.canal.entity.EventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      eventTypePresentCase_ = 2;
      eventTypePresent_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.alibaba.otter.canal.protocol.EventType eventType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      if (eventTypePresentCase_ == 2) {
        eventTypePresentCase_ = 0;
        eventTypePresent_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:com.alibaba.otter.canal.protocol.RowChange)
  }

  // @@protoc_insertion_point(class_scope:com.alibaba.otter.canal.protocol.RowChange)
  private static final org.apache.flink.pb3.canal.entity.RowChange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.flink.pb3.canal.entity.RowChange();
  }

  public static org.apache.flink.pb3.canal.entity.RowChange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RowChange>
      PARSER = new com.google.protobuf.AbstractParser<RowChange>() {
    @java.lang.Override
    public RowChange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RowChange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RowChange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RowChange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.flink.pb3.canal.entity.RowChange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
