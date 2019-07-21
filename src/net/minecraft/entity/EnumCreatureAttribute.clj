(ns net.minecraft.entity.EnumCreatureAttribute
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EnumCreatureAttribute]))

(def UNDEFINED
  "Enum Constant.

  type: net.minecraft.entity.EnumCreatureAttribute"
  EnumCreatureAttribute/UNDEFINED)

(def UNDEAD
  "Enum Constant.

  type: net.minecraft.entity.EnumCreatureAttribute"
  EnumCreatureAttribute/UNDEAD)

(def ARTHROPOD
  "Enum Constant.

  type: net.minecraft.entity.EnumCreatureAttribute"
  EnumCreatureAttribute/ARTHROPOD)

(def ILLAGER
  "Enum Constant.

  type: net.minecraft.entity.EnumCreatureAttribute"
  EnumCreatureAttribute/ILLAGER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumCreatureAttribute c : EnumCreatureAttribute.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.EnumCreatureAttribute[]`"
  ([]
    (EnumCreatureAttribute/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.EnumCreatureAttribute`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.EnumCreatureAttribute [^java.lang.String name]
    (EnumCreatureAttribute/valueOf name)))

