(ns net.minecraft.entity.item.EntityMinecart$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecart$Type]))

(def RIDEABLE
  "Enum Constant.

  type: net.minecraft.entity.item.EntityMinecart$Type"
  EntityMinecart$Type/RIDEABLE)

(def CHEST
  "Enum Constant.

  type: net.minecraft.entity.item.EntityMinecart$Type"
  EntityMinecart$Type/CHEST)

(def FURNACE
  "Enum Constant.

  type: net.minecraft.entity.item.EntityMinecart$Type"
  EntityMinecart$Type/FURNACE)

(def TNT
  "Enum Constant.

  type: net.minecraft.entity.item.EntityMinecart$Type"
  EntityMinecart$Type/TNT)

(def SPAWNER
  "Enum Constant.

  type: net.minecraft.entity.item.EntityMinecart$Type"
  EntityMinecart$Type/SPAWNER)

(def HOPPER
  "Enum Constant.

  type: net.minecraft.entity.item.EntityMinecart$Type"
  EntityMinecart$Type/HOPPER)

(def COMMAND_BLOCK
  "Enum Constant.

  type: net.minecraft.entity.item.EntityMinecart$Type"
  EntityMinecart$Type/COMMAND_BLOCK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityMinecart.Type c : EntityMinecart.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.item.EntityMinecart$Type[]`"
  ([]
    (EntityMinecart$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.item.EntityMinecart$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.item.EntityMinecart$Type [^java.lang.String name]
    (EntityMinecart$Type/valueOf name)))

(defn *get-by-id
  "id-in - `int`

  returns: `net.minecraft.entity.item.EntityMinecart$Type`"
  (^net.minecraft.entity.item.EntityMinecart$Type [^Integer id-in]
    (EntityMinecart$Type/getById id-in)))

(defn get-id
  "returns: `int`"
  (^Integer [^EntityMinecart$Type this]
    (-> this (.getId))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityMinecart$Type this]
    (-> this (.getName))))

