(ns net.minecraft.command.CommandSetPlayerTimeout
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandSetPlayerTimeout]))

(defn ->command-set-player-timeout
  "Constructor."
  (^CommandSetPlayerTimeout []
    (new CommandSetPlayerTimeout )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandSetPlayerTimeout this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandSetPlayerTimeout this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandSetPlayerTimeout this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandSetPlayerTimeout this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

