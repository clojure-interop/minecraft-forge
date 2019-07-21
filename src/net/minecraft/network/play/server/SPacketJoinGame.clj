(ns net.minecraft.network.play.server.SPacketJoinGame
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketJoinGame]))

(defn ->s-packet-join-game
  "Constructor.

  player-id-in - `int`
  game-type-in - `net.minecraft.world.GameType`
  hardcore-mode-in - `boolean`
  dimension-in - `int`
  difficulty-in - `net.minecraft.world.EnumDifficulty`
  max-players-in - `int`
  world-type-in - `net.minecraft.world.WorldType`
  reduced-debug-info-in - `boolean`"
  (^SPacketJoinGame [^Integer player-id-in ^net.minecraft.world.GameType game-type-in ^Boolean hardcore-mode-in ^Integer dimension-in ^net.minecraft.world.EnumDifficulty difficulty-in ^Integer max-players-in ^net.minecraft.world.WorldType world-type-in ^Boolean reduced-debug-info-in]
    (new SPacketJoinGame player-id-in game-type-in hardcore-mode-in dimension-in difficulty-in max-players-in world-type-in reduced-debug-info-in))
  (^SPacketJoinGame []
    (new SPacketJoinGame )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketJoinGame this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-max-players
  "returns: `int`"
  (^Integer [^SPacketJoinGame this]
    (-> this (.getMaxPlayers))))

(defn hardcore-mode?
  "returns: `boolean`"
  (^Boolean [^SPacketJoinGame this]
    (-> this (.isHardcoreMode))))

(defn get-world-type
  "returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^SPacketJoinGame this]
    (-> this (.getWorldType))))

(defn get-dimension
  "returns: `int`"
  (^Integer [^SPacketJoinGame this]
    (-> this (.getDimension))))

(defn get-player-id
  "returns: `int`"
  (^Integer [^SPacketJoinGame this]
    (-> this (.getPlayerId))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketJoinGame this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^SPacketJoinGame this]
    (-> this (.getGameType))))

(defn reduced-debug-info?
  "returns: `boolean`"
  (^Boolean [^SPacketJoinGame this]
    (-> this (.isReducedDebugInfo))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketJoinGame this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-difficulty
  "returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^SPacketJoinGame this]
    (-> this (.getDifficulty))))

