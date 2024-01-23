// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user-service.proto

package com.vinsguru.grpcflix.user;

/**
 * Protobuf type {@code UserGenreUpdateRequest}
 */
public final class UserGenreUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UserGenreUpdateRequest)
    UserGenreUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserGenreUpdateRequest.newBuilder() to construct.
  private UserGenreUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserGenreUpdateRequest() {
    loginId_ = "";
    genre_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserGenreUpdateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.vinsguru.grpcflix.user.UserServiceOuterClass.internal_static_UserGenreUpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.vinsguru.grpcflix.user.UserServiceOuterClass.internal_static_UserGenreUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.vinsguru.grpcflix.user.UserGenreUpdateRequest.class, com.vinsguru.grpcflix.user.UserGenreUpdateRequest.Builder.class);
  }

  public static final int LOGIN_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object loginId_ = "";
  /**
   * <code>string login_id = 1;</code>
   * @return The loginId.
   */
  @java.lang.Override
  public java.lang.String getLoginId() {
    java.lang.Object ref = loginId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      loginId_ = s;
      return s;
    }
  }
  /**
   * <code>string login_id = 1;</code>
   * @return The bytes for loginId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLoginIdBytes() {
    java.lang.Object ref = loginId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      loginId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENRE_FIELD_NUMBER = 2;
  private int genre_ = 0;
  /**
   * <code>.common.Genre genre = 2;</code>
   * @return The enum numeric value on the wire for genre.
   */
  @java.lang.Override public int getGenreValue() {
    return genre_;
  }
  /**
   * <code>.common.Genre genre = 2;</code>
   * @return The genre.
   */
  @java.lang.Override public com.vinsguru.grpcflix.common.Genre getGenre() {
    com.vinsguru.grpcflix.common.Genre result = com.vinsguru.grpcflix.common.Genre.forNumber(genre_);
    return result == null ? com.vinsguru.grpcflix.common.Genre.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(loginId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, loginId_);
    }
    if (genre_ != com.vinsguru.grpcflix.common.Genre.DRAMA.getNumber()) {
      output.writeEnum(2, genre_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(loginId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, loginId_);
    }
    if (genre_ != com.vinsguru.grpcflix.common.Genre.DRAMA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, genre_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.vinsguru.grpcflix.user.UserGenreUpdateRequest)) {
      return super.equals(obj);
    }
    com.vinsguru.grpcflix.user.UserGenreUpdateRequest other = (com.vinsguru.grpcflix.user.UserGenreUpdateRequest) obj;

    if (!getLoginId()
        .equals(other.getLoginId())) return false;
    if (genre_ != other.genre_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LOGIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLoginId().hashCode();
    hash = (37 * hash) + GENRE_FIELD_NUMBER;
    hash = (53 * hash) + genre_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest parseFrom(
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
  public static Builder newBuilder(com.vinsguru.grpcflix.user.UserGenreUpdateRequest prototype) {
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
   * Protobuf type {@code UserGenreUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserGenreUpdateRequest)
      com.vinsguru.grpcflix.user.UserGenreUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.vinsguru.grpcflix.user.UserServiceOuterClass.internal_static_UserGenreUpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.vinsguru.grpcflix.user.UserServiceOuterClass.internal_static_UserGenreUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.vinsguru.grpcflix.user.UserGenreUpdateRequest.class, com.vinsguru.grpcflix.user.UserGenreUpdateRequest.Builder.class);
    }

    // Construct using com.vinsguru.grpcflix.user.UserGenreUpdateRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      loginId_ = "";
      genre_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.vinsguru.grpcflix.user.UserServiceOuterClass.internal_static_UserGenreUpdateRequest_descriptor;
    }

    @java.lang.Override
    public com.vinsguru.grpcflix.user.UserGenreUpdateRequest getDefaultInstanceForType() {
      return com.vinsguru.grpcflix.user.UserGenreUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.vinsguru.grpcflix.user.UserGenreUpdateRequest build() {
      com.vinsguru.grpcflix.user.UserGenreUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.vinsguru.grpcflix.user.UserGenreUpdateRequest buildPartial() {
      com.vinsguru.grpcflix.user.UserGenreUpdateRequest result = new com.vinsguru.grpcflix.user.UserGenreUpdateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.vinsguru.grpcflix.user.UserGenreUpdateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.loginId_ = loginId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.genre_ = genre_;
      }
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
      if (other instanceof com.vinsguru.grpcflix.user.UserGenreUpdateRequest) {
        return mergeFrom((com.vinsguru.grpcflix.user.UserGenreUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.vinsguru.grpcflix.user.UserGenreUpdateRequest other) {
      if (other == com.vinsguru.grpcflix.user.UserGenreUpdateRequest.getDefaultInstance()) return this;
      if (!other.getLoginId().isEmpty()) {
        loginId_ = other.loginId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.genre_ != 0) {
        setGenreValue(other.getGenreValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              loginId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              genre_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object loginId_ = "";
    /**
     * <code>string login_id = 1;</code>
     * @return The loginId.
     */
    public java.lang.String getLoginId() {
      java.lang.Object ref = loginId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        loginId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string login_id = 1;</code>
     * @return The bytes for loginId.
     */
    public com.google.protobuf.ByteString
        getLoginIdBytes() {
      java.lang.Object ref = loginId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        loginId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string login_id = 1;</code>
     * @param value The loginId to set.
     * @return This builder for chaining.
     */
    public Builder setLoginId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      loginId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string login_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoginId() {
      loginId_ = getDefaultInstance().getLoginId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string login_id = 1;</code>
     * @param value The bytes for loginId to set.
     * @return This builder for chaining.
     */
    public Builder setLoginIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      loginId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int genre_ = 0;
    /**
     * <code>.common.Genre genre = 2;</code>
     * @return The enum numeric value on the wire for genre.
     */
    @java.lang.Override public int getGenreValue() {
      return genre_;
    }
    /**
     * <code>.common.Genre genre = 2;</code>
     * @param value The enum numeric value on the wire for genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenreValue(int value) {
      genre_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.common.Genre genre = 2;</code>
     * @return The genre.
     */
    @java.lang.Override
    public com.vinsguru.grpcflix.common.Genre getGenre() {
      com.vinsguru.grpcflix.common.Genre result = com.vinsguru.grpcflix.common.Genre.forNumber(genre_);
      return result == null ? com.vinsguru.grpcflix.common.Genre.UNRECOGNIZED : result;
    }
    /**
     * <code>.common.Genre genre = 2;</code>
     * @param value The genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenre(com.vinsguru.grpcflix.common.Genre value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      genre_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.common.Genre genre = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGenre() {
      bitField0_ = (bitField0_ & ~0x00000002);
      genre_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:UserGenreUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:UserGenreUpdateRequest)
  private static final com.vinsguru.grpcflix.user.UserGenreUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.vinsguru.grpcflix.user.UserGenreUpdateRequest();
  }

  public static com.vinsguru.grpcflix.user.UserGenreUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserGenreUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UserGenreUpdateRequest>() {
    @java.lang.Override
    public UserGenreUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UserGenreUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserGenreUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vinsguru.grpcflix.user.UserGenreUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
