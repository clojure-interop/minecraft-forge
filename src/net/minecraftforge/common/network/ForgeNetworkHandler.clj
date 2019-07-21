(ns net.minecraftforge.common.network.ForgeNetworkHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.network ForgeNetworkHandler]))

(defn ->forge-network-handler
  "Constructor."
  (^ForgeNetworkHandler []
    (new ForgeNetworkHandler )))

(defn *register-channel
  "forge-mod-container - `net.minecraftforge.common.ForgeModContainer`
  side - `net.minecraftforge.fml.relauncher.Side`"
  ([^net.minecraftforge.common.ForgeModContainer forge-mod-container ^net.minecraftforge.fml.relauncher.Side side]
    (ForgeNetworkHandler/registerChannel forge-mod-container side)))

