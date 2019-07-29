// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/phone.proto

package com.akaxin.proto.core;

public final class PhoneProto {
  private PhoneProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   *手机验证码类型
   * </pre>
   *
   * Protobuf enum {@code core.VCType}
   */
  public enum VCType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *统一的验证码
     * </pre>
     *
     * <code>UNIFIED = 0;</code>
     */
    UNIFIED(0),
    /**
     * <pre>
     *手机号同步登陆使用的验证码
     * </pre>
     *
     * <code>PHONE_LOGIN = 1;</code>
     */
    PHONE_LOGIN(1),
    /**
     * <pre>
     *用户实名使用的验证码
     * </pre>
     *
     * <code>PHONE_REALNAME = 2;</code>
     */
    PHONE_REALNAME(2),
    /**
     * <pre>
     *通过手机号实名注册平台
     * </pre>
     *
     * <code>PHONE_REGISTER = 3;</code>
     */
    PHONE_REGISTER(3),
    /**
     * <pre>
     *匿名登陆实名站点，需平台手机注册
     * </pre>
     *
     * <code>PHONE_REGISTER_FOR_SITE = 4;</code>
     */
    PHONE_REGISTER_FOR_SITE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *统一的验证码
     * </pre>
     *
     * <code>UNIFIED = 0;</code>
     */
    public static final int UNIFIED_VALUE = 0;
    /**
     * <pre>
     *手机号同步登陆使用的验证码
     * </pre>
     *
     * <code>PHONE_LOGIN = 1;</code>
     */
    public static final int PHONE_LOGIN_VALUE = 1;
    /**
     * <pre>
     *用户实名使用的验证码
     * </pre>
     *
     * <code>PHONE_REALNAME = 2;</code>
     */
    public static final int PHONE_REALNAME_VALUE = 2;
    /**
     * <pre>
     *通过手机号实名注册平台
     * </pre>
     *
     * <code>PHONE_REGISTER = 3;</code>
     */
    public static final int PHONE_REGISTER_VALUE = 3;
    /**
     * <pre>
     *匿名登陆实名站点，需平台手机注册
     * </pre>
     *
     * <code>PHONE_REGISTER_FOR_SITE = 4;</code>
     */
    public static final int PHONE_REGISTER_FOR_SITE_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static VCType valueOf(int value) {
      return forNumber(value);
    }

    public static VCType forNumber(int value) {
      switch (value) {
        case 0: return UNIFIED;
        case 1: return PHONE_LOGIN;
        case 2: return PHONE_REALNAME;
        case 3: return PHONE_REGISTER;
        case 4: return PHONE_REGISTER_FOR_SITE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VCType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VCType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VCType>() {
            public VCType findValueByNumber(int number) {
              return VCType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.akaxin.proto.core.PhoneProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final VCType[] VALUES = values();

    public static VCType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private VCType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:core.VCType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020core/phone.proto\022\004core*k\n\006VCType\022\013\n\007UN" +
      "IFIED\020\000\022\017\n\013PHONE_LOGIN\020\001\022\022\n\016PHONE_REALNA" +
      "ME\020\002\022\022\n\016PHONE_REGISTER\020\003\022\033\n\027PHONE_REGIST" +
      "ER_FOR_SITE\020\004B#\n\025com.akaxin.proto.coreB\n" +
      "PhoneProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
