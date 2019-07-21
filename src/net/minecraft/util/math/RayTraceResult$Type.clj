(ns net.minecraft.util.math.RayTraceResult$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math RayTraceResult$Type]))

(def MISS
  "Enum Constant.

  type: net.minecraft.util.math.RayTraceResult$Type"
  RayTraceResult$Type/MISS)

(def BLOCK
  "Enum Constant.

  type: net.minecraft.util.math.RayTraceResult$Type"
  RayTraceResult$Type/BLOCK)

(def ENTITY
  "Enum Constant.

  type: net.minecraft.util.math.RayTraceResult$Type"
  RayTraceResult$Type/ENTITY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (RayTraceResult.Type c : RayTraceResult.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.math.RayTraceResult$Type[]`"
  ([]
    (RayTraceResult$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.math.RayTraceResult$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.math.RayTraceResult$Type [^java.lang.String name]
    (RayTraceResult$Type/valueOf name)))

