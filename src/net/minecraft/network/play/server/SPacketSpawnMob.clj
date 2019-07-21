(ns net.minecraft.network.play.server.SPacketSpawnMob
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSpawnMob]))

(defn ->s-packet-spawn-mob
  "Constructor.

  entity-in - `net.minecraft.entity.EntityLivingBase`"
  (^SPacketSpawnMob [^net.minecraft.entity.EntityLivingBase entity-in]
    (new SPacketSpawnMob entity-in))
  (^SPacketSpawnMob []
    (new SPacketSpawnMob )))

(defn get-yaw
  "returns: `byte`"
  (^Byte [^SPacketSpawnMob this]
    (-> this (.getYaw))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnMob this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-pitch
  "returns: `byte`"
  (^Byte [^SPacketSpawnMob this]
    (-> this (.getPitch))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketSpawnMob this]
    (-> this (.getZ))))

(defn get-entity-type
  "returns: `int`"
  (^Integer [^SPacketSpawnMob this]
    (-> this (.getEntityType))))

(defn get-data-manager-entries
  "returns: `java.util.List<net.minecraft.network.datasync.EntityDataManager$DataEntry<?>>`"
  (^java.util.List [^SPacketSpawnMob this]
    (-> this (.getDataManagerEntries))))

(defn get-head-pitch
  "returns: `byte`"
  (^Byte [^SPacketSpawnMob this]
    (-> this (.getHeadPitch))))

(defn get-velocity-x
  "returns: `int`"
  (^Integer [^SPacketSpawnMob this]
    (-> this (.getVelocityX))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketSpawnMob this]
    (-> this (.getY))))

(defn get-velocity-y
  "returns: `int`"
  (^Integer [^SPacketSpawnMob this]
    (-> this (.getVelocityY))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSpawnMob this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketSpawnMob this]
    (-> this (.getX))))

(defn get-velocity-z
  "returns: `int`"
  (^Integer [^SPacketSpawnMob this]
    (-> this (.getVelocityZ))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnMob this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-unique-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^SPacketSpawnMob this]
    (-> this (.getUniqueId))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketSpawnMob this]
    (-> this (.getEntityID))))

