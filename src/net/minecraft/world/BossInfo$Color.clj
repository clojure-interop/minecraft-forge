(ns net.minecraft.world.BossInfo$Color
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world BossInfo$Color]))

(def PINK
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Color"
  BossInfo$Color/PINK)

(def BLUE
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Color"
  BossInfo$Color/BLUE)

(def RED
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Color"
  BossInfo$Color/RED)

(def GREEN
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Color"
  BossInfo$Color/GREEN)

(def YELLOW
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Color"
  BossInfo$Color/YELLOW)

(def PURPLE
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Color"
  BossInfo$Color/PURPLE)

(def WHITE
  "Enum Constant.

  type: net.minecraft.world.BossInfo$Color"
  BossInfo$Color/WHITE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BossInfo.Color c : BossInfo.Color.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.BossInfo$Color[]`"
  ([]
    (BossInfo$Color/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.BossInfo$Color`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.BossInfo$Color [^java.lang.String name]
    (BossInfo$Color/valueOf name)))

