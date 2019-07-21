(ns net.minecraft.entity.player.EntityPlayer$SleepResult
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.player EntityPlayer$SleepResult]))

(def OK
  "Enum Constant.

  type: net.minecraft.entity.player.EntityPlayer$SleepResult"
  EntityPlayer$SleepResult/OK)

(def NOT_POSSIBLE_HERE
  "Enum Constant.

  type: net.minecraft.entity.player.EntityPlayer$SleepResult"
  EntityPlayer$SleepResult/NOT_POSSIBLE_HERE)

(def NOT_POSSIBLE_NOW
  "Enum Constant.

  type: net.minecraft.entity.player.EntityPlayer$SleepResult"
  EntityPlayer$SleepResult/NOT_POSSIBLE_NOW)

(def TOO_FAR_AWAY
  "Enum Constant.

  type: net.minecraft.entity.player.EntityPlayer$SleepResult"
  EntityPlayer$SleepResult/TOO_FAR_AWAY)

(def OTHER_PROBLEM
  "Enum Constant.

  type: net.minecraft.entity.player.EntityPlayer$SleepResult"
  EntityPlayer$SleepResult/OTHER_PROBLEM)

(def NOT_SAFE
  "Enum Constant.

  type: net.minecraft.entity.player.EntityPlayer$SleepResult"
  EntityPlayer$SleepResult/NOT_SAFE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityPlayer.SleepResult c : EntityPlayer.SleepResult.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.player.EntityPlayer$SleepResult[]`"
  ([]
    (EntityPlayer$SleepResult/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.player.EntityPlayer$SleepResult`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.player.EntityPlayer$SleepResult [^java.lang.String name]
    (EntityPlayer$SleepResult/valueOf name)))

