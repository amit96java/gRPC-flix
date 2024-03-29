// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie-service.proto

package com.vinsguru.grpcflix.movie;

/**
 * Protobuf type {@code MovieSearchResponse}
 */
public final class MovieSearchResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MovieSearchResponse)
    MovieSearchResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MovieSearchResponse.newBuilder() to construct.
  private MovieSearchResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MovieSearchResponse() {
    movie_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MovieSearchResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.vinsguru.grpcflix.movie.MovieServiceOuterClass.internal_static_MovieSearchResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.vinsguru.grpcflix.movie.MovieServiceOuterClass.internal_static_MovieSearchResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.vinsguru.grpcflix.movie.MovieSearchResponse.class, com.vinsguru.grpcflix.movie.MovieSearchResponse.Builder.class);
  }

  public static final int MOVIE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.vinsguru.grpcflix.movie.MovieDto> movie_;
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.vinsguru.grpcflix.movie.MovieDto> getMovieList() {
    return movie_;
  }
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.vinsguru.grpcflix.movie.MovieDtoOrBuilder> 
      getMovieOrBuilderList() {
    return movie_;
  }
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public int getMovieCount() {
    return movie_.size();
  }
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public com.vinsguru.grpcflix.movie.MovieDto getMovie(int index) {
    return movie_.get(index);
  }
  /**
   * <code>repeated .MovieDto movie = 1;</code>
   */
  @java.lang.Override
  public com.vinsguru.grpcflix.movie.MovieDtoOrBuilder getMovieOrBuilder(
      int index) {
    return movie_.get(index);
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
    for (int i = 0; i < movie_.size(); i++) {
      output.writeMessage(1, movie_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < movie_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, movie_.get(i));
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
    if (!(obj instanceof com.vinsguru.grpcflix.movie.MovieSearchResponse)) {
      return super.equals(obj);
    }
    com.vinsguru.grpcflix.movie.MovieSearchResponse other = (com.vinsguru.grpcflix.movie.MovieSearchResponse) obj;

    if (!getMovieList()
        .equals(other.getMovieList())) return false;
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
    if (getMovieCount() > 0) {
      hash = (37 * hash) + MOVIE_FIELD_NUMBER;
      hash = (53 * hash) + getMovieList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vinsguru.grpcflix.movie.MovieSearchResponse parseFrom(
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
  public static Builder newBuilder(com.vinsguru.grpcflix.movie.MovieSearchResponse prototype) {
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
   * Protobuf type {@code MovieSearchResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MovieSearchResponse)
      com.vinsguru.grpcflix.movie.MovieSearchResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.vinsguru.grpcflix.movie.MovieServiceOuterClass.internal_static_MovieSearchResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.vinsguru.grpcflix.movie.MovieServiceOuterClass.internal_static_MovieSearchResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.vinsguru.grpcflix.movie.MovieSearchResponse.class, com.vinsguru.grpcflix.movie.MovieSearchResponse.Builder.class);
    }

    // Construct using com.vinsguru.grpcflix.movie.MovieSearchResponse.newBuilder()
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
      if (movieBuilder_ == null) {
        movie_ = java.util.Collections.emptyList();
      } else {
        movie_ = null;
        movieBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.vinsguru.grpcflix.movie.MovieServiceOuterClass.internal_static_MovieSearchResponse_descriptor;
    }

    @java.lang.Override
    public com.vinsguru.grpcflix.movie.MovieSearchResponse getDefaultInstanceForType() {
      return com.vinsguru.grpcflix.movie.MovieSearchResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.vinsguru.grpcflix.movie.MovieSearchResponse build() {
      com.vinsguru.grpcflix.movie.MovieSearchResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.vinsguru.grpcflix.movie.MovieSearchResponse buildPartial() {
      com.vinsguru.grpcflix.movie.MovieSearchResponse result = new com.vinsguru.grpcflix.movie.MovieSearchResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.vinsguru.grpcflix.movie.MovieSearchResponse result) {
      if (movieBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          movie_ = java.util.Collections.unmodifiableList(movie_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.movie_ = movie_;
      } else {
        result.movie_ = movieBuilder_.build();
      }
    }

    private void buildPartial0(com.vinsguru.grpcflix.movie.MovieSearchResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.vinsguru.grpcflix.movie.MovieSearchResponse) {
        return mergeFrom((com.vinsguru.grpcflix.movie.MovieSearchResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.vinsguru.grpcflix.movie.MovieSearchResponse other) {
      if (other == com.vinsguru.grpcflix.movie.MovieSearchResponse.getDefaultInstance()) return this;
      if (movieBuilder_ == null) {
        if (!other.movie_.isEmpty()) {
          if (movie_.isEmpty()) {
            movie_ = other.movie_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMovieIsMutable();
            movie_.addAll(other.movie_);
          }
          onChanged();
        }
      } else {
        if (!other.movie_.isEmpty()) {
          if (movieBuilder_.isEmpty()) {
            movieBuilder_.dispose();
            movieBuilder_ = null;
            movie_ = other.movie_;
            bitField0_ = (bitField0_ & ~0x00000001);
            movieBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMovieFieldBuilder() : null;
          } else {
            movieBuilder_.addAllMessages(other.movie_);
          }
        }
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
              com.vinsguru.grpcflix.movie.MovieDto m =
                  input.readMessage(
                      com.vinsguru.grpcflix.movie.MovieDto.parser(),
                      extensionRegistry);
              if (movieBuilder_ == null) {
                ensureMovieIsMutable();
                movie_.add(m);
              } else {
                movieBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.vinsguru.grpcflix.movie.MovieDto> movie_ =
      java.util.Collections.emptyList();
    private void ensureMovieIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        movie_ = new java.util.ArrayList<com.vinsguru.grpcflix.movie.MovieDto>(movie_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.vinsguru.grpcflix.movie.MovieDto, com.vinsguru.grpcflix.movie.MovieDto.Builder, com.vinsguru.grpcflix.movie.MovieDtoOrBuilder> movieBuilder_;

    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public java.util.List<com.vinsguru.grpcflix.movie.MovieDto> getMovieList() {
      if (movieBuilder_ == null) {
        return java.util.Collections.unmodifiableList(movie_);
      } else {
        return movieBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public int getMovieCount() {
      if (movieBuilder_ == null) {
        return movie_.size();
      } else {
        return movieBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.vinsguru.grpcflix.movie.MovieDto getMovie(int index) {
      if (movieBuilder_ == null) {
        return movie_.get(index);
      } else {
        return movieBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder setMovie(
        int index, com.vinsguru.grpcflix.movie.MovieDto value) {
      if (movieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMovieIsMutable();
        movie_.set(index, value);
        onChanged();
      } else {
        movieBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder setMovie(
        int index, com.vinsguru.grpcflix.movie.MovieDto.Builder builderForValue) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        movie_.set(index, builderForValue.build());
        onChanged();
      } else {
        movieBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addMovie(com.vinsguru.grpcflix.movie.MovieDto value) {
      if (movieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMovieIsMutable();
        movie_.add(value);
        onChanged();
      } else {
        movieBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addMovie(
        int index, com.vinsguru.grpcflix.movie.MovieDto value) {
      if (movieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMovieIsMutable();
        movie_.add(index, value);
        onChanged();
      } else {
        movieBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addMovie(
        com.vinsguru.grpcflix.movie.MovieDto.Builder builderForValue) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        movie_.add(builderForValue.build());
        onChanged();
      } else {
        movieBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addMovie(
        int index, com.vinsguru.grpcflix.movie.MovieDto.Builder builderForValue) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        movie_.add(index, builderForValue.build());
        onChanged();
      } else {
        movieBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder addAllMovie(
        java.lang.Iterable<? extends com.vinsguru.grpcflix.movie.MovieDto> values) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, movie_);
        onChanged();
      } else {
        movieBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder clearMovie() {
      if (movieBuilder_ == null) {
        movie_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        movieBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public Builder removeMovie(int index) {
      if (movieBuilder_ == null) {
        ensureMovieIsMutable();
        movie_.remove(index);
        onChanged();
      } else {
        movieBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.vinsguru.grpcflix.movie.MovieDto.Builder getMovieBuilder(
        int index) {
      return getMovieFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.vinsguru.grpcflix.movie.MovieDtoOrBuilder getMovieOrBuilder(
        int index) {
      if (movieBuilder_ == null) {
        return movie_.get(index);  } else {
        return movieBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public java.util.List<? extends com.vinsguru.grpcflix.movie.MovieDtoOrBuilder> 
         getMovieOrBuilderList() {
      if (movieBuilder_ != null) {
        return movieBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(movie_);
      }
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.vinsguru.grpcflix.movie.MovieDto.Builder addMovieBuilder() {
      return getMovieFieldBuilder().addBuilder(
          com.vinsguru.grpcflix.movie.MovieDto.getDefaultInstance());
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public com.vinsguru.grpcflix.movie.MovieDto.Builder addMovieBuilder(
        int index) {
      return getMovieFieldBuilder().addBuilder(
          index, com.vinsguru.grpcflix.movie.MovieDto.getDefaultInstance());
    }
    /**
     * <code>repeated .MovieDto movie = 1;</code>
     */
    public java.util.List<com.vinsguru.grpcflix.movie.MovieDto.Builder> 
         getMovieBuilderList() {
      return getMovieFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.vinsguru.grpcflix.movie.MovieDto, com.vinsguru.grpcflix.movie.MovieDto.Builder, com.vinsguru.grpcflix.movie.MovieDtoOrBuilder> 
        getMovieFieldBuilder() {
      if (movieBuilder_ == null) {
        movieBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.vinsguru.grpcflix.movie.MovieDto, com.vinsguru.grpcflix.movie.MovieDto.Builder, com.vinsguru.grpcflix.movie.MovieDtoOrBuilder>(
                movie_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        movie_ = null;
      }
      return movieBuilder_;
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


    // @@protoc_insertion_point(builder_scope:MovieSearchResponse)
  }

  // @@protoc_insertion_point(class_scope:MovieSearchResponse)
  private static final com.vinsguru.grpcflix.movie.MovieSearchResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.vinsguru.grpcflix.movie.MovieSearchResponse();
  }

  public static com.vinsguru.grpcflix.movie.MovieSearchResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MovieSearchResponse>
      PARSER = new com.google.protobuf.AbstractParser<MovieSearchResponse>() {
    @java.lang.Override
    public MovieSearchResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MovieSearchResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MovieSearchResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vinsguru.grpcflix.movie.MovieSearchResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

