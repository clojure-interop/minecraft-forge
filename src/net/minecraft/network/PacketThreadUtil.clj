(ns net.minecraft.network.PacketThreadUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network PacketThreadUtil]))

(defn ->packet-thread-util
  "Constructor."
  (^PacketThreadUtil []
    (new PacketThreadUtil )))

(defn *check-thread-and-enqueue
  "packet-in - `net.minecraft.network.Packet`
  processor - `T`
  scheduler - `net.minecraft.util.IThreadListener`

  returns: `<T extends net.minecraft.network.INetHandler> void`

  throws: net.minecraft.network.ThreadQuickExitException"
  ([^net.minecraft.network.Packet packet-in processor ^net.minecraft.util.IThreadListener scheduler]
    (PacketThreadUtil/checkThreadAndEnqueue packet-in processor scheduler)))

