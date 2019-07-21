(ns net.minecraft.util.EnumFacing$Plane
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnumFacing$Plane]))

(def HORIZONTAL
  "Enum Constant.

  type: net.minecraft.util.EnumFacing$Plane"
  EnumFacing$Plane/HORIZONTAL)

(def VERTICAL
  "Enum Constant.

  type: net.minecraft.util.EnumFacing$Plane"
  EnumFacing$Plane/VERTICAL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumFacing.Plane c : EnumFacing.Plane.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.EnumFacing$Plane[]`"
  ([]
    (EnumFacing$Plane/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.EnumFacing$Plane`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.EnumFacing$Plane [^java.lang.String name]
    (EnumFacing$Plane/valueOf name)))

(defn facings
  "returns: `net.minecraft.util.EnumFacing[]`"
  ([^EnumFacing$Plane this]
    (-> this (.facings))))

(defn random
  "rand - `java.util.Random`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^EnumFacing$Plane this ^java.util.Random rand]
    (-> this (.random rand))))

(defn apply
  "p-apply-1 - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^EnumFacing$Plane this ^net.minecraft.util.EnumFacing p-apply-1]
    (-> this (.apply p-apply-1))))

(defn iterator
  "returns: `java.util.Iterator<net.minecraft.util.EnumFacing>`"
  (^java.util.Iterator [^EnumFacing$Plane this]
    (-> this (.iterator))))

