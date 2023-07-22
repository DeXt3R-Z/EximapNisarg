package com.kotlang.social;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: social.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserPostGrpc {

  private UserPostGrpc() {}

  public static final String SERVICE_NAME = "social.UserPost";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kotlang.social.UserPostRequest,
      com.kotlang.social.UserPostProto> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = com.kotlang.social.UserPostRequest.class,
      responseType = com.kotlang.social.UserPostProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kotlang.social.UserPostRequest,
      com.kotlang.social.UserPostProto> getCreatePostMethod() {
    io.grpc.MethodDescriptor<com.kotlang.social.UserPostRequest, com.kotlang.social.UserPostProto> getCreatePostMethod;
    if ((getCreatePostMethod = UserPostGrpc.getCreatePostMethod) == null) {
      synchronized (UserPostGrpc.class) {
        if ((getCreatePostMethod = UserPostGrpc.getCreatePostMethod) == null) {
          UserPostGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<com.kotlang.social.UserPostRequest, com.kotlang.social.UserPostProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.UserPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.UserPostProto.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kotlang.social.DeletePostRequest,
      com.kotlang.social.SocialStatusResponse> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = com.kotlang.social.DeletePostRequest.class,
      responseType = com.kotlang.social.SocialStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kotlang.social.DeletePostRequest,
      com.kotlang.social.SocialStatusResponse> getDeletePostMethod() {
    io.grpc.MethodDescriptor<com.kotlang.social.DeletePostRequest, com.kotlang.social.SocialStatusResponse> getDeletePostMethod;
    if ((getDeletePostMethod = UserPostGrpc.getDeletePostMethod) == null) {
      synchronized (UserPostGrpc.class) {
        if ((getDeletePostMethod = UserPostGrpc.getDeletePostMethod) == null) {
          UserPostGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<com.kotlang.social.DeletePostRequest, com.kotlang.social.SocialStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.DeletePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.SocialStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kotlang.social.GetFeedRequest,
      com.kotlang.social.FeedResponse> getGetFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeed",
      requestType = com.kotlang.social.GetFeedRequest.class,
      responseType = com.kotlang.social.FeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kotlang.social.GetFeedRequest,
      com.kotlang.social.FeedResponse> getGetFeedMethod() {
    io.grpc.MethodDescriptor<com.kotlang.social.GetFeedRequest, com.kotlang.social.FeedResponse> getGetFeedMethod;
    if ((getGetFeedMethod = UserPostGrpc.getGetFeedMethod) == null) {
      synchronized (UserPostGrpc.class) {
        if ((getGetFeedMethod = UserPostGrpc.getGetFeedMethod) == null) {
          UserPostGrpc.getGetFeedMethod = getGetFeedMethod =
              io.grpc.MethodDescriptor.<com.kotlang.social.GetFeedRequest, com.kotlang.social.FeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.GetFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.FeedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kotlang.social.MediaUploadRequest,
      com.kotlang.social.MediaUploadURL> getGetMediaUploadUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMediaUploadUrl",
      requestType = com.kotlang.social.MediaUploadRequest.class,
      responseType = com.kotlang.social.MediaUploadURL.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kotlang.social.MediaUploadRequest,
      com.kotlang.social.MediaUploadURL> getGetMediaUploadUrlMethod() {
    io.grpc.MethodDescriptor<com.kotlang.social.MediaUploadRequest, com.kotlang.social.MediaUploadURL> getGetMediaUploadUrlMethod;
    if ((getGetMediaUploadUrlMethod = UserPostGrpc.getGetMediaUploadUrlMethod) == null) {
      synchronized (UserPostGrpc.class) {
        if ((getGetMediaUploadUrlMethod = UserPostGrpc.getGetMediaUploadUrlMethod) == null) {
          UserPostGrpc.getGetMediaUploadUrlMethod = getGetMediaUploadUrlMethod =
              io.grpc.MethodDescriptor.<com.kotlang.social.MediaUploadRequest, com.kotlang.social.MediaUploadURL>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMediaUploadUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.MediaUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.MediaUploadURL.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMediaUploadUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kotlang.social.GetPostRequest,
      com.kotlang.social.UserPostProto> getGetPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPost",
      requestType = com.kotlang.social.GetPostRequest.class,
      responseType = com.kotlang.social.UserPostProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kotlang.social.GetPostRequest,
      com.kotlang.social.UserPostProto> getGetPostMethod() {
    io.grpc.MethodDescriptor<com.kotlang.social.GetPostRequest, com.kotlang.social.UserPostProto> getGetPostMethod;
    if ((getGetPostMethod = UserPostGrpc.getGetPostMethod) == null) {
      synchronized (UserPostGrpc.class) {
        if ((getGetPostMethod = UserPostGrpc.getGetPostMethod) == null) {
          UserPostGrpc.getGetPostMethod = getGetPostMethod =
              io.grpc.MethodDescriptor.<com.kotlang.social.GetPostRequest, com.kotlang.social.UserPostProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.GetPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.UserPostProto.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kotlang.social.GetBookmarksRequest,
      com.kotlang.social.FeedResponse> getGetBookmarksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBookmarks",
      requestType = com.kotlang.social.GetBookmarksRequest.class,
      responseType = com.kotlang.social.FeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kotlang.social.GetBookmarksRequest,
      com.kotlang.social.FeedResponse> getGetBookmarksMethod() {
    io.grpc.MethodDescriptor<com.kotlang.social.GetBookmarksRequest, com.kotlang.social.FeedResponse> getGetBookmarksMethod;
    if ((getGetBookmarksMethod = UserPostGrpc.getGetBookmarksMethod) == null) {
      synchronized (UserPostGrpc.class) {
        if ((getGetBookmarksMethod = UserPostGrpc.getGetBookmarksMethod) == null) {
          UserPostGrpc.getGetBookmarksMethod = getGetBookmarksMethod =
              io.grpc.MethodDescriptor.<com.kotlang.social.GetBookmarksRequest, com.kotlang.social.FeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBookmarks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.GetBookmarksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.FeedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBookmarksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kotlang.social.GetTagsRequest,
      com.kotlang.social.TagListResponse> getGetTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTags",
      requestType = com.kotlang.social.GetTagsRequest.class,
      responseType = com.kotlang.social.TagListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kotlang.social.GetTagsRequest,
      com.kotlang.social.TagListResponse> getGetTagsMethod() {
    io.grpc.MethodDescriptor<com.kotlang.social.GetTagsRequest, com.kotlang.social.TagListResponse> getGetTagsMethod;
    if ((getGetTagsMethod = UserPostGrpc.getGetTagsMethod) == null) {
      synchronized (UserPostGrpc.class) {
        if ((getGetTagsMethod = UserPostGrpc.getGetTagsMethod) == null) {
          UserPostGrpc.getGetTagsMethod = getGetTagsMethod =
              io.grpc.MethodDescriptor.<com.kotlang.social.GetTagsRequest, com.kotlang.social.TagListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.GetTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.TagListResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kotlang.social.UploadPostMediaRequest,
      com.kotlang.social.UploadPostMediaResponse> getUploadPostMediaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadPostMedia",
      requestType = com.kotlang.social.UploadPostMediaRequest.class,
      responseType = com.kotlang.social.UploadPostMediaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.kotlang.social.UploadPostMediaRequest,
      com.kotlang.social.UploadPostMediaResponse> getUploadPostMediaMethod() {
    io.grpc.MethodDescriptor<com.kotlang.social.UploadPostMediaRequest, com.kotlang.social.UploadPostMediaResponse> getUploadPostMediaMethod;
    if ((getUploadPostMediaMethod = UserPostGrpc.getUploadPostMediaMethod) == null) {
      synchronized (UserPostGrpc.class) {
        if ((getUploadPostMediaMethod = UserPostGrpc.getUploadPostMediaMethod) == null) {
          UserPostGrpc.getUploadPostMediaMethod = getUploadPostMediaMethod =
              io.grpc.MethodDescriptor.<com.kotlang.social.UploadPostMediaRequest, com.kotlang.social.UploadPostMediaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadPostMedia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.UploadPostMediaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.UploadPostMediaResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadPostMediaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kotlang.social.UserPostRequest,
      com.kotlang.social.UserPostRequest> getParsePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParsePost",
      requestType = com.kotlang.social.UserPostRequest.class,
      responseType = com.kotlang.social.UserPostRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kotlang.social.UserPostRequest,
      com.kotlang.social.UserPostRequest> getParsePostMethod() {
    io.grpc.MethodDescriptor<com.kotlang.social.UserPostRequest, com.kotlang.social.UserPostRequest> getParsePostMethod;
    if ((getParsePostMethod = UserPostGrpc.getParsePostMethod) == null) {
      synchronized (UserPostGrpc.class) {
        if ((getParsePostMethod = UserPostGrpc.getParsePostMethod) == null) {
          UserPostGrpc.getParsePostMethod = getParsePostMethod =
              io.grpc.MethodDescriptor.<com.kotlang.social.UserPostRequest, com.kotlang.social.UserPostRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParsePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.UserPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.kotlang.social.UserPostRequest.getDefaultInstance()))
              .build();
        }
      }
    }
    return getParsePostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserPostStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserPostStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserPostStub>() {
        @java.lang.Override
        public UserPostStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserPostStub(channel, callOptions);
        }
      };
    return UserPostStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserPostBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserPostBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserPostBlockingStub>() {
        @java.lang.Override
        public UserPostBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserPostBlockingStub(channel, callOptions);
        }
      };
    return UserPostBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserPostFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserPostFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserPostFutureStub>() {
        @java.lang.Override
        public UserPostFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserPostFutureStub(channel, callOptions);
        }
      };
    return UserPostFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserPostImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *create new post or reply to a post or add answer to a post
     *referencePost would be used to post answer or comment on a feed post
     * </pre>
     */
    public void createPost(com.kotlang.social.UserPostRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.UserPostProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     */
    public void deletePost(com.kotlang.social.DeletePostRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.SocialStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     */
    public void getFeed(com.kotlang.social.GetFeedRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.FeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeedMethod(), responseObserver);
    }

    /**
     */
    public void getMediaUploadUrl(com.kotlang.social.MediaUploadRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.MediaUploadURL> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMediaUploadUrlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns post with it's text, media and top 10 comments/answers.
     * For more comments/answers use GetFeed API with referencePost = postId.
     * </pre>
     */
    public void getPost(com.kotlang.social.GetPostRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.UserPostProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostMethod(), responseObserver);
    }

    /**
     */
    public void getBookmarks(com.kotlang.social.GetBookmarksRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.FeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBookmarksMethod(), responseObserver);
    }

    /**
     */
    public void getTags(com.kotlang.social.GetTagsRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.TagListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * directly takes input of post image or video and uploads the media.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.kotlang.social.UploadPostMediaRequest> uploadPostMedia(
        io.grpc.stub.StreamObserver<com.kotlang.social.UploadPostMediaResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadPostMediaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Called from frontend before CreatePost.
     * Will be usually called whenever a user pastes a link in post - To show preview as user is creating post.
     * Also, before createPost - Idempotency.
     * </pre>
     */
    public void parsePost(com.kotlang.social.UserPostRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.UserPostRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParsePostMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kotlang.social.UserPostRequest,
                com.kotlang.social.UserPostProto>(
                  this, METHODID_CREATE_POST)))
          .addMethod(
            getDeletePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kotlang.social.DeletePostRequest,
                com.kotlang.social.SocialStatusResponse>(
                  this, METHODID_DELETE_POST)))
          .addMethod(
            getGetFeedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kotlang.social.GetFeedRequest,
                com.kotlang.social.FeedResponse>(
                  this, METHODID_GET_FEED)))
          .addMethod(
            getGetMediaUploadUrlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kotlang.social.MediaUploadRequest,
                com.kotlang.social.MediaUploadURL>(
                  this, METHODID_GET_MEDIA_UPLOAD_URL)))
          .addMethod(
            getGetPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kotlang.social.GetPostRequest,
                com.kotlang.social.UserPostProto>(
                  this, METHODID_GET_POST)))
          .addMethod(
            getGetBookmarksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kotlang.social.GetBookmarksRequest,
                com.kotlang.social.FeedResponse>(
                  this, METHODID_GET_BOOKMARKS)))
          .addMethod(
            getGetTagsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kotlang.social.GetTagsRequest,
                com.kotlang.social.TagListResponse>(
                  this, METHODID_GET_TAGS)))
          .addMethod(
            getUploadPostMediaMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.kotlang.social.UploadPostMediaRequest,
                com.kotlang.social.UploadPostMediaResponse>(
                  this, METHODID_UPLOAD_POST_MEDIA)))
          .addMethod(
            getParsePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kotlang.social.UserPostRequest,
                com.kotlang.social.UserPostRequest>(
                  this, METHODID_PARSE_POST)))
          .build();
    }
  }

  /**
   */
  public static final class UserPostStub extends io.grpc.stub.AbstractAsyncStub<UserPostStub> {
    private UserPostStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserPostStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserPostStub(channel, callOptions);
    }

    /**
     * <pre>
     *create new post or reply to a post or add answer to a post
     *referencePost would be used to post answer or comment on a feed post
     * </pre>
     */
    public void createPost(com.kotlang.social.UserPostRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.UserPostProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(com.kotlang.social.DeletePostRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.SocialStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFeed(com.kotlang.social.GetFeedRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.FeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMediaUploadUrl(com.kotlang.social.MediaUploadRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.MediaUploadURL> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMediaUploadUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns post with it's text, media and top 10 comments/answers.
     * For more comments/answers use GetFeed API with referencePost = postId.
     * </pre>
     */
    public void getPost(com.kotlang.social.GetPostRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.UserPostProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBookmarks(com.kotlang.social.GetBookmarksRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.FeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBookmarksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTags(com.kotlang.social.GetTagsRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.TagListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * directly takes input of post image or video and uploads the media.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.kotlang.social.UploadPostMediaRequest> uploadPostMedia(
        io.grpc.stub.StreamObserver<com.kotlang.social.UploadPostMediaResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadPostMediaMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Called from frontend before CreatePost.
     * Will be usually called whenever a user pastes a link in post - To show preview as user is creating post.
     * Also, before createPost - Idempotency.
     * </pre>
     */
    public void parsePost(com.kotlang.social.UserPostRequest request,
        io.grpc.stub.StreamObserver<com.kotlang.social.UserPostRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParsePostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserPostBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserPostBlockingStub> {
    private UserPostBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserPostBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserPostBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *create new post or reply to a post or add answer to a post
     *referencePost would be used to post answer or comment on a feed post
     * </pre>
     */
    public com.kotlang.social.UserPostProto createPost(com.kotlang.social.UserPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kotlang.social.SocialStatusResponse deletePost(com.kotlang.social.DeletePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kotlang.social.FeedResponse getFeed(com.kotlang.social.GetFeedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kotlang.social.MediaUploadURL getMediaUploadUrl(com.kotlang.social.MediaUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMediaUploadUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns post with it's text, media and top 10 comments/answers.
     * For more comments/answers use GetFeed API with referencePost = postId.
     * </pre>
     */
    public com.kotlang.social.UserPostProto getPost(com.kotlang.social.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kotlang.social.FeedResponse getBookmarks(com.kotlang.social.GetBookmarksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBookmarksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kotlang.social.TagListResponse getTags(com.kotlang.social.GetTagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Called from frontend before CreatePost.
     * Will be usually called whenever a user pastes a link in post - To show preview as user is creating post.
     * Also, before createPost - Idempotency.
     * </pre>
     */
    public com.kotlang.social.UserPostRequest parsePost(com.kotlang.social.UserPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParsePostMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserPostFutureStub extends io.grpc.stub.AbstractFutureStub<UserPostFutureStub> {
    private UserPostFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserPostFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserPostFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *create new post or reply to a post or add answer to a post
     *referencePost would be used to post answer or comment on a feed post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kotlang.social.UserPostProto> createPost(
        com.kotlang.social.UserPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kotlang.social.SocialStatusResponse> deletePost(
        com.kotlang.social.DeletePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kotlang.social.FeedResponse> getFeed(
        com.kotlang.social.GetFeedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kotlang.social.MediaUploadURL> getMediaUploadUrl(
        com.kotlang.social.MediaUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMediaUploadUrlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns post with it's text, media and top 10 comments/answers.
     * For more comments/answers use GetFeed API with referencePost = postId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kotlang.social.UserPostProto> getPost(
        com.kotlang.social.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kotlang.social.FeedResponse> getBookmarks(
        com.kotlang.social.GetBookmarksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBookmarksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kotlang.social.TagListResponse> getTags(
        com.kotlang.social.GetTagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Called from frontend before CreatePost.
     * Will be usually called whenever a user pastes a link in post - To show preview as user is creating post.
     * Also, before createPost - Idempotency.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kotlang.social.UserPostRequest> parsePost(
        com.kotlang.social.UserPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParsePostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;
  private static final int METHODID_DELETE_POST = 1;
  private static final int METHODID_GET_FEED = 2;
  private static final int METHODID_GET_MEDIA_UPLOAD_URL = 3;
  private static final int METHODID_GET_POST = 4;
  private static final int METHODID_GET_BOOKMARKS = 5;
  private static final int METHODID_GET_TAGS = 6;
  private static final int METHODID_PARSE_POST = 7;
  private static final int METHODID_UPLOAD_POST_MEDIA = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserPostImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserPostImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_POST:
          serviceImpl.createPost((com.kotlang.social.UserPostRequest) request,
              (io.grpc.stub.StreamObserver<com.kotlang.social.UserPostProto>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((com.kotlang.social.DeletePostRequest) request,
              (io.grpc.stub.StreamObserver<com.kotlang.social.SocialStatusResponse>) responseObserver);
          break;
        case METHODID_GET_FEED:
          serviceImpl.getFeed((com.kotlang.social.GetFeedRequest) request,
              (io.grpc.stub.StreamObserver<com.kotlang.social.FeedResponse>) responseObserver);
          break;
        case METHODID_GET_MEDIA_UPLOAD_URL:
          serviceImpl.getMediaUploadUrl((com.kotlang.social.MediaUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.kotlang.social.MediaUploadURL>) responseObserver);
          break;
        case METHODID_GET_POST:
          serviceImpl.getPost((com.kotlang.social.GetPostRequest) request,
              (io.grpc.stub.StreamObserver<com.kotlang.social.UserPostProto>) responseObserver);
          break;
        case METHODID_GET_BOOKMARKS:
          serviceImpl.getBookmarks((com.kotlang.social.GetBookmarksRequest) request,
              (io.grpc.stub.StreamObserver<com.kotlang.social.FeedResponse>) responseObserver);
          break;
        case METHODID_GET_TAGS:
          serviceImpl.getTags((com.kotlang.social.GetTagsRequest) request,
              (io.grpc.stub.StreamObserver<com.kotlang.social.TagListResponse>) responseObserver);
          break;
        case METHODID_PARSE_POST:
          serviceImpl.parsePost((com.kotlang.social.UserPostRequest) request,
              (io.grpc.stub.StreamObserver<com.kotlang.social.UserPostRequest>) responseObserver);
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
        case METHODID_UPLOAD_POST_MEDIA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadPostMedia(
              (io.grpc.stub.StreamObserver<com.kotlang.social.UploadPostMediaResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserPostGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreatePostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getGetFeedMethod())
              .addMethod(getGetMediaUploadUrlMethod())
              .addMethod(getGetPostMethod())
              .addMethod(getGetBookmarksMethod())
              .addMethod(getGetTagsMethod())
              .addMethod(getUploadPostMediaMethod())
              .addMethod(getParsePostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
