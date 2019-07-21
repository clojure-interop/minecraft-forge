(ns net.minecraft.network.play.server.SPacketCombatEvent$Event
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketCombatEvent$Event]))

(def ENTER_COMBAT
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketCombatEvent$Event"
  SPacketCombatEvent$Event/ENTER_COMBAT)

(def END_COMBAT
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketCombatEvent$Event"
  SPacketCombatEvent$Event/END_COMBAT)

(def ENTITY_DIED
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketCombatEvent$Event"
  SPacketCombatEvent$Event/ENTITY_DIED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SPacketCombatEvent.Event c : SPacketCombatEvent.Event.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.server.SPacketCombatEvent$Event[]`"
  ([]
    (SPacketCombatEvent$Event/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.server.SPacketCombatEvent$Event`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.server.SPacketCombatEvent$Event [^java.lang.String name]
    (SPacketCombatEvent$Event/valueOf name)))

