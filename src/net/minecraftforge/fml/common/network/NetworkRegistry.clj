(ns net.minecraftforge.fml.common.network.NetworkRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network NetworkRegistry]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.fml.common.network.NetworkRegistry"
  NetworkRegistry/INSTANCE)

(def *-fml-channel
  "Static Constant.

  Set in the ChannelHandlerContext

  type: io.netty.util.AttributeKey<java.lang.String>"
  NetworkRegistry/FML_CHANNEL)

(def *-channel-source
  "Static Constant.

  type: io.netty.util.AttributeKey<net.minecraftforge.fml.relauncher.Side>"
  NetworkRegistry/CHANNEL_SOURCE)

(def *-mod-container
  "Static Constant.

  type: io.netty.util.AttributeKey<net.minecraftforge.fml.common.ModContainer>"
  NetworkRegistry/MOD_CONTAINER)

(def *-net-handler
  "Static Constant.

  type: io.netty.util.AttributeKey<net.minecraft.network.INetHandler>"
  NetworkRegistry/NET_HANDLER)

(def *-fml-marker
  "Static Constant.

  type: io.netty.util.AttributeKey<java.lang.Boolean>"
  NetworkRegistry/FML_MARKER)

(def *-fml-protocol
  "Static Constant.

  type: byte"
  NetworkRegistry/FML_PROTOCOL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (NetworkRegistry c : NetworkRegistry.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.network.NetworkRegistry[]`"
  ([]
    (NetworkRegistry/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.network.NetworkRegistry`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.network.NetworkRegistry [^java.lang.String name]
    (NetworkRegistry/valueOf name)))

(defn fire-network-handshake
  "INTERNAL fire a handshake to all channels

  network-dispatcher - The dispatcher firing - `net.minecraftforge.fml.common.network.handshake.NetworkDispatcher`
  origin - which side the dispatcher is on - `net.minecraftforge.fml.relauncher.Side`"
  ([^NetworkRegistry this ^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher network-dispatcher ^net.minecraftforge.fml.relauncher.Side origin]
    (-> this (.fireNetworkHandshake network-dispatcher origin))))

(defn vanilla-accepted?
  "from - `net.minecraftforge.fml.relauncher.Side`

  returns: `boolean`"
  (^Boolean [^NetworkRegistry this ^net.minecraftforge.fml.relauncher.Side from]
    (-> this (.isVanillaAccepted from))))

(defn new-channel
  "INTERNAL Create a new channel pair with the specified name and channel handlers.
   This is used internally in forge and FML

  container - The container to associate the channel with - `net.minecraftforge.fml.common.ModContainer`
  name - The name for the channel - `java.lang.String`
  handlers - Some ChannelHandler for the channel - `io.netty.channel.ChannelHandler`

  returns: an EnumMap of the pair of channels. keys are Side. There will always be two entries. - `java.util.EnumMap<net.minecraftforge.fml.relauncher.Side,net.minecraftforge.fml.common.network.FMLEmbeddedChannel>`"
  (^java.util.EnumMap [^NetworkRegistry this ^net.minecraftforge.fml.common.ModContainer container ^java.lang.String name ^io.netty.channel.ChannelHandler handlers]
    (-> this (.newChannel container name handlers)))
  (^java.util.EnumMap [^NetworkRegistry this ^java.lang.String name ^io.netty.channel.ChannelHandler handlers]
    (-> this (.newChannel name handlers))))

(defn new-event-driven-channel
  "Construct a new FMLEventChannel for the channel.

  name - The name of the channel - `java.lang.String`

  returns: An FMLEventChannel for handling this channel - `net.minecraftforge.fml.common.network.FMLEventChannel`"
  (^net.minecraftforge.fml.common.network.FMLEventChannel [^NetworkRegistry this ^java.lang.String name]
    (-> this (.newEventDrivenChannel name))))

(defn register-gui-handler
  "Register an IGuiHandler for the supplied mod object.

  mod - The mod to handle GUIs for - `java.lang.Object`
  handler - A handler for creating GUI related objects - `net.minecraftforge.fml.common.network.IGuiHandler`"
  ([^NetworkRegistry this ^java.lang.Object mod ^net.minecraftforge.fml.common.network.IGuiHandler handler]
    (-> this (.registerGuiHandler mod handler))))

(defn has-channel?
  "Is there a channel with this name on this side?

  channel-name - The name - `java.lang.String`
  source - the side - `net.minecraftforge.fml.relauncher.Side`

  returns: if there's a channel - `boolean`"
  (^Boolean [^NetworkRegistry this ^java.lang.String channel-name ^net.minecraftforge.fml.relauncher.Side source]
    (-> this (.hasChannel channel-name source))))

(defn registry
  "returns: `java.util.Map<net.minecraftforge.fml.common.ModContainer,net.minecraftforge.fml.common.network.internal.NetworkModHolder>`"
  (^java.util.Map [^NetworkRegistry this]
    (-> this (.registry))))

(defn get-local-gui-container
  "INTERNAL method for accessing the Gui registry

  mc - Mod Container - `net.minecraftforge.fml.common.ModContainer`
  player - Player - `net.minecraft.entity.player.EntityPlayer`
  mod-gui-id - guiId - `int`
  world - World - `net.minecraft.world.World`
  x - X coord - `int`
  y - Y coord - `int`
  z - Z coord - `int`

  returns: The client side GUI object (An instance of Gui) - `java.lang.Object`"
  (^java.lang.Object [^NetworkRegistry this ^net.minecraftforge.fml.common.ModContainer mc ^net.minecraft.entity.player.EntityPlayer player ^Integer mod-gui-id ^net.minecraft.world.World world ^Integer x ^Integer y ^Integer z]
    (-> this (.getLocalGuiContainer mc player mod-gui-id world x y z))))

(defn register
  "INTERNAL method for registering a mod as a network capable thing

  fml-mod-container - The fml mod container - `net.minecraftforge.fml.common.ModContainer`
  clazz - a class - `java.lang.Class`
  remote-version-range - the acceptable remote range - `java.lang.String`
  asm-harvested-data - internal data - `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  ([^NetworkRegistry this ^net.minecraftforge.fml.common.ModContainer fml-mod-container ^java.lang.Class clazz ^java.lang.String remote-version-range ^net.minecraftforge.fml.common.discovery.ASMDataTable asm-harvested-data]
    (-> this (.register fml-mod-container clazz remote-version-range asm-harvested-data))))

(defn channel-names-for
  "All the valid channel names for a side

  side - the side - `net.minecraftforge.fml.relauncher.Side`

  returns: the set of channel names - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^NetworkRegistry this ^net.minecraftforge.fml.relauncher.Side side]
    (-> this (.channelNamesFor side))))

(defn get-channel
  "name - `java.lang.String`
  source - `net.minecraftforge.fml.relauncher.Side`

  returns: `net.minecraftforge.fml.common.network.FMLEmbeddedChannel`"
  (^net.minecraftforge.fml.common.network.FMLEmbeddedChannel [^NetworkRegistry this ^java.lang.String name ^net.minecraftforge.fml.relauncher.Side source]
    (-> this (.getChannel name source))))

(defn new-simple-channel
  "Construct a new SimpleNetworkWrapper for the channel.

  name - The name of the channel - `java.lang.String`

  returns: A SimpleNetworkWrapper for handling this channel - `net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper`"
  (^net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper [^NetworkRegistry this ^java.lang.String name]
    (-> this (.newSimpleChannel name))))

(defn get-remote-gui-container
  "INTERNAL method for accessing the Gui registry

  mc - Mod Container - `net.minecraftforge.fml.common.ModContainer`
  player - Player - `net.minecraft.entity.player.EntityPlayerMP`
  mod-gui-id - guiId - `int`
  world - World - `net.minecraft.world.World`
  x - X coord - `int`
  y - Y coord - `int`
  z - Z coord - `int`

  returns: The server side GUI object (An instance of Container) - `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^NetworkRegistry this ^net.minecraftforge.fml.common.ModContainer mc ^net.minecraft.entity.player.EntityPlayerMP player ^Integer mod-gui-id ^net.minecraft.world.World world ^Integer x ^Integer y ^Integer z]
    (-> this (.getRemoteGuiContainer mc player mod-gui-id world x y z))))

