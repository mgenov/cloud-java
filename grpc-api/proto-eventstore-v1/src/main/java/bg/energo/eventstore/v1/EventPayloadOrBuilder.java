// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventstore.proto

package bg.energo.eventstore.v1;

public interface EventPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bg.energo.eventstore.v1.EventPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string kind = 1;</code>
   */
  java.lang.String getKind();
  /**
   * <code>string kind = 1;</code>
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <code>uint64 timestamp = 2;</code>
   */
  long getTimestamp();

  /**
   * <code>string identityId = 3;</code>
   */
  java.lang.String getIdentityId();
  /**
   * <code>string identityId = 3;</code>
   */
  com.google.protobuf.ByteString
      getIdentityIdBytes();

  /**
   * <code>bytes payload = 4;</code>
   */
  com.google.protobuf.ByteString getPayload();
}