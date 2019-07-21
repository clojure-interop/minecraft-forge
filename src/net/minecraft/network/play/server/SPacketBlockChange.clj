(ns net.minecraft.network.play.server.SPacketBlockChange
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketBlockChange]))

(defn ->s-packet-block-change
  "Constructor.

  world-in - `net.minecraft.world.World`
  pos-in - `net.minecraft.util.math.BlockPos`"
  (^SPacketBlockChange [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos-in]
    (new SPacketBlockChange world-in pos-in))
  (^SPacketBlockChange []
    (new SPacketBlockChange )))

(defn block-state
  "Instance Field.

  type: net.minecraft.block.state.IBlockState"
  (^net.minecraft.block.state.IBlockState [^SPacketBlockChange this]
    (-> this .-blockState)))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketBlockChange this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketBlockChange this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketBlockChange this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-block-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^SPacketBlockChange this]
    (-> this (.getBlockState))))

(defn get-block-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SPacketBlockChange this]
    (-> this (.getBlockPosition))))

