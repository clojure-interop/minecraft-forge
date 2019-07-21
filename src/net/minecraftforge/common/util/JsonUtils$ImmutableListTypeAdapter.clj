(ns net.minecraftforge.common.util.JsonUtils$ImmutableListTypeAdapter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util JsonUtils$ImmutableListTypeAdapter]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.common.util.JsonUtils$ImmutableListTypeAdapter"
  JsonUtils$ImmutableListTypeAdapter/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (JsonUtils.ImmutableListTypeAdapter c : JsonUtils.ImmutableListTypeAdapter.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.util.JsonUtils$ImmutableListTypeAdapter[]`"
  ([]
    (JsonUtils$ImmutableListTypeAdapter/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.util.JsonUtils$ImmutableListTypeAdapter`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.util.JsonUtils$ImmutableListTypeAdapter [^java.lang.String name]
    (JsonUtils$ImmutableListTypeAdapter/valueOf name)))

(defn deserialize
  "json - `com.google.gson.JsonElement`
  type - `java.lang.reflect.Type`
  context - `com.google.gson.JsonDeserializationContext`

  returns: `com.google.common.collect.ImmutableList<?>`

  throws: com.google.gson.JsonParseException"
  (^com.google.common.collect.ImmutableList [^JsonUtils$ImmutableListTypeAdapter this ^com.google.gson.JsonElement json ^java.lang.reflect.Type type ^com.google.gson.JsonDeserializationContext context]
    (-> this (.deserialize json type context))))

(defn serialize
  "src - `com.google.common.collect.ImmutableList`
  type - `java.lang.reflect.Type`
  context - `com.google.gson.JsonSerializationContext`

  returns: `com.google.gson.JsonElement`"
  (^com.google.gson.JsonElement [^JsonUtils$ImmutableListTypeAdapter this ^com.google.common.collect.ImmutableList src ^java.lang.reflect.Type type ^com.google.gson.JsonSerializationContext context]
    (-> this (.serialize src type context))))

