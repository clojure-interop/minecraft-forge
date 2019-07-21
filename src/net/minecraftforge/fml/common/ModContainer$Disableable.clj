(ns net.minecraftforge.fml.common.ModContainer$Disableable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ModContainer$Disableable]))

(def YES
  "Enum Constant.

  type: net.minecraftforge.fml.common.ModContainer$Disableable"
  ModContainer$Disableable/YES)

(def RESTART
  "Enum Constant.

  type: net.minecraftforge.fml.common.ModContainer$Disableable"
  ModContainer$Disableable/RESTART)

(def NEVER
  "Enum Constant.

  type: net.minecraftforge.fml.common.ModContainer$Disableable"
  ModContainer$Disableable/NEVER)

(def DEPENDENCIES
  "Enum Constant.

  type: net.minecraftforge.fml.common.ModContainer$Disableable"
  ModContainer$Disableable/DEPENDENCIES)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ModContainer.Disableable c : ModContainer.Disableable.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.ModContainer$Disableable[]`"
  ([]
    (ModContainer$Disableable/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.ModContainer$Disableable`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.ModContainer$Disableable [^java.lang.String name]
    (ModContainer$Disableable/valueOf name)))

