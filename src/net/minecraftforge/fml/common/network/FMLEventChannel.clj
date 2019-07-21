(ns net.minecraftforge.fml.common.network.FMLEventChannel
  "An event driven network channel, using FMLNetworkEvent.CustomPacketEvent and FMLNetworkEvent.CustomNetworkEvent
  to deliver messages to an event listener. There is one \"bus\" for each channel, due to the
  impossibility of filtering a bus for specific events.

  This event driven system completely wraps the netty code. Mod code deals with FMLProxyPackets directly. It is not
  possible to enhance the netty pipeline, and I would expect highly unexpected results if it were modified reflectively.
  Use a real ChannelHandler if you want to use netty."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLEventChannel]))

(defn register
  "Register an event listener with this channel and bus. See SubscribeEvent

  object - `java.lang.Object`"
  ([^FMLEventChannel this ^java.lang.Object object]
    (-> this (.register object))))

(defn unregister
  "Unregister an event listener from the bus.

  object - `java.lang.Object`"
  ([^FMLEventChannel this ^java.lang.Object object]
    (-> this (.unregister object))))

(defn fire-user-event
  "evt - `java.lang.Object`
  ctx - `io.netty.channel.ChannelHandlerContext`"
  ([^FMLEventChannel this ^java.lang.Object evt ^io.netty.channel.ChannelHandlerContext ctx]
    (-> this (.fireUserEvent evt ctx))))

(defn send-to-all
  "Send a packet to all on the server

  pkt - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  ([^FMLEventChannel this ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket pkt]
    (-> this (.sendToAll pkt))))

(defn send-to
  "Send to a specific player

  pkt - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`
  player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^FMLEventChannel this ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket pkt ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.sendTo pkt player))))

(defn send-to-all-around
  "Send to all around a point

  pkt - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`
  point - `net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint`"
  ([^FMLEventChannel this ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket pkt ^net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint point]
    (-> this (.sendToAllAround pkt point))))

(defn send-to-dimension
  "Send to all in a dimension

  pkt - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`
  dimension-id - `int`"
  ([^FMLEventChannel this ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket pkt ^Integer dimension-id]
    (-> this (.sendToDimension pkt dimension-id))))

(defn send-to-server
  "Send to the server

  pkt - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  ([^FMLEventChannel this ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket pkt]
    (-> this (.sendToServer pkt))))

