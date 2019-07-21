(ns net.minecraft.network.play.client.CPacketVehicleMove
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketVehicleMove]))

(defn ->c-packet-vehicle-move
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`"
  (^CPacketVehicleMove [^net.minecraft.entity.Entity entity-in]
    (new CPacketVehicleMove entity-in))
  (^CPacketVehicleMove []
    (new CPacketVehicleMove )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketVehicleMove this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketVehicleMove this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketVehicleMove this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `double`"
  (^Double [^CPacketVehicleMove this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^CPacketVehicleMove this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^CPacketVehicleMove this]
    (-> this (.getZ))))

(defn get-yaw
  "returns: `float`"
  (^Float [^CPacketVehicleMove this]
    (-> this (.getYaw))))

(defn get-pitch
  "returns: `float`"
  (^Float [^CPacketVehicleMove this]
    (-> this (.getPitch))))

