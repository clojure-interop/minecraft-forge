(ns net.minecraft.network.play.server.SPacketHeldItemChange
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketHeldItemChange]))

(defn ->s-packet-held-item-change
  "Constructor.

  hotbar-index-in - `int`"
  (^SPacketHeldItemChange [^Integer hotbar-index-in]
    (new SPacketHeldItemChange hotbar-index-in))
  (^SPacketHeldItemChange []
    (new SPacketHeldItemChange )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketHeldItemChange this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketHeldItemChange this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketHeldItemChange this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-held-item-hotbar-index
  "returns: `int`"
  (^Integer [^SPacketHeldItemChange this]
    (-> this (.getHeldItemHotbarIndex))))

