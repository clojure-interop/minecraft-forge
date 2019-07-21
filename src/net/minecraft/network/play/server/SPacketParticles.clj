(ns net.minecraft.network.play.server.SPacketParticles
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketParticles]))

(defn ->s-packet-particles
  "Constructor.

  particle-in - `net.minecraft.util.EnumParticleTypes`
  long-distance-in - `boolean`
  x-in - `float`
  y-in - `float`
  z-in - `float`
  x-offset-in - `float`
  y-offset-in - `float`
  z-offset-in - `float`
  speed-in - `float`
  count-in - `int`
  arguments-in - `int`"
  (^SPacketParticles [^net.minecraft.util.EnumParticleTypes particle-in ^Boolean long-distance-in ^Float x-in ^Float y-in ^Float z-in ^Float x-offset-in ^Float y-offset-in ^Float z-offset-in ^Float speed-in ^Integer count-in ^Integer arguments-in]
    (new SPacketParticles particle-in long-distance-in x-in y-in z-in x-offset-in y-offset-in z-offset-in speed-in count-in arguments-in))
  (^SPacketParticles []
    (new SPacketParticles )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketParticles this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-z-offset
  "returns: `float`"
  (^Float [^SPacketParticles this]
    (-> this (.getZOffset))))

(defn get-x-coordinate
  "returns: `double`"
  (^Double [^SPacketParticles this]
    (-> this (.getXCoordinate))))

(defn get-z-coordinate
  "returns: `double`"
  (^Double [^SPacketParticles this]
    (-> this (.getZCoordinate))))

(defn get-x-offset
  "returns: `float`"
  (^Float [^SPacketParticles this]
    (-> this (.getXOffset))))

(defn get-y-coordinate
  "returns: `double`"
  (^Double [^SPacketParticles this]
    (-> this (.getYCoordinate))))

(defn long-distance?
  "returns: `boolean`"
  (^Boolean [^SPacketParticles this]
    (-> this (.isLongDistance))))

(defn get-particle-speed
  "returns: `float`"
  (^Float [^SPacketParticles this]
    (-> this (.getParticleSpeed))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketParticles this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-particle-args
  "returns: `int[]`"
  ([^SPacketParticles this]
    (-> this (.getParticleArgs))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketParticles this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-y-offset
  "returns: `float`"
  (^Float [^SPacketParticles this]
    (-> this (.getYOffset))))

(defn get-particle-type
  "returns: `net.minecraft.util.EnumParticleTypes`"
  (^net.minecraft.util.EnumParticleTypes [^SPacketParticles this]
    (-> this (.getParticleType))))

(defn get-particle-count
  "returns: `int`"
  (^Integer [^SPacketParticles this]
    (-> this (.getParticleCount))))

