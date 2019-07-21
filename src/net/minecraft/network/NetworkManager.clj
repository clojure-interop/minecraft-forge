(ns net.minecraft.network.NetworkManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network NetworkManager]))

(defn ->network-manager
  "Constructor.

  packet-direction - `net.minecraft.network.EnumPacketDirection`"
  (^NetworkManager [^net.minecraft.network.EnumPacketDirection packet-direction]
    (new NetworkManager packet-direction)))

(def *-network-marker
  "Static Constant.

  type: org.apache.logging.log4j.Marker"
  NetworkManager/NETWORK_MARKER)

(def *-network-packets-marker
  "Static Constant.

  type: org.apache.logging.log4j.Marker"
  NetworkManager/NETWORK_PACKETS_MARKER)

(def *-protocol-attribute-key
  "Static Constant.

  type: io.netty.util.AttributeKey<net.minecraft.network.EnumConnectionState>"
  NetworkManager/PROTOCOL_ATTRIBUTE_KEY)

(def *-client-nio-eventloop
  "Static Constant.

  type: net.minecraft.util.LazyLoadBase<io.netty.channel.nio.NioEventLoopGroup>"
  NetworkManager/CLIENT_NIO_EVENTLOOP)

(def *-client-epoll-eventloop
  "Static Constant.

  type: net.minecraft.util.LazyLoadBase<io.netty.channel.epoll.EpollEventLoopGroup>"
  NetworkManager/CLIENT_EPOLL_EVENTLOOP)

(def *-client-local-eventloop
  "Static Constant.

  type: net.minecraft.util.LazyLoadBase<io.netty.channel.local.LocalEventLoopGroup>"
  NetworkManager/CLIENT_LOCAL_EVENTLOOP)

(defn *create-network-manager-and-connect
  "address - `java.net.InetAddress`
  server-port - `int`
  use-native-transport - `boolean`

  returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^java.net.InetAddress address ^Integer server-port ^Boolean use-native-transport]
    (NetworkManager/createNetworkManagerAndConnect address server-port use-native-transport)))

(defn *provide-local-client
  "address - `java.net.SocketAddress`

  returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^java.net.SocketAddress address]
    (NetworkManager/provideLocalClient address)))

(defn send-packet
  "packet-in - `net.minecraft.network.Packet`
  listener - `io.netty.util.concurrent.GenericFutureListener`
  listeners - `io.netty.util.concurrent.GenericFutureListener`"
  ([^NetworkManager this ^net.minecraft.network.Packet packet-in ^io.netty.util.concurrent.GenericFutureListener listener ^io.netty.util.concurrent.GenericFutureListener listeners]
    (-> this (.sendPacket packet-in listener listeners)))
  ([^NetworkManager this ^net.minecraft.network.Packet packet-in]
    (-> this (.sendPacket packet-in))))

(defn local-channel?
  "returns: `boolean`"
  (^Boolean [^NetworkManager this]
    (-> this (.isLocalChannel))))

(defn check-disconnected
  ""
  ([^NetworkManager this]
    (-> this (.checkDisconnected))))

(defn has-no-channel?
  "returns: `boolean`"
  (^Boolean [^NetworkManager this]
    (-> this (.hasNoChannel))))

(defn exception-caught
  "p-exception-caught-1 - `io.netty.channel.ChannelHandlerContext`
  p-exception-caught-2 - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^NetworkManager this ^io.netty.channel.ChannelHandlerContext p-exception-caught-1 ^java.lang.Throwable p-exception-caught-2]
    (-> this (.exceptionCaught p-exception-caught-1 p-exception-caught-2))))

(defn channel-open?
  "returns: `boolean`"
  (^Boolean [^NetworkManager this]
    (-> this (.isChannelOpen))))

(defn encrypted?
  "returns: `boolean`"
  (^Boolean [^NetworkManager this]
    (-> this (.isEncrypted))))

(defn get-remote-address
  "returns: `java.net.SocketAddress`"
  (^java.net.SocketAddress [^NetworkManager this]
    (-> this (.getRemoteAddress))))

(defn close-channel
  "message - `net.minecraft.util.text.ITextComponent`"
  ([^NetworkManager this ^net.minecraft.util.text.ITextComponent message]
    (-> this (.closeChannel message))))

(defn get-direction
  "returns: `net.minecraft.network.EnumPacketDirection`"
  (^net.minecraft.network.EnumPacketDirection [^NetworkManager this]
    (-> this (.getDirection))))

(defn set-net-handler
  "handler - `net.minecraft.network.INetHandler`"
  ([^NetworkManager this ^net.minecraft.network.INetHandler handler]
    (-> this (.setNetHandler handler))))

(defn channel-active
  "p-channel-active-1 - `io.netty.channel.ChannelHandlerContext`

  throws: java.lang.Exception"
  ([^NetworkManager this ^io.netty.channel.ChannelHandlerContext p-channel-active-1]
    (-> this (.channelActive p-channel-active-1))))

(defn set-compression-threshold
  "threshold - `int`"
  ([^NetworkManager this ^Integer threshold]
    (-> this (.setCompressionThreshold threshold))))

(defn enable-encryption
  "key - `javax.crypto.SecretKey`"
  ([^NetworkManager this ^javax.crypto.SecretKey key]
    (-> this (.enableEncryption key))))

(defn get-exit-message
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^NetworkManager this]
    (-> this (.getExitMessage))))

(defn channel
  "returns: `io.netty.channel.Channel`"
  (^io.netty.channel.Channel [^NetworkManager this]
    (-> this (.channel))))

(defn channel-inactive
  "p-channel-inactive-1 - `io.netty.channel.ChannelHandlerContext`

  throws: java.lang.Exception"
  ([^NetworkManager this ^io.netty.channel.ChannelHandlerContext p-channel-inactive-1]
    (-> this (.channelInactive p-channel-inactive-1))))

(defn get-net-handler
  "returns: `net.minecraft.network.INetHandler`"
  (^net.minecraft.network.INetHandler [^NetworkManager this]
    (-> this (.getNetHandler))))

(defn disable-auto-read
  ""
  ([^NetworkManager this]
    (-> this (.disableAutoRead))))

(defn set-connection-state
  "new-state - `net.minecraft.network.EnumConnectionState`"
  ([^NetworkManager this ^net.minecraft.network.EnumConnectionState new-state]
    (-> this (.setConnectionState new-state))))

(defn process-received-packets
  ""
  ([^NetworkManager this]
    (-> this (.processReceivedPackets))))

