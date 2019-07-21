(ns net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLOutboundHandler$OutboundTarget]))

(def NOWHERE
  "Enum Constant.

  The packet is sent nowhere. It will be on the EmbeddedChannel.outboundMessages() Queue.

  type: net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget"
  FMLOutboundHandler$OutboundTarget/NOWHERE)

(def DISPATCHER
  "Enum Constant.

  The packet is sent to the NetworkDispatcher supplied as an argument.

  type: net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget"
  FMLOutboundHandler$OutboundTarget/DISPATCHER)

(def REPLY
  "Enum Constant.

  The packet is sent to the originator of the packet. This requires the inbound packet
   to have it's originator information set.

  type: net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget"
  FMLOutboundHandler$OutboundTarget/REPLY)

(def PLAYER
  "Enum Constant.

  The packet is sent to the EntityPlayerMP supplied as an argument.

  type: net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget"
  FMLOutboundHandler$OutboundTarget/PLAYER)

(def ALL
  "Enum Constant.

  The packet is dispatched to all players connected to the server.

  type: net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget"
  FMLOutboundHandler$OutboundTarget/ALL)

(def DIMENSION
  "Enum Constant.

  The packet is sent to all players in the dimension identified by the integer argument.

  type: net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget"
  FMLOutboundHandler$OutboundTarget/DIMENSION)

(def ALLAROUNDPOINT
  "Enum Constant.

  The packet is sent to all players within range of the NetworkRegistry.TargetPoint argument supplied.

  type: net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget"
  FMLOutboundHandler$OutboundTarget/ALLAROUNDPOINT)

(def TOSERVER
  "Enum Constant.

  The packet is sent to the server this client is currently conversing with.

  type: net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget"
  FMLOutboundHandler$OutboundTarget/TOSERVER)

(defn allowed
  "Instance Constant.

  type: com.google.common.collect.ImmutableSet<net.minecraftforge.fml.relauncher.Side>"
  (^com.google.common.collect.ImmutableSet [^FMLOutboundHandler$OutboundTarget this]
    (-> this .-allowed)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (FMLOutboundHandler.OutboundTarget c : FMLOutboundHandler.OutboundTarget.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget[]`"
  ([]
    (FMLOutboundHandler$OutboundTarget/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget [^java.lang.String name]
    (FMLOutboundHandler$OutboundTarget/valueOf name)))

(defn validate-args
  "args - `java.lang.Object`"
  ([^FMLOutboundHandler$OutboundTarget this ^java.lang.Object args]
    (-> this (.validateArgs args))))

(defn select-networks
  "args - `java.lang.Object`
  context - `io.netty.channel.ChannelHandlerContext`
  packet - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`

  returns: `java.util.List<net.minecraftforge.fml.common.network.handshake.NetworkDispatcher>`"
  (^java.util.List [^FMLOutboundHandler$OutboundTarget this ^java.lang.Object args ^io.netty.channel.ChannelHandlerContext context ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket packet]
    (-> this (.selectNetworks args context packet))))

