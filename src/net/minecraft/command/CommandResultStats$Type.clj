(ns net.minecraft.command.CommandResultStats$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandResultStats$Type]))

(def SUCCESS_COUNT
  "Enum Constant.

  type: net.minecraft.command.CommandResultStats$Type"
  CommandResultStats$Type/SUCCESS_COUNT)

(def AFFECTED_BLOCKS
  "Enum Constant.

  type: net.minecraft.command.CommandResultStats$Type"
  CommandResultStats$Type/AFFECTED_BLOCKS)

(def AFFECTED_ENTITIES
  "Enum Constant.

  type: net.minecraft.command.CommandResultStats$Type"
  CommandResultStats$Type/AFFECTED_ENTITIES)

(def AFFECTED_ITEMS
  "Enum Constant.

  type: net.minecraft.command.CommandResultStats$Type"
  CommandResultStats$Type/AFFECTED_ITEMS)

(def QUERY_RESULT
  "Enum Constant.

  type: net.minecraft.command.CommandResultStats$Type"
  CommandResultStats$Type/QUERY_RESULT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CommandResultStats.Type c : CommandResultStats.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.command.CommandResultStats$Type[]`"
  ([]
    (CommandResultStats$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.command.CommandResultStats$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.command.CommandResultStats$Type [^java.lang.String name]
    (CommandResultStats$Type/valueOf name)))

(defn *get-type-names
  "returns: `java.lang.String[]`"
  ([]
    (CommandResultStats$Type/getTypeNames )))

(defn *get-type-by-name
  "name - `java.lang.String`

  returns: `net.minecraft.command.CommandResultStats$Type`"
  (^net.minecraft.command.CommandResultStats$Type [^java.lang.String name]
    (CommandResultStats$Type/getTypeByName name)))

(defn get-type-id
  "returns: `int`"
  (^Integer [^CommandResultStats$Type this]
    (-> this (.getTypeID))))

(defn get-type-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandResultStats$Type this]
    (-> this (.getTypeName))))

