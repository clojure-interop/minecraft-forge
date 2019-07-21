(ns net.minecraft.network.play.server.SPacketSpawnPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSpawnPlayer]))

(defn ->s-packet-spawn-player
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`"
  (^SPacketSpawnPlayer [^net.minecraft.entity.player.EntityPlayer player]
    (new SPacketSpawnPlayer player))
  (^SPacketSpawnPlayer []
    (new SPacketSpawnPlayer )))

(defn get-yaw
  "returns: `byte`"
  (^Byte [^SPacketSpawnPlayer this]
    (-> this (.getYaw))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnPlayer this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-pitch
  "returns: `byte`"
  (^Byte [^SPacketSpawnPlayer this]
    (-> this (.getPitch))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketSpawnPlayer this]
    (-> this (.getZ))))

(defn get-data-manager-entries
  "returns: `java.util.List<net.minecraft.network.datasync.EntityDataManager$DataEntry<?>>`"
  (^java.util.List [^SPacketSpawnPlayer this]
    (-> this (.getDataManagerEntries))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketSpawnPlayer this]
    (-> this (.getY))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSpawnPlayer this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketSpawnPlayer this]
    (-> this (.getX))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnPlayer this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-unique-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^SPacketSpawnPlayer this]
    (-> this (.getUniqueId))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketSpawnPlayer this]
    (-> this (.getEntityID))))

