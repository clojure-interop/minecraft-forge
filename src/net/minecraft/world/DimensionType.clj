(ns net.minecraft.world.DimensionType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world DimensionType]))

(def OVERWORLD
  "Enum Constant.

  type: net.minecraft.world.DimensionType"
  DimensionType/OVERWORLD)

(def NETHER
  "Enum Constant.

  type: net.minecraft.world.DimensionType"
  DimensionType/NETHER)

(def THE_END
  "Enum Constant.

  type: net.minecraft.world.DimensionType"
  DimensionType/THE_END)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DimensionType c : DimensionType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.DimensionType[]`"
  ([]
    (DimensionType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.DimensionType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.DimensionType [^java.lang.String name]
    (DimensionType/valueOf name)))

(defn *get-by-id
  "id - `int`

  returns: `net.minecraft.world.DimensionType`"
  (^net.minecraft.world.DimensionType [^Integer id]
    (DimensionType/getById id)))

(defn *register
  "name - `java.lang.String`
  suffix - `java.lang.String`
  id - `int`
  provider - `java.lang.Class`
  keep-loaded - `boolean`

  returns: `net.minecraft.world.DimensionType`"
  (^net.minecraft.world.DimensionType [^java.lang.String name ^java.lang.String suffix ^Integer id ^java.lang.Class provider ^Boolean keep-loaded]
    (DimensionType/register name suffix id provider keep-loaded)))

(defn get-id
  "returns: `int`"
  (^Integer [^DimensionType this]
    (-> this (.getId))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^DimensionType this]
    (-> this (.getName))))

(defn get-suffix
  "returns: `java.lang.String`"
  (^java.lang.String [^DimensionType this]
    (-> this (.getSuffix))))

(defn create-dimension
  "returns: `net.minecraft.world.WorldProvider`"
  (^net.minecraft.world.WorldProvider [^DimensionType this]
    (-> this (.createDimension))))

(defn should-load-spawn?
  "returns: `boolean`"
  (^Boolean [^DimensionType this]
    (-> this (.shouldLoadSpawn))))

(defn set-load-spawn
  "value - `boolean`

  returns: `net.minecraft.world.DimensionType`"
  (^net.minecraft.world.DimensionType [^DimensionType this ^Boolean value]
    (-> this (.setLoadSpawn value))))

