(ns net.minecraft.network.play.server.SPacketPlayerListItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketPlayerListItem]))

(defn ->s-packet-player-list-item
  "Constructor.

  action-in - `net.minecraft.network.play.server.SPacketPlayerListItem$Action`
  players-in - `net.minecraft.entity.player.EntityPlayerMP`"
  (^SPacketPlayerListItem [^net.minecraft.network.play.server.SPacketPlayerListItem$Action action-in ^net.minecraft.entity.player.EntityPlayerMP players-in]
    (new SPacketPlayerListItem action-in players-in))
  (^SPacketPlayerListItem []
    (new SPacketPlayerListItem )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPlayerListItem this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPlayerListItem this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketPlayerListItem this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entries
  "returns: `java.util.List<net.minecraft.network.play.server.SPacketPlayerListItem$AddPlayerData>`"
  (^java.util.List [^SPacketPlayerListItem this]
    (-> this (.getEntries))))

(defn get-action
  "returns: `net.minecraft.network.play.server.SPacketPlayerListItem$Action`"
  (^net.minecraft.network.play.server.SPacketPlayerListItem$Action [^SPacketPlayerListItem this]
    (-> this (.getAction))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketPlayerListItem this]
    (-> this (.toString))))

