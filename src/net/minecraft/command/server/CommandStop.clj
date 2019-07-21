(ns net.minecraft.command.server.CommandStop
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandStop]))

(defn ->command-stop
  "Constructor."
  (^CommandStop []
    (new CommandStop )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandStop this]
    (-> this (.getName))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandStop this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandStop this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

