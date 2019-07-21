(ns net.minecraft.network.play.client.CPacketPlayerAbilities
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketPlayerAbilities]))

(defn ->c-packet-player-abilities
  "Constructor.

  capabilities - `net.minecraft.entity.player.PlayerCapabilities`"
  (^CPacketPlayerAbilities [^net.minecraft.entity.player.PlayerCapabilities capabilities]
    (new CPacketPlayerAbilities capabilities))
  (^CPacketPlayerAbilities []
    (new CPacketPlayerAbilities )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayerAbilities this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn set-invulnerable
  "is-invulnerable - `boolean`"
  ([^CPacketPlayerAbilities this ^Boolean is-invulnerable]
    (-> this (.setInvulnerable is-invulnerable))))

(defn set-allow-flying
  "is-allow-flying - `boolean`"
  ([^CPacketPlayerAbilities this ^Boolean is-allow-flying]
    (-> this (.setAllowFlying is-allow-flying))))

(defn set-walk-speed
  "walk-speed-in - `float`"
  ([^CPacketPlayerAbilities this ^Float walk-speed-in]
    (-> this (.setWalkSpeed walk-speed-in))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketPlayerAbilities this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn set-fly-speed
  "fly-speed-in - `float`"
  ([^CPacketPlayerAbilities this ^Float fly-speed-in]
    (-> this (.setFlySpeed fly-speed-in))))

(defn invulnerable?
  "returns: `boolean`"
  (^Boolean [^CPacketPlayerAbilities this]
    (-> this (.isInvulnerable))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayerAbilities this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn set-creative-mode
  "is-creative-mode - `boolean`"
  ([^CPacketPlayerAbilities this ^Boolean is-creative-mode]
    (-> this (.setCreativeMode is-creative-mode))))

(defn allow-flying?
  "returns: `boolean`"
  (^Boolean [^CPacketPlayerAbilities this]
    (-> this (.isAllowFlying))))

(defn set-flying
  "is-flying - `boolean`"
  ([^CPacketPlayerAbilities this ^Boolean is-flying]
    (-> this (.setFlying is-flying))))

(defn flying?
  "returns: `boolean`"
  (^Boolean [^CPacketPlayerAbilities this]
    (-> this (.isFlying))))

(defn creative-mode?
  "returns: `boolean`"
  (^Boolean [^CPacketPlayerAbilities this]
    (-> this (.isCreativeMode))))

