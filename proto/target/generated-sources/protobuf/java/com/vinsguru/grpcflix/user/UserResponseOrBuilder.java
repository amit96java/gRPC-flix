// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user-service.proto

package com.vinsguru.grpcflix.user;

public interface UserResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string login_id = 1;</code>
   * @return The loginId.
   */
  java.lang.String getLoginId();
  /**
   * <code>string login_id = 1;</code>
   * @return The bytes for loginId.
   */
  com.google.protobuf.ByteString
      getLoginIdBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.common.Genre genre = 3;</code>
   * @return The enum numeric value on the wire for genre.
   */
  int getGenreValue();
  /**
   * <code>.common.Genre genre = 3;</code>
   * @return The genre.
   */
  com.vinsguru.grpcflix.common.Genre getGenre();
}
