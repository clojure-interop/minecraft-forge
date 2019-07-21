(ns net.minecraftforge.fml.common.network.handshake.NetworkDispatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake NetworkDispatcher]))

(defn ->network-dispatcher
  "Constructor.

  manager - `net.minecraft.network.NetworkManager`
  scm - `net.minecraft.server.management.PlayerList`"
  (^NetworkDispatcher [^net.minecraft.network.NetworkManager manager ^net.minecraft.server.management.PlayerList scm]
    (new NetworkDispatcher manager scm))
  (^NetworkDispatcher [^net.minecraft.network.NetworkManager manager]
    (new NetworkDispatcher manager)))

(def *-fml-dispatcher
  "Static Constant.

  type: io.netty.util.AttributeKey<net.minecraftforge.fml.common.network.handshake.NetworkDispatcher>"
  NetworkDispatcher/FML_DISPATCHER)

(def *-is-local
  "Static Constant.

  type: io.netty.util.AttributeKey<java.lang.Boolean>"
  NetworkDispatcher/IS_LOCAL)

(def *-fml-gamedata-snapshot
  "Static Constant.

  type: io.netty.util.AttributeKey<net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot>"
  NetworkDispatcher/FML_GAMEDATA_SNAPSHOT)

(defn manager
  "Instance Constant.

  type: net.minecraft.network.NetworkManager"
  (^net.minecraft.network.NetworkManager [^NetworkDispatcher this]
    (-> this .-manager)))

(defn *get
  "manager - `net.minecraft.network.NetworkManager`

  returns: `net.minecraftforge.fml.common.network.handshake.NetworkDispatcher`"
  (^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher [^net.minecraft.network.NetworkManager manager]
    (NetworkDispatcher/get manager)))

(defn *alloc-and-set
  "manager - `net.minecraft.network.NetworkManager`
  scm - `net.minecraft.server.management.PlayerList`

  returns: `net.minecraftforge.fml.common.network.handshake.NetworkDispatcher`"
  (^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher [^net.minecraft.network.NetworkManager manager ^net.minecraft.server.management.PlayerList scm]
    (NetworkDispatcher/allocAndSet manager scm))
  (^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher [^net.minecraft.network.NetworkManager manager]
    (NetworkDispatcher/allocAndSet manager)))

(defn client-to-server-handshake
  ""
  ([^NetworkDispatcher this]
    (-> this (.clientToServerHandshake))))

(defn server-to-client-handshake
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^NetworkDispatcher this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.serverToClientHandshake player))))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

(defn disconnect
  "ctx - `io.netty.channel.ChannelHandlerContext`
  promise - `io.netty.channel.ChannelPromise`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx ^io.netty.channel.ChannelPromise promise]
    (-> this (.disconnect ctx promise))))

(defn get-mod-list
  "The mod list returned by this method is in no way reliable because it is provided by the client

  returns: a map that will contain String keys and values listing all mods and their versions - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^NetworkDispatcher this]
    (-> this (.getModList))))

(defn bind
  "ctx - `io.netty.channel.ChannelHandlerContext`
  local-address - `java.net.SocketAddress`
  promise - `io.netty.channel.ChannelPromise`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx ^java.net.SocketAddress local-address ^io.netty.channel.ChannelPromise promise]
    (-> this (.bind ctx local-address promise))))

(defn handler-added
  "ctx - `io.netty.channel.ChannelHandlerContext`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx]
    (-> this (.handlerAdded ctx))))

(defn flush
  "ctx - `io.netty.channel.ChannelHandlerContext`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx]
    (-> this (.flush ctx))))

(defn read
  "ctx - `io.netty.channel.ChannelHandlerContext`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx]
    (-> this (.read ctx))))

(defn connect
  "ctx - `io.netty.channel.ChannelHandlerContext`
  remote-address - `java.net.SocketAddress`
  local-address - `java.net.SocketAddress`
  promise - `io.netty.channel.ChannelPromise`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx ^java.net.SocketAddress remote-address ^java.net.SocketAddress local-address ^io.netty.channel.ChannelPromise promise]
    (-> this (.connect ctx remote-address local-address promise))))

(defn abort-client-handshake
  "type - `java.lang.String`"
  ([^NetworkDispatcher this ^java.lang.String type]
    (-> this (.abortClientHandshake type))))

(defn user-event-triggered
  "ctx - `io.netty.channel.ChannelHandlerContext`
  evt - `java.lang.Object`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Object evt]
    (-> this (.userEventTriggered ctx evt))))

(defn close
  "ctx - `io.netty.channel.ChannelHandlerContext`
  promise - `io.netty.channel.ChannelPromise`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx ^io.netty.channel.ChannelPromise promise]
    (-> this (.close ctx promise))))

(defn get-override-dimension
  "packet-in - `net.minecraft.network.play.server.SPacketJoinGame`

  returns: `int`"
  (^Integer [^NetworkDispatcher this ^net.minecraft.network.play.server.SPacketJoinGame packet-in]
    (-> this (.getOverrideDimension packet-in))))

(defn deregister
  "Deprecated.

  ctx - `io.netty.channel.ChannelHandlerContext`
  promise - `io.netty.channel.ChannelPromise`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx ^io.netty.channel.ChannelPromise promise]
    (-> this (.deregister ctx promise))))

(defn complete-handshake
  "target - `net.minecraftforge.fml.relauncher.Side`"
  ([^NetworkDispatcher this ^net.minecraftforge.fml.relauncher.Side target]
    (-> this (.completeHandshake target))))

(defn send-proxy
  "msg - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  ([^NetworkDispatcher this ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket msg]
    (-> this (.sendProxy msg))))

(defn write
  "ctx - `io.netty.channel.ChannelHandlerContext`
  msg - `java.lang.Object`
  promise - `io.netty.channel.ChannelPromise`

  throws: java.lang.Exception"
  ([^NetworkDispatcher this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Object msg ^io.netty.channel.ChannelPromise promise]
    (-> this (.write ctx msg promise))))

(defn complete-client-handshake
  ""
  ([^NetworkDispatcher this]
    (-> this (.completeClientHandshake))))

(defn get-net-handler
  "returns: `net.minecraft.network.INetHandler`"
  (^net.minecraft.network.INetHandler [^NetworkDispatcher this]
    (-> this (.getNetHandler))))

(defn set-override-dimension
  "override-dim - `int`"
  ([^NetworkDispatcher this ^Integer override-dim]
    (-> this (.setOverrideDimension override-dim))))

(defn reject-handshake
  "result - `java.lang.String`"
  ([^NetworkDispatcher this ^java.lang.String result]
    (-> this (.rejectHandshake result))))

