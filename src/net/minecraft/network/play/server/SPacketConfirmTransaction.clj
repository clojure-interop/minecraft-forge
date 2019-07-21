(ns net.minecraft.network.play.server.SPacketConfirmTransaction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketConfirmTransaction]))

(defn ->s-packet-confirm-transaction
  "Constructor.

  window-id-in - `int`
  action-number-in - `short`
  accepted-in - `boolean`"
  (^SPacketConfirmTransaction [^Integer window-id-in ^Short action-number-in ^Boolean accepted-in]
    (new SPacketConfirmTransaction window-id-in action-number-in accepted-in))
  (^SPacketConfirmTransaction []
    (new SPacketConfirmTransaction )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketConfirmTransaction this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketConfirmTransaction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketConfirmTransaction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-window-id
  "returns: `int`"
  (^Integer [^SPacketConfirmTransaction this]
    (-> this (.getWindowId))))

(defn get-action-number
  "returns: `short`"
  (^Short [^SPacketConfirmTransaction this]
    (-> this (.getActionNumber))))

(defn was-accepted
  "returns: `boolean`"
  (^Boolean [^SPacketConfirmTransaction this]
    (-> this (.wasAccepted))))

