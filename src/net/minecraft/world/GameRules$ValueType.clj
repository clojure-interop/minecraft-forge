(ns net.minecraft.world.GameRules$ValueType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world GameRules$ValueType]))

(def ANY_VALUE
  "Enum Constant.

  type: net.minecraft.world.GameRules$ValueType"
  GameRules$ValueType/ANY_VALUE)

(def BOOLEAN_VALUE
  "Enum Constant.

  type: net.minecraft.world.GameRules$ValueType"
  GameRules$ValueType/BOOLEAN_VALUE)

(def NUMERICAL_VALUE
  "Enum Constant.

  type: net.minecraft.world.GameRules$ValueType"
  GameRules$ValueType/NUMERICAL_VALUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GameRules.ValueType c : GameRules.ValueType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.GameRules$ValueType[]`"
  ([]
    (GameRules$ValueType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.GameRules$ValueType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.GameRules$ValueType [^java.lang.String name]
    (GameRules$ValueType/valueOf name)))

