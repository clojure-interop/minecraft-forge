(ns net.minecraft.network.play.server.SPacketEntityAttach
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntityAttach]))

(defn ->s-packet-entity-attach
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`
  vehicle-in - `net.minecraft.entity.Entity`"
  (^SPacketEntityAttach [^net.minecraft.entity.Entity entity-in ^net.minecraft.entity.Entity vehicle-in]
    (new SPacketEntityAttach entity-in vehicle-in))
  (^SPacketEntityAttach []
    (new SPacketEntityAttach )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityAttach this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityAttach this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntityAttach this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketEntityAttach this]
    (-> this (.getEntityId))))

(defn get-vehicle-entity-id
  "returns: `int`"
  (^Integer [^SPacketEntityAttach this]
    (-> this (.getVehicleEntityId))))

