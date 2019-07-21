(ns net.minecraft.network.play.client.CPacketConfirmTransaction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketConfirmTransaction]))

(defn ->c-packet-confirm-transaction
  "Constructor.

  window-id-in - `int`
  uid-in - `short`
  accepted-in - `boolean`"
  (^CPacketConfirmTransaction [^Integer window-id-in ^Short uid-in ^Boolean accepted-in]
    (new CPacketConfirmTransaction window-id-in uid-in accepted-in))
  (^CPacketConfirmTransaction []
    (new CPacketConfirmTransaction )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketConfirmTransaction this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketConfirmTransaction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketConfirmTransaction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-window-id
  "returns: `int`"
  (^Integer [^CPacketConfirmTransaction this]
    (-> this (.getWindowId))))

(defn get-uid
  "returns: `short`"
  (^Short [^CPacketConfirmTransaction this]
    (-> this (.getUid))))

