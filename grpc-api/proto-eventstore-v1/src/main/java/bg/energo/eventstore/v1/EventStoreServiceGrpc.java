package bg.energo.eventstore.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The Event Store service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.1-SNAPSHOT)",
    comments = "Source: eventstore.proto")
public final class EventStoreServiceGrpc {

  private EventStoreServiceGrpc() {}

  public static final String SERVICE_NAME = "bg.energo.eventstore.v1.EventStoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bg.energo.eventstore.v1.SaveEventsRequest,
      bg.energo.eventstore.v1.SaveEventsResponse> getSaveAggregateEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveAggregateEvents",
      requestType = bg.energo.eventstore.v1.SaveEventsRequest.class,
      responseType = bg.energo.eventstore.v1.SaveEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bg.energo.eventstore.v1.SaveEventsRequest,
      bg.energo.eventstore.v1.SaveEventsResponse> getSaveAggregateEventsMethod() {
    io.grpc.MethodDescriptor<bg.energo.eventstore.v1.SaveEventsRequest, bg.energo.eventstore.v1.SaveEventsResponse> getSaveAggregateEventsMethod;
    if ((getSaveAggregateEventsMethod = EventStoreServiceGrpc.getSaveAggregateEventsMethod) == null) {
      synchronized (EventStoreServiceGrpc.class) {
        if ((getSaveAggregateEventsMethod = EventStoreServiceGrpc.getSaveAggregateEventsMethod) == null) {
          EventStoreServiceGrpc.getSaveAggregateEventsMethod = getSaveAggregateEventsMethod = 
              io.grpc.MethodDescriptor.<bg.energo.eventstore.v1.SaveEventsRequest, bg.energo.eventstore.v1.SaveEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bg.energo.eventstore.v1.EventStoreService", "SaveAggregateEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bg.energo.eventstore.v1.SaveEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bg.energo.eventstore.v1.SaveEventsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreServiceMethodDescriptorSupplier("SaveAggregateEvents"))
                  .build();
          }
        }
     }
     return getSaveAggregateEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bg.energo.eventstore.v1.GetAggregateEventsRequest,
      bg.energo.eventstore.v1.GetAggregateEventsResponse> getGetAggregateEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAggregateEvents",
      requestType = bg.energo.eventstore.v1.GetAggregateEventsRequest.class,
      responseType = bg.energo.eventstore.v1.GetAggregateEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bg.energo.eventstore.v1.GetAggregateEventsRequest,
      bg.energo.eventstore.v1.GetAggregateEventsResponse> getGetAggregateEventsMethod() {
    io.grpc.MethodDescriptor<bg.energo.eventstore.v1.GetAggregateEventsRequest, bg.energo.eventstore.v1.GetAggregateEventsResponse> getGetAggregateEventsMethod;
    if ((getGetAggregateEventsMethod = EventStoreServiceGrpc.getGetAggregateEventsMethod) == null) {
      synchronized (EventStoreServiceGrpc.class) {
        if ((getGetAggregateEventsMethod = EventStoreServiceGrpc.getGetAggregateEventsMethod) == null) {
          EventStoreServiceGrpc.getGetAggregateEventsMethod = getGetAggregateEventsMethod = 
              io.grpc.MethodDescriptor.<bg.energo.eventstore.v1.GetAggregateEventsRequest, bg.energo.eventstore.v1.GetAggregateEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bg.energo.eventstore.v1.EventStoreService", "getAggregateEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bg.energo.eventstore.v1.GetAggregateEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bg.energo.eventstore.v1.GetAggregateEventsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreServiceMethodDescriptorSupplier("getAggregateEvents"))
                  .build();
          }
        }
     }
     return getGetAggregateEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventStoreServiceStub newStub(io.grpc.Channel channel) {
    return new EventStoreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventStoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventStoreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventStoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventStoreServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The Event Store service definition.
   * </pre>
   */
  public static abstract class EventStoreServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Saves aggregate events in the Event Store.
     * </pre>
     */
    public void saveAggregateEvents(bg.energo.eventstore.v1.SaveEventsRequest request,
        io.grpc.stub.StreamObserver<bg.energo.eventstore.v1.SaveEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveAggregateEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets events for the provided aggregates.
     * </pre>
     */
    public void getAggregateEvents(bg.energo.eventstore.v1.GetAggregateEventsRequest request,
        io.grpc.stub.StreamObserver<bg.energo.eventstore.v1.GetAggregateEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAggregateEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveAggregateEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bg.energo.eventstore.v1.SaveEventsRequest,
                bg.energo.eventstore.v1.SaveEventsResponse>(
                  this, METHODID_SAVE_AGGREGATE_EVENTS)))
          .addMethod(
            getGetAggregateEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bg.energo.eventstore.v1.GetAggregateEventsRequest,
                bg.energo.eventstore.v1.GetAggregateEventsResponse>(
                  this, METHODID_GET_AGGREGATE_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * The Event Store service definition.
   * </pre>
   */
  public static final class EventStoreServiceStub extends io.grpc.stub.AbstractStub<EventStoreServiceStub> {
    private EventStoreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventStoreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventStoreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventStoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Saves aggregate events in the Event Store.
     * </pre>
     */
    public void saveAggregateEvents(bg.energo.eventstore.v1.SaveEventsRequest request,
        io.grpc.stub.StreamObserver<bg.energo.eventstore.v1.SaveEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveAggregateEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets events for the provided aggregates.
     * </pre>
     */
    public void getAggregateEvents(bg.energo.eventstore.v1.GetAggregateEventsRequest request,
        io.grpc.stub.StreamObserver<bg.energo.eventstore.v1.GetAggregateEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAggregateEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Event Store service definition.
   * </pre>
   */
  public static final class EventStoreServiceBlockingStub extends io.grpc.stub.AbstractStub<EventStoreServiceBlockingStub> {
    private EventStoreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventStoreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventStoreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventStoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Saves aggregate events in the Event Store.
     * </pre>
     */
    public bg.energo.eventstore.v1.SaveEventsResponse saveAggregateEvents(bg.energo.eventstore.v1.SaveEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveAggregateEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets events for the provided aggregates.
     * </pre>
     */
    public bg.energo.eventstore.v1.GetAggregateEventsResponse getAggregateEvents(bg.energo.eventstore.v1.GetAggregateEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAggregateEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Event Store service definition.
   * </pre>
   */
  public static final class EventStoreServiceFutureStub extends io.grpc.stub.AbstractStub<EventStoreServiceFutureStub> {
    private EventStoreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventStoreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventStoreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventStoreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Saves aggregate events in the Event Store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bg.energo.eventstore.v1.SaveEventsResponse> saveAggregateEvents(
        bg.energo.eventstore.v1.SaveEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveAggregateEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets events for the provided aggregates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bg.energo.eventstore.v1.GetAggregateEventsResponse> getAggregateEvents(
        bg.energo.eventstore.v1.GetAggregateEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAggregateEventsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_AGGREGATE_EVENTS = 0;
  private static final int METHODID_GET_AGGREGATE_EVENTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventStoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventStoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_AGGREGATE_EVENTS:
          serviceImpl.saveAggregateEvents((bg.energo.eventstore.v1.SaveEventsRequest) request,
              (io.grpc.stub.StreamObserver<bg.energo.eventstore.v1.SaveEventsResponse>) responseObserver);
          break;
        case METHODID_GET_AGGREGATE_EVENTS:
          serviceImpl.getAggregateEvents((bg.energo.eventstore.v1.GetAggregateEventsRequest) request,
              (io.grpc.stub.StreamObserver<bg.energo.eventstore.v1.GetAggregateEventsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventStoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bg.energo.eventstore.v1.Eventstore.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventStoreService");
    }
  }

  private static final class EventStoreServiceFileDescriptorSupplier
      extends EventStoreServiceBaseDescriptorSupplier {
    EventStoreServiceFileDescriptorSupplier() {}
  }

  private static final class EventStoreServiceMethodDescriptorSupplier
      extends EventStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventStoreServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventStoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventStoreServiceFileDescriptorSupplier())
              .addMethod(getSaveAggregateEventsMethod())
              .addMethod(getGetAggregateEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
