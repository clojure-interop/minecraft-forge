(ns net.minecraftforge.common.config.Property$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.config Property$Type]))

(def STRING
  "Enum Constant.

  type: net.minecraftforge.common.config.Property$Type"
  Property$Type/STRING)

(def INTEGER
  "Enum Constant.

  type: net.minecraftforge.common.config.Property$Type"
  Property$Type/INTEGER)

(def BOOLEAN
  "Enum Constant.

  type: net.minecraftforge.common.config.Property$Type"
  Property$Type/BOOLEAN)

(def DOUBLE
  "Enum Constant.

  type: net.minecraftforge.common.config.Property$Type"
  Property$Type/DOUBLE)

(def COLOR
  "Enum Constant.

  type: net.minecraftforge.common.config.Property$Type"
  Property$Type/COLOR)

(def MOD_ID
  "Enum Constant.

  type: net.minecraftforge.common.config.Property$Type"
  Property$Type/MOD_ID)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Property.Type c : Property.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.config.Property$Type[]`"
  ([]
    (Property$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.config.Property$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.config.Property$Type [^java.lang.String name]
    (Property$Type/valueOf name)))

(defn *try-parse
  "id - `char`

  returns: `net.minecraftforge.common.config.Property$Type`"
  (^net.minecraftforge.common.config.Property$Type [^Character id]
    (Property$Type/tryParse id)))

(defn get-id
  "returns: `char`"
  (^Character [^Property$Type this]
    (-> this (.getID))))

