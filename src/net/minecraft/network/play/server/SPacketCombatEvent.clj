(ns net.minecraft.network.play.server.SPacketCombatEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketCombatEvent]))

(defn ->s-packet-combat-event
  "Constructor.

  tracker - `net.minecraft.util.CombatTracker`
  event-in - `net.minecraft.network.play.server.SPacketCombatEvent$Event`
  p-i-46932-3 - `boolean`"
  (^SPacketCombatEvent [^net.minecraft.util.CombatTracker tracker ^net.minecraft.network.play.server.SPacketCombatEvent$Event event-in ^Boolean p-i-46932-3]
    (new SPacketCombatEvent tracker event-in p-i-46932-3))
  (^SPacketCombatEvent [^net.minecraft.util.CombatTracker tracker ^net.minecraft.network.play.server.SPacketCombatEvent$Event event-in]
    (new SPacketCombatEvent tracker event-in))
  (^SPacketCombatEvent []
    (new SPacketCombatEvent )))

(defn event-type
  "Instance Field.

  type: net.minecraft.network.play.server.SPacketCombatEvent$Event"
  (^net.minecraft.network.play.server.SPacketCombatEvent$Event [^SPacketCombatEvent this]
    (-> this .-eventType)))

(defn player-id
  "Instance Field.

  type: int"
  (^Integer [^SPacketCombatEvent this]
    (-> this .-playerId)))

(defn entity-id
  "Instance Field.

  type: int"
  (^Integer [^SPacketCombatEvent this]
    (-> this .-entityId)))

(defn duration
  "Instance Field.

  type: int"
  (^Integer [^SPacketCombatEvent this]
    (-> this .-duration)))

(defn death-message
  "Instance Field.

  type: net.minecraft.util.text.ITextComponent"
  (^net.minecraft.util.text.ITextComponent [^SPacketCombatEvent this]
    (-> this .-deathMessage)))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCombatEvent this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCombatEvent this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketCombatEvent this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

