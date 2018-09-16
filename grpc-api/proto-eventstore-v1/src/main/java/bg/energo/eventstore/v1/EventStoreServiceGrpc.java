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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.1-SNAPSHOT)",
    comments = "Source: eventstore.proto")
public final class EventStoreServiceGrpc {

  private EventStoreServiceGrpc() {}

  public static final String SERVICE_NAME = "bg.energo.eventstore.v1.EventStoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bg.energo.eventstore.v1.GetEventsRequest,
      bg.energo.eventstore.v1.GetEventsResponse> getGetEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEvents",
      requestType = bg.energo.eventstore.v1.GetEventsRequest.class,
      responseType = bg.energo.eventstore.v1.GetEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bg.energo.eventstore.v1.GetEventsRequest,
      bg.energo.eventstore.v1.GetEventsResponse> getGetEventsMethod() {
    io.grpc.MethodDescriptor<bg.energo.eventstore.v1.GetEventsRequest, bg.energo.eventstore.v1.GetEventsResponse> getGetEventsMethod;
    if ((getGetEventsMethod = EventStoreServiceGrpc.getGetEventsMethod) == null) {
      synchronized (EventStoreServiceGrpc.class) {
        if ((getGetEventsMethod = EventStoreServiceGrpc.getGetEventsMethod) == null) {
          EventStoreServiceGrpc.getGetEventsMethod = getGetEventsMethod = 
              io.grpc.MethodDescriptor.<bg.energo.eventstore.v1.GetEventsRequest, bg.energo.eventstore.v1.GetEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bg.energo.eventstore.v1.EventStoreService", "getEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bg.energo.eventstore.v1.GetEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bg.energo.eventstore.v1.GetEventsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreServiceMethodDescriptorSupplier("getEvents"))
                  .build();
          }
        }
     }
     return getGetEventsMethod;
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
   */
  public static abstract class EventStoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEvents(bg.energo.eventstore.v1.GetEventsRequest request,
        io.grpc.stub.StreamObserver<bg.energo.eventstore.v1.GetEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bg.energo.eventstore.v1.GetEventsRequest,
                bg.energo.eventstore.v1.GetEventsResponse>(
                  this, METHODID_GET_EVENTS)))
          .build();
    }
  }

  /**
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
     */
    public void getEvents(bg.energo.eventstore.v1.GetEventsRequest request,
        io.grpc.stub.StreamObserver<bg.energo.eventstore.v1.GetEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
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
     */
    public bg.energo.eventstore.v1.GetEventsResponse getEvents(bg.energo.eventstore.v1.GetEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEventsMethod(), getCallOptions(), request);
    }
  }

  /**
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
     */
    public com.google.common.util.concurrent.ListenableFuture<bg.energo.eventstore.v1.GetEventsResponse> getEvents(
        bg.energo.eventstore.v1.GetEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EVENTS = 0;

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
        case METHODID_GET_EVENTS:
          serviceImpl.getEvents((bg.energo.eventstore.v1.GetEventsRequest) request,
              (io.grpc.stub.StreamObserver<bg.energo.eventstore.v1.GetEventsResponse>) responseObserver);
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
              .addMethod(getGetEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
