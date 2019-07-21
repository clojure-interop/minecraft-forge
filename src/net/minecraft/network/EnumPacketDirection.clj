(ns net.minecraft.network.EnumPacketDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network EnumPacketDirection]))

(def SERVERBOUND
  "Enum Constant.

  type: net.minecraft.network.EnumPacketDirection"
  EnumPacketDirection/SERVERBOUND)

(def CLIENTBOUND
  "Enum Constant.

  type: net.minecraft.network.EnumPacketDirection"
  EnumPacketDirection/CLIENTBOUND)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumPacketDirection c : EnumPacketDirection.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.EnumPacketDirection[]`"
  ([]
    (EnumPacketDirection/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.EnumPacketDirection`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.EnumPacketDirection [^java.lang.String name]
    (EnumPacketDirection/valueOf name)))

