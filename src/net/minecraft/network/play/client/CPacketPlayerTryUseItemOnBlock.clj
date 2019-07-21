(ns net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketPlayerTryUseItemOnBlock]))

(defn ->c-packet-player-try-use-item-on-block
  "Constructor.

  pos-in - `net.minecraft.util.math.BlockPos`
  placed-block-direction-in - `net.minecraft.util.EnumFacing`
  hand-in - `net.minecraft.util.EnumHand`
  facing-x-in - `float`
  facing-y-in - `float`
  facing-z-in - `float`"
  (^CPacketPlayerTryUseItemOnBlock [^net.minecraft.util.math.BlockPos pos-in ^net.minecraft.util.EnumFacing placed-block-direction-in ^net.minecraft.util.EnumHand hand-in ^Float facing-x-in ^Float facing-y-in ^Float facing-z-in]
    (new CPacketPlayerTryUseItemOnBlock pos-in placed-block-direction-in hand-in facing-x-in facing-y-in facing-z-in))
  (^CPacketPlayerTryUseItemOnBlock []
    (new CPacketPlayerTryUseItemOnBlock )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayerTryUseItemOnBlock this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-facing-x
  "returns: `float`"
  (^Float [^CPacketPlayerTryUseItemOnBlock this]
    (-> this (.getFacingX))))

(defn get-direction
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^CPacketPlayerTryUseItemOnBlock this]
    (-> this (.getDirection))))

(defn get-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^CPacketPlayerTryUseItemOnBlock this]
    (-> this (.getHand))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketPlayerTryUseItemOnBlock this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayerTryUseItemOnBlock this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^CPacketPlayerTryUseItemOnBlock this]
    (-> this (.getPos))))

(defn get-facing-z
  "returns: `float`"
  (^Float [^CPacketPlayerTryUseItemOnBlock this]
    (-> this (.getFacingZ))))

(defn get-facing-y
  "returns: `float`"
  (^Float [^CPacketPlayerTryUseItemOnBlock this]
    (-> this (.getFacingY))))

