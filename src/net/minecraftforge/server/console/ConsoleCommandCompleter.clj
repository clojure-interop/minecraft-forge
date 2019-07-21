(ns net.minecraftforge.server.console.ConsoleCommandCompleter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.console ConsoleCommandCompleter]))

(defn ->console-command-completer
  "Constructor.

  server - `net.minecraft.server.dedicated.DedicatedServer`"
  (^ConsoleCommandCompleter [^net.minecraft.server.dedicated.DedicatedServer server]
    (new ConsoleCommandCompleter server)))

(defn complete
  "buffer - `java.lang.String`
  cursor - `int`
  candidates - `java.util.List`

  returns: `int`"
  (^Integer [^ConsoleCommandCompleter this ^java.lang.String buffer ^Integer cursor ^java.util.List candidates]
    (-> this (.complete buffer cursor candidates))))

