// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

package com.google.cloud.texttospeech.v1beta1;

/**
 * <pre>
 * The message returned to the client by the `SynthesizeSpeech` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse}
 */
public  final class SynthesizeSpeechResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse)
    SynthesizeSpeechResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SynthesizeSpeechResponse.newBuilder() to construct.
  private SynthesizeSpeechResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SynthesizeSpeechResponse() {
    audioContent_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SynthesizeSpeechResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            audioContent_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.class, com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.Builder.class);
  }

  public static final int AUDIO_CONTENT_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString audioContent_;
  /**
   * <pre>
   * The audio data bytes encoded as specified in the request, including the
   * header (For LINEAR16 audio, we include the WAV header). Note: as
   * with all bytes fields, protobuffers use a pure binary representation,
   * whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes audio_content = 1;</code>
   */
  public com.google.protobuf.ByteString getAudioContent() {
    return audioContent_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!audioContent_.isEmpty()) {
      output.writeBytes(1, audioContent_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!audioContent_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, audioContent_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse other = (com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse) obj;

    boolean result = true;
    result = result && getAudioContent()
        .equals(other.getAudioContent());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AUDIO_CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getAudioContent().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * The message returned to the client by the `SynthesizeSpeech` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse)
      com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.class, com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      audioContent_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_descriptor;
    }

    public com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.getDefaultInstance();
    }

    public com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse build() {
      com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse buildPartial() {
      com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse result = new com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse(this);
      result.audioContent_ = audioContent_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse) {
        return mergeFrom((com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse other) {
      if (other == com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.getDefaultInstance()) return this;
      if (other.getAudioContent() != com.google.protobuf.ByteString.EMPTY) {
        setAudioContent(other.getAudioContent());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString audioContent_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The audio data bytes encoded as specified in the request, including the
     * header (For LINEAR16 audio, we include the WAV header). Note: as
     * with all bytes fields, protobuffers use a pure binary representation,
     * whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes audio_content = 1;</code>
     */
    public com.google.protobuf.ByteString getAudioContent() {
      return audioContent_;
    }
    /**
     * <pre>
     * The audio data bytes encoded as specified in the request, including the
     * header (For LINEAR16 audio, we include the WAV header). Note: as
     * with all bytes fields, protobuffers use a pure binary representation,
     * whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes audio_content = 1;</code>
     */
    public Builder setAudioContent(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      audioContent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The audio data bytes encoded as specified in the request, including the
     * header (For LINEAR16 audio, we include the WAV header). Note: as
     * with all bytes fields, protobuffers use a pure binary representation,
     * whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes audio_content = 1;</code>
     */
    public Builder clearAudioContent() {
      
      audioContent_ = getDefaultInstance().getAudioContent();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse)
  private static final com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse();
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SynthesizeSpeechResponse>
      PARSER = new com.google.protobuf.AbstractParser<SynthesizeSpeechResponse>() {
    public SynthesizeSpeechResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SynthesizeSpeechResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SynthesizeSpeechResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SynthesizeSpeechResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
