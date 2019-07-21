(ns net.minecraft.network.play.server.SPacketRespawn
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketRespawn]))

(defn ->s-packet-respawn
  "Constructor.

  dimension-id-in - `int`
  difficulty-in - `net.minecraft.world.EnumDifficulty`
  world-type-in - `net.minecraft.world.WorldType`
  game-mode-in - `net.minecraft.world.GameType`"
  (^SPacketRespawn [^Integer dimension-id-in ^net.minecraft.world.EnumDifficulty difficulty-in ^net.minecraft.world.WorldType world-type-in ^net.minecraft.world.GameType game-mode-in]
    (new SPacketRespawn dimension-id-in difficulty-in world-type-in game-mode-in))
  (^SPacketRespawn []
    (new SPacketRespawn )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketRespawn this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketRespawn this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketRespawn this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-dimension-id
  "returns: `int`"
  (^Integer [^SPacketRespawn this]
    (-> this (.getDimensionID))))

(defn get-difficulty
  "returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^SPacketRespawn this]
    (-> this (.getDifficulty))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^SPacketRespawn this]
    (-> this (.getGameType))))

(defn get-world-type
  "returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^SPacketRespawn this]
    (-> this (.getWorldType))))

