(ns net.minecraft.network.play.server.SPacketTitle$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketTitle$Type]))

(def TITLE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketTitle$Type"
  SPacketTitle$Type/TITLE)

(def SUBTITLE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketTitle$Type"
  SPacketTitle$Type/SUBTITLE)

(def ACTIONBAR
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketTitle$Type"
  SPacketTitle$Type/ACTIONBAR)

(def TIMES
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketTitle$Type"
  SPacketTitle$Type/TIMES)

(def CLEAR
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketTitle$Type"
  SPacketTitle$Type/CLEAR)

(def RESET
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketTitle$Type"
  SPacketTitle$Type/RESET)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SPacketTitle.Type c : SPacketTitle.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.server.SPacketTitle$Type[]`"
  ([]
    (SPacketTitle$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.server.SPacketTitle$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.server.SPacketTitle$Type [^java.lang.String name]
    (SPacketTitle$Type/valueOf name)))

(defn *by-name
  "name - `java.lang.String`

  returns: `net.minecraft.network.play.server.SPacketTitle$Type`"
  (^net.minecraft.network.play.server.SPacketTitle$Type [^java.lang.String name]
    (SPacketTitle$Type/byName name)))

(defn *get-names
  "returns: `java.lang.String[]`"
  ([]
    (SPacketTitle$Type/getNames )))

