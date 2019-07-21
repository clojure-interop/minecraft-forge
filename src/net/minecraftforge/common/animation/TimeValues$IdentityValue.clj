(ns net.minecraftforge.common.animation.TimeValues$IdentityValue
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation TimeValues$IdentityValue]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.common.animation.TimeValues$IdentityValue"
  TimeValues$IdentityValue/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TimeValues.IdentityValue c : TimeValues.IdentityValue.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.animation.TimeValues$IdentityValue[]`"
  ([]
    (TimeValues$IdentityValue/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.animation.TimeValues$IdentityValue`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.animation.TimeValues$IdentityValue [^java.lang.String name]
    (TimeValues$IdentityValue/valueOf name)))

(defn apply
  "input - `float`

  returns: `float`"
  (^Float [^TimeValues$IdentityValue this ^Float input]
    (-> this (.apply input))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TimeValues$IdentityValue this]
    (-> this (.getName))))

