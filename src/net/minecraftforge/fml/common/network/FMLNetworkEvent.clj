(ns net.minecraftforge.fml.common.network.FMLNetworkEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent]))

(defn get-handler-type
  "returns: `java.lang.Class<T>`"
  (^java.lang.Class [^FMLNetworkEvent this]
    (-> this (.getHandlerType))))

(defn get-handler
  "returns: `T`"
  ([^FMLNetworkEvent this]
    (-> this (.getHandler))))

(defn get-manager
  "returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^FMLNetworkEvent this]
    (-> this (.getManager))))

(defn get-type
  "returns: `java.lang.Class<T>`"
  (^java.lang.Class [^FMLNetworkEvent this]
    (-> this (.getType))))

