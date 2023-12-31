// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: social.proto

package com.kotlang.social;

public interface UserPostRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:social.UserPostRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   *can be markup like html containing images
   *Question markup in case of QnA_QUESTION
   *Answer markup in case of QnA_ANSWER
   *Just markup in case FEED_POST
   * </pre>
   *
   * <code>string post = 1;</code>
   * @return The post.
   */
  java.lang.String getPost();
  /**
   * <pre>
   *can be markup like html containing images
   *Question markup in case of QnA_QUESTION
   *Answer markup in case of QnA_ANSWER
   *Just markup in case FEED_POST
   * </pre>
   *
   * <code>string post = 1;</code>
   * @return The bytes for post.
   */
  com.google.protobuf.ByteString
      getPostBytes();

  /**
   * <code>repeated string tags = 2;</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 2;</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 2;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 2;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   *in case of QnA_ANSWER use this field to refer to questionId
   *to reply/comment on a post use original postId as referencePost
   * </pre>
   *
   * <code>string referencePost = 3;</code>
   * @return The referencePost.
   */
  java.lang.String getReferencePost();
  /**
   * <pre>
   *in case of QnA_ANSWER use this field to refer to questionId
   *to reply/comment on a post use original postId as referencePost
   * </pre>
   *
   * <code>string referencePost = 3;</code>
   * @return The bytes for referencePost.
   */
  com.google.protobuf.ByteString
      getReferencePostBytes();

  /**
   * <code>string title = 4;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 4;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * List of media urls uploaded via UploadPostMedia API.
   * </pre>
   *
   * <code>repeated .social.MediaUrl mediaUrls = 5;</code>
   */
  java.util.List<com.kotlang.social.MediaUrl> 
      getMediaUrlsList();
  /**
   * <pre>
   * List of media urls uploaded via UploadPostMedia API.
   * </pre>
   *
   * <code>repeated .social.MediaUrl mediaUrls = 5;</code>
   */
  com.kotlang.social.MediaUrl getMediaUrls(int index);
  /**
   * <pre>
   * List of media urls uploaded via UploadPostMedia API.
   * </pre>
   *
   * <code>repeated .social.MediaUrl mediaUrls = 5;</code>
   */
  int getMediaUrlsCount();

  /**
   * <pre>
   * Populated by backend by parsing the webpage urls in post = 1;
   * </pre>
   *
   * <code>repeated .social.WebPreview webPreviews = 7;</code>
   */
  java.util.List<com.kotlang.social.WebPreview> 
      getWebPreviewsList();
  /**
   * <pre>
   * Populated by backend by parsing the webpage urls in post = 1;
   * </pre>
   *
   * <code>repeated .social.WebPreview webPreviews = 7;</code>
   */
  com.kotlang.social.WebPreview getWebPreviews(int index);
  /**
   * <pre>
   * Populated by backend by parsing the webpage urls in post = 1;
   * </pre>
   *
   * <code>repeated .social.WebPreview webPreviews = 7;</code>
   */
  int getWebPreviewsCount();

  /**
   * <pre>
   * For answer or comment on a post use postType as QnA_ANSWER.
   * </pre>
   *
   * <code>.social.UserPostRequest.PostType postType = 6;</code>
   * @return The enum numeric value on the wire for postType.
   */
  int getPostTypeValue();
  /**
   * <pre>
   * For answer or comment on a post use postType as QnA_ANSWER.
   * </pre>
   *
   * <code>.social.UserPostRequest.PostType postType = 6;</code>
   * @return The postType.
   */
  com.kotlang.social.UserPostRequest.PostType getPostType();
}
