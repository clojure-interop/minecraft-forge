(ns net.minecraft.server.integrated.IntegratedServerCommandManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.integrated IntegratedServerCommandManager]))

(defn ->integrated-server-command-manager
  "Constructor.

  server - `net.minecraft.server.integrated.IntegratedServer`"
  (^IntegratedServerCommandManager [^net.minecraft.server.integrated.IntegratedServer server]
    (new IntegratedServerCommandManager server)))

