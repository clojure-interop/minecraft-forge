(ns net.minecraft.entity.MoverType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity MoverType]))

(def SELF
  "Enum Constant.

  type: net.minecraft.entity.MoverType"
  MoverType/SELF)

(def PLAYER
  "Enum Constant.

  type: net.minecraft.entity.MoverType"
  MoverType/PLAYER)

(def PISTON
  "Enum Constant.

  type: net.minecraft.entity.MoverType"
  MoverType/PISTON)

(def SHULKER_BOX
  "Enum Constant.

  type: net.minecraft.entity.MoverType"
  MoverType/SHULKER_BOX)

(def SHULKER
  "Enum Constant.

  type: net.minecraft.entity.MoverType"
  MoverType/SHULKER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MoverType c : MoverType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.MoverType[]`"
  ([]
    (MoverType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.MoverType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.MoverType [^java.lang.String name]
    (MoverType/valueOf name)))

