(ns net.minecraft.network.play.server.SPacketUseBed
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketUseBed]))

(defn ->s-packet-use-bed
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  pos-in - `net.minecraft.util.math.BlockPos`"
  (^SPacketUseBed [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos-in]
    (new SPacketUseBed player pos-in))
  (^SPacketUseBed []
    (new SPacketUseBed )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUseBed this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUseBed this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketUseBed this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-player
  "world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^SPacketUseBed this ^net.minecraft.world.World world-in]
    (-> this (.getPlayer world-in))))

(defn get-bed-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SPacketUseBed this]
    (-> this (.getBedPosition))))

