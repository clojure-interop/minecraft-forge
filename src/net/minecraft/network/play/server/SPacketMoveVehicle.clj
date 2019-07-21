(ns net.minecraft.network.play.server.SPacketMoveVehicle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketMoveVehicle]))

(defn ->s-packet-move-vehicle
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`"
  (^SPacketMoveVehicle [^net.minecraft.entity.Entity entity-in]
    (new SPacketMoveVehicle entity-in))
  (^SPacketMoveVehicle []
    (new SPacketMoveVehicle )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketMoveVehicle this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketMoveVehicle this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketMoveVehicle this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketMoveVehicle this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketMoveVehicle this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketMoveVehicle this]
    (-> this (.getZ))))

(defn get-yaw
  "returns: `float`"
  (^Float [^SPacketMoveVehicle this]
    (-> this (.getYaw))))

(defn get-pitch
  "returns: `float`"
  (^Float [^SPacketMoveVehicle this]
    (-> this (.getPitch))))

