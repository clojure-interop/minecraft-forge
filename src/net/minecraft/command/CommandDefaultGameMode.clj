(ns net.minecraft.command.CommandDefaultGameMode
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandDefaultGameMode]))

(defn ->command-default-game-mode
  "Constructor."
  (^CommandDefaultGameMode []
    (new CommandDefaultGameMode )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandDefaultGameMode this]
    (-> this (.getName))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandDefaultGameMode this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandDefaultGameMode this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

