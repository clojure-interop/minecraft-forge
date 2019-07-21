(ns net.minecraftforge.fml.common.network.internal.FMLMessage$CompleteHandshake
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.internal FMLMessage$CompleteHandshake]))

(defn ->complete-handshake
  "Constructor.

  target - `net.minecraftforge.fml.relauncher.Side`"
  (^FMLMessage$CompleteHandshake [^net.minecraftforge.fml.relauncher.Side target]
    (new FMLMessage$CompleteHandshake target))
  (^FMLMessage$CompleteHandshake []
    (new FMLMessage$CompleteHandshake )))

