(ns net.minecraftforge.server.permission.DefaultPermissionLevel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission DefaultPermissionLevel]))

(def ALL
  "Enum Constant.

  type: net.minecraftforge.server.permission.DefaultPermissionLevel"
  DefaultPermissionLevel/ALL)

(def OP
  "Enum Constant.

  type: net.minecraftforge.server.permission.DefaultPermissionLevel"
  DefaultPermissionLevel/OP)

(def NONE
  "Enum Constant.

  type: net.minecraftforge.server.permission.DefaultPermissionLevel"
  DefaultPermissionLevel/NONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DefaultPermissionLevel c : DefaultPermissionLevel.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.server.permission.DefaultPermissionLevel[]`"
  ([]
    (DefaultPermissionLevel/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.server.permission.DefaultPermissionLevel`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.server.permission.DefaultPermissionLevel [^java.lang.String name]
    (DefaultPermissionLevel/valueOf name)))

