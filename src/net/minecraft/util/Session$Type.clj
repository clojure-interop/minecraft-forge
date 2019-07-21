(ns net.minecraft.util.Session$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util Session$Type]))

(def LEGACY
  "Enum Constant.

  type: net.minecraft.util.Session$Type"
  Session$Type/LEGACY)

(def MOJANG
  "Enum Constant.

  type: net.minecraft.util.Session$Type"
  Session$Type/MOJANG)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Session.Type c : Session.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.Session$Type[]`"
  ([]
    (Session$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.Session$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.Session$Type [^java.lang.String name]
    (Session$Type/valueOf name)))

(defn *set-session-type
  "session-type-in - `java.lang.String`

  returns: `net.minecraft.util.Session$Type`"
  (^net.minecraft.util.Session$Type [^java.lang.String session-type-in]
    (Session$Type/setSessionType session-type-in)))

