(ns net.minecraft.world.BossInfo$Overlay
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world BossInfo$Overlay]))

(def PROGRESS
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Overlay"
  BossInfo$Overlay/PROGRESS)

(def NOTCHED_6
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Overlay"
  BossInfo$Overlay/NOTCHED_6)

(def NOTCHED_10
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Overlay"
  BossInfo$Overlay/NOTCHED_10)

(def NOTCHED_12
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Overlay"
  BossInfo$Overlay/NOTCHED_12)

(def NOTCHED_20
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Overlay"
  BossInfo$Overlay/NOTCHED_20)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BossInfo.Overlay c : BossInfo.Overlay.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.BossInfo$Overlay[]`"
  ([]
    (BossInfo$Overlay/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.BossInfo$Overlay`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.BossInfo$Overlay [^java.lang.String name]
    (BossInfo$Overlay/valueOf name)))

