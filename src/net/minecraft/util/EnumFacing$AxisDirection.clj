(ns net.minecraft.util.EnumFacing$AxisDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnumFacing$AxisDirection]))

(def POSITIVE
  "Enum Constant.

  type: net.minecraft.util.EnumFacing$AxisDirection"
  EnumFacing$AxisDirection/POSITIVE)

(def NEGATIVE
  "Enum Constant.

  type: net.minecraft.util.EnumFacing$AxisDirection"
  EnumFacing$AxisDirection/NEGATIVE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumFacing.AxisDirection c : EnumFacing.AxisDirection.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.EnumFacing$AxisDirection[]`"
  ([]
    (EnumFacing$AxisDirection/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.EnumFacing$AxisDirection`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.EnumFacing$AxisDirection [^java.lang.String name]
    (EnumFacing$AxisDirection/valueOf name)))

(defn get-offset
  "returns: `int`"
  (^Integer [^EnumFacing$AxisDirection this]
    (-> this (.getOffset))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumFacing$AxisDirection this]
    (-> this (.toString))))

