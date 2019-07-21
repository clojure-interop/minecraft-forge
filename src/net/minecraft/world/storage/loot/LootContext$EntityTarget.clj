(ns net.minecraft.world.storage.loot.LootContext$EntityTarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootContext$EntityTarget]))

(def THIS
  "Enum Constant.

  type: net.minecraft.world.storage.loot.LootContext$EntityTarget"
  LootContext$EntityTarget/THIS)

(def KILLER
  "Enum Constant.

  type: net.minecraft.world.storage.loot.LootContext$EntityTarget"
  LootContext$EntityTarget/KILLER)

(def KILLER_PLAYER
  "Enum Constant.

  type: net.minecraft.world.storage.loot.LootContext$EntityTarget"
  LootContext$EntityTarget/KILLER_PLAYER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (LootContext.EntityTarget c : LootContext.EntityTarget.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.storage.loot.LootContext$EntityTarget[]`"
  ([]
    (LootContext$EntityTarget/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.storage.loot.LootContext$EntityTarget`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.storage.loot.LootContext$EntityTarget [^java.lang.String name]
    (LootContext$EntityTarget/valueOf name)))

(defn *from-string
  "type - `java.lang.String`

  returns: `net.minecraft.world.storage.loot.LootContext$EntityTarget`"
  (^net.minecraft.world.storage.loot.LootContext$EntityTarget [^java.lang.String type]
    (LootContext$EntityTarget/fromString type)))

