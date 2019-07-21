(ns net.minecraft.command.CommandToggleDownfall
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandToggleDownfall]))

(defn ->command-toggle-downfall
  "Constructor."
  (^CommandToggleDownfall []
    (new CommandToggleDownfall )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandToggleDownfall this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandToggleDownfall this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandToggleDownfall this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandToggleDownfall this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

