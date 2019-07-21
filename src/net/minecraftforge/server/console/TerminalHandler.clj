(ns net.minecraftforge.server.console.TerminalHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.console TerminalHandler]))

(defn *handle-commands
  "server - `net.minecraft.server.dedicated.DedicatedServer`

  returns: `boolean`"
  (^Boolean [^net.minecraft.server.dedicated.DedicatedServer server]
    (TerminalHandler/handleCommands server)))

