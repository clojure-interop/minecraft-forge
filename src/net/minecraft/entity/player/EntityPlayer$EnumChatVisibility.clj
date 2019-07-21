(ns net.minecraft.entity.player.EntityPlayer$EnumChatVisibility
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.player EntityPlayer$EnumChatVisibility]))

(def FULL
  "Enum Constant.

  type: net.minecraft.entity.player.EntityPlayer$EnumChatVisibility"
  EntityPlayer$EnumChatVisibility/FULL)

(def SYSTEM
  "Enum Constant.

  type: net.minecraft.entity.player.EntityPlayer$EnumChatVisibility"
  EntityPlayer$EnumChatVisibility/SYSTEM)

(def HIDDEN
  "Enum Constant.

  type: net.minecraft.entity.player.EntityPlayer$EnumChatVisibility"
  EntityPlayer$EnumChatVisibility/HIDDEN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityPlayer.EnumChatVisibility c : EntityPlayer.EnumChatVisibility.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[]`"
  ([]
    (EntityPlayer$EnumChatVisibility/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.player.EntityPlayer$EnumChatVisibility`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.player.EntityPlayer$EnumChatVisibility [^java.lang.String name]
    (EntityPlayer$EnumChatVisibility/valueOf name)))

(defn *get-enum-chat-visibility
  "id - `int`

  returns: `net.minecraft.entity.player.EntityPlayer$EnumChatVisibility`"
  (^net.minecraft.entity.player.EntityPlayer$EnumChatVisibility [^Integer id]
    (EntityPlayer$EnumChatVisibility/getEnumChatVisibility id)))

(defn get-chat-visibility
  "returns: `int`"
  (^Integer [^EntityPlayer$EnumChatVisibility this]
    (-> this (.getChatVisibility))))

(defn get-resource-key
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityPlayer$EnumChatVisibility this]
    (-> this (.getResourceKey))))

