(ns net.minecraftforge.common.config.Config$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.config Config$Type]))

(def INSTANCE
  "Enum Constant.

  Loaded once, directly after mod construction. Before pre-init.
   This class must have static fields.

  type: net.minecraftforge.common.config.Config$Type"
  Config$Type/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Config.Type c : Config.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.config.Config$Type[]`"
  ([]
    (Config$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.config.Config$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.config.Config$Type [^java.lang.String name]
    (Config$Type/valueOf name)))

(defn static?
  "returns: `boolean`"
  (^Boolean [^Config$Type this]
    (-> this (.isStatic))))

