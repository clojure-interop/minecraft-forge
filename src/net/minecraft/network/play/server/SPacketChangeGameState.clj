(ns net.minecraft.network.play.server.SPacketChangeGameState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketChangeGameState]))

(defn ->s-packet-change-game-state
  "Constructor.

  state-in - `int`
  value-in - `float`"
  (^SPacketChangeGameState [^Integer state-in ^Float value-in]
    (new SPacketChangeGameState state-in value-in))
  (^SPacketChangeGameState []
    (new SPacketChangeGameState )))

(def *-message-names
  "Static Constant.

  type: java.lang.String[]"
  SPacketChangeGameState/MESSAGE_NAMES)

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketChangeGameState this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketChangeGameState this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketChangeGameState this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-game-state
  "returns: `int`"
  (^Integer [^SPacketChangeGameState this]
    (-> this (.getGameState))))

(defn get-value
  "returns: `float`"
  (^Float [^SPacketChangeGameState this]
    (-> this (.getValue))))

