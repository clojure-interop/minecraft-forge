(ns net.minecraft.network.play.client.CPacketHeldItemChange
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketHeldItemChange]))

(defn ->c-packet-held-item-change
  "Constructor.

  slot-id-in - `int`"
  (^CPacketHeldItemChange [^Integer slot-id-in]
    (new CPacketHeldItemChange slot-id-in))
  (^CPacketHeldItemChange []
    (new CPacketHeldItemChange )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketHeldItemChange this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketHeldItemChange this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketHeldItemChange this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-slot-id
  "returns: `int`"
  (^Integer [^CPacketHeldItemChange this]
    (-> this (.getSlotId))))

