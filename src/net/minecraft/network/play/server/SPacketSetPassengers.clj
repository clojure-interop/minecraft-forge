(ns net.minecraft.network.play.server.SPacketSetPassengers
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSetPassengers]))

(defn ->s-packet-set-passengers
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`"
  (^SPacketSetPassengers [^net.minecraft.entity.Entity entity-in]
    (new SPacketSetPassengers entity-in))
  (^SPacketSetPassengers []
    (new SPacketSetPassengers )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSetPassengers this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSetPassengers this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSetPassengers this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-passenger-ids
  "returns: `int[]`"
  ([^SPacketSetPassengers this]
    (-> this (.getPassengerIds))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketSetPassengers this]
    (-> this (.getEntityId))))

