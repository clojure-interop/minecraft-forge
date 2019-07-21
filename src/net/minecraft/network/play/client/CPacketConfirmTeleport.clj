(ns net.minecraft.network.play.client.CPacketConfirmTeleport
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketConfirmTeleport]))

(defn ->c-packet-confirm-teleport
  "Constructor.

  teleport-id-in - `int`"
  (^CPacketConfirmTeleport [^Integer teleport-id-in]
    (new CPacketConfirmTeleport teleport-id-in))
  (^CPacketConfirmTeleport []
    (new CPacketConfirmTeleport )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketConfirmTeleport this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketConfirmTeleport this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketConfirmTeleport this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-teleport-id
  "returns: `int`"
  (^Integer [^CPacketConfirmTeleport this]
    (-> this (.getTeleportId))))

