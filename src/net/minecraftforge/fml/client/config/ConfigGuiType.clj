(ns net.minecraftforge.fml.client.config.ConfigGuiType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config ConfigGuiType]))

(def STRING
  "Enum Constant.

  type: net.minecraftforge.fml.client.config.ConfigGuiType"
  ConfigGuiType/STRING)

(def INTEGER
  "Enum Constant.

  type: net.minecraftforge.fml.client.config.ConfigGuiType"
  ConfigGuiType/INTEGER)

(def BOOLEAN
  "Enum Constant.

  type: net.minecraftforge.fml.client.config.ConfigGuiType"
  ConfigGuiType/BOOLEAN)

(def DOUBLE
  "Enum Constant.

  type: net.minecraftforge.fml.client.config.ConfigGuiType"
  ConfigGuiType/DOUBLE)

(def COLOR
  "Enum Constant.

  type: net.minecraftforge.fml.client.config.ConfigGuiType"
  ConfigGuiType/COLOR)

(def MOD_ID
  "Enum Constant.

  type: net.minecraftforge.fml.client.config.ConfigGuiType"
  ConfigGuiType/MOD_ID)

(def CONFIG_CATEGORY
  "Enum Constant.

  type: net.minecraftforge.fml.client.config.ConfigGuiType"
  ConfigGuiType/CONFIG_CATEGORY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ConfigGuiType c : ConfigGuiType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.client.config.ConfigGuiType[]`"
  ([]
    (ConfigGuiType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.client.config.ConfigGuiType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.client.config.ConfigGuiType [^java.lang.String name]
    (ConfigGuiType/valueOf name)))

