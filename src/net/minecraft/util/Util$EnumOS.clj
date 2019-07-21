(ns net.minecraft.util.Util$EnumOS
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util Util$EnumOS]))

(def LINUX
  "Enum Constant.

  type: net.minecraft.util.Util$EnumOS"
  Util$EnumOS/LINUX)

(def SOLARIS
  "Enum Constant.

  type: net.minecraft.util.Util$EnumOS"
  Util$EnumOS/SOLARIS)

(def WINDOWS
  "Enum Constant.

  type: net.minecraft.util.Util$EnumOS"
  Util$EnumOS/WINDOWS)

(def OSX
  "Enum Constant.

  type: net.minecraft.util.Util$EnumOS"
  Util$EnumOS/OSX)

(def UNKNOWN
  "Enum Constant.

  type: net.minecraft.util.Util$EnumOS"
  Util$EnumOS/UNKNOWN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Util.EnumOS c : Util.EnumOS.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.Util$EnumOS[]`"
  ([]
    (Util$EnumOS/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.Util$EnumOS`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.Util$EnumOS [^java.lang.String name]
    (Util$EnumOS/valueOf name)))

