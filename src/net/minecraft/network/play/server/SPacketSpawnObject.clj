(ns net.minecraft.network.play.server.SPacketSpawnObject
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSpawnObject]))

(defn ->s-packet-spawn-object
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`
  type-in - `int`
  data-in - `int`
  pos - `net.minecraft.util.math.BlockPos`"
  (^SPacketSpawnObject [^net.minecraft.entity.Entity entity-in ^Integer type-in ^Integer data-in ^net.minecraft.util.math.BlockPos pos]
    (new SPacketSpawnObject entity-in type-in data-in pos))
  (^SPacketSpawnObject [^net.minecraft.entity.Entity entity-in ^Integer type-in ^Integer data-in]
    (new SPacketSpawnObject entity-in type-in data-in))
  (^SPacketSpawnObject [^net.minecraft.entity.Entity entity-in ^Integer type-in]
    (new SPacketSpawnObject entity-in type-in))
  (^SPacketSpawnObject []
    (new SPacketSpawnObject )))

(defn get-yaw
  "returns: `int`"
  (^Integer [^SPacketSpawnObject this]
    (-> this (.getYaw))))

(defn get-speed-y
  "returns: `int`"
  (^Integer [^SPacketSpawnObject this]
    (-> this (.getSpeedY))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnObject this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn set-data
  "data-in - `int`"
  ([^SPacketSpawnObject this ^Integer data-in]
    (-> this (.setData data-in))))

(defn get-speed-z
  "returns: `int`"
  (^Integer [^SPacketSpawnObject this]
    (-> this (.getSpeedZ))))

(defn get-data
  "returns: `int`"
  (^Integer [^SPacketSpawnObject this]
    (-> this (.getData))))

(defn get-speed-x
  "returns: `int`"
  (^Integer [^SPacketSpawnObject this]
    (-> this (.getSpeedX))))

(defn get-type
  "returns: `int`"
  (^Integer [^SPacketSpawnObject this]
    (-> this (.getType))))

(defn set-speed-z
  "new-speed-z - `int`"
  ([^SPacketSpawnObject this ^Integer new-speed-z]
    (-> this (.setSpeedZ new-speed-z))))

(defn get-pitch
  "returns: `int`"
  (^Integer [^SPacketSpawnObject this]
    (-> this (.getPitch))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketSpawnObject this]
    (-> this (.getZ))))

(defn set-speed-y
  "new-speed-y - `int`"
  ([^SPacketSpawnObject this ^Integer new-speed-y]
    (-> this (.setSpeedY new-speed-y))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketSpawnObject this]
    (-> this (.getY))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSpawnObject this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn set-speed-x
  "new-speed-x - `int`"
  ([^SPacketSpawnObject this ^Integer new-speed-x]
    (-> this (.setSpeedX new-speed-x))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketSpawnObject this]
    (-> this (.getX))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnObject this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-unique-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^SPacketSpawnObject this]
    (-> this (.getUniqueId))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketSpawnObject this]
    (-> this (.getEntityID))))

