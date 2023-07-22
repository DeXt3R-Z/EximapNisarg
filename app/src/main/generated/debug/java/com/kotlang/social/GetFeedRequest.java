// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: social.proto

package com.kotlang.social;

/**
 * Protobuf type {@code social.GetFeedRequest}
 */
public  final class GetFeedRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetFeedRequest, GetFeedRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:social.GetFeedRequest)
    GetFeedRequestOrBuilder {
  private GetFeedRequest() {
    referencePost_ = "";
  }
  /**
   * Protobuf enum {@code social.GetFeedRequest.PostType}
   */
  public enum PostType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>FEED_POST = 0;</code>
     */
    FEED_POST(0),
    /**
     * <code>QnA_QUESTION = 1;</code>
     */
    QnA_QUESTION(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FEED_POST = 0;</code>
     */
    public static final int FEED_POST_VALUE = 0;
    /**
     * <code>QnA_QUESTION = 1;</code>
     */
    public static final int QnA_QUESTION_VALUE = 1;


    @java.lang.Override
    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PostType valueOf(int value) {
      return forNumber(value);
    }

    public static PostType forNumber(int value) {
      switch (value) {
        case 0: return FEED_POST;
        case 1: return QnA_QUESTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PostType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PostType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PostType>() {
            @java.lang.Override
            public PostType findValueByNumber(int number) {
              return PostType.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return PostTypeVerifier.INSTANCE;
    }

    private static final class PostTypeVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new PostTypeVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return PostType.forNumber(number) != null;
            }
          };

    private final int value;

    private PostType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:social.GetFeedRequest.PostType)
  }

  public static final int POSTTYPE_FIELD_NUMBER = 1;
  private int postType_;
  /**
   * <code>.social.GetFeedRequest.PostType postType = 1;</code>
   * @return The enum numeric value on the wire for postType.
   */
  @java.lang.Override
  public int getPostTypeValue() {
    return postType_;
  }
  /**
   * <code>.social.GetFeedRequest.PostType postType = 1;</code>
   * @return The postType.
   */
  @java.lang.Override
  public com.kotlang.social.GetFeedRequest.PostType getPostType() {
    com.kotlang.social.GetFeedRequest.PostType result = com.kotlang.social.GetFeedRequest.PostType.forNumber(postType_);
    return result == null ? com.kotlang.social.GetFeedRequest.PostType.UNRECOGNIZED : result;
  }
  /**
   * <code>.social.GetFeedRequest.PostType postType = 1;</code>
   * @param value The enum numeric value on the wire for postType to set.
   */
  private void setPostTypeValue(int value) {
      postType_ = value;
  }
  /**
   * <code>.social.GetFeedRequest.PostType postType = 1;</code>
   * @param value The postType to set.
   */
  private void setPostType(com.kotlang.social.GetFeedRequest.PostType value) {
    postType_ = value.getNumber();

  }
  /**
   * <code>.social.GetFeedRequest.PostType postType = 1;</code>
   */
  private void clearPostType() {

    postType_ = 0;
  }

  public static final int FILTERS_FIELD_NUMBER = 2;
  private com.kotlang.social.FeedFilters filters_;
  /**
   * <code>.social.FeedFilters filters = 2;</code>
   */
  @java.lang.Override
  public boolean hasFilters() {
    return filters_ != null;
  }
  /**
   * <code>.social.FeedFilters filters = 2;</code>
   */
  @java.lang.Override
  public com.kotlang.social.FeedFilters getFilters() {
    return filters_ == null ? com.kotlang.social.FeedFilters.getDefaultInstance() : filters_;
  }
  /**
   * <code>.social.FeedFilters filters = 2;</code>
   */
  private void setFilters(com.kotlang.social.FeedFilters value) {
    value.getClass();
  filters_ = value;

    }
  /**
   * <code>.social.FeedFilters filters = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeFilters(com.kotlang.social.FeedFilters value) {
    value.getClass();
  if (filters_ != null &&
        filters_ != com.kotlang.social.FeedFilters.getDefaultInstance()) {
      filters_ =
        com.kotlang.social.FeedFilters.newBuilder(filters_).mergeFrom(value).buildPartial();
    } else {
      filters_ = value;
    }

  }
  /**
   * <code>.social.FeedFilters filters = 2;</code>
   */
  private void clearFilters() {  filters_ = null;

  }

  public static final int REFERENCEPOST_FIELD_NUMBER = 5;
  private java.lang.String referencePost_;
  /**
   * <code>string referencePost = 5;</code>
   * @return The referencePost.
   */
  @java.lang.Override
  public java.lang.String getReferencePost() {
    return referencePost_;
  }
  /**
   * <code>string referencePost = 5;</code>
   * @return The bytes for referencePost.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReferencePostBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(referencePost_);
  }
  /**
   * <code>string referencePost = 5;</code>
   * @param value The referencePost to set.
   */
  private void setReferencePost(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    referencePost_ = value;
  }
  /**
   * <code>string referencePost = 5;</code>
   */
  private void clearReferencePost() {

    referencePost_ = getDefaultInstance().getReferencePost();
  }
  /**
   * <code>string referencePost = 5;</code>
   * @param value The bytes for referencePost to set.
   */
  private void setReferencePostBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    referencePost_ = value.toStringUtf8();

  }

  public static final int PAGESIZE_FIELD_NUMBER = 3;
  private int pageSize_;
  /**
   * <pre>
   *pagination
   *pageNumber starting from 0
   * </pre>
   *
   * <code>int32 pageSize = 3;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }
  /**
   * <pre>
   *pagination
   *pageNumber starting from 0
   * </pre>
   *
   * <code>int32 pageSize = 3;</code>
   * @param value The pageSize to set.
   */
  private void setPageSize(int value) {
    
    pageSize_ = value;
  }
  /**
   * <pre>
   *pagination
   *pageNumber starting from 0
   * </pre>
   *
   * <code>int32 pageSize = 3;</code>
   */
  private void clearPageSize() {

    pageSize_ = 0;
  }

  public static final int PAGENUMBER_FIELD_NUMBER = 4;
  private int pageNumber_;
  /**
   * <code>int32 pageNumber = 4;</code>
   * @return The pageNumber.
   */
  @java.lang.Override
  public int getPageNumber() {
    return pageNumber_;
  }
  /**
   * <code>int32 pageNumber = 4;</code>
   * @param value The pageNumber to set.
   */
  private void setPageNumber(int value) {
    
    pageNumber_ = value;
  }
  /**
   * <code>int32 pageNumber = 4;</code>
   */
  private void clearPageNumber() {

    pageNumber_ = 0;
  }

  public static com.kotlang.social.GetFeedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.kotlang.social.GetFeedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.kotlang.social.GetFeedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.kotlang.social.GetFeedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.kotlang.social.GetFeedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.kotlang.social.GetFeedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.kotlang.social.GetFeedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.kotlang.social.GetFeedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.kotlang.social.GetFeedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.kotlang.social.GetFeedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.kotlang.social.GetFeedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.kotlang.social.GetFeedRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.kotlang.social.GetFeedRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code social.GetFeedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.kotlang.social.GetFeedRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:social.GetFeedRequest)
      com.kotlang.social.GetFeedRequestOrBuilder {
    // Construct using com.kotlang.social.GetFeedRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.social.GetFeedRequest.PostType postType = 1;</code>
     * @return The enum numeric value on the wire for postType.
     */
    @java.lang.Override
    public int getPostTypeValue() {
      return instance.getPostTypeValue();
    }
    /**
     * <code>.social.GetFeedRequest.PostType postType = 1;</code>
     * @param value The postType to set.
     * @return This builder for chaining.
     */
    public Builder setPostTypeValue(int value) {
      copyOnWrite();
      instance.setPostTypeValue(value);
      return this;
    }
    /**
     * <code>.social.GetFeedRequest.PostType postType = 1;</code>
     * @return The postType.
     */
    @java.lang.Override
    public com.kotlang.social.GetFeedRequest.PostType getPostType() {
      return instance.getPostType();
    }
    /**
     * <code>.social.GetFeedRequest.PostType postType = 1;</code>
     * @param value The enum numeric value on the wire for postType to set.
     * @return This builder for chaining.
     */
    public Builder setPostType(com.kotlang.social.GetFeedRequest.PostType value) {
      copyOnWrite();
      instance.setPostType(value);
      return this;
    }
    /**
     * <code>.social.GetFeedRequest.PostType postType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPostType() {
      copyOnWrite();
      instance.clearPostType();
      return this;
    }

    /**
     * <code>.social.FeedFilters filters = 2;</code>
     */
    @java.lang.Override
    public boolean hasFilters() {
      return instance.hasFilters();
    }
    /**
     * <code>.social.FeedFilters filters = 2;</code>
     */
    @java.lang.Override
    public com.kotlang.social.FeedFilters getFilters() {
      return instance.getFilters();
    }
    /**
     * <code>.social.FeedFilters filters = 2;</code>
     */
    public Builder setFilters(com.kotlang.social.FeedFilters value) {
      copyOnWrite();
      instance.setFilters(value);
      return this;
      }
    /**
     * <code>.social.FeedFilters filters = 2;</code>
     */
    public Builder setFilters(
        com.kotlang.social.FeedFilters.Builder builderForValue) {
      copyOnWrite();
      instance.setFilters(builderForValue.build());
      return this;
    }
    /**
     * <code>.social.FeedFilters filters = 2;</code>
     */
    public Builder mergeFilters(com.kotlang.social.FeedFilters value) {
      copyOnWrite();
      instance.mergeFilters(value);
      return this;
    }
    /**
     * <code>.social.FeedFilters filters = 2;</code>
     */
    public Builder clearFilters() {  copyOnWrite();
      instance.clearFilters();
      return this;
    }

    /**
     * <code>string referencePost = 5;</code>
     * @return The referencePost.
     */
    @java.lang.Override
    public java.lang.String getReferencePost() {
      return instance.getReferencePost();
    }
    /**
     * <code>string referencePost = 5;</code>
     * @return The bytes for referencePost.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReferencePostBytes() {
      return instance.getReferencePostBytes();
    }
    /**
     * <code>string referencePost = 5;</code>
     * @param value The referencePost to set.
     * @return This builder for chaining.
     */
    public Builder setReferencePost(
        java.lang.String value) {
      copyOnWrite();
      instance.setReferencePost(value);
      return this;
    }
    /**
     * <code>string referencePost = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearReferencePost() {
      copyOnWrite();
      instance.clearReferencePost();
      return this;
    }
    /**
     * <code>string referencePost = 5;</code>
     * @param value The bytes for referencePost to set.
     * @return This builder for chaining.
     */
    public Builder setReferencePostBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setReferencePostBytes(value);
      return this;
    }

    /**
     * <pre>
     *pagination
     *pageNumber starting from 0
     * </pre>
     *
     * <code>int32 pageSize = 3;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return instance.getPageSize();
    }
    /**
     * <pre>
     *pagination
     *pageNumber starting from 0
     * </pre>
     *
     * <code>int32 pageSize = 3;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      copyOnWrite();
      instance.setPageSize(value);
      return this;
    }
    /**
     * <pre>
     *pagination
     *pageNumber starting from 0
     * </pre>
     *
     * <code>int32 pageSize = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      copyOnWrite();
      instance.clearPageSize();
      return this;
    }

    /**
     * <code>int32 pageNumber = 4;</code>
     * @return The pageNumber.
     */
    @java.lang.Override
    public int getPageNumber() {
      return instance.getPageNumber();
    }
    /**
     * <code>int32 pageNumber = 4;</code>
     * @param value The pageNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPageNumber(int value) {
      copyOnWrite();
      instance.setPageNumber(value);
      return this;
    }
    /**
     * <code>int32 pageNumber = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNumber() {
      copyOnWrite();
      instance.clearPageNumber();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:social.GetFeedRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.kotlang.social.GetFeedRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "postType_",
            "filters_",
            "pageSize_",
            "pageNumber_",
            "referencePost_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\t\u0003" +
              "\u0004\u0004\u0004\u0005\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.kotlang.social.GetFeedRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.kotlang.social.GetFeedRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.kotlang.social.GetFeedRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:social.GetFeedRequest)
  private static final com.kotlang.social.GetFeedRequest DEFAULT_INSTANCE;
  static {
    GetFeedRequest defaultInstance = new GetFeedRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetFeedRequest.class, defaultInstance);
  }

  public static com.kotlang.social.GetFeedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetFeedRequest> PARSER;

  public static com.google.protobuf.Parser<GetFeedRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

