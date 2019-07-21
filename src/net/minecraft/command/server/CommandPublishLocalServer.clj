(ns net.minecraft.command.server.CommandPublishLocalServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandPublishLocalServer]))

(defn ->command-publish-local-server
  "Constructor."
  (^CommandPublishLocalServer []
    (new CommandPublishLocalServer )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandPublishLocalServer this]
    (-> this (.getName))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandPublishLocalServer this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandPublishLocalServer this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

