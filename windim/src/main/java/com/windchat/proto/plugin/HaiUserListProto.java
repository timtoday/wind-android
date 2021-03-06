// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin/hai_user_list.proto

package com.windchat.proto.plugin;

public final class HaiUserListProto {
  private HaiUserListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface HaiUserListRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiUserListRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *分页：第几页
     * </pre>
     *
     * <code>optional int32 page_number = 1;</code>
     */
    int getPageNumber();

    /**
     * <pre>
     *分页：每页条数
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    int getPageSize();
  }
  /**
   * <pre>
   **
   *获取站点上用户
   *----
   *接口名
   *----
   * /hai/user/list
   *错误码
   *----
   *- success
   *- error.alert
   * </pre>
   *
   * Protobuf type {@code plugin.HaiUserListRequest}
   */
  public  static final class HaiUserListRequest extends
      com.google.protobuf.GeneratedMessageLite<
          HaiUserListRequest, HaiUserListRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiUserListRequest)
      HaiUserListRequestOrBuilder {
    private HaiUserListRequest() {
    }
    public static final int PAGE_NUMBER_FIELD_NUMBER = 1;
    private int pageNumber_;
    /**
     * <pre>
     *分页：第几页
     * </pre>
     *
     * <code>optional int32 page_number = 1;</code>
     */
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     * <pre>
     *分页：第几页
     * </pre>
     *
     * <code>optional int32 page_number = 1;</code>
     */
    private void setPageNumber(int value) {
      
      pageNumber_ = value;
    }
    /**
     * <pre>
     *分页：第几页
     * </pre>
     *
     * <code>optional int32 page_number = 1;</code>
     */
    private void clearPageNumber() {
      
      pageNumber_ = 0;
    }

    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    private int pageSize_;
    /**
     * <pre>
     *分页：每页条数
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     *分页：每页条数
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    private void setPageSize(int value) {
      
      pageSize_ = value;
    }
    /**
     * <pre>
     *分页：每页条数
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    private void clearPageSize() {
      
      pageSize_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (pageNumber_ != 0) {
        output.writeInt32(1, pageNumber_);
      }
      if (pageSize_ != 0) {
        output.writeInt32(2, pageSize_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (pageNumber_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, pageNumber_);
      }
      if (pageSize_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, pageSize_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiUserListRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiUserListRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiUserListRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiUserListRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiUserListRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiUserListRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiUserListRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiUserListRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiUserListRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiUserListRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiUserListRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     **
     *获取站点上用户
     *----
     *接口名
     *----
     * /hai/user/list
     *错误码
     *----
     *- success
     *- error.alert
     * </pre>
     *
     * Protobuf type {@code plugin.HaiUserListRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiUserListRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiUserListRequest)
        HaiUserListRequestOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiUserListProto.HaiUserListRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *分页：第几页
       * </pre>
       *
       * <code>optional int32 page_number = 1;</code>
       */
      public int getPageNumber() {
        return instance.getPageNumber();
      }
      /**
       * <pre>
       *分页：第几页
       * </pre>
       *
       * <code>optional int32 page_number = 1;</code>
       */
      public Builder setPageNumber(int value) {
        copyOnWrite();
        instance.setPageNumber(value);
        return this;
      }
      /**
       * <pre>
       *分页：第几页
       * </pre>
       *
       * <code>optional int32 page_number = 1;</code>
       */
      public Builder clearPageNumber() {
        copyOnWrite();
        instance.clearPageNumber();
        return this;
      }

      /**
       * <pre>
       *分页：每页条数
       * </pre>
       *
       * <code>optional int32 page_size = 2;</code>
       */
      public int getPageSize() {
        return instance.getPageSize();
      }
      /**
       * <pre>
       *分页：每页条数
       * </pre>
       *
       * <code>optional int32 page_size = 2;</code>
       */
      public Builder setPageSize(int value) {
        copyOnWrite();
        instance.setPageSize(value);
        return this;
      }
      /**
       * <pre>
       *分页：每页条数
       * </pre>
       *
       * <code>optional int32 page_size = 2;</code>
       */
      public Builder clearPageSize() {
        copyOnWrite();
        instance.clearPageSize();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiUserListRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiUserListRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          HaiUserListRequest other = (HaiUserListRequest) arg1;
          pageNumber_ = visitor.visitInt(pageNumber_ != 0, pageNumber_,
              other.pageNumber_ != 0, other.pageNumber_);
          pageSize_ = visitor.visitInt(pageSize_ != 0, pageSize_,
              other.pageSize_ != 0, other.pageSize_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 8: {

                  pageNumber_ = input.readInt32();
                  break;
                }
                case 16: {

                  pageSize_ = input.readInt32();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (HaiUserListRequest.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:plugin.HaiUserListRequest)
    private static final HaiUserListRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiUserListRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiUserListRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiUserListRequest> PARSER;

    public static com.google.protobuf.Parser<HaiUserListRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface HaiUserListResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiUserListResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    java.util.List<com.windchat.proto.core.UserProto.SimpleUserProfile>
        getUserProfileList();
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    com.windchat.proto.core.UserProto.SimpleUserProfile getUserProfile(int index);
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    int getUserProfileCount();

    /**
     * <code>optional int32 page_total_num = 2;</code>
     */
    int getPageTotalNum();
  }
  /**
   * Protobuf type {@code plugin.HaiUserListResponse}
   */
  public  static final class HaiUserListResponse extends
      com.google.protobuf.GeneratedMessageLite<
          HaiUserListResponse, HaiUserListResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiUserListResponse)
      HaiUserListResponseOrBuilder {
    private HaiUserListResponse() {
      userProfile_ = emptyProtobufList();
    }
    private int bitField0_;
    public static final int USER_PROFILE_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<com.windchat.proto.core.UserProto.SimpleUserProfile> userProfile_;
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    public java.util.List<com.windchat.proto.core.UserProto.SimpleUserProfile> getUserProfileList() {
      return userProfile_;
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    public java.util.List<? extends com.windchat.proto.core.UserProto.SimpleUserProfileOrBuilder>
        getUserProfileOrBuilderList() {
      return userProfile_;
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    public int getUserProfileCount() {
      return userProfile_.size();
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    public com.windchat.proto.core.UserProto.SimpleUserProfile getUserProfile(int index) {
      return userProfile_.get(index);
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    public com.windchat.proto.core.UserProto.SimpleUserProfileOrBuilder getUserProfileOrBuilder(
        int index) {
      return userProfile_.get(index);
    }
    private void ensureUserProfileIsMutable() {
      if (!userProfile_.isModifiable()) {
        userProfile_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(userProfile_);
       }
    }

    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    private void setUserProfile(
        int index, com.windchat.proto.core.UserProto.SimpleUserProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUserProfileIsMutable();
      userProfile_.set(index, value);
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    private void setUserProfile(
        int index, com.windchat.proto.core.UserProto.SimpleUserProfile.Builder builderForValue) {
      ensureUserProfileIsMutable();
      userProfile_.set(index, builderForValue.build());
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    private void addUserProfile(com.windchat.proto.core.UserProto.SimpleUserProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUserProfileIsMutable();
      userProfile_.add(value);
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    private void addUserProfile(
        int index, com.windchat.proto.core.UserProto.SimpleUserProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUserProfileIsMutable();
      userProfile_.add(index, value);
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    private void addUserProfile(
        com.windchat.proto.core.UserProto.SimpleUserProfile.Builder builderForValue) {
      ensureUserProfileIsMutable();
      userProfile_.add(builderForValue.build());
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    private void addUserProfile(
        int index, com.windchat.proto.core.UserProto.SimpleUserProfile.Builder builderForValue) {
      ensureUserProfileIsMutable();
      userProfile_.add(index, builderForValue.build());
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    private void addAllUserProfile(
        Iterable<? extends com.windchat.proto.core.UserProto.SimpleUserProfile> values) {
      ensureUserProfileIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, userProfile_);
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    private void clearUserProfile() {
      userProfile_ = emptyProtobufList();
    }
    /**
     * <pre>
     *查询的结果
     * </pre>
     *
     * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
     */
    private void removeUserProfile(int index) {
      ensureUserProfileIsMutable();
      userProfile_.remove(index);
    }

    public static final int PAGE_TOTAL_NUM_FIELD_NUMBER = 2;
    private int pageTotalNum_;
    /**
     * <code>optional int32 page_total_num = 2;</code>
     */
    public int getPageTotalNum() {
      return pageTotalNum_;
    }
    /**
     * <code>optional int32 page_total_num = 2;</code>
     */
    private void setPageTotalNum(int value) {

      pageTotalNum_ = value;
    }
    /**
     * <code>optional int32 page_total_num = 2;</code>
     */
    private void clearPageTotalNum() {

      pageTotalNum_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < userProfile_.size(); i++) {
        output.writeMessage(1, userProfile_.get(i));
      }
      if (pageTotalNum_ != 0) {
        output.writeInt32(2, pageTotalNum_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < userProfile_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, userProfile_.get(i));
      }
      if (pageTotalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, pageTotalNum_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiUserListResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiUserListResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiUserListResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiUserListResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiUserListResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiUserListResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiUserListResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiUserListResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiUserListResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiUserListResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiUserListResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code plugin.HaiUserListResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiUserListResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiUserListResponse)
        HaiUserListResponseOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiUserListProto.HaiUserListResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public java.util.List<com.windchat.proto.core.UserProto.SimpleUserProfile> getUserProfileList() {
        return java.util.Collections.unmodifiableList(
            instance.getUserProfileList());
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public int getUserProfileCount() {
        return instance.getUserProfileCount();
      }/**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public com.windchat.proto.core.UserProto.SimpleUserProfile getUserProfile(int index) {
        return instance.getUserProfile(index);
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public Builder setUserProfile(
          int index, com.windchat.proto.core.UserProto.SimpleUserProfile value) {
        copyOnWrite();
        instance.setUserProfile(index, value);
        return this;
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public Builder setUserProfile(
          int index, com.windchat.proto.core.UserProto.SimpleUserProfile.Builder builderForValue) {
        copyOnWrite();
        instance.setUserProfile(index, builderForValue);
        return this;
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public Builder addUserProfile(com.windchat.proto.core.UserProto.SimpleUserProfile value) {
        copyOnWrite();
        instance.addUserProfile(value);
        return this;
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public Builder addUserProfile(
          int index, com.windchat.proto.core.UserProto.SimpleUserProfile value) {
        copyOnWrite();
        instance.addUserProfile(index, value);
        return this;
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public Builder addUserProfile(
          com.windchat.proto.core.UserProto.SimpleUserProfile.Builder builderForValue) {
        copyOnWrite();
        instance.addUserProfile(builderForValue);
        return this;
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public Builder addUserProfile(
          int index, com.windchat.proto.core.UserProto.SimpleUserProfile.Builder builderForValue) {
        copyOnWrite();
        instance.addUserProfile(index, builderForValue);
        return this;
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public Builder addAllUserProfile(
          Iterable<? extends com.windchat.proto.core.UserProto.SimpleUserProfile> values) {
        copyOnWrite();
        instance.addAllUserProfile(values);
        return this;
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public Builder clearUserProfile() {
        copyOnWrite();
        instance.clearUserProfile();
        return this;
      }
      /**
       * <pre>
       *查询的结果
       * </pre>
       *
       * <code>repeated .core.SimpleUserProfile user_profile = 1;</code>
       */
      public Builder removeUserProfile(int index) {
        copyOnWrite();
        instance.removeUserProfile(index);
        return this;
      }

      /**
       * <code>optional int32 page_total_num = 2;</code>
       */
      public int getPageTotalNum() {
        return instance.getPageTotalNum();
      }
      /**
       * <code>optional int32 page_total_num = 2;</code>
       */
      public Builder setPageTotalNum(int value) {
        copyOnWrite();
        instance.setPageTotalNum(value);
        return this;
      }
      /**
       * <code>optional int32 page_total_num = 2;</code>
       */
      public Builder clearPageTotalNum() {
        copyOnWrite();
        instance.clearPageTotalNum();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiUserListResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiUserListResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          userProfile_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          HaiUserListResponse other = (HaiUserListResponse) arg1;
          userProfile_= visitor.visitList(userProfile_, other.userProfile_);
          pageTotalNum_ = visitor.visitInt(pageTotalNum_ != 0, pageTotalNum_,
              other.pageTotalNum_ != 0, other.pageTotalNum_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  if (!userProfile_.isModifiable()) {
                    userProfile_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(userProfile_);
                  }
                  userProfile_.add(
                      input.readMessage(com.windchat.proto.core.UserProto.SimpleUserProfile.parser(), extensionRegistry));
                  break;
                }
                case 16: {

                  pageTotalNum_ = input.readInt32();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (HaiUserListResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:plugin.HaiUserListResponse)
    private static final HaiUserListResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiUserListResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiUserListResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiUserListResponse> PARSER;

    public static com.google.protobuf.Parser<HaiUserListResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
