(ns net.minecraft.network.play.server.SPacketPlayerAbilities
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketPlayerAbilities]))

(defn ->s-packet-player-abilities
  "Constructor.

  capabilities - `net.minecraft.entity.player.PlayerCapabilities`"
  (^SPacketPlayerAbilities [^net.minecraft.entity.player.PlayerCapabilities capabilities]
    (new SPacketPlayerAbilities capabilities))
  (^SPacketPlayerAbilities []
    (new SPacketPlayerAbilities )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPlayerAbilities this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-walk-speed
  "returns: `float`"
  (^Float [^SPacketPlayerAbilities this]
    (-> this (.getWalkSpeed))))

(defn set-invulnerable
  "is-invulnerable - `boolean`"
  ([^SPacketPlayerAbilities this ^Boolean is-invulnerable]
    (-> this (.setInvulnerable is-invulnerable))))

(defn set-allow-flying
  "is-allow-flying - `boolean`"
  ([^SPacketPlayerAbilities this ^Boolean is-allow-flying]
    (-> this (.setAllowFlying is-allow-flying))))

(defn set-walk-speed
  "walk-speed-in - `float`"
  ([^SPacketPlayerAbilities this ^Float walk-speed-in]
    (-> this (.setWalkSpeed walk-speed-in))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketPlayerAbilities this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-fly-speed
  "returns: `float`"
  (^Float [^SPacketPlayerAbilities this]
    (-> this (.getFlySpeed))))

(defn set-fly-speed
  "fly-speed-in - `float`"
  ([^SPacketPlayerAbilities this ^Float fly-speed-in]
    (-> this (.setFlySpeed fly-speed-in))))

(defn invulnerable?
  "returns: `boolean`"
  (^Boolean [^SPacketPlayerAbilities this]
    (-> this (.isInvulnerable))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPlayerAbilities this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn set-creative-mode
  "is-creative-mode - `boolean`"
  ([^SPacketPlayerAbilities this ^Boolean is-creative-mode]
    (-> this (.setCreativeMode is-creative-mode))))

(defn allow-flying?
  "returns: `boolean`"
  (^Boolean [^SPacketPlayerAbilities this]
    (-> this (.isAllowFlying))))

(defn set-flying
  "is-flying - `boolean`"
  ([^SPacketPlayerAbilities this ^Boolean is-flying]
    (-> this (.setFlying is-flying))))

(defn flying?
  "returns: `boolean`"
  (^Boolean [^SPacketPlayerAbilities this]
    (-> this (.isFlying))))

(defn creative-mode?
  "returns: `boolean`"
  (^Boolean [^SPacketPlayerAbilities this]
    (-> this (.isCreativeMode))))

