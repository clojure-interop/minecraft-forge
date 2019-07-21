(ns net.minecraft.command.server.CommandListPlayers
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandListPlayers]))

(defn ->command-list-players
  "Constructor."
  (^CommandListPlayers []
    (new CommandListPlayers )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandListPlayers this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandListPlayers this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandListPlayers this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandListPlayers this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

