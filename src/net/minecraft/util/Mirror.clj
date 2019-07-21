(ns net.minecraft.util.Mirror
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util Mirror]))

(def NONE
  "Enum Constant.

  type: net.minecraft.util.Mirror"
  Mirror/NONE)

(def LEFT_RIGHT
  "Enum Constant.

  type: net.minecraft.util.Mirror"
  Mirror/LEFT_RIGHT)

(def FRONT_BACK
  "Enum Constant.

  type: net.minecraft.util.Mirror"
  Mirror/FRONT_BACK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Mirror c : Mirror.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.Mirror[]`"
  ([]
    (Mirror/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.Mirror`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.Mirror [^java.lang.String name]
    (Mirror/valueOf name)))

(defn mirror-rotation
  "rotation-in - `int`
  rotation-count - `int`

  returns: `int`"
  (^Integer [^Mirror this ^Integer rotation-in ^Integer rotation-count]
    (-> this (.mirrorRotation rotation-in rotation-count))))

(defn to-rotation
  "facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.util.Rotation`"
  (^net.minecraft.util.Rotation [^Mirror this ^net.minecraft.util.EnumFacing facing]
    (-> this (.toRotation facing))))

(defn mirror
  "facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Mirror this ^net.minecraft.util.EnumFacing facing]
    (-> this (.mirror facing))))

