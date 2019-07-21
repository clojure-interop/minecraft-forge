(ns net.minecraftforge.fml.common.network.FMLEmbeddedChannel
  "Utility wrapper around EmbeddedChannel. Provides some convenience methods
  associated with the specific needs of FML network handling."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLEmbeddedChannel]))

(defn ->fml-embedded-channel
  "Constructor.

  container - `net.minecraftforge.fml.common.ModContainer`
  channel-name - `java.lang.String`
  source - `net.minecraftforge.fml.relauncher.Side`
  handlers - `io.netty.channel.ChannelHandler`"
  (^FMLEmbeddedChannel [^net.minecraftforge.fml.common.ModContainer container ^java.lang.String channel-name ^net.minecraftforge.fml.relauncher.Side source ^io.netty.channel.ChannelHandler handlers]
    (new FMLEmbeddedChannel container channel-name source handlers))
  (^FMLEmbeddedChannel [^java.lang.String channel-name ^net.minecraftforge.fml.relauncher.Side source ^io.netty.channel.ChannelHandler handlers]
    (new FMLEmbeddedChannel channel-name source handlers)))

(defn generate-packet-from
  "Utility method to generate a regular packet from a custom packet. Basically, it writes the packet through the
   outbound side which should have a message to message codec present (such as FMLIndexedMessageToMessageCodec,
   transforming from mod packets to standard FMLProxyPackets.

   This is mostly useful in cases where vanilla expects a packet, such as the TileEntity getDescriptionPacket.

  object - The inbound packet - `java.lang.Object`

  returns: A Packet suitable for passing to vanilla network code. - `net.minecraft.network.Packet<?>`"
  (^net.minecraft.network.Packet [^FMLEmbeddedChannel this ^java.lang.Object object]
    (-> this (.generatePacketFrom object))))

(defn find-channel-handler-name-for-type
  "type - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLEmbeddedChannel this ^java.lang.Class type]
    (-> this (.findChannelHandlerNameForType type))))

