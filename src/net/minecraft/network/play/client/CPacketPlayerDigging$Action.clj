(ns net.minecraft.network.play.client.CPacketPlayerDigging$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketPlayerDigging$Action]))

(def START_DESTROY_BLOCK
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketPlayerDigging$Action"
  CPacketPlayerDigging$Action/START_DESTROY_BLOCK)

(def ABORT_DESTROY_BLOCK
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketPlayerDigging$Action"
  CPacketPlayerDigging$Action/ABORT_DESTROY_BLOCK)

(def STOP_DESTROY_BLOCK
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketPlayerDigging$Action"
  CPacketPlayerDigging$Action/STOP_DESTROY_BLOCK)

(def DROP_ALL_ITEMS
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketPlayerDigging$Action"
  CPacketPlayerDigging$Action/DROP_ALL_ITEMS)

(def DROP_ITEM
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketPlayerDigging$Action"
  CPacketPlayerDigging$Action/DROP_ITEM)

(def RELEASE_USE_ITEM
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketPlayerDigging$Action"
  CPacketPlayerDigging$Action/RELEASE_USE_ITEM)

(def SWAP_HELD_ITEMS
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketPlayerDigging$Action"
  CPacketPlayerDigging$Action/SWAP_HELD_ITEMS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CPacketPlayerDigging.Action c : CPacketPlayerDigging.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.client.CPacketPlayerDigging$Action[]`"
  ([]
    (CPacketPlayerDigging$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.client.CPacketPlayerDigging$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.client.CPacketPlayerDigging$Action [^java.lang.String name]
    (CPacketPlayerDigging$Action/valueOf name)))

