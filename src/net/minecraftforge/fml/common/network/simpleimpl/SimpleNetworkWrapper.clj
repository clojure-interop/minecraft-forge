(ns net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper
  "This class is a simplified netty wrapper for those not wishing to deal with the full power of netty.
  It provides a simple message driven system, based on a discriminator byte over the custom packet channel.
  It assumes that you have a series of unique message types with each having a unique handler. Generally, context should be
  derived at message handling time.

  Usage is simple:
  construct, and store, an instance of this class. It will automatically register and configure your underlying netty channel.

  Then, call registerMessage(Class, Class, int, Side) for each message type you want to exchange
  providing an IMessageHandler implementation class as well as an IMessage implementation class. The side parameter
  to that method indicates which side (server or client) the message processing will occur on. The discriminator byte
  should be unique for this channelName - it is used to discriminate between different types of message that might
  occur on this channel (a simple form of message channel multiplexing, if you will).
  To get a packet suitable for presenting to the rest of minecraft, you can call getPacketFrom(IMessage). The return result
  is suitable for returning from things like TileEntity#getDescriptionPacket() for example.
  Finally, use the sendXXX to send unsolicited messages to various classes of recipients.


  Example



   // Request message
   public Message1 implements IMessage {
   // message structure
    public fromBytes(ByteBuf buf) {
     // build message from byte array
    }
    public toBytes(ByteBuf buf) {
     // put message content into byte array
    }
   }
   // Reply message
   public Message2 implements IMessage {
    // stuff as before
   }
   // Message1Handler expects input of type Message1 and returns type Message2
   public Message1Handler implements IMessageHandler {
    public Message2 onMessage(Message1 message, MessageContext ctx) {
     // do something and generate reply message
     return aMessage2Object;
    }
   }
   // Message2Handler expects input of type Message2 and returns no message (IMessage)
   public Message2Handler implements IMessageHandler {
    public IMessage onMessage(Message2 message, MessageContext ctx) {
     // handle the message 2 response message at the other end
     // no reply for this message - return null
     return null;
    }
   }

   // Code in a FMLPreInitializationEvent or FMLInitializationEvent handler
   SimpleNetworkWrapper wrapper = NetworkRegistry.newSimpleChannel(\"MYCHANNEL\");
   // Message1 is handled by the Message1Handler class, it has discriminator id 1 and it's on the client
   wrapper.registerMessage(Message1Handler.class, Message1.class, 1, Side.CLIENT);
   // Message2 is handled by the Message2Handler class, it has discriminator id 2 and it's on the server
   wrapper.registerMessage(Message2Handler.class, Message2.class, 2, Side.SERVER);


  Note: As of Minecraft 1.8 packets are by default handled on the network thread.
  That means that your IMessageHandler can not interact with most game objects directly.
  Minecraft provides a convenient way to make your code execute on the main thread instead using IThreadListener.addScheduledTask(Runnable).
  The way to obtain an IThreadListener is using either the Minecraft instance (client side) or a WorldServer instance (server side)."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.simpleimpl SimpleNetworkWrapper]))

(defn ->simple-network-wrapper
  "Constructor.

  channel-name - `java.lang.String`"
  (^SimpleNetworkWrapper [^java.lang.String channel-name]
    (new SimpleNetworkWrapper channel-name)))

(defn register-message
  "Register a message and it's associated handler. The message will have the supplied discriminator byte. The message handler will
   be registered on the supplied side (this is the side where you want the message to be processed and acted upon).

  message-handler - the message handler type - `java.lang.Class`
  request-message-type - the message type - `java.lang.Class`
  discriminator - a discriminator byte - `int`
  side - the side for the handler - `net.minecraftforge.fml.relauncher.Side`

  returns: `<REQ extends net.minecraftforge.fml.common.network.simpleimpl.IMessage,REPLY extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> void`"
  ([^SimpleNetworkWrapper this ^java.lang.Class message-handler ^java.lang.Class request-message-type ^Integer discriminator ^net.minecraftforge.fml.relauncher.Side side]
    (-> this (.registerMessage message-handler request-message-type discriminator side))))

(defn get-packet-from
  "Construct a minecraft packet from the supplied message. Can be used where minecraft packets are required, such as
   TileEntity#getDescriptionPacket().

  message - The message to translate into packet form - `net.minecraftforge.fml.common.network.simpleimpl.IMessage`

  returns: A minecraft Packet suitable for use in minecraft APIs - `net.minecraft.network.Packet<?>`"
  (^net.minecraft.network.Packet [^SimpleNetworkWrapper this ^net.minecraftforge.fml.common.network.simpleimpl.IMessage message]
    (-> this (.getPacketFrom message))))

(defn send-to-all
  "Send this message to everyone.
   The IMessageHandler for this message type should be on the CLIENT side.

  message - The message to send - `net.minecraftforge.fml.common.network.simpleimpl.IMessage`"
  ([^SimpleNetworkWrapper this ^net.minecraftforge.fml.common.network.simpleimpl.IMessage message]
    (-> this (.sendToAll message))))

(defn send-to
  "Send this message to the specified player.
   The IMessageHandler for this message type should be on the CLIENT side.

  message - The message to send - `net.minecraftforge.fml.common.network.simpleimpl.IMessage`
  player - The player to send it to - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^SimpleNetworkWrapper this ^net.minecraftforge.fml.common.network.simpleimpl.IMessage message ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.sendTo message player))))

(defn send-to-all-around
  "Send this message to everyone within a certain range of a point.
   The IMessageHandler for this message type should be on the CLIENT side.

  message - The message to send - `net.minecraftforge.fml.common.network.simpleimpl.IMessage`
  point - The NetworkRegistry.TargetPoint around which to send - `net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint`"
  ([^SimpleNetworkWrapper this ^net.minecraftforge.fml.common.network.simpleimpl.IMessage message ^net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint point]
    (-> this (.sendToAllAround message point))))

(defn send-to-dimension
  "Send this message to everyone within the supplied dimension.
   The IMessageHandler for this message type should be on the CLIENT side.

  message - The message to send - `net.minecraftforge.fml.common.network.simpleimpl.IMessage`
  dimension-id - The dimension id to target - `int`"
  ([^SimpleNetworkWrapper this ^net.minecraftforge.fml.common.network.simpleimpl.IMessage message ^Integer dimension-id]
    (-> this (.sendToDimension message dimension-id))))

(defn send-to-server
  "Send this message to the server.
   The IMessageHandler for this message type should be on the SERVER side.

  message - The message to send - `net.minecraftforge.fml.common.network.simpleimpl.IMessage`"
  ([^SimpleNetworkWrapper this ^net.minecraftforge.fml.common.network.simpleimpl.IMessage message]
    (-> this (.sendToServer message))))

