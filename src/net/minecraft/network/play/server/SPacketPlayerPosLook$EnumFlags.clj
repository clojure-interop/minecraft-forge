(ns net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketPlayerPosLook$EnumFlags]))

(def X
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags"
  SPacketPlayerPosLook$EnumFlags/X)

(def Y
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags"
  SPacketPlayerPosLook$EnumFlags/Y)

(def Z
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags"
  SPacketPlayerPosLook$EnumFlags/Z)

(def Y_ROT
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags"
  SPacketPlayerPosLook$EnumFlags/Y_ROT)

(def X_ROT
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags"
  SPacketPlayerPosLook$EnumFlags/X_ROT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SPacketPlayerPosLook.EnumFlags c : SPacketPlayerPosLook.EnumFlags.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags[]`"
  ([]
    (SPacketPlayerPosLook$EnumFlags/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags [^java.lang.String name]
    (SPacketPlayerPosLook$EnumFlags/valueOf name)))

(defn *unpack
  "flags - `int`

  returns: `java.util.Set<net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags>`"
  (^java.util.Set [^Integer flags]
    (SPacketPlayerPosLook$EnumFlags/unpack flags)))

(defn *pack
  "flags - `java.util.Set`

  returns: `int`"
  (^Integer [^java.util.Set flags]
    (SPacketPlayerPosLook$EnumFlags/pack flags)))

