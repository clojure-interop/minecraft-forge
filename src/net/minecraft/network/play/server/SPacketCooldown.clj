(ns net.minecraft.network.play.server.SPacketCooldown
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketCooldown]))

(defn ->s-packet-cooldown
  "Constructor.

  item-in - `net.minecraft.item.Item`
  ticks-in - `int`"
  (^SPacketCooldown [^net.minecraft.item.Item item-in ^Integer ticks-in]
    (new SPacketCooldown item-in ticks-in))
  (^SPacketCooldown []
    (new SPacketCooldown )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCooldown this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCooldown this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketCooldown this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-item
  "returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^SPacketCooldown this]
    (-> this (.getItem))))

(defn get-ticks
  "returns: `int`"
  (^Integer [^SPacketCooldown this]
    (-> this (.getTicks))))

