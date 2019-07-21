(ns net.minecraft.network.play.client.CPacketSpectate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketSpectate]))

(defn ->c-packet-spectate
  "Constructor.

  unique-id-in - `java.util.UUID`"
  (^CPacketSpectate [^java.util.UUID unique-id-in]
    (new CPacketSpectate unique-id-in))
  (^CPacketSpectate []
    (new CPacketSpectate )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketSpectate this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketSpectate this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketSpectate this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-entity
  "world-in - `net.minecraft.world.WorldServer`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^CPacketSpectate this ^net.minecraft.world.WorldServer world-in]
    (-> this (.getEntity world-in))))

