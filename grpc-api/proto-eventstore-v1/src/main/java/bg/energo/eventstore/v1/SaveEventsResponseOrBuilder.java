// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventstore.proto

package bg.energo.eventstore.v1;

public interface SaveEventsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bg.energo.eventstore.v1.SaveEventsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the aggregate
   * </pre>
   *
   * <code>string aggregateId = 1;</code>
   */
  java.lang.String getAggregateId();
  /**
   * <pre>
   * The id of the aggregate
   * </pre>
   *
   * <code>string aggregateId = 1;</code>
   */
  com.google.protobuf.ByteString
      getAggregateIdBytes();

  /**
   * <pre>
   * Used to perform a consistent read-modify-write.
   * </pre>
   *
   * <code>int32 version = 2;</code>
   */
  int getVersion();
}
