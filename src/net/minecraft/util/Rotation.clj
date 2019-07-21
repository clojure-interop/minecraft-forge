(ns net.minecraft.util.Rotation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util Rotation]))

(def NONE
  "Enum Constant.

  type: net.minecraft.util.Rotation"
  Rotation/NONE)

(def CLOCKWISE_90
  "Enum Constant.

  type: net.minecraft.util.Rotation"
  Rotation/CLOCKWISE_90)

(def CLOCKWISE_180
  "Enum Constant.

  type: net.minecraft.util.Rotation"
  Rotation/CLOCKWISE_180)

(def COUNTERCLOCKWISE_90
  "Enum Constant.

  type: net.minecraft.util.Rotation"
  Rotation/COUNTERCLOCKWISE_90)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Rotation c : Rotation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.Rotation[]`"
  ([]
    (Rotation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.Rotation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.Rotation [^java.lang.String name]
    (Rotation/valueOf name)))

(defn add
  "rotation - `net.minecraft.util.Rotation`

  returns: `net.minecraft.util.Rotation`"
  (^net.minecraft.util.Rotation [^Rotation this ^net.minecraft.util.Rotation rotation]
    (-> this (.add rotation))))

(defn rotate
  "p-185833-1 - `int`
  p-185833-2 - `int`

  returns: `int`"
  (^Integer [^Rotation this ^Integer p-185833-1 ^Integer p-185833-2]
    (-> this (.rotate p-185833-1 p-185833-2)))
  (^net.minecraft.util.EnumFacing [^Rotation this ^net.minecraft.util.EnumFacing facing]
    (-> this (.rotate facing))))

