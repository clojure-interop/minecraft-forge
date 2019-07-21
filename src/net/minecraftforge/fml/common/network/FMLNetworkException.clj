(ns net.minecraftforge.fml.common.network.FMLNetworkException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkException]))

(defn ->fml-network-exception
  "Constructor.

  e - `java.lang.Exception`"
  (^FMLNetworkException [^java.lang.Exception e]
    (new FMLNetworkException e))
  (^FMLNetworkException []
    (new FMLNetworkException )))

