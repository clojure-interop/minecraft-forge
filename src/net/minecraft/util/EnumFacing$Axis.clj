(ns net.minecraft.util.EnumFacing$Axis
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnumFacing$Axis]))

(def X
  "Enum Constant.

  type: net.minecraft.util.EnumFacing$Axis"
  EnumFacing$Axis/X)

(def Y
  "Enum Constant.

  type: net.minecraft.util.EnumFacing$Axis"
  EnumFacing$Axis/Y)

(def Z
  "Enum Constant.

  type: net.minecraft.util.EnumFacing$Axis"
  EnumFacing$Axis/Z)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumFacing.Axis c : EnumFacing.Axis.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.EnumFacing$Axis[]`"
  ([]
    (EnumFacing$Axis/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.EnumFacing$Axis`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.EnumFacing$Axis [^java.lang.String name]
    (EnumFacing$Axis/valueOf name)))

(defn *by-name
  "name - `java.lang.String`

  returns: `net.minecraft.util.EnumFacing$Axis`"
  (^net.minecraft.util.EnumFacing$Axis [^java.lang.String name]
    (EnumFacing$Axis/byName name)))

(defn get-name-2
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumFacing$Axis this]
    (-> this (.getName2))))

(defn vertical?
  "returns: `boolean`"
  (^Boolean [^EnumFacing$Axis this]
    (-> this (.isVertical))))

(defn horizontal?
  "returns: `boolean`"
  (^Boolean [^EnumFacing$Axis this]
    (-> this (.isHorizontal))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumFacing$Axis this]
    (-> this (.toString))))

(defn apply
  "p-apply-1 - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^EnumFacing$Axis this ^net.minecraft.util.EnumFacing p-apply-1]
    (-> this (.apply p-apply-1))))

(defn get-plane
  "returns: `net.minecraft.util.EnumFacing$Plane`"
  (^net.minecraft.util.EnumFacing$Plane [^EnumFacing$Axis this]
    (-> this (.getPlane))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumFacing$Axis this]
    (-> this (.getName))))

