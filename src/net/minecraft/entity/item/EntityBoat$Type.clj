(ns net.minecraft.entity.item.EntityBoat$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityBoat$Type]))

(def OAK
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Type"
  EntityBoat$Type/OAK)

(def SPRUCE
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Type"
  EntityBoat$Type/SPRUCE)

(def BIRCH
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Type"
  EntityBoat$Type/BIRCH)

(def JUNGLE
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Type"
  EntityBoat$Type/JUNGLE)

(def ACACIA
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Type"
  EntityBoat$Type/ACACIA)

(def DARK_OAK
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Type"
  EntityBoat$Type/DARK_OAK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityBoat.Type c : EntityBoat.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.item.EntityBoat$Type[]`"
  ([]
    (EntityBoat$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.item.EntityBoat$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.item.EntityBoat$Type [^java.lang.String name]
    (EntityBoat$Type/valueOf name)))

(defn *by-id
  "id - `int`

  returns: `net.minecraft.entity.item.EntityBoat$Type`"
  (^net.minecraft.entity.item.EntityBoat$Type [^Integer id]
    (EntityBoat$Type/byId id)))

(defn *get-type-from-string
  "name-in - `java.lang.String`

  returns: `net.minecraft.entity.item.EntityBoat$Type`"
  (^net.minecraft.entity.item.EntityBoat$Type [^java.lang.String name-in]
    (EntityBoat$Type/getTypeFromString name-in)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityBoat$Type this]
    (-> this (.getName))))

(defn get-metadata
  "returns: `int`"
  (^Integer [^EntityBoat$Type this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityBoat$Type this]
    (-> this (.toString))))

