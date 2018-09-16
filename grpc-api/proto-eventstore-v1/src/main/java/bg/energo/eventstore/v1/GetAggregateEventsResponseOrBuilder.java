// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventstore.proto

package bg.energo.eventstore.v1;

public interface GetAggregateEventsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bg.energo.eventstore.v1.GetAggregateEventsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  java.util.List<bg.energo.eventstore.v1.Aggregate> 
      getAggregatesList();
  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  bg.energo.eventstore.v1.Aggregate getAggregates(int index);
  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  int getAggregatesCount();
  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  java.util.List<? extends bg.energo.eventstore.v1.AggregateOrBuilder> 
      getAggregatesOrBuilderList();
  /**
   * <pre>
   * A list of returned aggregates.
   * </pre>
   *
   * <code>repeated .bg.energo.eventstore.v1.Aggregate aggregates = 1;</code>
   */
  bg.energo.eventstore.v1.AggregateOrBuilder getAggregatesOrBuilder(
      int index);
}
