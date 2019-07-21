(ns net.minecraft.network.play.client.CPacketEntityAction$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketEntityAction$Action]))

(def START_SNEAKING
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketEntityAction$Action"
  CPacketEntityAction$Action/START_SNEAKING)

(def STOP_SNEAKING
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketEntityAction$Action"
  CPacketEntityAction$Action/STOP_SNEAKING)

(def STOP_SLEEPING
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketEntityAction$Action"
  CPacketEntityAction$Action/STOP_SLEEPING)

(def START_SPRINTING
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketEntityAction$Action"
  CPacketEntityAction$Action/START_SPRINTING)

(def STOP_SPRINTING
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketEntityAction$Action"
  CPacketEntityAction$Action/STOP_SPRINTING)

(def START_RIDING_JUMP
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketEntityAction$Action"
  CPacketEntityAction$Action/START_RIDING_JUMP)

(def STOP_RIDING_JUMP
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketEntityAction$Action"
  CPacketEntityAction$Action/STOP_RIDING_JUMP)

(def OPEN_INVENTORY
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketEntityAction$Action"
  CPacketEntityAction$Action/OPEN_INVENTORY)

(def START_FALL_FLYING
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketEntityAction$Action"
  CPacketEntityAction$Action/START_FALL_FLYING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CPacketEntityAction.Action c : CPacketEntityAction.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.client.CPacketEntityAction$Action[]`"
  ([]
    (CPacketEntityAction$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.client.CPacketEntityAction$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.client.CPacketEntityAction$Action [^java.lang.String name]
    (CPacketEntityAction$Action/valueOf name)))

